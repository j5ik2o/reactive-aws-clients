// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TargetConfigurationRequestBuilderOps(val self: TargetConfigurationRequest.Builder) extends AnyVal {

  final def instanceCountAsScala(value: Option[Int]): TargetConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.instanceCount(v)
    }
  }

  final def offeringIdAsScala(value: Option[String]): TargetConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.offeringId(v)
    }
  }

}

final class TargetConfigurationRequestOps(val self: TargetConfigurationRequest) extends AnyVal {

  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  final def offeringIdAsScala: Option[String] = Option(self.offeringId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTargetConfigurationRequestOps {

  implicit def toTargetConfigurationRequestBuilderOps(
      v: TargetConfigurationRequest.Builder
  ): TargetConfigurationRequestBuilderOps = new TargetConfigurationRequestBuilderOps(v)

  implicit def toTargetConfigurationRequestOps(v: TargetConfigurationRequest): TargetConfigurationRequestOps =
    new TargetConfigurationRequestOps(v)

}
