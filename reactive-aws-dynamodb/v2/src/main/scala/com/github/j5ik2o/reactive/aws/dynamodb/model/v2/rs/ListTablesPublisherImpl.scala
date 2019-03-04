package com.github.j5ik2o.reactive.aws.dynamodb.model.v2.rs

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListTablesResponse => ScalaListTablesResponse }
import org.reactivestreams.{ Subscriber, Subscription }
import software.amazon.awssdk.services.dynamodb.model.{ ListTablesResponse => JavaListTablesResponse }

import scala.collection.mutable.ListBuffer

@SuppressWarnings(Array("org.wartremover.warts.MutableDataStructures"))
class ListTablesPublisherImpl(self: software.amazon.awssdk.services.dynamodb.paginators.ListTablesPublisher)
    extends com.github.j5ik2o.reactive.aws.dynamodb.model.rs.ListTablesPublisher {

  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ListTablesResponseOps._

  self.subscribe(new Subscriber[JavaListTablesResponse] {
    override def onSubscribe(s: Subscription): Unit = {
      subscribers.foreach(subscriber => subscriber.onSubscribe(s))
    }
    override def onNext(t: JavaListTablesResponse): Unit = {
      subscribers.foreach(subscriber => subscriber.onNext(t.toScala))
    }
    override def onError(t: Throwable): Unit = {
      subscribers.foreach(subscriber => subscriber.onError(t))
    }
    override def onComplete(): Unit = {
      subscribers.foreach(subscriber => subscriber.onComplete())
    }
  })

  private val subscribers = ListBuffer.empty[Subscriber[_ >: ScalaListTablesResponse]]

  override def subscribe(s: Subscriber[_ >: ScalaListTablesResponse]): Unit = subscribers.append(s)

}
