// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ScanRequestBuilderOps(val self: ScanRequest.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  final def indexNameAsScala(value: Option[String]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  }

  final def attributesToGetAsScala(value: Option[Seq[String]]): ScanRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributesToGet(v.asJava)
    }
  }

  final def limitAsScala(value: Option[Int]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

  final def selectAsScala(value: Option[Select]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.select(v)
    }
  }

  final def scanFilterAsScala(value: Option[Map[String, Condition]]): ScanRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.scanFilter(v.asJava)
    }
  }

  final def conditionalOperatorAsScala(value: Option[ConditionalOperator]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.conditionalOperator(v)
    }
  }

  final def exclusiveStartKeyAsScala(value: Option[Map[String, AttributeValue]]): ScanRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.exclusiveStartKey(v.asJava)
    }
  }

  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  }

  final def totalSegmentsAsScala(value: Option[Int]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.totalSegments(v)
    }
  }

  final def segmentAsScala(value: Option[Int]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.segment(v)
    }
  }

  final def projectionExpressionAsScala(value: Option[String]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.projectionExpression(v)
    }
  }

  final def filterExpressionAsScala(value: Option[String]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.filterExpression(v)
    }
  }

  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): ScanRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeNames(v.asJava)
    }
  }

  final def expressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): ScanRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeValues(v.asJava)
    }
  }

  final def consistentReadAsScala(value: Option[Boolean]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.consistentRead(v)
    }
  }

}

final class ScanRequestOps(val self: ScanRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName)

  final def indexNameAsScala: Option[String] = Option(self.indexName)

  final def attributesToGetAsScala: Option[Seq[String]] = Option(self.attributesToGet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def limitAsScala: Option[Int] = Option(self.limit)

  final def selectAsScala: Option[Select] = Option(self.select)

  final def scanFilterAsScala: Option[Map[String, Condition]] = Option(self.scanFilter).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def conditionalOperatorAsScala: Option[ConditionalOperator] = Option(self.conditionalOperator)

  final def exclusiveStartKeyAsScala: Option[Map[String, AttributeValue]] = Option(self.exclusiveStartKey).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] = Option(self.returnConsumedCapacity)

  final def totalSegmentsAsScala: Option[Int] = Option(self.totalSegments)

  final def segmentAsScala: Option[Int] = Option(self.segment)

  final def projectionExpressionAsScala: Option[String] = Option(self.projectionExpression)

  final def filterExpressionAsScala: Option[String] = Option(self.filterExpression)

  final def expressionAttributeNamesAsScala: Option[Map[String, String]] = Option(self.expressionAttributeNames).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def expressionAttributeValuesAsScala: Option[Map[String, AttributeValue]] =
    Option(self.expressionAttributeValues).map { v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
    }

  final def consistentReadAsScala: Option[Boolean] = Option(self.consistentRead)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScanRequestOps {

  implicit def toScanRequestBuilderOps(v: ScanRequest.Builder): ScanRequestBuilderOps = new ScanRequestBuilderOps(v)

  implicit def toScanRequestOps(v: ScanRequest): ScanRequestOps = new ScanRequestOps(v)

}
