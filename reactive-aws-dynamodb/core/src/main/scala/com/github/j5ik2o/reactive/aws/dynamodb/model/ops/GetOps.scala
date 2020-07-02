// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GetBuilderOps(val self: Get.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[Map[String, AttributeValue]]): Get.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.key(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): Get.Builder = {
    value.fold(self) { v => self.tableName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectionExpressionAsScala(value: Option[String]): Get.Builder = {
    value.fold(self) { v => self.projectionExpression(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): Get.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expressionAttributeNames(v.asJava)
    }
  }

}

final class GetOps(val self: Get) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[Map[String, AttributeValue]] =
    Option(self.key).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectionExpressionAsScala: Option[String] = Option(self.projectionExpression)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeNamesAsScala: Option[Map[String, String]] =
    Option(self.expressionAttributeNames).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetOps {

  implicit def toGetBuilderOps(v: Get.Builder): GetBuilderOps = new GetBuilderOps(v)

  implicit def toGetOps(v: Get): GetOps = new GetOps(v)

}
