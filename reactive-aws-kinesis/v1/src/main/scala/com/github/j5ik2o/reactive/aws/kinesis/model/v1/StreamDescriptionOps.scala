package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import java.util.Date

import com.amazonaws.services.kinesis.model.{ StreamDescription => JavaStreamDescription }
import com.github.j5ik2o.reactive.aws.kinesis.model.{
  EncryptionType,
  StreamStatus,
  StreamDescription => ScalaStreamDescription
}

import scala.collection.JavaConverters._

object StreamDescriptionOps {

  import EnhancedMetricsOps._
  import ShardOps._

  implicit class ScalaStreamDescriptionOps(val self: ScalaStreamDescription) extends AnyVal {

    def toJava: JavaStreamDescription = {
      val result = new JavaStreamDescription
      self.streamName.foreach(result.setStreamName)
      self.streamARN.foreach(result.setStreamARN)
      self.streamStatus.map(_.entryName).foreach(result.setStreamStatus)
      self.shards.map(_.map(_.toJava).asJava).foreach(result.setShards)
      self.hasMoreShards.foreach(v => result.setHasMoreShards(v))
      self.retentionPeriodHours.foreach(v => result.setRetentionPeriodHours(v))
      self.streamCreationTimestamp.map(Date.from).foreach(result.setStreamCreationTimestamp)
      self.enhancedMonitoring.map(_.map(_.toJava).asJava).foreach(result.setEnhancedMonitoring)
      self.encryptionType.map(_.entryName).foreach(result.setEncryptionType)
      self.keyId.foreach(result.setKeyId)
      result
    }

  }

  implicit class JavaStreamDescriptionOps(val self: JavaStreamDescription) extends AnyVal {

    def toScala: ScalaStreamDescription = {
      ScalaStreamDescription()
        .withStreamName(Option(self.getStreamName))
        .withStreamARN(Option(self.getStreamARN))
        .withStreamStatus(Option(self.getStreamStatus).map(StreamStatus.withName))
        .withShards(Option(self.getShards).map(_.asScala.map(_.toScala)))
        .withHasMoreShards(Option(self.getHasMoreShards))
        .withRetentionPeriodHours(Option(self.getRetentionPeriodHours()))
        .withStreamCreationTimestamp(Option(self.getStreamCreationTimestamp).map(_.toInstant))
        .withEnhancedMonitoring(Option(self.getEnhancedMonitoring).map(_.asScala.map(_.toScala)))
        .withEncryptionType(Option(self.getEncryptionType).map(EncryptionType.withName))
        .withKeyId(Option(self.getKeyId))
    }

  }

}
