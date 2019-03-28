package com.github.j5ik2o.reactive.aws.dynamodb.v2.model.rs

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ScanResponse => ScalaScanResponse }
import org.reactivestreams.{ Subscriber, Subscription }
import software.amazon.awssdk.services.dynamodb.model.{ ScanResponse => JavaScanResponse }

import scala.collection.mutable.ListBuffer

@SuppressWarnings(Array("org.wartremover.warts.MutableDataStructures"))
private[dynamodb] class ScanPublisherImpl(self: software.amazon.awssdk.services.dynamodb.paginators.ScanPublisher)
    extends com.github.j5ik2o.reactive.aws.dynamodb.model.rs.ScanPublisher {

  import com.github.j5ik2o.reactive.aws.dynamodb.v2.model.ScanResponseOps._

  self.subscribe(new Subscriber[JavaScanResponse] {
    override def onSubscribe(s: Subscription): Unit = {
      subscribers.foreach(subscriber => subscriber.onSubscribe(s))
    }

    override def onNext(t: JavaScanResponse): Unit = {
      subscribers.foreach(subscriber => subscriber.onNext(t.toScala))
    }

    override def onError(t: Throwable): Unit = {
      subscribers.foreach(subscriber => subscriber.onError(t))
    }

    override def onComplete(): Unit = {
      subscribers.foreach(subscriber => subscriber.onComplete())
    }
  })

  private val subscribers = ListBuffer.empty[Subscriber[_ >: ScalaScanResponse]]

  override def subscribe(s: Subscriber[_ >: ScalaScanResponse]): Unit = subscribers.append(s)

}
