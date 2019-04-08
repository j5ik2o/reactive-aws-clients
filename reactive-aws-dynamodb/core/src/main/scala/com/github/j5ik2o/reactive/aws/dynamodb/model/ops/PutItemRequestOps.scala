// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class PutItemRequestBuilderOps(val self: PutItemRequest.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  final def itemAsScala(value: Option[Map[String, AttributeValue]]): PutItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.item(v.asJava)
    }
  }

  final def expectedAsScala(value: Option[Map[String, ExpectedAttributeValue]]): PutItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expected(v.asJava)
    }
  }

  final def returnValuesAsScala(value: Option[ReturnValue]): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnValues(v)
    }
  }

  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  }

  final def returnItemCollectionMetricsAsScala(value: Option[ReturnItemCollectionMetrics]): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnItemCollectionMetrics(v)
    }
  }

  final def conditionalOperatorAsScala(value: Option[ConditionalOperator]): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.conditionalOperator(v)
    }
  }

  final def conditionExpressionAsScala(value: Option[String]): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.conditionExpression(v)
    }
  }

  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): PutItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeNames(v.asJava)
    }
  }

  final def expressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): PutItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeValues(v.asJava)
    }
  }

}

final class PutItemRequestOps(val self: PutItemRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName)

  final def itemAsScala: Option[Map[String, AttributeValue]] = Option(self.item).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def expectedAsScala: Option[Map[String, ExpectedAttributeValue]] = Option(self.expected).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def returnValuesAsScala: Option[ReturnValue] = Option(self.returnValues)

  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] = Option(self.returnConsumedCapacity)

  final def returnItemCollectionMetricsAsScala: Option[ReturnItemCollectionMetrics] =
    Option(self.returnItemCollectionMetrics)

  final def conditionalOperatorAsScala: Option[ConditionalOperator] = Option(self.conditionalOperator)

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
trait ToPutItemRequestOps {

  implicit def toPutItemRequestBuilderOps(v: PutItemRequest.Builder): PutItemRequestBuilderOps =
    new PutItemRequestBuilderOps(v)

  implicit def toPutItemRequestOps(v: PutItemRequest): PutItemRequestOps = new PutItemRequestOps(v)

}
