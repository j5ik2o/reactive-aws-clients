// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GetBuilderOps(val self: Get.Builder) extends AnyVal {

  final def withKeyAsScala(value: Option[Map[String, AttributeValue]]): Get.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.key(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def withTableNameAsScala(value: Option[String]): Get.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def withProjectionExpressionAsScala(value: Option[String]): Get.Builder = {
    value.fold(self) { v =>
      self.projectionExpression(v)
    }
  } // String

  final def withExpressionAttributeNamesAsScala(value: Option[Map[String, String]]): Get.Builder = {
    value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeNames(v.asJava)
    } // Map[String, String]
  }

}

final class GetOps(val self: Get) extends AnyVal {

  final def keyAsScala: Option[Map[String, AttributeValue]] = Option(self.key).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def projectionExpressionAsScala: Option[String] = Option(self.projectionExpression) // String

  final def expressionAttributeNamesAsScala: Option[Map[String, String]] = Option(self.expressionAttributeNames).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetOps {

  implicit def toGetBuilderOps(v: Get.Builder): GetBuilderOps = new GetBuilderOps(v)

  implicit def toGetOps(v: Get): GetOps = new GetOps(v)

}
