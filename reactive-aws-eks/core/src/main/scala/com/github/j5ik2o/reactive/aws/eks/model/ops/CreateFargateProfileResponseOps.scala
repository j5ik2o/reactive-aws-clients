// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class CreateFargateProfileResponseBuilderOps(val self: CreateFargateProfileResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fargateProfileAsScala(value: Option[FargateProfile]): CreateFargateProfileResponse.Builder = {
    value.fold(self) { v => self.fargateProfile(v) }
  }

}

final class CreateFargateProfileResponseOps(val self: CreateFargateProfileResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fargateProfileAsScala: Option[FargateProfile] = Option(self.fargateProfile)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFargateProfileResponseOps {

  implicit def toCreateFargateProfileResponseBuilderOps(
      v: CreateFargateProfileResponse.Builder
  ): CreateFargateProfileResponseBuilderOps = new CreateFargateProfileResponseBuilderOps(v)

  implicit def toCreateFargateProfileResponseOps(v: CreateFargateProfileResponse): CreateFargateProfileResponseOps =
    new CreateFargateProfileResponseOps(v)

}
