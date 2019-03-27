// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateTableRequest => ScalaUpdateTableRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ UpdateTableRequest => JavaUpdateTableRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateTableRequestOps {

  implicit class ScalaUpdateTableRequestOps(val self: ScalaUpdateTableRequest) extends AnyVal {

    def toJava: JavaUpdateTableRequest = {
      val result = new JavaUpdateTableRequest()
      self.attributeDefinitions.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeDefinitionOps._;
        result.withAttributeDefinitions(v.map(_.toJava).asJava)
      } // Seq[AttributeDefinition]
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v)) // String
      self.billingMode.foreach { v =>
        import BillingModeOps._; result.withBillingMode(v.toJava)
      } // String
      self.provisionedThroughput.foreach { v =>
        import ProvisionedThroughputOps._; result.withProvisionedThroughput(v.toJava)
      } // ProvisionedThroughput
      self.globalSecondaryIndexUpdates.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, GlobalSecondaryIndexUpdateOps._;
        result.withGlobalSecondaryIndexUpdates(v.map(_.toJava).asJava)
      } // Seq[GlobalSecondaryIndexUpdate]
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
