// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TargetConfigurationBuilderOps(val self: TargetConfiguration.Builder) extends AnyVal {

  final def instanceCountAsScala(value: Option[Int]): TargetConfiguration.Builder = {
    value.fold(self) { v =>
      self.instanceCount(v)
    }
  }

  final def offeringIdAsScala(value: Option[String]): TargetConfiguration.Builder = {
    value.fold(self) { v =>
      self.offeringId(v)
    }
  }

}

final class TargetConfigurationOps(val self: TargetConfiguration) extends AnyVal {

  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  final def offeringIdAsScala: Option[String] = Option(self.offeringId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTargetConfigurationOps {

  implicit def toTargetConfigurationBuilderOps(v: TargetConfiguration.Builder): TargetConfigurationBuilderOps =
    new TargetConfigurationBuilderOps(v)

  implicit def toTargetConfigurationOps(v: TargetConfiguration): TargetConfigurationOps = new TargetConfigurationOps(v)

}
