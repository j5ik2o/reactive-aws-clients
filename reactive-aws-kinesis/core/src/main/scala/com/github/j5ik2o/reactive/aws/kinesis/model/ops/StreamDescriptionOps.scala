// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ StreamDescription => ScalaStreamDescription, _ }
import software.amazon.awssdk.services.kinesis.model.{ StreamDescription => JavaStreamDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StreamDescriptionOps {

  implicit class ScalaStreamDescriptionOps(val self: ScalaStreamDescription) extends AnyVal {

    def toJava: JavaStreamDescription = {
      val result = JavaStreamDescription.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v)) // String
      self.streamARN.filter(_.nonEmpty).foreach(v => result.streamARN(v))   // String
      self.streamStatus.foreach { v =>
        import StreamStatusOps._; result.streamStatus(v.toJava)
      } // String
      self.shards.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ShardOps._; result.shards(v.map(_.toJava).asJava)
      } // Seq[Shard]
      self.hasMoreShards.map(_.booleanValue).foreach(v => result.hasMoreShards(v))           // Boolean
      self.retentionPeriodHours.map(_.intValue).foreach(v => result.retentionPeriodHours(v)) // Int
      self.streamCreationTimestamp.foreach(v => result.streamCreationTimestamp(v))           // Instant
      self.enhancedMonitoring.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, EnhancedMetricsOps._;
        result.enhancedMonitoring(v.map(_.toJava).asJava)
      } // Seq[EnhancedMetrics]
      self.encryptionType.foreach { v =>
        import EncryptionTypeOps._; result.encryptionType(v.toJava)
      } // String
      self.keyId.filter(_.nonEmpty).foreach(v => result.keyId(v)) // String

      result.build()
    }

  }

  implicit class JavaStreamDescriptionOps(val self: JavaStreamDescription) extends AnyVal {

    def toScala: ScalaStreamDescription = {
      ScalaStreamDescription()
        .withStreamName(Option(self.streamName)) // String
        .withStreamARN(Option(self.streamARN)) // String
        .withStreamStatus(Option(self.streamStatus).map { v =>
          import StreamStatusOps._; v.toScala
        }) // String
        .withShards(Option(self.shards).map { v =>
          import scala.collection.JavaConverters._, ShardOps._; v.asScala.map(_.toScala)
        }) // Seq[Shard]
        .withHasMoreShards(Option(self.hasMoreShards).map(_.booleanValue)) // Boolean
        .withRetentionPeriodHours(Option(self.retentionPeriodHours).map(_.intValue)) // Int
        .withStreamCreationTimestamp(Option(self.streamCreationTimestamp)) // Instant
        .withEnhancedMonitoring(Option(self.enhancedMonitoring).map { v =>
          import scala.collection.JavaConverters._, EnhancedMetricsOps._; v.asScala.map(_.toScala)
        }) // Seq[EnhancedMetrics]
        .withEncryptionType(Option(self.encryptionType).map { v =>
          import EncryptionTypeOps._; v.toScala
        }) // String
        .withKeyId(Option(self.keyId)) // String
    }

  }

}
