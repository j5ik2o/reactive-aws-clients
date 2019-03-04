package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{
  EncryptionType,
  StreamStatus,
  StreamDescriptionSummary => ScalaStreamDescriptionSummary
}
import software.amazon.awssdk.services.kinesis.model.{ StreamDescriptionSummary => JavaStreamDescriptionSummary }

import scala.collection.JavaConverters._

object StreamDescriptionSummaryOps {

  import EnhancedMetricsOps._

  implicit class ScalaStreamDescriptionSummaryOps(val self: ScalaStreamDescriptionSummary) extends AnyVal {

    def toJava: JavaStreamDescriptionSummary = {
      val result = JavaStreamDescriptionSummary.builder()
      self.streamName.foreach(result.streamName)
      self.streamARN.foreach(result.streamARN)
      self.streamStatus.map(_.entryName).foreach(result.streamStatus)
      self.retentionPeriodHours.foreach(v => result.retentionPeriodHours(v))
      self.streamCreationTimestamp.foreach(result.streamCreationTimestamp)
      self.enhancedMonitoring.map(_.map(_.toJava).asJava).foreach(result.enhancedMonitoring)
      self.encryptionType.map(_.entryName).foreach(result.encryptionType)
      self.keyId.foreach(result.keyId)
      self.openShardCount.foreach(v => result.openShardCount(v))
      self.consumerCount.foreach(v => result.consumerCount(v))
      result.build()
    }

  }

  implicit class JavaStreamDescriptionSummaryOps(val self: JavaStreamDescriptionSummary) extends AnyVal {

    def toScala: ScalaStreamDescriptionSummary = {
      ScalaStreamDescriptionSummary()
        .withStreamName(Option(self.streamName()))
        .withStreamARN(Option(self.streamARN()))
        .withStreamStatus(Option(self.streamStatus()).map(_.toString).map(StreamStatus.withName))
        .withRetentionPeriodHours(Option(self.retentionPeriodHours()))
        .withStreamCreationTimestamp(Option(self.streamCreationTimestamp()))
        .withEnhancedMonitoring(Option(self.enhancedMonitoring()).map(_.asScala.map(_.toScala)))
        .withEncryptionType(Option(self.encryptionType()).map(_.toString).map(EncryptionType.withName))
        .withKeyId(Option(self.keyId()))
        .withOpenShardCount(Option(self.openShardCount()))
        .withConsumerCount(Option(self.consumerCount()))
    }

  }

}
