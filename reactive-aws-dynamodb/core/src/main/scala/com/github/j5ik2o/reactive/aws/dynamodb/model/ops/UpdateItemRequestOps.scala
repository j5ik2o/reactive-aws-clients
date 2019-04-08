// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateItemRequestBuilderOps(val self: UpdateItemRequest.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  final def keyAsScala(value: Option[Map[String, AttributeValue]]): UpdateItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.key(v.asJava)
    }
  }

  final def attributeUpdatesAsScala(value: Option[Map[String, AttributeValueUpdate]]): UpdateItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributeUpdates(v.asJava)
    }
  }

  final def expectedAsScala(value: Option[Map[String, ExpectedAttributeValue]]): UpdateItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expected(v.asJava)
    }
  }

  final def conditionalOperatorAsScala(value: Option[ConditionalOperator]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.conditionalOperator(v)
    }
  }

  final def returnValuesAsScala(value: Option[ReturnValue]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnValues(v)
    }
  }

  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  }

  final def returnItemCollectionMetricsAsScala(
      value: Option[ReturnItemCollectionMetrics]
  ): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnItemCollectionMetrics(v)
    }
  }

  final def updateExpressionAsScala(value: Option[String]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.updateExpression(v)
    }
  }

  final def conditionExpressionAsScala(value: Option[String]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.conditionExpression(v)
    }
  }

  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): UpdateItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeNames(v.asJava)
    }
  }

  final def expressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): UpdateItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeValues(v.asJava)
    }
  }

}

final class UpdateItemRequestOps(val self: UpdateItemRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName)

  final def keyAsScala: Option[Map[String, AttributeValue]] = Option(self.key).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def attributeUpdatesAsScala: Option[Map[String, AttributeValueUpdate]] = Option(self.attributeUpdates).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def expectedAsScala: Option[Map[String, ExpectedAttributeValue]] = Option(self.expected).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def conditionalOperatorAsScala: Option[ConditionalOperator] = Option(self.conditionalOperator)

  final def returnValuesAsScala: Option[ReturnValue] = Option(self.returnValues)

  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] = Option(self.returnConsumedCapacity)

  final def returnItemCollectionMetricsAsScala: Option[ReturnItemCollectionMetrics] =
    Option(self.returnItemCollectionMetrics)

  final def updateExpressionAsScala: Option[String] = Option(self.updateExpression)

  final def conditionExpressionAsScala: Option[String] = Option(self.conditionExpression)

  final def expressionAttributeNamesAsScala: Option[Map[String, String]] = Option(self.expressionAttributeNames).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def expressionAttributeValuesAsScala: Option[Map[String, AttributeValue]] =
    Option(self.expressionAttributeValues).map { v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateItemRequestOps {

  implicit def toUpdateItemRequestBuilderOps(v: UpdateItemRequest.Builder): UpdateItemRequestBuilderOps =
    new UpdateItemRequestBuilderOps(v)

  implicit def toUpdateItemRequestOps(v: UpdateItemRequest): UpdateItemRequestOps = new UpdateItemRequestOps(v)

}
