// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class PutItemRequestBuilderOps(val self: PutItemRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemAsScala(value: Option[Map[String, AttributeValue]]): PutItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.item(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expectedAsScala(value: Option[Map[String, ExpectedAttributeValue]]): PutItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expected(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValuesAsScala(value: Option[ReturnValue]): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnValues(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnItemCollectionMetricsAsScala(value: Option[ReturnItemCollectionMetrics]): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnItemCollectionMetrics(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conditionalOperatorAsScala(value: Option[ConditionalOperator]): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.conditionalOperator(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conditionExpressionAsScala(value: Option[String]): PutItemRequest.Builder = {
    value.fold(self) { v =>
      self.conditionExpression(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): PutItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expressionAttributeNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): PutItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expressionAttributeValues(v.asJava)
    }
  }

}

final class PutItemRequestOps(val self: PutItemRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemAsScala: Option[Map[String, AttributeValue]] = Option(self.item).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expectedAsScala: Option[Map[String, ExpectedAttributeValue]] = Option(self.expected).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValuesAsScala: Option[ReturnValue] = Option(self.returnValues)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] = Option(self.returnConsumedCapacity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnItemCollectionMetricsAsScala: Option[ReturnItemCollectionMetrics] =
    Option(self.returnItemCollectionMetrics)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conditionalOperatorAsScala: Option[ConditionalOperator] = Option(self.conditionalOperator)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conditionExpressionAsScala: Option[String] = Option(self.conditionExpression)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeNamesAsScala: Option[Map[String, String]] = Option(self.expressionAttributeNames).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeValuesAsScala: Option[Map[String, AttributeValue]] =
    Option(self.expressionAttributeValues).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutItemRequestOps {

  implicit def toPutItemRequestBuilderOps(v: PutItemRequest.Builder): PutItemRequestBuilderOps =
    new PutItemRequestBuilderOps(v)

  implicit def toPutItemRequestOps(v: PutItemRequest): PutItemRequestOps = new PutItemRequestOps(v)

}
