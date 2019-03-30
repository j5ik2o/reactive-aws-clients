package com.github.j5ik2o.reactive.aws.dynamodb.v2.model.rs

import java.util

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeValue, ScanResponse => ScalaScanResponse }
import org.reactivestreams.{ Publisher, Subscriber, Subscription }
import software.amazon.awssdk.services.dynamodb.model.{
  AttributeValue => JavaAttributeValue,
  ScanResponse => JavaScanResponse
}

import scala.collection.mutable.ListBuffer
import scala.collection.JavaConverters._
import scala.compat.java8.FunctionConverters._

@SuppressWarnings(Array("org.wartremover.warts.MutableDataStructures"))
private[dynamodb] class ScanPublisherImpl(self: software.amazon.awssdk.services.dynamodb.paginators.ScanPublisher)
    extends com.github.j5ik2o.reactive.aws.dynamodb.model.rs.ScanPublisher {

  import com.github.j5ik2o.reactive.aws.dynamodb.v2.model.ScanResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.v2.model.AttributeValueOps._

  self.subscribe(new Subscriber[JavaScanResponse] {
    override def onSubscribe(s: Subscription): Unit = {
      subscribers.foreach(_.onSubscribe(s))
    }

    override def onNext(t: JavaScanResponse): Unit = {
      subscribers.foreach(_.onNext(t.toScala))
    }

    override def onError(t: Throwable): Unit = {
      subscribers.foreach(_.onError(t))
    }

    override def onComplete(): Unit = {
      subscribers.foreach(_.onComplete())
    }
  })

  private val subscribers = ListBuffer.empty[Subscriber[_ >: ScalaScanResponse]]

  override def subscribe(s: Subscriber[_ >: ScalaScanResponse]): Unit = subscribers.append(s)

  override def items: Publisher[Map[String, AttributeValue]] =
    self.items().map(((v: util.Map[String, JavaAttributeValue]) => v.asScala.toMap.mapValues(_.toScala)).asJava)
}
