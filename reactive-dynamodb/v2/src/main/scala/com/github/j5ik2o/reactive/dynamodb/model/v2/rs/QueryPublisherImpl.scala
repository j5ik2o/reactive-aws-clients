package com.github.j5ik2o.reactive.dynamodb.model.v2.rs

import com.github.j5ik2o.reactive.dynamodb.model.{ QueryResponse => ScalaQueryResponse }
import org.reactivestreams.{ Subscriber, Subscription }
import software.amazon.awssdk.services.dynamodb.model.{ QueryResponse => JavaQueryResponse }

import scala.collection.mutable.ListBuffer

@SuppressWarnings(Array("org.wartremover.warts.MutableDataStructures"))
class QueryPublisherImpl(self: software.amazon.awssdk.services.dynamodb.paginators.QueryPublisher)
    extends com.github.j5ik2o.reactive.dynamodb.model.rs.QueryPublisher {

  import com.github.j5ik2o.reactive.dynamodb.model.v2.QueryResponseOps._

  self.subscribe(new Subscriber[JavaQueryResponse] {
    override def onSubscribe(s: Subscription): Unit = {
      subscribers.foreach(subscriber => subscriber.onSubscribe(s))
    }
    override def onNext(t: JavaQueryResponse): Unit = {
      subscribers.foreach(subscriber => subscriber.onNext(t.toScala))
    }
    override def onError(t: Throwable): Unit = {
      subscribers.foreach(subscriber => subscriber.onError(t))
    }
    override def onComplete(): Unit = {
      subscribers.foreach(subscriber => subscriber.onComplete())
    }
  })

  private val subscribers = ListBuffer.empty[Subscriber[_ >: ScalaQueryResponse]]

  override def subscribe(s: Subscriber[_ >: ScalaQueryResponse]): Unit = subscribers.append(s)
}
