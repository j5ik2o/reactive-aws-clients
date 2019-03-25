package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateTableRequest => ScalaCreateTableRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ CreateTableRequest => JavaCreateTableRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateTableRequestOps {

  implicit class ScalaCreateTableRequestOps(val self: ScalaCreateTableRequest) extends AnyVal {

    def toJava: JavaCreateTableRequest = {
      val result = JavaCreateTableRequest.builder()
      self.attributeDefinitions.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeDefinitionOps._;
        result.attributeDefinitions(v.map(_.toJava).asJava)
      } // Seq[AttributeDefinition], case Seq[_], UserDefined
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v)) // String, case String
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.keySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement], case Seq[_], UserDefined
      self.localSecondaryIndexes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.localSecondaryIndexes(v.map(_.toJava).asJava)
      } // Seq[LocalSecondaryIndex], case Seq[_], UserDefined
      self.globalSecondaryIndexes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, GlobalSecondaryIndexOps._;
        result.globalSecondaryIndexes(v.map(_.toJava).asJava)
      } // Seq[GlobalSecondaryIndex], case Seq[_], UserDefined
      self.billingMode.foreach { v =>
        import BillingModeOps._; result.billingMode(v.toJava)
      } // String, case Other
      self.provisionedThroughput.foreach { v =>
        result.provisionedThroughput(v.toJava)
      } // ProvisionedThroughput, case Other
      self.streamSpecification.foreach { v =>
        import StreamSpecificationOps._; result.streamSpecification(v.toJava)
      } // StreamSpecification, case Other
      self.sseSpecification.foreach { v =>
        import SSESpecificationOps._; result.sseSpecification(v.toJava)
      } // SSESpecification, case Other

      result.build()
    }

  }

}
