// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ReplicationRuleFilterBuilderOps(val self: ReplicationRuleFilter.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala(value: Option[String]): ReplicationRuleFilter.Builder = {
    value.fold(self) { v => self.prefix(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagAsScala(value: Option[Tag]): ReplicationRuleFilter.Builder = {
    value.fold(self) { v => self.tag(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def andAsScala(value: Option[ReplicationRuleAndOperator]): ReplicationRuleFilter.Builder = {
    value.fold(self) { v => self.and(v) }
  }

}

final class ReplicationRuleFilterOps(val self: ReplicationRuleFilter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala: Option[String] = Option(self.prefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagAsScala: Option[Tag] = Option(self.tag)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def andAsScala: Option[ReplicationRuleAndOperator] = Option(self.and)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicationRuleFilterOps {

  implicit def toReplicationRuleFilterBuilderOps(v: ReplicationRuleFilter.Builder): ReplicationRuleFilterBuilderOps =
    new ReplicationRuleFilterBuilderOps(v)

  implicit def toReplicationRuleFilterOps(v: ReplicationRuleFilter): ReplicationRuleFilterOps =
    new ReplicationRuleFilterOps(v)

}
