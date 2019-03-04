package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  EncryptionType,
  StreamStatus,
  StreamDescription => ScalaStreamDescription
}
import software.amazon.awssdk.services.kinesis.model.{ StreamDescription => JavaStreamDescription }

import scala.collection.JavaConverters._

object StreamDescriptionOps {

  import EnhancedMetricsOps._
  import ShardOps._

  implicit class ScalaStreamDescriptionOps(val self: ScalaStreamDescription) extends AnyVal {

    def toJava: JavaStreamDescription = {
      val result = JavaStreamDescription.builder()
      self.streamName.foreach(result.streamName)
      self.streamARN.foreach(result.streamARN)
      self.streamStatus.map(_.entryName).foreach(result.streamStatus)
      self.shards.map(_.map(_.toJava).asJava).foreach(result.shards)
      self.hasMoreShards.foreach(v => result.hasMoreShards(v))
      self.retentionPeriodHours.foreach(v => result.retentionPeriodHours(v))
      self.streamCreationTimestamp.foreach(result.streamCreationTimestamp)
      self.enhancedMonitoring.map(_.map(_.toJava).asJava).foreach(result.enhancedMonitoring)
      self.encryptionType.map(_.entryName).foreach(result.encryptionType)
      self.keyId.foreach(result.keyId)
      result.build()
    }

  }

  implicit class JavaStreamDescriptionOps(val self: JavaStreamDescription) extends AnyVal {

    def toScala: ScalaStreamDescription = {
      ScalaStreamDescription()
        .withStreamName(Option(self.streamName()))
        .withStreamARN(Option(self.streamARN()))
        .withStreamStatus(Option(self.streamStatus()).map(_.toString).map(StreamStatus.withName))
        .withShards(Option(self.shards()).map(_.asScala.map(_.toScala)))
        .withHasMoreShards(Option(self.hasMoreShards))
        .withRetentionPeriodHours(Option(self.retentionPeriodHours()))
        .withStreamCreationTimestamp(Option(self.streamCreationTimestamp()))
        .withEnhancedMonitoring(Option(self.enhancedMonitoring()).map(_.asScala.map(_.toScala)))
        .withEncryptionType(Option(self.encryptionType()).map(_.toString).map(EncryptionType.withName))
        .withKeyId(Option(self.keyId))
    }

  }

}
