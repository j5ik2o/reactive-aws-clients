// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class SubscribeToShardEventBuilderOps(val self: SubscribeToShardEvent.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recordsAsScala(value: Option[Seq[Record]]): SubscribeToShardEvent.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.records(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def continuationSequenceNumberAsScala(value: Option[String]): SubscribeToShardEvent.Builder = {
    value.fold(self) { v => self.continuationSequenceNumber(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def millisBehindLatestAsScala(value: Option[Long]): SubscribeToShardEvent.Builder = {
    value.fold(self) { v => self.millisBehindLatest(v) }
  }

}

final class SubscribeToShardEventOps(val self: SubscribeToShardEvent) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recordsAsScala: Option[Seq[Record]] =
    Option(self.records).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def continuationSequenceNumberAsScala: Option[String] = Option(self.continuationSequenceNumber)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def millisBehindLatestAsScala: Option[Long] = Option(self.millisBehindLatest)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubscribeToShardEventOps {

  implicit def toSubscribeToShardEventBuilderOps(v: SubscribeToShardEvent.Builder): SubscribeToShardEventBuilderOps =
    new SubscribeToShardEventBuilderOps(v)

  implicit def toSubscribeToShardEventOps(v: SubscribeToShardEvent): SubscribeToShardEventOps =
    new SubscribeToShardEventOps(v)

}
