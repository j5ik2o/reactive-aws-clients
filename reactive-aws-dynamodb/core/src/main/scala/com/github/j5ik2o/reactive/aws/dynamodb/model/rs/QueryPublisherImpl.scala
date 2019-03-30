package com.github.j5ik2o.reactive.aws.dynamodb.model.rs

import java.util

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeValue, QueryResponse => ScalaQueryResponse }
import org.reactivestreams.{ Publisher, Subscriber, Subscription }
import software.amazon.awssdk.services.dynamodb.model.{
  QueryResponse => JavaQueryResponse,
  AttributeValue => JavaAttributeValue
}

import scala.collection.JavaConverters._
import scala.collection.mutable.ListBuffer
import scala.compat.java8.FunctionConverters._

@SuppressWarnings(Array("org.wartremover.warts.MutableDataStructures"))
private[dynamodb] class QueryPublisherImpl(self: software.amazon.awssdk.services.dynamodb.paginators.QueryPublisher)
    extends com.github.j5ik2o.reactive.aws.dynamodb.model.rs.QueryPublisher {

  import com.github.j5ik2o.reactive.aws.dynamodb.model.ops.QueryResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.ops.AttributeValueOps._

  self.subscribe(new Subscriber[JavaQueryResponse] {
    override def onSubscribe(s: Subscription): Unit = {
      subscribers.foreach(_.onSubscribe(s))
    }

    override def onNext(t: JavaQueryResponse): Unit = {
      subscribers.foreach(_.onNext(t.toScala))
    }

    override def onError(t: Throwable): Unit = {
      subscribers.foreach(_.onError(t))
    }

    override def onComplete(): Unit = {
      subscribers.foreach(_.onComplete())
    }
  })

  private val subscribers = ListBuffer.empty[Subscriber[_ >: ScalaQueryResponse]]

  override def subscribe(s: Subscriber[_ >: ScalaQueryResponse]): Unit = subscribers.append(s)

  override def items: Publisher[Map[String, AttributeValue]] =
    self.items().map(((v: util.Map[String, JavaAttributeValue]) => v.asScala.toMap.mapValues(_.toScala)).asJava)
}
