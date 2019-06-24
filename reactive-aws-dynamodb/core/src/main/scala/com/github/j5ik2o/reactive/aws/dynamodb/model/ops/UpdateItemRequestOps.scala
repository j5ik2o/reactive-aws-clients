// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateItemRequestBuilderOps(val self: UpdateItemRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[Map[String, AttributeValue]]): UpdateItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.key(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeUpdatesAsScala(value: Option[Map[String, AttributeValueUpdate]]): UpdateItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributeUpdates(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expectedAsScala(value: Option[Map[String, ExpectedAttributeValue]]): UpdateItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expected(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conditionalOperatorAsScala(value: Option[ConditionalOperator]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.conditionalOperator(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValuesAsScala(value: Option[ReturnValue]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnValues(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnItemCollectionMetricsAsScala(
      value: Option[ReturnItemCollectionMetrics]
  ): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnItemCollectionMetrics(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateExpressionAsScala(value: Option[String]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.updateExpression(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conditionExpressionAsScala(value: Option[String]): UpdateItemRequest.Builder = {
    value.fold(self) { v =>
      self.conditionExpression(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): UpdateItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expressionAttributeNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): UpdateItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expressionAttributeValues(v.asJava)
    }
  }

}

final class UpdateItemRequestOps(val self: UpdateItemRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[Map[String, AttributeValue]] = Option(self.key).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeUpdatesAsScala: Option[Map[String, AttributeValueUpdate]] = Option(self.attributeUpdates).map {
    v =>
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
  final def updateExpressionAsScala: Option[String] = Option(self.updateExpression)

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
trait ToUpdateItemRequestOps {

  implicit def toUpdateItemRequestBuilderOps(v: UpdateItemRequest.Builder): UpdateItemRequestBuilderOps =
    new UpdateItemRequestBuilderOps(v)

  implicit def toUpdateItemRequestOps(v: UpdateItemRequest): UpdateItemRequestOps = new UpdateItemRequestOps(v)

}
