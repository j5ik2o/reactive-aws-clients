// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class LifecycleRuleFilterBuilderOps(val self: LifecycleRuleFilter.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala(value: Option[String]): LifecycleRuleFilter.Builder = {
    value.fold(self) { v => self.prefix(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagAsScala(value: Option[Tag]): LifecycleRuleFilter.Builder = {
    value.fold(self) { v => self.tag(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def andAsScala(value: Option[LifecycleRuleAndOperator]): LifecycleRuleFilter.Builder = {
    value.fold(self) { v => self.and(v) }
  }

}

final class LifecycleRuleFilterOps(val self: LifecycleRuleFilter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala: Option[String] = Option(self.prefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagAsScala: Option[Tag] = Option(self.tag)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def andAsScala: Option[LifecycleRuleAndOperator] = Option(self.and)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLifecycleRuleFilterOps {

  implicit def toLifecycleRuleFilterBuilderOps(v: LifecycleRuleFilter.Builder): LifecycleRuleFilterBuilderOps =
    new LifecycleRuleFilterBuilderOps(v)

  implicit def toLifecycleRuleFilterOps(v: LifecycleRuleFilter): LifecycleRuleFilterOps = new LifecycleRuleFilterOps(v)

}
