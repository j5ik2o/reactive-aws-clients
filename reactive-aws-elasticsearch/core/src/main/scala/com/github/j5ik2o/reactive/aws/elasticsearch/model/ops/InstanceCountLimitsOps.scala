// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class InstanceCountLimitsBuilderOps(val self: InstanceCountLimits.Builder) extends AnyVal {

  final def withMinimumInstanceCountAsScala(value: Option[Int]): InstanceCountLimits.Builder = {
    value.fold(self) { v =>
      self.minimumInstanceCount(v)
    }
  } // Int

  final def withMaximumInstanceCountAsScala(value: Option[Int]): InstanceCountLimits.Builder = {
    value.fold(self) { v =>
      self.maximumInstanceCount(v)
    }
  } // Int

}

final class InstanceCountLimitsOps(val self: InstanceCountLimits) extends AnyVal {

  final def minimumInstanceCountAsScala: Option[Int] = Option(self.minimumInstanceCount) // Int

  final def maximumInstanceCountAsScala: Option[Int] = Option(self.maximumInstanceCount) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceCountLimitsOps {

  implicit def toInstanceCountLimitsBuilderOps(v: InstanceCountLimits.Builder): InstanceCountLimitsBuilderOps =
    new InstanceCountLimitsBuilderOps(v)

  implicit def toInstanceCountLimitsOps(v: InstanceCountLimits): InstanceCountLimitsOps = new InstanceCountLimitsOps(v)

}
