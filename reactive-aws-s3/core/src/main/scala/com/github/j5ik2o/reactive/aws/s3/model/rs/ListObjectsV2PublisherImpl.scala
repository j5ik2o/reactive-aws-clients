package com.github.j5ik2o.reactive.aws.s3.model.rs

import com.github.j5ik2o.reactive.aws.s3.model.{
  CommonPrefix,
  S3Object,
  ListObjectsV2Response => ScalaListObjectsV2Response
}
import org.reactivestreams.{ Publisher, Subscriber, Subscription }
import software.amazon.awssdk.services.s3.model.{
  CommonPrefix => JavaCommonPrefix,
  ListObjectsV2Response => JavaListObjectsV2Response,
  S3Object => JavaS3Object
}

import scala.compat.java8.FunctionConverters._

@SuppressWarnings(Array("org.wartremover.warts.MutableDataStructures"))
class ListObjectsV2PublisherImpl(self: software.amazon.awssdk.services.s3.paginators.ListObjectsV2Publisher)
    extends com.github.j5ik2o.reactive.aws.s3.model.rs.ListObjectsV2Publisher {

  import com.github.j5ik2o.reactive.aws.s3.model.ops.CommonPrefixOps._
  import com.github.j5ik2o.reactive.aws.s3.model.ops.ListObjectsV2ResponseOps._
  import com.github.j5ik2o.reactive.aws.s3.model.ops.S3ObjectOps._

  override def subscribe(org: Subscriber[_ >: ScalaListObjectsV2Response]): Unit = {
    self.subscribe(new Subscriber[JavaListObjectsV2Response] {
      override def onSubscribe(s: Subscription): Unit = org.onSubscribe(s)

      override def onNext(t: JavaListObjectsV2Response): Unit = org.onNext(t.toScala)

      override def onError(t: Throwable): Unit = org.onError(t)

      override def onComplete(): Unit = org.onComplete()
    })
  }

  override def contents: Publisher[S3Object] = self.contents.map(((v: JavaS3Object) => v.toScala).asJava)

  override def commonPrefixes: Publisher[CommonPrefix] =
    self.commonPrefixes().map(((v: JavaCommonPrefix) => v.toScala).asJava)
}
