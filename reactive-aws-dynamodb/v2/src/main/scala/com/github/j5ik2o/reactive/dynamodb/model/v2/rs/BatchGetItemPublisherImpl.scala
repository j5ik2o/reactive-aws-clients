package com.github.j5ik2o.reactive.dynamodb.model.v2.rs

import com.github.j5ik2o.reactive.dynamodb.model.{ BatchGetItemResponse => ScalaBatchGetItemResponse }
import org.reactivestreams.{ Subscriber, Subscription }
import software.amazon.awssdk.services.dynamodb.model.{ BatchGetItemResponse => JavaBatchGetItemResponse }

import scala.collection.mutable.ListBuffer

@SuppressWarnings(Array("org.wartremover.warts.MutableDataStructures"))
class BatchGetItemPublisherImpl(self: software.amazon.awssdk.services.dynamodb.paginators.BatchGetItemPublisher)
    extends com.github.j5ik2o.reactive.dynamodb.model.rs.BatchGetItemPublisher {

  import com.github.j5ik2o.reactive.dynamodb.model.v2.BatchGetItemResponseOps._

  self.subscribe(new Subscriber[JavaBatchGetItemResponse] {
    override def onSubscribe(s: Subscription): Unit = {
      subscribers.foreach(subscriber => subscriber.onSubscribe(s))
    }
    override def onNext(t: JavaBatchGetItemResponse): Unit = {
      subscribers.foreach(subscriber => subscriber.onNext(t.toScala))
    }
    override def onError(t: Throwable): Unit = {
      subscribers.foreach(subscriber => subscriber.onError(t))
    }
    override def onComplete(): Unit = {
      subscribers.foreach(subscriber => subscriber.onComplete())
    }
  })

  private val subscribers = ListBuffer.empty[Subscriber[_ >: ScalaBatchGetItemResponse]]

  override def subscribe(s: Subscriber[_ >: ScalaBatchGetItemResponse]): Unit =
    subscribers.append(s)

}
