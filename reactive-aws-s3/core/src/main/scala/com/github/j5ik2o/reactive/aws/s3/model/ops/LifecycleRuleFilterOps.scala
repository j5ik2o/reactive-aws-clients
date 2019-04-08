// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class LifecycleRuleFilterBuilderOps(val self: LifecycleRuleFilter.Builder) extends AnyVal {

  final def prefixAsScala(value: Option[String]): LifecycleRuleFilter.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  } // String

  final def tagAsScala(value: Option[Tag]): LifecycleRuleFilter.Builder = {
    value.fold(self) { v =>
      self.tag(v)
    }
  } // Tag

  final def andAsScala(value: Option[LifecycleRuleAndOperator]): LifecycleRuleFilter.Builder = {
    value.fold(self) { v =>
      self.and(v)
    }
  } // LifecycleRuleAndOperator

}

final class LifecycleRuleFilterOps(val self: LifecycleRuleFilter) extends AnyVal {

  final def prefixAsScala: Option[String] = Option(self.prefix) // String

  final def tagAsScala: Option[Tag] = Option(self.tag) // Tag

  final def andAsScala: Option[LifecycleRuleAndOperator] = Option(self.and) // LifecycleRuleAndOperator

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLifecycleRuleFilterOps {

  implicit def toLifecycleRuleFilterBuilderOps(v: LifecycleRuleFilter.Builder): LifecycleRuleFilterBuilderOps =
    new LifecycleRuleFilterBuilderOps(v)

  implicit def toLifecycleRuleFilterOps(v: LifecycleRuleFilter): LifecycleRuleFilterOps = new LifecycleRuleFilterOps(v)

}
