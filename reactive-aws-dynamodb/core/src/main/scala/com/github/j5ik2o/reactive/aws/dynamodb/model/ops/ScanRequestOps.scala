// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ScanRequestBuilderOps(val self: ScanRequest.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def indexNameAsScala(value: Option[String]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  } // String

  final def attributesToGetAsScala(value: Option[Seq[String]]): ScanRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributesToGet(v.asJava)
    } // Seq[String]
  }

  final def limitAsScala(value: Option[Int]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  } // Int

  final def selectAsScala(value: Option[Select]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.select(v)
    }
  } // String

  final def scanFilterAsScala(value: Option[Map[String, Condition]]): ScanRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.scanFilter(v.asJava)
    } // Map[String, Condition]
  }

  final def conditionalOperatorAsScala(value: Option[ConditionalOperator]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.conditionalOperator(v)
    }
  } // String

  final def exclusiveStartKeyAsScala(value: Option[Map[String, AttributeValue]]): ScanRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.exclusiveStartKey(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  } // String

  final def totalSegmentsAsScala(value: Option[Int]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.totalSegments(v)
    }
  } // Int

  final def segmentAsScala(value: Option[Int]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.segment(v)
    }
  } // Int

  final def projectionExpressionAsScala(value: Option[String]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.projectionExpression(v)
    }
  } // String

  final def filterExpressionAsScala(value: Option[String]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.filterExpression(v)
    }
  } // String

  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): ScanRequest.Builder = {
    value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeNames(v.asJava)
    } // Map[String, String]
  }

  final def expressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): ScanRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeValues(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def consistentReadAsScala(value: Option[Boolean]): ScanRequest.Builder = {
    value.fold(self) { v =>
      self.consistentRead(v)
    }
  } // Boolean

}

final class ScanRequestOps(val self: ScanRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def indexNameAsScala: Option[String] = Option(self.indexName) // String

  final def attributesToGetAsScala: Option[Seq[String]] = Option(self.attributesToGet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def limitAsScala: Option[Int] = Option(self.limit) // Int

  final def selectAsScala: Option[Select] = Option(self.select) // String

  final def scanFilterAsScala: Option[Map[String, Condition]] = Option(self.scanFilter).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, Condition]

  final def conditionalOperatorAsScala: Option[ConditionalOperator] = Option(self.conditionalOperator) // String

  final def exclusiveStartKeyAsScala: Option[Map[String, AttributeValue]] = Option(self.exclusiveStartKey).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] =
    Option(self.returnConsumedCapacity) // String

  final def totalSegmentsAsScala: Option[Int] = Option(self.totalSegments) // Int

  final def segmentAsScala: Option[Int] = Option(self.segment) // Int

  final def projectionExpressionAsScala: Option[String] = Option(self.projectionExpression) // String

  final def filterExpressionAsScala: Option[String] = Option(self.filterExpression) // String

  final def expressionAttributeNamesAsScala: Option[Map[String, String]] = Option(self.expressionAttributeNames).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def expressionAttributeValuesAsScala: Option[Map[String, AttributeValue]] =
    Option(self.expressionAttributeValues).map { v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
    } // Map[String, AttributeValue]

  final def consistentReadAsScala: Option[Boolean] = Option(self.consistentRead) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScanRequestOps {

  implicit def toScanRequestBuilderOps(v: ScanRequest.Builder): ScanRequestBuilderOps = new ScanRequestBuilderOps(v)

  implicit def toScanRequestOps(v: ScanRequest): ScanRequestOps = new ScanRequestOps(v)

}
