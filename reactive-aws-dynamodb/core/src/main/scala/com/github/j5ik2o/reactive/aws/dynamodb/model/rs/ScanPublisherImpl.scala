package com.github.j5ik2o.reactive.aws.dynamodb.model.rs

import java.util

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeValue, ScanResponse => ScalaScanResponse }
import org.reactivestreams.{ Publisher, Subscriber, Subscription }
import software.amazon.awssdk.services.dynamodb.model.{
  AttributeValue => JavaAttributeValue,
  ScanResponse => JavaScanResponse
}

import scala.collection.JavaConverters._
import scala.compat.java8.FunctionConverters._

@SuppressWarnings(Array("org.wartremover.warts.MutableDataStructures"))
private[dynamodb] class ScanPublisherImpl(self: software.amazon.awssdk.services.dynamodb.paginators.ScanPublisher)
    extends com.github.j5ik2o.reactive.aws.dynamodb.model.rs.ScanPublisher {
  import com.github.j5ik2o.reactive.aws.dynamodb.model.ops.AttributeValueOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.ops.ScanResponseOps._

  override def subscribe(org: Subscriber[_ >: ScalaScanResponse]): Unit = {
    self.subscribe(new Subscriber[JavaScanResponse] {
      override def onSubscribe(s: Subscription): Unit = {
        org.onSubscribe(s)
      }

      override def onNext(t: JavaScanResponse): Unit = {
        org.onNext(t.toScala)
      }

      override def onError(t: Throwable): Unit = {
        org.onError(t)
      }

      override def onComplete(): Unit = {
        org.onComplete()
      }
    })
  }

  override def items: Publisher[Map[String, AttributeValue]] =
    self.items().map(((v: util.Map[String, JavaAttributeValue]) => v.asScala.toMap.mapValues(_.toScala)).asJava)
}
