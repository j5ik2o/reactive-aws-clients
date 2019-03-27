// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  GlobalSecondaryIndexDescription => ScalaGlobalSecondaryIndexDescription,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  GlobalSecondaryIndexDescription => JavaGlobalSecondaryIndexDescription
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GlobalSecondaryIndexDescriptionOps {

  implicit class ScalaGlobalSecondaryIndexDescriptionOps(val self: ScalaGlobalSecondaryIndexDescription)
      extends AnyVal {

    def toJava: JavaGlobalSecondaryIndexDescription = {
      val result = new JavaGlobalSecondaryIndexDescription()
      self.indexName.filter(_.nonEmpty).foreach(v => result.withIndexName(v)) // String
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.withKeySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement]
      self.projection.foreach { v =>
        import ProjectionOps._; result.withProjection(v.toJava)
      } // Projection
      self.indexStatus.foreach { v =>
        import IndexStatusOps._; result.withIndexStatus(v.toJava)
      } // String
      self.backfilling.map(_.booleanValue).foreach(v => result.withBackfilling(v)) // Boolean
      self.provisionedThroughput.foreach { v =>
        import ProvisionedThroughputDescriptionOps._; result.withProvisionedThroughput(v.toJava)
      } // ProvisionedThroughputDescription
      self.indexSizeBytes.map(_.longValue).foreach(v => result.withIndexSizeBytes(v)) // Long
      self.itemCount.map(_.longValue).foreach(v => result.withItemCount(v))           // Long
      self.indexArn.filter(_.nonEmpty).foreach(v => result.withIndexArn(v))           // String

      result
    }

  }

  implicit class JavaGlobalSecondaryIndexDescriptionOps(val self: JavaGlobalSecondaryIndexDescription) extends AnyVal {

    def toScala: ScalaGlobalSecondaryIndexDescription = {
      ScalaGlobalSecondaryIndexDescription()
        .withIndexName(Option(self.getIndexName)) // String
        .withKeySchema(Option(self.getKeySchema).map { v =>
          import scala.collection.JavaConverters._, KeySchemaElementOps._; v.asScala.map(_.toScala)
        }) // Seq[KeySchemaElement]
        .withProjection(Option(self.getProjection).map { v =>
          import ProjectionOps._; v.toScala
        }) // Projection
        .withIndexStatus(Option(self.getIndexStatus).map { v =>
          import IndexStatusOps._; v.toScala
        }) // String
        .withBackfilling(Option(self.getBackfilling).map(_.booleanValue)) // Boolean
        .withProvisionedThroughput(Option(self.getProvisionedThroughput).map { v =>
          import ProvisionedThroughputDescriptionOps._; v.toScala
        }) // ProvisionedThroughputDescription
        .withIndexSizeBytes(Option(self.getIndexSizeBytes).map(_.longValue)) // Long
        .withItemCount(Option(self.getItemCount).map(_.longValue)) // Long
        .withIndexArn(Option(self.getIndexArn)) // String
    }

  }

}
