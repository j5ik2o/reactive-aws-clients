// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ StreamDescription => ScalaStreamDescription, _ }
import com.amazonaws.services.dynamodbv2.model.{ StreamDescription => JavaStreamDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StreamDescriptionOps {

  implicit class ScalaStreamDescriptionOps(val self: ScalaStreamDescription) extends AnyVal {

    def toJava: JavaStreamDescription = {
      val result = new JavaStreamDescription()
      self.streamArn.filter(_.nonEmpty).foreach(v => result.withStreamArn(v))     // String
      self.streamLabel.filter(_.nonEmpty).foreach(v => result.withStreamLabel(v)) // String
      self.streamStatus.foreach { v =>
        import StreamStatusOps._; result.withStreamStatus(v.toJava)
      } // String
      self.streamViewType.foreach { v =>
        import StreamViewTypeOps._; result.withStreamViewType(v.toJava)
      } // String
      self.creationRequestDateTime
        .map(java.util.Date.from).foreach(v => result.withCreationRequestDateTime(v)) // Instant
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v))         // String
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.withKeySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement]
      self.shards.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ShardOps._; result.withShards(v.map(_.toJava).asJava)
      } // Seq[Shard]
      self.lastEvaluatedShardId.filter(_.nonEmpty).foreach(v => result.withLastEvaluatedShardId(v)) // String

      result
    }

  }

  implicit class JavaStreamDescriptionOps(val self: JavaStreamDescription) extends AnyVal {

    def toScala: ScalaStreamDescription = {
      ScalaStreamDescription()
        .withStreamArn(Option(self.getStreamArn)) // String
        .withStreamLabel(Option(self.getStreamLabel)) // String
        .withStreamStatus(Option(self.getStreamStatus).map { v =>
          import StreamStatusOps._; v.toScala
        }) // String
        .withStreamViewType(Option(self.getStreamViewType).map { v =>
          import StreamViewTypeOps._; v.toScala
        }) // String
        .withCreationRequestDateTime(Option(self.getCreationRequestDateTime).map(_.toInstant)) // Instant
        .withTableName(Option(self.getTableName)) // String
        .withKeySchema(Option(self.getKeySchema).map { v =>
          import scala.collection.JavaConverters._, KeySchemaElementOps._; v.asScala.map(_.toScala)
        }) // Seq[KeySchemaElement]
        .withShards(Option(self.getShards).map { v =>
          import scala.collection.JavaConverters._, ShardOps._; v.asScala.map(_.toScala)
        }) // Seq[Shard]
        .withLastEvaluatedShardId(Option(self.getLastEvaluatedShardId)) // String
    }

  }

}
