// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateItemRequestBuilderOps(val self: UpdateItemRequest.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def keyAsScala(value: Option[Map[String, AttributeValue]]): UpdateItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.key(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def attributeUpdatesAsScala(value: Option[Map[String, AttributeValueUpdate]]): UpdateItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributeUpdates(v.asJava)
    } // Map[String, AttributeValueUpdate]
  }

  final def expectedAsScala(value: Option[Map[String, ExpectedAttributeValue]]): UpdateItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expected(v.asJava)
    } // Map[String, ExpectedAttributeValue]
  }

  final def conditionalOperatorAsScala(value: Option[ConditionalOperator]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.conditionalOperator(v)
    }
  } // String

  final def returnValuesAsScala(value: Option[ReturnValue]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnValues(v)
    }
  } // String

  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  } // String

  final def returnItemCollectionMetricsAsScala(
      value: Option[ReturnItemCollectionMetrics]
  ): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnItemCollectionMetrics(v)
    }
  } // String

  final def updateExpressionAsScala(value: Option[String]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.updateExpression(v)
    }
  } // String

  final def conditionExpressionAsScala(value: Option[String]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.conditionExpression(v)
    }
  } // String

  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): UpdateItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeNames(v.asJava)
    } // Map[String, String]
  }

  final def expressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): UpdateItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeValues(v.asJava)
    } // Map[String, AttributeValue]
  }

}

final class UpdateItemRequestOps(val self: UpdateItemRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def keyAsScala: Option[Map[String, AttributeValue]] = Option(self.key).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def attributeUpdatesAsScala: Option[Map[String, AttributeValueUpdate]] = Option(self.attributeUpdates).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValueUpdate]

  final def expectedAsScala: Option[Map[String, ExpectedAttributeValue]] = Option(self.expected).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, ExpectedAttributeValue]

  final def conditionalOperatorAsScala: Option[ConditionalOperator] = Option(self.conditionalOperator) // String

  final def returnValuesAsScala: Option[ReturnValue] = Option(self.returnValues) // String

  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] =
    Option(self.returnConsumedCapacity) // String

  final def returnItemCollectionMetricsAsScala: Option[ReturnItemCollectionMetrics] =
    Option(self.returnItemCollectionMetrics) // String

  final def updateExpressionAsScala: Option[String] = Option(self.updateExpression) // String

  final def conditionExpressionAsScala: Option[String] = Option(self.conditionExpression) // String

  final def expressionAttributeNamesAsScala: Option[Map[String, String]] = Option(self.expressionAttributeNames).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def expressionAttributeValuesAsScala: Option[Map[String, AttributeValue]] =
    Option(self.expressionAttributeValues).map { v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
    } // Map[String, AttributeValue]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateItemRequestOps {

  implicit def toUpdateItemRequestBuilderOps(v: UpdateItemRequest.Builder): UpdateItemRequestBuilderOps =
    new UpdateItemRequestBuilderOps(v)

  implicit def toUpdateItemRequestOps(v: UpdateItemRequest): UpdateItemRequestOps = new UpdateItemRequestOps(v)

}
