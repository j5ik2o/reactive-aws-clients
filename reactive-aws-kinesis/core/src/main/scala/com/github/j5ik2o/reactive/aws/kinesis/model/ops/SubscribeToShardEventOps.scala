// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class SubscribeToShardEventBuilderOps(val self: SubscribeToShardEvent.Builder) extends AnyVal {

  final def recordsAsScala(value: Option[Seq[Record]]): SubscribeToShardEvent.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.records(v.asJava)
    } // Seq[Record]
  }

  final def continuationSequenceNumberAsScala(value: Option[String]): SubscribeToShardEvent.Builder = {
    value.fold(self) { v =>
      self.continuationSequenceNumber(v)
    }
  } // String

  final def millisBehindLatestAsScala(value: Option[Long]): SubscribeToShardEvent.Builder = {
    value.fold(self) { v =>
      self.millisBehindLatest(v)
    }
  } // Long

}

final class SubscribeToShardEventOps(val self: SubscribeToShardEvent) extends AnyVal {

  final def recordsAsScala: Option[Seq[Record]] = Option(self.records).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Record]

  final def continuationSequenceNumberAsScala: Option[String] = Option(self.continuationSequenceNumber) // String

  final def millisBehindLatestAsScala: Option[Long] = Option(self.millisBehindLatest) // Long

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubscribeToShardEventOps {

  implicit def toSubscribeToShardEventBuilderOps(v: SubscribeToShardEvent.Builder): SubscribeToShardEventBuilderOps =
    new SubscribeToShardEventBuilderOps(v)

  implicit def toSubscribeToShardEventOps(v: SubscribeToShardEvent): SubscribeToShardEventOps =
    new SubscribeToShardEventOps(v)

}
