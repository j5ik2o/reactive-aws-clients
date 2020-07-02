// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ScanRequestBuilderOps(val self: ScanRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): ScanRequest.Builder = {
    value.fold(self) { v => self.tableName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): ScanRequest.Builder = {
    value.fold(self) { v => self.indexName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesToGetAsScala(value: Option[Seq[String]]): ScanRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributesToGet(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala(value: Option[Int]): ScanRequest.Builder = {
    value.fold(self) { v => self.limit(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def selectAsScala(value: Option[Select]): ScanRequest.Builder = {
    value.fold(self) { v => self.select(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scanFilterAsScala(value: Option[Map[String, Condition]]): ScanRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.scanFilter(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conditionalOperatorAsScala(value: Option[ConditionalOperator]): ScanRequest.Builder = {
    value.fold(self) { v => self.conditionalOperator(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exclusiveStartKeyAsScala(value: Option[Map[String, AttributeValue]]): ScanRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.exclusiveStartKey(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): ScanRequest.Builder = {
    value.fold(self) { v => self.returnConsumedCapacity(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalSegmentsAsScala(value: Option[Int]): ScanRequest.Builder = {
    value.fold(self) { v => self.totalSegments(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def segmentAsScala(value: Option[Int]): ScanRequest.Builder = {
    value.fold(self) { v => self.segment(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectionExpressionAsScala(value: Option[String]): ScanRequest.Builder = {
    value.fold(self) { v => self.projectionExpression(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterExpressionAsScala(value: Option[String]): ScanRequest.Builder = {
    value.fold(self) { v => self.filterExpression(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): ScanRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expressionAttributeNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): ScanRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expressionAttributeValues(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consistentReadAsScala(value: Option[Boolean]): ScanRequest.Builder = {
    value.fold(self) { v => self.consistentRead(v) }
  }

}

final class ScanRequestOps(val self: ScanRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesToGetAsScala: Option[Seq[String]] =
    Option(self.attributesToGet).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala: Option[Int] = Option(self.limit)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def selectAsScala: Option[Select] = Option(self.select)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scanFilterAsScala: Option[Map[String, Condition]] =
    Option(self.scanFilter).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conditionalOperatorAsScala: Option[ConditionalOperator] = Option(self.conditionalOperator)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exclusiveStartKeyAsScala: Option[Map[String, AttributeValue]] =
    Option(self.exclusiveStartKey).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] = Option(self.returnConsumedCapacity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalSegmentsAsScala: Option[Int] = Option(self.totalSegments)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def segmentAsScala: Option[Int] = Option(self.segment)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectionExpressionAsScala: Option[String] = Option(self.projectionExpression)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterExpressionAsScala: Option[String] = Option(self.filterExpression)

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

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consistentReadAsScala: Option[Boolean] = Option(self.consistentRead)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScanRequestOps {

  implicit def toScanRequestBuilderOps(v: ScanRequest.Builder): ScanRequestBuilderOps = new ScanRequestBuilderOps(v)

  implicit def toScanRequestOps(v: ScanRequest): ScanRequestOps = new ScanRequestOps(v)

}
