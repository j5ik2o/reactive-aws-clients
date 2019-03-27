// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ StreamDescription => ScalaStreamDescription, _ }
import software.amazon.awssdk.services.dynamodb.model.{ StreamDescription => JavaStreamDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StreamDescriptionOps {

  implicit class ScalaStreamDescriptionOps(val self: ScalaStreamDescription) extends AnyVal {

    def toJava: JavaStreamDescription = {
      val result = JavaStreamDescription.builder()
      self.streamArn.filter(_.nonEmpty).foreach(v => result.streamArn(v))     // String
      self.streamLabel.filter(_.nonEmpty).foreach(v => result.streamLabel(v)) // String
      self.streamStatus.foreach { v =>
        import StreamStatusOps._; result.streamStatus(v.toJava)
      } // String
      self.streamViewType.foreach { v =>
        import StreamViewTypeOps._; result.streamViewType(v.toJava)
      } // String
      self.creationRequestDateTime.foreach(v => result.creationRequestDateTime(v)) // Instant
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v))          // String
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.keySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement]
      self.shards.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ShardOps._; result.shards(v.map(_.toJava).asJava)
      } // Seq[Shard]
      self.lastEvaluatedShardId.filter(_.nonEmpty).foreach(v => result.lastEvaluatedShardId(v)) // String

      result.build()
    }

  }

  implicit class JavaStreamDescriptionOps(val self: JavaStreamDescription) extends AnyVal {

    def toScala: ScalaStreamDescription = {
      ScalaStreamDescription()
        .withStreamArn(Option(self.streamArn)) // String
        .withStreamLabel(Option(self.streamLabel)) // String
        .withStreamStatus(Option(self.streamStatus).map { v =>
          import StreamStatusOps._; v.toScala
        }) // String
        .withStreamViewType(Option(self.streamViewType).map { v =>
          import StreamViewTypeOps._; v.toScala
        }) // String
        .withCreationRequestDateTime(Option(self.creationRequestDateTime)) // Instant
        .withTableName(Option(self.tableName)) // String
        .withKeySchema(Option(self.keySchema).map { v =>
          import scala.collection.JavaConverters._, KeySchemaElementOps._; v.asScala.map(_.toScala)
        }) // Seq[KeySchemaElement]
        .withShards(Option(self.shards).map { v =>
          import scala.collection.JavaConverters._, ShardOps._; v.asScala.map(_.toScala)
        }) // Seq[Shard]
        .withLastEvaluatedShardId(Option(self.lastEvaluatedShardId)) // String
    }

  }

}
