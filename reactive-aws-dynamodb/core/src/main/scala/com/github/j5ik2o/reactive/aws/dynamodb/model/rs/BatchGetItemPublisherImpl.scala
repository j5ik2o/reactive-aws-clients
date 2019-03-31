package com.github.j5ik2o.reactive.aws.dynamodb.model.rs

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchGetItemResponse => ScalaBatchGetItemResponse }
import org.reactivestreams.{ Subscriber, Subscription }
import software.amazon.awssdk.services.dynamodb.model.{ BatchGetItemResponse => JavaBatchGetItemResponse }

@SuppressWarnings(Array("org.wartremover.warts.MutableDataStructures"))
private[dynamodb] class BatchGetItemPublisherImpl(
    self: software.amazon.awssdk.services.dynamodb.paginators.BatchGetItemPublisher
) extends com.github.j5ik2o.reactive.aws.dynamodb.model.rs.BatchGetItemPublisher {
  import com.github.j5ik2o.reactive.aws.dynamodb.model.ops.BatchGetItemResponseOps._

  override def subscribe(org: Subscriber[_ >: ScalaBatchGetItemResponse]): Unit = {
    self.subscribe(new Subscriber[JavaBatchGetItemResponse] {
      override def onSubscribe(s: Subscription): Unit = {
        org.onSubscribe(s)
      }

      override def onNext(t: JavaBatchGetItemResponse): Unit = {
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
