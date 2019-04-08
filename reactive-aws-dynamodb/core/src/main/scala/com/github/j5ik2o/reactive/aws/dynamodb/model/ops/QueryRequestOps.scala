// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class QueryRequestBuilderOps(val self: QueryRequest.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): QueryRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def indexNameAsScala(value: Option[String]): QueryRequest.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  } // String

  final def selectAsScala(value: Option[Select]): QueryRequest.Builder = {
    value.fold(self) { v =>
      self.select(v)
    }
  } // Select

  final def attributesToGetAsScala(value: Option[Seq[String]]): QueryRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributesToGet(v.asJava)
    } // Seq[String]
  }

  final def limitAsScala(value: Option[Int]): QueryRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  } // Int

  final def consistentReadAsScala(value: Option[Boolean]): QueryRequest.Builder = {
    value.fold(self) { v =>
      self.consistentRead(v)
    }
  } // Boolean

  final def keyConditionsAsScala(value: Option[Map[String, Condition]]): QueryRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keyConditions(v.asJava)
    } // Map[String, Condition]
  }

  final def queryFilterAsScala(value: Option[Map[String, Condition]]): QueryRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.queryFilter(v.asJava)
    } // Map[String, Condition]
  }

  final def conditionalOperatorAsScala(value: Option[ConditionalOperator]): QueryRequest.Builder = {
    value.fold(self) { v =>
      self.conditionalOperator(v)
    }
  } // ConditionalOperator

  final def scanIndexForwardAsScala(value: Option[Boolean]): QueryRequest.Builder = {
    value.fold(self) { v =>
      self.scanIndexForward(v)
    }
  } // Boolean

  final def exclusiveStartKeyAsScala(value: Option[Map[String, AttributeValue]]): QueryRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.exclusiveStartKey(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): QueryRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  } // ReturnConsumedCapacity

  final def projectionExpressionAsScala(value: Option[String]): QueryRequest.Builder = {
    value.fold(self) { v =>
      self.projectionExpression(v)
    }
  } // String

  final def filterExpressionAsScala(value: Option[String]): QueryRequest.Builder = {
    value.fold(self) { v =>
      self.filterExpression(v)
    }
  } // String

  final def keyConditionExpressionAsScala(value: Option[String]): QueryRequest.Builder = {
    value.fold(self) { v =>
      self.keyConditionExpression(v)
    }
  } // String

  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): QueryRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeNames(v.asJava)
    } // Map[String, String]
  }

  final def expressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): QueryRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeValues(v.asJava)
    } // Map[String, AttributeValue]
  }

}

final class QueryRequestOps(val self: QueryRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def indexNameAsScala: Option[String] = Option(self.indexName) // String

  final def selectAsScala: Option[Select] = Option(self.select) // Select

  final def attributesToGetAsScala: Option[Seq[String]] = Option(self.attributesToGet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def limitAsScala: Option[Int] = Option(self.limit) // Int

  final def consistentReadAsScala: Option[Boolean] = Option(self.consistentRead) // Boolean

  final def keyConditionsAsScala: Option[Map[String, Condition]] = Option(self.keyConditions).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, Condition]

  final def queryFilterAsScala: Option[Map[String, Condition]] = Option(self.queryFilter).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, Condition]

  final def conditionalOperatorAsScala: Option[ConditionalOperator] =
    Option(self.conditionalOperator) // ConditionalOperator

  final def scanIndexForwardAsScala: Option[Boolean] = Option(self.scanIndexForward) // Boolean

  final def exclusiveStartKeyAsScala: Option[Map[String, AttributeValue]] = Option(self.exclusiveStartKey).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] =
    Option(self.returnConsumedCapacity) // ReturnConsumedCapacity

  final def projectionExpressionAsScala: Option[String] = Option(self.projectionExpression) // String

  final def filterExpressionAsScala: Option[String] = Option(self.filterExpression) // String

  final def keyConditionExpressionAsScala: Option[String] = Option(self.keyConditionExpression) // String

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
trait ToQueryRequestOps {

  implicit def toQueryRequestBuilderOps(v: QueryRequest.Builder): QueryRequestBuilderOps = new QueryRequestBuilderOps(v)

  implicit def toQueryRequestOps(v: QueryRequest): QueryRequestOps = new QueryRequestOps(v)

}
