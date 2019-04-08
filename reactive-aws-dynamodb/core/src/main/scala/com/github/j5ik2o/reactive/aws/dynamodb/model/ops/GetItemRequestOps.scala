// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GetItemRequestBuilderOps(val self: GetItemRequest.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): GetItemRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  final def keyAsScala(value: Option[Map[String, AttributeValue]]): GetItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.key(v.asJava)
    }
  }

  final def attributesToGetAsScala(value: Option[Seq[String]]): GetItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributesToGet(v.asJava)
    }
  }

  final def consistentReadAsScala(value: Option[Boolean]): GetItemRequest.Builder = {
    value.fold(self) { v =>
      self.consistentRead(v)
    }
  }

  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): GetItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  }

  final def projectionExpressionAsScala(value: Option[String]): GetItemRequest.Builder = {
    value.fold(self) { v =>
      self.projectionExpression(v)
    }
  }

  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): GetItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeNames(v.asJava)
    }
  }

}

final class GetItemRequestOps(val self: GetItemRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName)

  final def keyAsScala: Option[Map[String, AttributeValue]] = Option(self.key).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def attributesToGetAsScala: Option[Seq[String]] = Option(self.attributesToGet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def consistentReadAsScala: Option[Boolean] = Option(self.consistentRead)

  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] = Option(self.returnConsumedCapacity)

  final def projectionExpressionAsScala: Option[String] = Option(self.projectionExpression)

  final def expressionAttributeNamesAsScala: Option[Map[String, String]] = Option(self.expressionAttributeNames).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetItemRequestOps {

  implicit def toGetItemRequestBuilderOps(v: GetItemRequest.Builder): GetItemRequestBuilderOps =
    new GetItemRequestBuilderOps(v)

  implicit def toGetItemRequestOps(v: GetItemRequest): GetItemRequestOps = new GetItemRequestOps(v)

}
