// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ExpectedAttributeValueBuilderOps(val self: ExpectedAttributeValue.Builder) extends AnyVal {

  final def valueAsScala(value: Option[AttributeValue]): ExpectedAttributeValue.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  } // AttributeValue

  final def existsAsScala(value: Option[Boolean]): ExpectedAttributeValue.Builder = {
    value.fold(self) { v =>
      self.exists(v)
    }
  } // Boolean

  final def comparisonOperatorAsScala(value: Option[ComparisonOperator]): ExpectedAttributeValue.Builder = {
    value.fold(self) { v =>
      self.comparisonOperator(v)
    }
  } // String

  final def attributeValueListAsScala(value: Option[Seq[AttributeValue]]): ExpectedAttributeValue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributeValueList(v.asJava)
    } // Seq[AttributeValue]
  }

}

final class ExpectedAttributeValueOps(val self: ExpectedAttributeValue) extends AnyVal {

  final def valueAsScala: Option[AttributeValue] = Option(self.value) // AttributeValue

  final def existsAsScala: Option[Boolean] = Option(self.exists) // Boolean

  final def comparisonOperatorAsScala: Option[ComparisonOperator] = Option(self.comparisonOperator) // String

  final def attributeValueListAsScala: Option[Seq[AttributeValue]] = Option(self.attributeValueList).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[AttributeValue]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExpectedAttributeValueOps {

  implicit def toExpectedAttributeValueBuilderOps(v: ExpectedAttributeValue.Builder): ExpectedAttributeValueBuilderOps =
    new ExpectedAttributeValueBuilderOps(v)

  implicit def toExpectedAttributeValueOps(v: ExpectedAttributeValue): ExpectedAttributeValueOps =
    new ExpectedAttributeValueOps(v)

}
