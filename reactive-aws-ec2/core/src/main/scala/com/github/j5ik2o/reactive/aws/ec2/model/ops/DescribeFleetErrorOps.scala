// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFleetErrorBuilderOps(val self: DescribeFleetError.Builder) extends AnyVal {

  final def launchTemplateAndOverridesAsScala(
      value: Option[LaunchTemplateAndOverridesResponse]
  ): DescribeFleetError.Builder = {
    value.fold(self) { v =>
      self.launchTemplateAndOverrides(v)
    }
  }

  final def lifecycleAsScala(value: Option[InstanceLifecycle]): DescribeFleetError.Builder = {
    value.fold(self) { v =>
      self.lifecycle(v)
    }
  }

  final def errorCodeAsScala(value: Option[String]): DescribeFleetError.Builder = {
    value.fold(self) { v =>
      self.errorCode(v)
    }
  }

  final def errorMessageAsScala(value: Option[String]): DescribeFleetError.Builder = {
    value.fold(self) { v =>
      self.errorMessage(v)
    }
  }

}

final class DescribeFleetErrorOps(val self: DescribeFleetError) extends AnyVal {

  final def launchTemplateAndOverridesAsScala: Option[LaunchTemplateAndOverridesResponse] =
    Option(self.launchTemplateAndOverrides)

  final def lifecycleAsScala: Option[InstanceLifecycle] = Option(self.lifecycle)

  final def errorCodeAsScala: Option[String] = Option(self.errorCode)

  final def errorMessageAsScala: Option[String] = Option(self.errorMessage)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFleetErrorOps {

  implicit def toDescribeFleetErrorBuilderOps(v: DescribeFleetError.Builder): DescribeFleetErrorBuilderOps =
    new DescribeFleetErrorBuilderOps(v)

  implicit def toDescribeFleetErrorOps(v: DescribeFleetError): DescribeFleetErrorOps = new DescribeFleetErrorOps(v)

}
