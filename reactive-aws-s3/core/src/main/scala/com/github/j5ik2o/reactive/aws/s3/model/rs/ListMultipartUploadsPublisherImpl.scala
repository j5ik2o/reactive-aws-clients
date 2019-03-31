package com.github.j5ik2o.reactive.aws.s3.model.rs

import com.github.j5ik2o.reactive.aws.s3.model.{
  CommonPrefix,
  MultipartUpload,
  ListMultipartUploadsResponse => ScalaListMultipartUploadsResponse
}
import org.reactivestreams.{ Publisher, Subscriber, Subscription }
import software.amazon.awssdk.services.s3.model.{
  CommonPrefix => JavaCommonPrefix,
  ListMultipartUploadsResponse => JavaListMultipartUploadsResponse,
  MultipartUpload => JavaMultipartUpload
}

import scala.compat.java8.FunctionConverters._

@SuppressWarnings(Array("org.wartremover.warts.MutableDataStructures"))
private[s3] class ListMultipartUploadsPublisherImpl(
    self: software.amazon.awssdk.services.s3.paginators.ListMultipartUploadsPublisher
) extends com.github.j5ik2o.reactive.aws.s3.model.rs.ListMultipartUploadsPublisher {

  import com.github.j5ik2o.reactive.aws.s3.model.ops.CommonPrefixOps._
  import com.github.j5ik2o.reactive.aws.s3.model.ops.ListMultipartUploadsResponseOps._
  import com.github.j5ik2o.reactive.aws.s3.model.ops.MultipartUploadOps._

  override def subscribe(org: Subscriber[_ >: ScalaListMultipartUploadsResponse]): Unit = {
    self.subscribe(new Subscriber[JavaListMultipartUploadsResponse] {
      override def onSubscribe(s: Subscription): Unit = org.onSubscribe(s)

      override def onNext(t: JavaListMultipartUploadsResponse): Unit = org.onNext(t.toScala)

      override def onError(t: Throwable): Unit = org.onError(t)

      override def onComplete(): Unit = org.onComplete()
    })
  }

  override def uploads: Publisher[MultipartUpload] = self.uploads.map(((v: JavaMultipartUpload) => v.toScala).asJava)

  override def commonPrefixes: Publisher[CommonPrefix] =
    self.commonPrefixes.map(((v: JavaCommonPrefix) => v.toScala).asJava)
}
