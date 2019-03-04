package com.github.j5ik2o.reactive.kinesis.model.v1

import java.util.Date

import com.amazonaws.services.kinesis.model.{ StreamDescriptionSummary => JavaStreamDescriptionSummary }
import com.github.j5ik2o.reactive.kinesis.model.{
  EncryptionType,
  StreamStatus,
  StreamDescriptionSummary => ScalaStreamDescriptionSummary
}

import scala.collection.JavaConverters._

object StreamDescriptionSummaryOps {

  import EnhancedMetricsOps._

  implicit class ScalaStreamDescriptionSummaryOps(val self: ScalaStreamDescriptionSummary) extends AnyVal {

    def toJava: JavaStreamDescriptionSummary = {
      val result = new JavaStreamDescriptionSummary
      self.streamName.foreach(result.setStreamName)
      self.streamARN.foreach(result.setStreamARN)
      self.streamStatus.map(_.entryName).foreach(result.setStreamStatus)
      self.retentionPeriodHours.foreach(v => result.setRetentionPeriodHours(v))
      self.streamCreationTimestamp.map(Date.from).foreach(result.setStreamCreationTimestamp)
      self.enhancedMonitoring.map(_.map(_.toJava).asJava).foreach(result.setEnhancedMonitoring)
      self.encryptionType.map(_.entryName).foreach(result.setEncryptionType)
      self.keyId.foreach(result.setKeyId)
      self.openShardCount.foreach(v => result.setOpenShardCount(v))
      self.consumerCount.foreach(v => result.setConsumerCount(v))
      result
    }

  }

  implicit class JavaStreamDescriptionSummaryOps(val self: JavaStreamDescriptionSummary) extends AnyVal {

    def toScala: ScalaStreamDescriptionSummary = {
      ScalaStreamDescriptionSummary()
        .withStreamName(Option(self.getStreamName))
        .withStreamARN(Option(self.getStreamARN))
        .withStreamStatus(Option(self.getStreamStatus).map(StreamStatus.withName))
        .withRetentionPeriodHours(Option(self.getRetentionPeriodHours()))
        .withStreamCreationTimestamp(Option(self.getStreamCreationTimestamp).map(_.toInstant))
        .withEnhancedMonitoring(Option(self.getEnhancedMonitoring).map(_.asScala.map(_.toScala)))
        .withEncryptionType(Option(self.getEncryptionType).map(EncryptionType.withName))
        .withKeyId(Option(self.getKeyId))
        .withOpenShardCount(Option(self.getOpenShardCount))
        .withConsumerCount(Option(self.getConsumerCount))
    }

  }

}
