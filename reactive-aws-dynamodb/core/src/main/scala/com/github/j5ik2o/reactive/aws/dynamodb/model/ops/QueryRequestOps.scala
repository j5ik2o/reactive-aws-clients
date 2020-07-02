// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class QueryRequestBuilderOps(val self: QueryRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): QueryRequest.Builder = {
    value.fold(self) { v => self.tableName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): QueryRequest.Builder = {
    value.fold(self) { v => self.indexName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def selectAsScala(value: Option[Select]): QueryRequest.Builder = {
    value.fold(self) { v => self.select(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesToGetAsScala(value: Option[Seq[String]]): QueryRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributesToGet(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala(value: Option[Int]): QueryRequest.Builder = {
    value.fold(self) { v => self.limit(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consistentReadAsScala(value: Option[Boolean]): QueryRequest.Builder = {
    value.fold(self) { v => self.consistentRead(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyConditionsAsScala(value: Option[Map[String, Condition]]): QueryRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.keyConditions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryFilterAsScala(value: Option[Map[String, Condition]]): QueryRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.queryFilter(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conditionalOperatorAsScala(value: Option[ConditionalOperator]): QueryRequest.Builder = {
    value.fold(self) { v => self.conditionalOperator(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scanIndexForwardAsScala(value: Option[Boolean]): QueryRequest.Builder = {
    value.fold(self) { v => self.scanIndexForward(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exclusiveStartKeyAsScala(value: Option[Map[String, AttributeValue]]): QueryRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.exclusiveStartKey(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): QueryRequest.Builder = {
    value.fold(self) { v => self.returnConsumedCapacity(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectionExpressionAsScala(value: Option[String]): QueryRequest.Builder = {
    value.fold(self) { v => self.projectionExpression(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterExpressionAsScala(value: Option[String]): QueryRequest.Builder = {
    value.fold(self) { v => self.filterExpression(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyConditionExpressionAsScala(value: Option[String]): QueryRequest.Builder = {
    value.fold(self) { v => self.keyConditionExpression(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): QueryRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expressionAttributeNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): QueryRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expressionAttributeValues(v.asJava)
    }
  }

}

final class QueryRequestOps(val self: QueryRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def selectAsScala: Option[Select] = Option(self.select)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesToGetAsScala: Option[Seq[String]] =
    Option(self.attributesToGet).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala: Option[Int] = Option(self.limit)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consistentReadAsScala: Option[Boolean] = Option(self.consistentRead)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyConditionsAsScala: Option[Map[String, Condition]] =
    Option(self.keyConditions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryFilterAsScala: Option[Map[String, Condition]] =
    Option(self.queryFilter).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conditionalOperatorAsScala: Option[ConditionalOperator] = Option(self.conditionalOperator)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scanIndexForwardAsScala: Option[Boolean] = Option(self.scanIndexForward)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exclusiveStartKeyAsScala: Option[Map[String, AttributeValue]] =
    Option(self.exclusiveStartKey).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] = Option(self.returnConsumedCapacity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectionExpressionAsScala: Option[String] = Option(self.projectionExpression)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterExpressionAsScala: Option[String] = Option(self.filterExpression)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyConditionExpressionAsScala: Option[String] = Option(self.keyConditionExpression)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeNamesAsScala: Option[Map[String, String]] =
    Option(self.expressionAttributeNames).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeValuesAsScala: Option[Map[String, AttributeValue]] =
    Option(self.expressionAttributeValues).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToQueryRequestOps {

  implicit def toQueryRequestBuilderOps(v: QueryRequest.Builder): QueryRequestBuilderOps = new QueryRequestBuilderOps(v)

  implicit def toQueryRequestOps(v: QueryRequest): QueryRequestOps = new QueryRequestOps(v)

}
