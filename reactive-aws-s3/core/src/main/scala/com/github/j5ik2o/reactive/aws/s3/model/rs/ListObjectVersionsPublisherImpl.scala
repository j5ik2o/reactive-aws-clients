package com.github.j5ik2o.reactive.aws.s3.model.rs

import com.github.j5ik2o.reactive.aws.s3.model.{
  CommonPrefix,
  DeleteMarkerEntry,
  ObjectVersion,
  ListObjectVersionsResponse => ScalaListObjectVersionsResponse
}
import org.reactivestreams.{ Publisher, Subscriber, Subscription }
import software.amazon.awssdk.services.s3.model.{
  CommonPrefix => JavaCommonPrefix,
  DeleteMarkerEntry => JavaDeleteMarkerEntry,
  ListObjectVersionsResponse => JavaListObjectVersionsResponse,
  ObjectVersion => JavaObjectVersion
}

import scala.compat.java8.FunctionConverters._

@SuppressWarnings(Array("org.wartremover.warts.MutableDataStructures"))
class ListObjectVersionsPublisherImpl(self: software.amazon.awssdk.services.s3.paginators.ListObjectVersionsPublisher)
    extends com.github.j5ik2o.reactive.aws.s3.model.rs.ListObjectVersionsPublisher {

  import com.github.j5ik2o.reactive.aws.s3.model.ops.CommonPrefixOps._
  import com.github.j5ik2o.reactive.aws.s3.model.ops.DeleteMarkerEntryOps._
  import com.github.j5ik2o.reactive.aws.s3.model.ops.ListObjectVersionsResponseOps._
  import com.github.j5ik2o.reactive.aws.s3.model.ops.ObjectVersionOps._

  override def subscribe(org: Subscriber[_ >: ScalaListObjectVersionsResponse]): Unit = {
    self.subscribe(new Subscriber[JavaListObjectVersionsResponse] {
      override def onSubscribe(s: Subscription): Unit = org.onSubscribe(s)

      override def onNext(t: JavaListObjectVersionsResponse): Unit = org.onNext(t.toScala)

      override def onError(t: Throwable): Unit = org.onError(t)

      override def onComplete(): Unit = org.onComplete()
    })
  }

  override def commonPrefixes: Publisher[CommonPrefix] =
    self.commonPrefixes().map(((v: JavaCommonPrefix) => v.toScala).asJava)

  override def deleteMarkers: Publisher[DeleteMarkerEntry] =
    self.deleteMarkers().map(((v: JavaDeleteMarkerEntry) => v.toScala).asJava)

  override def versions: Publisher[ObjectVersion] = self.versions.map(((v: JavaObjectVersion) => v.toScala).asJava)
}
