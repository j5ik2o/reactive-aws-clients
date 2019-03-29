// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ StreamDescriptionSummary => ScalaStreamDescriptionSummary, _ }
import com.amazonaws.services.kinesis.model.{ StreamDescriptionSummary => JavaStreamDescriptionSummary }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StreamDescriptionSummaryOps {

  implicit class ScalaStreamDescriptionSummaryOps(val self: ScalaStreamDescriptionSummary) extends AnyVal {

    def toJava: JavaStreamDescriptionSummary = {
      val result = new JavaStreamDescriptionSummary()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v)) // String
      self.streamARN.filter(_.nonEmpty).foreach(v => result.withStreamARN(v))   // String
      self.streamStatus.foreach { v =>
        import StreamStatusOps._; result.withStreamStatus(v.toJava)
      } // String
      self.retentionPeriodHours.map(_.intValue).foreach(v => result.withRetentionPeriodHours(v)) // Int
      self.streamCreationTimestamp
        .map(java.util.Date.from).foreach(v => result.withStreamCreationTimestamp(v)) // Instant
      self.enhancedMonitoring.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, EnhancedMetricsOps._;
        result.withEnhancedMonitoring(v.map(_.toJava).asJava)
      } // Seq[EnhancedMetrics]
      self.encryptionType.foreach { v =>
        import EncryptionTypeOps._; result.withEncryptionType(v.toJava)
      } // String
      self.keyId.filter(_.nonEmpty).foreach(v => result.withKeyId(v))                // String
      self.openShardCount.map(_.intValue).foreach(v => result.withOpenShardCount(v)) // Int
      self.consumerCount.map(_.intValue).foreach(v => result.withConsumerCount(v))   // Int

      result
    }

  }

  implicit class JavaStreamDescriptionSummaryOps(val self: JavaStreamDescriptionSummary) extends AnyVal {

    def toScala: ScalaStreamDescriptionSummary = {
      ScalaStreamDescriptionSummary()
        .withStreamName(Option(self.getStreamName)) // String
        .withStreamARN(Option(self.getStreamARN)) // String
        .withStreamStatus(Option(self.getStreamStatus).map { v =>
          import StreamStatusOps._; v.toScala
        }) // String
        .withRetentionPeriodHours(Option(self.getRetentionPeriodHours).map(_.intValue)) // Int
        .withStreamCreationTimestamp(Option(self.getStreamCreationTimestamp).map(_.toInstant)) // Instant
        .withEnhancedMonitoring(Option(self.getEnhancedMonitoring).map { v =>
          import scala.collection.JavaConverters._, EnhancedMetricsOps._; v.asScala.map(_.toScala)
        }) // Seq[EnhancedMetrics]
        .withEncryptionType(Option(self.getEncryptionType).map { v =>
          import EncryptionTypeOps._; v.toScala
        }) // String
        .withKeyId(Option(self.getKeyId)) // String
        .withOpenShardCount(Option(self.getOpenShardCount).map(_.intValue)) // Int
        .withConsumerCount(Option(self.getConsumerCount).map(_.intValue)) // Int
    }

  }

}
