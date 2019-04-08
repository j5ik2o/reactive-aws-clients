// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class StreamDescriptionSummaryBuilderOps(val self: StreamDescriptionSummary.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

  final def streamARNAsScala(value: Option[String]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.streamARN(v)
    }
  } // String

  final def streamStatusAsScala(value: Option[StreamStatus]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.streamStatus(v)
    }
  } // StreamStatus

  final def retentionPeriodHoursAsScala(value: Option[Int]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.retentionPeriodHours(v)
    }
  } // Int

  final def streamCreationTimestampAsScala(value: Option[java.time.Instant]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.streamCreationTimestamp(v)
    }
  } // java.time.Instant

  final def enhancedMonitoringAsScala(value: Option[Seq[EnhancedMetrics]]): StreamDescriptionSummary.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.enhancedMonitoring(v.asJava)
    } // Seq[EnhancedMetrics]
  }

  final def encryptionTypeAsScala(value: Option[EncryptionType]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.encryptionType(v)
    }
  } // EncryptionType

  final def keyIdAsScala(value: Option[String]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  } // String

  final def openShardCountAsScala(value: Option[Int]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.openShardCount(v)
    }
  } // Int

  final def consumerCountAsScala(value: Option[Int]): StreamDescriptionSummary.Builder = {
    value.fold(self) { v =>
      self.consumerCount(v)
    }
  } // Int

}

final class StreamDescriptionSummaryOps(val self: StreamDescriptionSummary) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

  final def streamARNAsScala: Option[String] = Option(self.streamARN) // String

  final def streamStatusAsScala: Option[StreamStatus] = Option(self.streamStatus) // StreamStatus

  final def retentionPeriodHoursAsScala: Option[Int] = Option(self.retentionPeriodHours) // Int

  final def streamCreationTimestampAsScala: Option[java.time.Instant] =
    Option(self.streamCreationTimestamp) // java.time.Instant

  final def enhancedMonitoringAsScala: Option[Seq[EnhancedMetrics]] = Option(self.enhancedMonitoring).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[EnhancedMetrics]

  final def encryptionTypeAsScala: Option[EncryptionType] = Option(self.encryptionType) // EncryptionType

  final def keyIdAsScala: Option[String] = Option(self.keyId) // String

  final def openShardCountAsScala: Option[Int] = Option(self.openShardCount) // Int

  final def consumerCountAsScala: Option[Int] = Option(self.consumerCount) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStreamDescriptionSummaryOps {

  implicit def toStreamDescriptionSummaryBuilderOps(
      v: StreamDescriptionSummary.Builder
  ): StreamDescriptionSummaryBuilderOps = new StreamDescriptionSummaryBuilderOps(v)

  implicit def toStreamDescriptionSummaryOps(v: StreamDescriptionSummary): StreamDescriptionSummaryOps =
    new StreamDescriptionSummaryOps(v)

}
