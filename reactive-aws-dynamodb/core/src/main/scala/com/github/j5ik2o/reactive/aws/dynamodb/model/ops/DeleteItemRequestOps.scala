// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DeleteItemRequestBuilderOps(val self: DeleteItemRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): DeleteItemRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[Map[String, AttributeValue]]): DeleteItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.key(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expectedAsScala(value: Option[Map[String, ExpectedAttributeValue]]): DeleteItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expected(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conditionalOperatorAsScala(value: Option[ConditionalOperator]): DeleteItemRequest.Builder = {
    value.fold(self) { v =>
      self.conditionalOperator(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValuesAsScala(value: Option[ReturnValue]): DeleteItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnValues(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): DeleteItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnItemCollectionMetricsAsScala(
      value: Option[ReturnItemCollectionMetrics]
  ): DeleteItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnItemCollectionMetrics(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conditionExpressionAsScala(value: Option[String]): DeleteItemRequest.Builder = {
    value.fold(self) { v =>
      self.conditionExpression(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): DeleteItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expressionAttributeNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): DeleteItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expressionAttributeValues(v.asJava)
    }
  }

}

final class DeleteItemRequestOps(val self: DeleteItemRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[Map[String, AttributeValue]] = Option(self.key).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expectedAsScala: Option[Map[String, ExpectedAttributeValue]] = Option(self.expected).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conditionalOperatorAsScala: Option[ConditionalOperator] = Option(self.conditionalOperator)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValuesAsScala: Option[ReturnValue] = Option(self.returnValues)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] = Option(self.returnConsumedCapacity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnItemCollectionMetricsAsScala: Option[ReturnItemCollectionMetrics] =
    Option(self.returnItemCollectionMetrics)

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
trait ToDeleteItemRequestOps {

  implicit def toDeleteItemRequestBuilderOps(v: DeleteItemRequest.Builder): DeleteItemRequestBuilderOps =
    new DeleteItemRequestBuilderOps(v)

  implicit def toDeleteItemRequestOps(v: DeleteItemRequest): DeleteItemRequestOps = new DeleteItemRequestOps(v)

}
