// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class FilterRuleBuilderOps(val self: FilterRule.Builder) extends AnyVal {

  final def nameAsScala(value: Option[FilterRuleName]): FilterRule.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def valueAsScala(value: Option[String]): FilterRule.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class FilterRuleOps(val self: FilterRule) extends AnyVal {

  final def nameAsScala: Option[FilterRuleName] = Option(self.name)

  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFilterRuleOps {

  implicit def toFilterRuleBuilderOps(v: FilterRule.Builder): FilterRuleBuilderOps = new FilterRuleBuilderOps(v)

  implicit def toFilterRuleOps(v: FilterRule): FilterRuleOps = new FilterRuleOps(v)

}
