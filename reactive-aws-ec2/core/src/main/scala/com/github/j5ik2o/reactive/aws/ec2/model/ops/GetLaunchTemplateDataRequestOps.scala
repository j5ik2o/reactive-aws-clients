// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetLaunchTemplateDataRequestBuilderOps(val self: GetLaunchTemplateDataRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): GetLaunchTemplateDataRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

}

final class GetLaunchTemplateDataRequestOps(val self: GetLaunchTemplateDataRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLaunchTemplateDataRequestOps {

  implicit def toGetLaunchTemplateDataRequestBuilderOps(
      v: GetLaunchTemplateDataRequest.Builder
  ): GetLaunchTemplateDataRequestBuilderOps = new GetLaunchTemplateDataRequestBuilderOps(v)

  implicit def toGetLaunchTemplateDataRequestOps(v: GetLaunchTemplateDataRequest): GetLaunchTemplateDataRequestOps =
    new GetLaunchTemplateDataRequestOps(v)

}
