// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ StreamDescription => ScalaStreamDescription, _ }
import com.amazonaws.services.kinesis.model.{ StreamDescription => JavaStreamDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StreamDescriptionOps {

  implicit class ScalaStreamDescriptionOps(val self: ScalaStreamDescription) extends AnyVal {

    def toJava: JavaStreamDescription = {
      val result = new JavaStreamDescription()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v)) // String
      self.streamARN.filter(_.nonEmpty).foreach(v => result.withStreamARN(v))   // String
      self.streamStatus.foreach { v =>
        import StreamStatusOps._; result.withStreamStatus(v.toJava)
      } // String
      self.shards.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ShardOps._; result.withShards(v.map(_.toJava).asJava)
      } // Seq[Shard]
      self.hasMoreShards.map(_.booleanValue).foreach(v => result.withHasMoreShards(v))           // Boolean
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
      self.keyId.filter(_.nonEmpty).foreach(v => result.withKeyId(v)) // String

      result
    }

  }

  implicit class JavaStreamDescriptionOps(val self: JavaStreamDescription) extends AnyVal {

    def toScala: ScalaStreamDescription = {
      ScalaStreamDescription()
        .withStreamName(Option(self.getStreamName)) // String
        .withStreamARN(Option(self.getStreamARN)) // String
        .withStreamStatus(Option(self.getStreamStatus).map { v =>
          import StreamStatusOps._; v.toScala
        }) // String
        .withShards(Option(self.getShards).map { v =>
          import scala.collection.JavaConverters._, ShardOps._; v.asScala.map(_.toScala)
        }) // Seq[Shard]
        .withHasMoreShards(Option(self.getHasMoreShards).map(_.booleanValue)) // Boolean
        .withRetentionPeriodHours(Option(self.getRetentionPeriodHours).map(_.intValue)) // Int
        .withStreamCreationTimestamp(Option(self.getStreamCreationTimestamp).map(_.toInstant)) // Instant
        .withEnhancedMonitoring(Option(self.getEnhancedMonitoring).map { v =>
          import scala.collection.JavaConverters._, EnhancedMetricsOps._; v.asScala.map(_.toScala)
        }) // Seq[EnhancedMetrics]
        .withEncryptionType(Option(self.getEncryptionType).map { v =>
          import EncryptionTypeOps._; v.toScala
        }) // String
        .withKeyId(Option(self.getKeyId)) // String
    }

  }

}
