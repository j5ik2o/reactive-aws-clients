// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class InstanceLimitsBuilderOps(val self: InstanceLimits.Builder) extends AnyVal {

  final def instanceCountLimitsAsScala(value: Option[InstanceCountLimits]): InstanceLimits.Builder = {
    value.fold(self) { v =>
      self.instanceCountLimits(v)
    }
  }

}

final class InstanceLimitsOps(val self: InstanceLimits) extends AnyVal {

  final def instanceCountLimitsAsScala: Option[InstanceCountLimits] = Option(self.instanceCountLimits)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceLimitsOps {

  implicit def toInstanceLimitsBuilderOps(v: InstanceLimits.Builder): InstanceLimitsBuilderOps =
    new InstanceLimitsBuilderOps(v)

  implicit def toInstanceLimitsOps(v: InstanceLimits): InstanceLimitsOps = new InstanceLimitsOps(v)

}
