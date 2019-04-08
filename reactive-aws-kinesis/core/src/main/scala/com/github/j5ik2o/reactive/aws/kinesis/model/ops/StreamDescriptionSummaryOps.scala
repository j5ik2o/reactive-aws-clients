// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class StreamDescriptionSummaryBuilderOps(val self: StreamDescriptionSummary.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  }

  final def streamARNAsScala(value: Option[String]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.streamARN(v)
    }
  }

  final def streamStatusAsScala(value: Option[StreamStatus]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.streamStatus(v)
    }
  }

  final def retentionPeriodHoursAsScala(value: Option[Int]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.retentionPeriodHours(v)
    }
  }

  final def streamCreationTimestampAsScala(value: Option[java.time.Instant]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.streamCreationTimestamp(v)
    }
  }

  final def enhancedMonitoringAsScala(value: Option[Seq[EnhancedMetrics]]): StreamDescriptionSummary.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.enhancedMonitoring(v.asJava)
    }
  }

  final def encryptionTypeAsScala(value: Option[EncryptionType]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.encryptionType(v)
    }
  }

  final def keyIdAsScala(value: Option[String]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  final def openShardCountAsScala(value: Option[Int]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.openShardCount(v)
    }
  }

  final def consumerCountAsScala(value: Option[Int]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.consumerCount(v)
    }
  }

}

final class StreamDescriptionSummaryOps(val self: StreamDescriptionSummary) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName)

  final def streamARNAsScala: Option[String] = Option(self.streamARN)

  final def streamStatusAsScala: Option[StreamStatus] = Option(self.streamStatus)

  final def retentionPeriodHoursAsScala: Option[Int] = Option(self.retentionPeriodHours)

  final def streamCreationTimestampAsScala: Option[java.time.Instant] = Option(self.streamCreationTimestamp)

  final def enhancedMonitoringAsScala: Option[Seq[EnhancedMetrics]] = Option(self.enhancedMonitoring).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def encryptionTypeAsScala: Option[EncryptionType] = Option(self.encryptionType)

  final def keyIdAsScala: Option[String] = Option(self.keyId)

  final def openShardCountAsScala: Option[Int] = Option(self.openShardCount)

  final def consumerCountAsScala: Option[Int] = Option(self.consumerCount)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStreamDescriptionSummaryOps {

  implicit def toStreamDescriptionSummaryBuilderOps(
      v: StreamDescriptionSummary.Builder
  ): StreamDescriptionSummaryBuilderOps = new StreamDescriptionSummaryBuilderOps(v)

  implicit def toStreamDescriptionSummaryOps(v: StreamDescriptionSummary): StreamDescriptionSummaryOps =
    new StreamDescriptionSummaryOps(v)

}
