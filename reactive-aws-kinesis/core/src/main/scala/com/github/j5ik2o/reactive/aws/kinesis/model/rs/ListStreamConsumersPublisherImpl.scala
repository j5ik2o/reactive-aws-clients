package com.github.j5ik2o.reactive.aws.kinesis.model.rs

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListStreamConsumersResponse => ScalaListStreamConsumersResponse }
import org.reactivestreams.{ Subscriber, Subscription }
import software.amazon.awssdk.services.kinesis.model.{ ListStreamConsumersResponse => JavaListStreamConsumersResponse }

import scala.collection.mutable.ListBuffer

@SuppressWarnings(Array("org.wartremover.warts.MutableDataStructures"))
private[kinesis] class ListStreamConsumersPublisherImpl(
    self: software.amazon.awssdk.services.kinesis.paginators.ListStreamConsumersPublisher
) extends ListStreamConsumersPublisher {

  import com.github.j5ik2o.reactive.aws.kinesis.model.ops.ListStreamConsumersResponseOps._

  override def subscribe(org: Subscriber[_ >: ScalaListStreamConsumersResponse]): Unit = {
    self.subscribe(new Subscriber[JavaListStreamConsumersResponse] {

      override def onSubscribe(s: Subscription): Unit = {
        org.onSubscribe(s)
      }

      override def onNext(t: JavaListStreamConsumersResponse): Unit = {
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
}
