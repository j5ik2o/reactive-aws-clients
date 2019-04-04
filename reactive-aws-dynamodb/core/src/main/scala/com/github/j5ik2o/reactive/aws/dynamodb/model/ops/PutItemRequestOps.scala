// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class PutItemRequestBuilderOps(val self: PutItemRequest.Builder) extends AnyVal {

  final def withTableNameAsScala(value: Option[String]): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def withItemAsScala(value: Option[Map[String, AttributeValue]]): PutItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.item(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def withExpectedAsScala(value: Option[Map[String, ExpectedAttributeValue]]): PutItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expected(v.asJava)
    } // Map[String, ExpectedAttributeValue]
  }

  final def withReturnValuesAsScala(value: Option[ReturnValue]): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnValues(v)
    }
  } // String

  final def withReturnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  } // String

  final def withReturnItemCollectionMetricsAsScala(
      value: Option[ReturnItemCollectionMetrics]
  ): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnItemCollectionMetrics(v)
    }
  } // String

  final def withConditionalOperatorAsScala(value: Option[ConditionalOperator]): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.conditionalOperator(v)
    }
  } // String

  final def withConditionExpressionAsScala(value: Option[String]): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.conditionExpression(v)
    }
  } // String

  final def withExpressionAttributeNamesAsScala(value: Option[Map[String, String]]): PutItemRequest.Builder = {
    value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeNames(v.asJava)
    } // Map[String, String]
  }

  final def withExpressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): PutItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeValues(v.asJava)
    } // Map[String, AttributeValue]
  }

}

final class PutItemRequestOps(val self: PutItemRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def itemAsScala: Option[Map[String, AttributeValue]] = Option(self.item).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def expectedAsScala: Option[Map[String, ExpectedAttributeValue]] = Option(self.expected).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, ExpectedAttributeValue]

  final def returnValuesAsScala: Option[ReturnValue] = Option(self.returnValues) // String

  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] =
    Option(self.returnConsumedCapacity) // String

  final def returnItemCollectionMetricsAsScala: Option[ReturnItemCollectionMetrics] =
    Option(self.returnItemCollectionMetrics) // String

  final def conditionalOperatorAsScala: Option[ConditionalOperator] = Option(self.conditionalOperator) // String

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
trait ToPutItemRequestOps {

  implicit def toPutItemRequestBuilderOps(v: PutItemRequest.Builder): PutItemRequestBuilderOps =
    new PutItemRequestBuilderOps(v)

  implicit def toPutItemRequestOps(v: PutItemRequest): PutItemRequestOps = new PutItemRequestOps(v)

}
