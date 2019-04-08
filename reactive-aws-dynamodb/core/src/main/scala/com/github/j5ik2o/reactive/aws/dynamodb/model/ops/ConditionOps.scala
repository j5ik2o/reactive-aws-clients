// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ConditionBuilderOps(val self: Condition.Builder) extends AnyVal {

  final def attributeValueListAsScala(value: Option[Seq[AttributeValue]]): Condition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributeValueList(v.asJava)
    }
  }

  final def comparisonOperatorAsScala(value: Option[ComparisonOperator]): Condition.Builder = {
    value.fold(self) { v =>
      self.comparisonOperator(v)
    }
  }

}

final class ConditionOps(val self: Condition) extends AnyVal {

  final def attributeValueListAsScala: Option[Seq[AttributeValue]] = Option(self.attributeValueList).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def comparisonOperatorAsScala: Option[ComparisonOperator] = Option(self.comparisonOperator)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConditionOps {

  implicit def toConditionBuilderOps(v: Condition.Builder): ConditionBuilderOps = new ConditionBuilderOps(v)

  implicit def toConditionOps(v: Condition): ConditionOps = new ConditionOps(v)

}
