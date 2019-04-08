// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DeleteItemRequestBuilderOps(val self: DeleteItemRequest.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): DeleteItemRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def keyAsScala(value: Option[Map[String, AttributeValue]]): DeleteItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.key(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def expectedAsScala(value: Option[Map[String, ExpectedAttributeValue]]): DeleteItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expected(v.asJava)
    } // Map[String, ExpectedAttributeValue]
  }

  final def conditionalOperatorAsScala(value: Option[ConditionalOperator]): DeleteItemRequest.Builder = {
    value.fold(self) { v =>
      self.conditionalOperator(v)
    }
  } // ConditionalOperator

  final def returnValuesAsScala(value: Option[ReturnValue]): DeleteItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnValues(v)
    }
  } // ReturnValue

  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): DeleteItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  } // ReturnConsumedCapacity

  final def returnItemCollectionMetricsAsScala(
      value: Option[ReturnItemCollectionMetrics]
  ): DeleteItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnItemCollectionMetrics(v)
    }
  } // ReturnItemCollectionMetrics

  final def conditionExpressionAsScala(value: Option[String]): DeleteItemRequest.Builder = {
    value.fold(self) { v =>
      self.conditionExpression(v)
    }
  } // String

  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): DeleteItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeNames(v.asJava)
    } // Map[String, String]
  }

  final def expressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): DeleteItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeValues(v.asJava)
    } // Map[String, AttributeValue]
  }

}

final class DeleteItemRequestOps(val self: DeleteItemRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def keyAsScala: Option[Map[String, AttributeValue]] = Option(self.key).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def expectedAsScala: Option[Map[String, ExpectedAttributeValue]] = Option(self.expected).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, ExpectedAttributeValue]

  final def conditionalOperatorAsScala: Option[ConditionalOperator] =
    Option(self.conditionalOperator) // ConditionalOperator

  final def returnValuesAsScala: Option[ReturnValue] = Option(self.returnValues) // ReturnValue

  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] =
    Option(self.returnConsumedCapacity) // ReturnConsumedCapacity

  final def returnItemCollectionMetricsAsScala: Option[ReturnItemCollectionMetrics] =
    Option(self.returnItemCollectionMetrics) // ReturnItemCollectionMetrics

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
trait ToDeleteItemRequestOps {

  implicit def toDeleteItemRequestBuilderOps(v: DeleteItemRequest.Builder): DeleteItemRequestBuilderOps =
    new DeleteItemRequestBuilderOps(v)

  implicit def toDeleteItemRequestOps(v: DeleteItemRequest): DeleteItemRequestOps = new DeleteItemRequestOps(v)

}
