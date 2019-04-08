// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ZoneAwarenessConfigBuilderOps(val self: ZoneAwarenessConfig.Builder) extends AnyVal {

  final def availabilityZoneCountAsScala(value: Option[Int]): ZoneAwarenessConfig.Builder = {
    value.fold(self) { v =>
      self.availabilityZoneCount(v)
    }
  } // Int

}

final class ZoneAwarenessConfigOps(val self: ZoneAwarenessConfig) extends AnyVal {

  final def availabilityZoneCountAsScala: Option[Int] = Option(self.availabilityZoneCount) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToZoneAwarenessConfigOps {

  implicit def toZoneAwarenessConfigBuilderOps(v: ZoneAwarenessConfig.Builder): ZoneAwarenessConfigBuilderOps =
    new ZoneAwarenessConfigBuilderOps(v)

  implicit def toZoneAwarenessConfigOps(v: ZoneAwarenessConfig): ZoneAwarenessConfigOps = new ZoneAwarenessConfigOps(v)

}
