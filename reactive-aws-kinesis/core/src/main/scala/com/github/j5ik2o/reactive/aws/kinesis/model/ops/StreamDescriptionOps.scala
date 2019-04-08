// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class StreamDescriptionBuilderOps(val self: StreamDescription.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  }

  final def streamARNAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamARN(v)
    }
  }

  final def streamStatusAsScala(value: Option[StreamStatus]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamStatus(v)
    }
  }

  final def shardsAsScala(value: Option[Seq[Shard]]): StreamDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.shards(v.asJava)
    }
  }

  final def hasMoreShardsAsScala(value: Option[Boolean]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.hasMoreShards(v)
    }
  }

  final def retentionPeriodHoursAsScala(value: Option[Int]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.retentionPeriodHours(v)
    }
  }

  final def streamCreationTimestampAsScala(value: Option[java.time.Instant]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamCreationTimestamp(v)
    }
  }

  final def enhancedMonitoringAsScala(value: Option[Seq[EnhancedMetrics]]): StreamDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.enhancedMonitoring(v.asJava)
    }
  }

  final def encryptionTypeAsScala(value: Option[EncryptionType]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.encryptionType(v)
    }
  }

  final def keyIdAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

}

final class StreamDescriptionOps(val self: StreamDescription) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName)

  final def streamARNAsScala: Option[String] = Option(self.streamARN)

  final def streamStatusAsScala: Option[StreamStatus] = Option(self.streamStatus)

  final def shardsAsScala: Option[Seq[Shard]] = Option(self.shards).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def hasMoreShardsAsScala: Option[Boolean] = Option(self.hasMoreShards)

  final def retentionPeriodHoursAsScala: Option[Int] = Option(self.retentionPeriodHours)

  final def streamCreationTimestampAsScala: Option[java.time.Instant] = Option(self.streamCreationTimestamp)

  final def enhancedMonitoringAsScala: Option[Seq[EnhancedMetrics]] = Option(self.enhancedMonitoring).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def encryptionTypeAsScala: Option[EncryptionType] = Option(self.encryptionType)

  final def keyIdAsScala: Option[String] = Option(self.keyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStreamDescriptionOps {

  implicit def toStreamDescriptionBuilderOps(v: StreamDescription.Builder): StreamDescriptionBuilderOps =
    new StreamDescriptionBuilderOps(v)

  implicit def toStreamDescriptionOps(v: StreamDescription): StreamDescriptionOps = new StreamDescriptionOps(v)

}
