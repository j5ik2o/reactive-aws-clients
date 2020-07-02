// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class DeleteFargateProfileResponseBuilderOps(val self: DeleteFargateProfileResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fargateProfileAsScala(value: Option[FargateProfile]): DeleteFargateProfileResponse.Builder = {
    value.fold(self) { v => self.fargateProfile(v) }
  }

}

final class DeleteFargateProfileResponseOps(val self: DeleteFargateProfileResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fargateProfileAsScala: Option[FargateProfile] = Option(self.fargateProfile)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFargateProfileResponseOps {

  implicit def toDeleteFargateProfileResponseBuilderOps(
      v: DeleteFargateProfileResponse.Builder
  ): DeleteFargateProfileResponseBuilderOps = new DeleteFargateProfileResponseBuilderOps(v)

  implicit def toDeleteFargateProfileResponseOps(v: DeleteFargateProfileResponse): DeleteFargateProfileResponseOps =
    new DeleteFargateProfileResponseOps(v)

}
