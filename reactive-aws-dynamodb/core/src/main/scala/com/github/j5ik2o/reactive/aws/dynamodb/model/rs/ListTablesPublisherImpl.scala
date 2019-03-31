package com.github.j5ik2o.reactive.aws.dynamodb.model.rs

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListTablesResponse => ScalaListTablesResponse }
import org.reactivestreams.{ Publisher, Subscriber, Subscription }
import software.amazon.awssdk.services.dynamodb.model.{ ListTablesResponse => JavaListTablesResponse }

@SuppressWarnings(Array("org.wartremover.warts.MutableDataStructures"))
private[dynamodb] class ListTablesPublisherImpl(
    self: software.amazon.awssdk.services.dynamodb.paginators.ListTablesPublisher
) extends com.github.j5ik2o.reactive.aws.dynamodb.model.rs.ListTablesPublisher {

  import com.github.j5ik2o.reactive.aws.dynamodb.model.ops.ListTablesResponseOps._

  override def subscribe(org: Subscriber[_ >: ScalaListTablesResponse]): Unit = {
    self.subscribe(new Subscriber[JavaListTablesResponse] {
      override def onSubscribe(s: Subscription): Unit = {
        org.onSubscribe(s)
      }

      override def onNext(t: JavaListTablesResponse): Unit = {
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

  override def tableNames: Publisher[String] = self.tableNames()
}
