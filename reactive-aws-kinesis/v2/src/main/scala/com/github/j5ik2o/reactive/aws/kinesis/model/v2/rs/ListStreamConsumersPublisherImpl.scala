package com.github.j5ik2o.reactive.aws.kinesis.model.v2.rs

import com.github.j5ik2o.reactive.aws.kinesis.model.rs.ListStreamConsumersPublisher
import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListStreamConsumersResponse => ScalaListStreamConsumersResponse }
import org.reactivestreams.{ Subscriber, Subscription }
import software.amazon.awssdk.services.kinesis.model.{ ListStreamConsumersResponse => JavaListStreamConsumersResponse }

import scala.collection.mutable.ListBuffer

@SuppressWarnings(Array("org.wartremover.warts.MutableDataStructures"))
class ListStreamConsumersPublisherImpl(
    self: software.amazon.awssdk.services.kinesis.paginators.ListStreamConsumersPublisher
) extends ListStreamConsumersPublisher {

  import com.github.j5ik2o.reactive.aws.kinesis.model.v2.ListStreamConsumersResponseOps._

  self.subscribe(new Subscriber[JavaListStreamConsumersResponse] {

    override def onSubscribe(s: Subscription): Unit = {
      subscribers.foreach(subscriber => subscriber.onSubscribe(s))
    }

    override def onNext(t: JavaListStreamConsumersResponse): Unit = {
      subscribers.foreach(subscriber => subscriber.onNext(t.toScala))
    }

    override def onError(t: Throwable): Unit = {
      subscribers.foreach(subscriber => subscriber.onError(t))
    }

    override def onComplete(): Unit = {
      subscribers.foreach(subscriber => subscriber.onComplete())
    }
  })

  private val subscribers = ListBuffer.empty[Subscriber[_ >: ScalaListStreamConsumersResponse]]

  override def subscribe(s: Subscriber[_ >: ScalaListStreamConsumersResponse]): Unit = subscribers.append(s)
}
