// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  GlobalSecondaryIndexDescription => ScalaGlobalSecondaryIndexDescription,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  GlobalSecondaryIndexDescription => JavaGlobalSecondaryIndexDescription
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GlobalSecondaryIndexDescriptionOps {

  implicit class ScalaGlobalSecondaryIndexDescriptionOps(val self: ScalaGlobalSecondaryIndexDescription)
      extends AnyVal {

    def toJava: JavaGlobalSecondaryIndexDescription = {
      val result = JavaGlobalSecondaryIndexDescription.builder()
      self.indexName.filter(_.nonEmpty).foreach(v => result.indexName(v)) // String
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.keySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement]
      self.projection.foreach { v =>
        import ProjectionOps._; result.projection(v.toJava)
      } // Projection
      self.indexStatus.foreach { v =>
        import IndexStatusOps._; result.indexStatus(v.toJava)
      } // String
      self.backfilling.map(_.booleanValue).foreach(v => result.backfilling(v)) // Boolean
      self.provisionedThroughput.foreach { v =>
        import ProvisionedThroughputDescriptionOps._; result.provisionedThroughput(v.toJava)
      } // ProvisionedThroughputDescription
      self.indexSizeBytes.map(_.longValue).foreach(v => result.indexSizeBytes(v)) // Long
      self.itemCount.map(_.longValue).foreach(v => result.itemCount(v))           // Long
      self.indexArn.filter(_.nonEmpty).foreach(v => result.indexArn(v))           // String

      result.build()
    }

  }

  implicit class JavaGlobalSecondaryIndexDescriptionOps(val self: JavaGlobalSecondaryIndexDescription) extends AnyVal {

    def toScala: ScalaGlobalSecondaryIndexDescription = {
      ScalaGlobalSecondaryIndexDescription()
        .withIndexName(Option(self.indexName)) // String
        .withKeySchema(Option(self.keySchema).map { v =>
          import scala.collection.JavaConverters._, KeySchemaElementOps._; v.asScala.map(_.toScala)
        }) // Seq[KeySchemaElement]
        .withProjection(Option(self.projection).map { v =>
          import ProjectionOps._; v.toScala
        }) // Projection
        .withIndexStatus(Option(self.indexStatus).map { v =>
          import IndexStatusOps._; v.toScala
        }) // String
        .withBackfilling(Option(self.backfilling).map(_.booleanValue)) // Boolean
        .withProvisionedThroughput(Option(self.provisionedThroughput).map { v =>
          import ProvisionedThroughputDescriptionOps._; v.toScala
        }) // ProvisionedThroughputDescription
        .withIndexSizeBytes(Option(self.indexSizeBytes).map(_.longValue)) // Long
        .withItemCount(Option(self.itemCount).map(_.longValue)) // Long
        .withIndexArn(Option(self.indexArn)) // String
    }

  }

}
