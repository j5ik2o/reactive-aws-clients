package com.github.j5ik2o.reactive.aws.dynamodb.v2.model.rs

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListTablesResponse => ScalaListTablesResponse }
import org.reactivestreams.{ Publisher, Subscriber, Subscription }
import software.amazon.awssdk.services.dynamodb.model.{ ListTablesResponse => JavaListTablesResponse }

import scala.collection.mutable.ListBuffer

@SuppressWarnings(Array("org.wartremover.warts.MutableDataStructures"))
private[dynamodb] class ListTablesPublisherImpl(
    self: software.amazon.awssdk.services.dynamodb.paginators.ListTablesPublisher
) extends com.github.j5ik2o.reactive.aws.dynamodb.model.rs.ListTablesPublisher {

  import com.github.j5ik2o.reactive.aws.dynamodb.v2.model.ListTablesResponseOps._

  self.subscribe(new Subscriber[JavaListTablesResponse] {
    override def onSubscribe(s: Subscription): Unit = {
      subscribers.foreach(_.onSubscribe(s))
    }

    override def onNext(t: JavaListTablesResponse): Unit = {
      subscribers.foreach(_.onNext(t.toScala))
    }

    override def onError(t: Throwable): Unit = {
      subscribers.foreach(_.onError(t))
    }

    override def onComplete(): Unit = {
      subscribers.foreach(_.onComplete())
    }
  })

  private val subscribers = ListBuffer.empty[Subscriber[_ >: ScalaListTablesResponse]]

  override def subscribe(s: Subscriber[_ >: ScalaListTablesResponse]): Unit = subscribers.append(s)

  override def tableNames: Publisher[String] = self.tableNames()
}
