// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class StreamDescriptionBuilderOps(val self: StreamDescription.Builder) extends AnyVal {

  final def withStreamNameAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

  final def withStreamARNAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamARN(v)
    }
  } // String

  final def withStreamStatusAsScala(value: Option[StreamStatus]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamStatus(v)
    }
  } // String

  final def withShardsAsScala(value: Option[Seq[Shard]]): StreamDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.shards(v.asJava)
    } // Seq[Shard]
  }

  final def withHasMoreShardsAsScala(value: Option[Boolean]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.hasMoreShards(v)
    }
  } // Boolean

  final def withRetentionPeriodHoursAsScala(value: Option[Int]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.retentionPeriodHours(v)
    }
  } // Int

  final def withStreamCreationTimestampAsScala(value: Option[java.time.Instant]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamCreationTimestamp(v)
    }
  } // Instant

  final def withEnhancedMonitoringAsScala(value: Option[Seq[EnhancedMetrics]]): StreamDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.enhancedMonitoring(v.asJava)
    } // Seq[EnhancedMetrics]
  }

  final def withEncryptionTypeAsScala(value: Option[EncryptionType]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.encryptionType(v)
    }
  } // String

  final def withKeyIdAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  } // String

}

final class StreamDescriptionOps(val self: StreamDescription) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

  final def streamARNAsScala: Option[String] = Option(self.streamARN) // String

  final def streamStatusAsScala: Option[StreamStatus] = Option(self.streamStatus) // String

  final def shardsAsScala: Option[Seq[Shard]] = Option(self.shards).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Shard]

  final def hasMoreShardsAsScala: Option[Boolean] = Option(self.hasMoreShards) // Boolean

  final def retentionPeriodHoursAsScala: Option[Int] = Option(self.retentionPeriodHours) // Int

  final def streamCreationTimestampAsScala: Option[java.time.Instant] = Option(self.streamCreationTimestamp) // Instant

  final def enhancedMonitoringAsScala: Option[Seq[EnhancedMetrics]] = Option(self.enhancedMonitoring).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[EnhancedMetrics]

  final def encryptionTypeAsScala: Option[EncryptionType] = Option(self.encryptionType) // String

  final def keyIdAsScala: Option[String] = Option(self.keyId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStreamDescriptionOps {

  implicit def toStreamDescriptionBuilderOps(v: StreamDescription.Builder): StreamDescriptionBuilderOps =
    new StreamDescriptionBuilderOps(v)

  implicit def toStreamDescriptionOps(v: StreamDescription): StreamDescriptionOps = new StreamDescriptionOps(v)

}
