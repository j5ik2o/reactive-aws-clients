// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateTableRequest => ScalaCreateTableRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ CreateTableRequest => JavaCreateTableRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateTableRequestOps {

  implicit class ScalaCreateTableRequestOps(val self: ScalaCreateTableRequest) extends AnyVal {

    def toJava: JavaCreateTableRequest = {
      val result = new JavaCreateTableRequest()
      self.attributeDefinitions.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeDefinitionOps._;
        result.withAttributeDefinitions(v.map(_.toJava).asJava)
      } // Seq[AttributeDefinition]
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v)) // String
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.withKeySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement]
      self.localSecondaryIndexes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, LocalSecondaryIndexOps._;
        result.withLocalSecondaryIndexes(v.map(_.toJava).asJava)
      } // Seq[LocalSecondaryIndex]
      self.globalSecondaryIndexes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, GlobalSecondaryIndexOps._;
        result.withGlobalSecondaryIndexes(v.map(_.toJava).asJava)
      } // Seq[GlobalSecondaryIndex]
      self.billingMode.foreach { v =>
        import BillingModeOps._; result.withBillingMode(v.toJava)
      } // String
      self.provisionedThroughput.foreach { v =>
        import ProvisionedThroughputOps._; result.withProvisionedThroughput(v.toJava)
      } // ProvisionedThroughput
      self.streamSpecification.foreach { v =>
        import StreamSpecificationOps._; result.withStreamSpecification(v.toJava)
      } // StreamSpecification
      self.sseSpecification.foreach { v =>
        import SSESpecificationOps._; result.withSSESpecification(v.toJava)
      } // SSESpecification

      result
    }

  }

}
