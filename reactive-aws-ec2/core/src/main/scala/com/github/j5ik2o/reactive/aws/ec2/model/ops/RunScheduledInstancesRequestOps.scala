// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RunScheduledInstancesRequestBuilderOps(val self: RunScheduledInstancesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): RunScheduledInstancesRequest.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala(value: Option[Int]): RunScheduledInstancesRequest.Builder = {
    value.fold(self) { v => self.instanceCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchSpecificationAsScala(
      value: Option[ScheduledInstancesLaunchSpecification]
  ): RunScheduledInstancesRequest.Builder = {
    value.fold(self) { v => self.launchSpecification(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scheduledInstanceIdAsScala(value: Option[String]): RunScheduledInstancesRequest.Builder = {
    value.fold(self) { v => self.scheduledInstanceId(v) }
  }

}

final class RunScheduledInstancesRequestOps(val self: RunScheduledInstancesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchSpecificationAsScala: Option[ScheduledInstancesLaunchSpecification] = Option(self.launchSpecification)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scheduledInstanceIdAsScala: Option[String] = Option(self.scheduledInstanceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRunScheduledInstancesRequestOps {

  implicit def toRunScheduledInstancesRequestBuilderOps(
      v: RunScheduledInstancesRequest.Builder
  ): RunScheduledInstancesRequestBuilderOps = new RunScheduledInstancesRequestBuilderOps(v)

  implicit def toRunScheduledInstancesRequestOps(v: RunScheduledInstancesRequest): RunScheduledInstancesRequestOps =
    new RunScheduledInstancesRequestOps(v)

}
