// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class DescribeFargateProfileResponseBuilderOps(val self: DescribeFargateProfileResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fargateProfileAsScala(value: Option[FargateProfile]): DescribeFargateProfileResponse.Builder = {
    value.fold(self) { v =>
      self.fargateProfile(v)
    }
  }

}

final class DescribeFargateProfileResponseOps(val self: DescribeFargateProfileResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fargateProfileAsScala: Option[FargateProfile] = Option(self.fargateProfile)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFargateProfileResponseOps {

  implicit def toDescribeFargateProfileResponseBuilderOps(
      v: DescribeFargateProfileResponse.Builder
  ): DescribeFargateProfileResponseBuilderOps = new DescribeFargateProfileResponseBuilderOps(v)

  implicit def toDescribeFargateProfileResponseOps(
      v: DescribeFargateProfileResponse
  ): DescribeFargateProfileResponseOps = new DescribeFargateProfileResponseOps(v)

}
