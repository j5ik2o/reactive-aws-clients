package com.github.j5ik2o.reactive.aws.s3.model.rs

import com.github.j5ik2o.reactive.aws.s3.model.{ Part, ListPartsResponse => ScalaListPartsResponse }
import org.reactivestreams.{ Publisher, Subscriber, Subscription }
import software.amazon.awssdk.services.s3.model.{ ListPartsResponse => JavaListPartsResponse, Part => JavaPart }

import scala.collection.mutable.ListBuffer
import scala.compat.java8.FunctionConverters._

@SuppressWarnings(Array("org.wartremover.warts.MutableDataStructures"))
class ListPartsPublisherImpl(self: software.amazon.awssdk.services.s3.paginators.ListPartsPublisher)
    extends com.github.j5ik2o.reactive.aws.s3.model.rs.ListPartsPublisher {

  import com.github.j5ik2o.reactive.aws.s3.model.ops.ListPartsResponseOps._
  import com.github.j5ik2o.reactive.aws.s3.model.ops.PartOps._

  self.subscribe(new Subscriber[JavaListPartsResponse] {
    override def onSubscribe(s: Subscription): Unit = subscribers.foreach(_.onSubscribe(s))

    override def onNext(t: JavaListPartsResponse): Unit = subscribers.foreach(_.onNext(t.toScala))

    override def onError(t: Throwable): Unit = subscribers.foreach(_.onError(t))

    override def onComplete(): Unit = subscribers.foreach(_.onComplete())
  })

  private val subscribers = ListBuffer.empty[Subscriber[_ >: ScalaListPartsResponse]]

  override def subscribe(org: Subscriber[_ >: ScalaListPartsResponse]): Unit = {
    self.subscribe(new Subscriber[JavaListPartsResponse] {
      override def onSubscribe(s: Subscription): Unit = org.onSubscribe(s)

      override def onNext(t: JavaListPartsResponse): Unit = org.onNext(t.toScala)

      override def onError(t: Throwable): Unit = org.onError(t)

      override def onComplete(): Unit = org.onComplete()
    })
  }

  override def parts: Publisher[Part] = self.parts().map(((v: JavaPart) => v.toScala).asJava)

}
