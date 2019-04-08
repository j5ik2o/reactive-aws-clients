// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetLaunchTemplateDataResponseBuilderOps(val self: GetLaunchTemplateDataResponse.Builder) extends AnyVal {

  final def launchTemplateDataAsScala(
      value: Option[ResponseLaunchTemplateData]
  ): GetLaunchTemplateDataResponse.Builder = {
    value.fold(self) { v =>
      self.launchTemplateData(v)
    }
  }

}

final class GetLaunchTemplateDataResponseOps(val self: GetLaunchTemplateDataResponse) extends AnyVal {

  final def launchTemplateDataAsScala: Option[ResponseLaunchTemplateData] = Option(self.launchTemplateData)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLaunchTemplateDataResponseOps {

  implicit def toGetLaunchTemplateDataResponseBuilderOps(
      v: GetLaunchTemplateDataResponse.Builder
  ): GetLaunchTemplateDataResponseBuilderOps = new GetLaunchTemplateDataResponseBuilderOps(v)

  implicit def toGetLaunchTemplateDataResponseOps(v: GetLaunchTemplateDataResponse): GetLaunchTemplateDataResponseOps =
    new GetLaunchTemplateDataResponseOps(v)

}
