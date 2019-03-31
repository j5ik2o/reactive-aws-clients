// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ StreamDescriptionSummary => ScalaStreamDescriptionSummary, _ }
import software.amazon.awssdk.services.kinesis.model.{ StreamDescriptionSummary => JavaStreamDescriptionSummary }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StreamDescriptionSummaryOps {

  implicit class ScalaStreamDescriptionSummaryOps(val self: ScalaStreamDescriptionSummary) extends AnyVal {

    def toJava: JavaStreamDescriptionSummary = {
      val result = JavaStreamDescriptionSummary.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v)) // String
      self.streamARN.filter(_.nonEmpty).foreach(v => result.streamARN(v))   // String
      self.streamStatus.foreach { v =>
        import StreamStatusOps._; result.streamStatus(v.toJava)
      } // String
      self.retentionPeriodHours.map(_.intValue).foreach(v => result.retentionPeriodHours(v)) // Int
      self.streamCreationTimestamp.foreach(v => result.streamCreationTimestamp(v))           // Instant
      self.enhancedMonitoring.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, EnhancedMetricsOps._;
        result.enhancedMonitoring(v.map(_.toJava).asJava)
      } // Seq[EnhancedMetrics]
      self.encryptionType.foreach { v =>
        import EncryptionTypeOps._; result.encryptionType(v.toJava)
      } // String
      self.keyId.filter(_.nonEmpty).foreach(v => result.keyId(v))                // String
      self.openShardCount.map(_.intValue).foreach(v => result.openShardCount(v)) // Int
      self.consumerCount.map(_.intValue).foreach(v => result.consumerCount(v))   // Int

      result.build()
    }

  }

  implicit class JavaStreamDescriptionSummaryOps(val self: JavaStreamDescriptionSummary) extends AnyVal {

    def toScala: ScalaStreamDescriptionSummary = {
      ScalaStreamDescriptionSummary()
        .withStreamName(Option(self.streamName)) // String
        .withStreamARN(Option(self.streamARN)) // String
        .withStreamStatus(Option(self.streamStatus).map { v =>
          import StreamStatusOps._; v.toScala
        }) // String
        .withRetentionPeriodHours(Option(self.retentionPeriodHours).map(_.intValue)) // Int
        .withStreamCreationTimestamp(Option(self.streamCreationTimestamp)) // Instant
        .withEnhancedMonitoring(Option(self.enhancedMonitoring).map { v =>
          import scala.collection.JavaConverters._, EnhancedMetricsOps._; v.asScala.map(_.toScala)
        }) // Seq[EnhancedMetrics]
        .withEncryptionType(Option(self.encryptionType).map { v =>
          import EncryptionTypeOps._; v.toScala
        }) // String
        .withKeyId(Option(self.keyId)) // String
        .withOpenShardCount(Option(self.openShardCount).map(_.intValue)) // Int
        .withConsumerCount(Option(self.consumerCount).map(_.intValue)) // Int
    }

  }

}
