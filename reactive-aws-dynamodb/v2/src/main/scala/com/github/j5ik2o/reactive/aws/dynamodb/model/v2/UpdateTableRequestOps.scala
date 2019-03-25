package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateTableRequest => ScalaUpdateTableRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ UpdateTableRequest => JavaUpdateTableRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateTableRequestOps {

  implicit class ScalaUpdateTableRequestOps(val self: ScalaUpdateTableRequest) extends AnyVal {

    def toJava: JavaUpdateTableRequest = {
      val result = JavaUpdateTableRequest.builder()
      self.attributeDefinitions.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeDefinitionOps._;
        result.attributeDefinitions(v.map(_.toJava).asJava)
      } // Seq[AttributeDefinition]
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v)) // String
      self.billingMode.foreach { v =>
        import BillingModeOps._; result.billingMode(v.toJava)
      } // String
      self.provisionedThroughput.foreach { v =>
        import ProvisionedThroughputOps._; result.provisionedThroughput(v.toJava)
      } // ProvisionedThroughput
      self.globalSecondaryIndexUpdates.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, GlobalSecondaryIndexUpdateOps._;
        result.globalSecondaryIndexUpdates(v.map(_.toJava).asJava)
      } // Seq[GlobalSecondaryIndexUpdate]
      self.streamSpecification.foreach { v =>
        import StreamSpecificationOps._; result.streamSpecification(v.toJava)
      } // StreamSpecification
      self.sseSpecification.foreach { v =>
        import SSESpecificationOps._; result.sseSpecification(v.toJava)
      } // SSESpecification

      result.build()
    }

  }

}
