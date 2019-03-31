package com.github.j5ik2o.reactive.aws.dynamodb.model.rs

import java.util

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeValue, QueryResponse => ScalaQueryResponse }
import org.reactivestreams.{ Publisher, Subscriber, Subscription }
import software.amazon.awssdk.services.dynamodb.model.{
  AttributeValue => JavaAttributeValue,
  QueryResponse => JavaQueryResponse
}

import scala.collection.JavaConverters._
import scala.compat.java8.FunctionConverters._

@SuppressWarnings(Array("org.wartremover.warts.MutableDataStructures"))
private[dynamodb] class QueryPublisherImpl(self: software.amazon.awssdk.services.dynamodb.paginators.QueryPublisher)
    extends com.github.j5ik2o.reactive.aws.dynamodb.model.rs.QueryPublisher {

  import com.github.j5ik2o.reactive.aws.dynamodb.model.ops.AttributeValueOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.ops.QueryResponseOps._

  override def subscribe(org: Subscriber[_ >: ScalaQueryResponse]): Unit = {
    self.subscribe(new Subscriber[JavaQueryResponse] {
      override def onSubscribe(s: Subscription): Unit = {
        org.onSubscribe(s)
      }

      override def onNext(t: JavaQueryResponse): Unit = {
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
