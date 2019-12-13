// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class StreamDescriptionBuilderOps(val self: StreamDescription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamNameAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamARNAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamARN(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamStatusAsScala(value: Option[StreamStatus]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shardsAsScala(value: Option[Seq[Shard]]): StreamDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.shards(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retentionPeriodHoursAsScala(value: Option[Int]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.retentionPeriodHours(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamCreationTimestampAsScala(value: Option[java.time.Instant]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamCreationTimestamp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enhancedMonitoringAsScala(value: Option[Seq[EnhancedMetrics]]): StreamDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.enhancedMonitoring(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionTypeAsScala(value: Option[EncryptionType]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.encryptionType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

}

final class StreamDescriptionOps(val self: StreamDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamNameAsScala: Option[String] = Option(self.streamName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamARNAsScala: Option[String] = Option(self.streamARN)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamStatusAsScala: Option[StreamStatus] = Option(self.streamStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shardsAsScala: Option[Seq[Shard]] = Option(self.shards).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retentionPeriodHoursAsScala: Option[Int] = Option(self.retentionPeriodHours)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamCreationTimestampAsScala: Option[java.time.Instant] = Option(self.streamCreationTimestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enhancedMonitoringAsScala: Option[Seq[EnhancedMetrics]] = Option(self.enhancedMonitoring).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionTypeAsScala: Option[EncryptionType] = Option(self.encryptionType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStreamDescriptionOps {

  implicit def toStreamDescriptionBuilderOps(v: StreamDescription.Builder): StreamDescriptionBuilderOps =
    new StreamDescriptionBuilderOps(v)

  implicit def toStreamDescriptionOps(v: StreamDescription): StreamDescriptionOps = new StreamDescriptionOps(v)

}
