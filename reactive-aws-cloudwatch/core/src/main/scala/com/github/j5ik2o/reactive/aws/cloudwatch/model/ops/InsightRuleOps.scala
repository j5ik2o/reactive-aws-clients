// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class InsightRuleBuilderOps(val self: InsightRule.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): InsightRule.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[String]): InsightRule.Builder = {
    value.fold(self) { v => self.state(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def schemaAsScala(value: Option[String]): InsightRule.Builder = {
    value.fold(self) { v => self.schema(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def definitionAsScala(value: Option[String]): InsightRule.Builder = {
    value.fold(self) { v => self.definition(v) }
  }

}

final class InsightRuleOps(val self: InsightRule) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[String] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def schemaAsScala: Option[String] = Option(self.schema)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def definitionAsScala: Option[String] = Option(self.definition)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInsightRuleOps {

  implicit def toInsightRuleBuilderOps(v: InsightRule.Builder): InsightRuleBuilderOps = new InsightRuleBuilderOps(v)

  implicit def toInsightRuleOps(v: InsightRule): InsightRuleOps = new InsightRuleOps(v)

}
