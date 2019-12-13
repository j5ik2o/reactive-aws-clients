// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class DescribeFargateProfileRequestBuilderOps(val self: DescribeFargateProfileRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): DescribeFargateProfileRequest.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fargateProfileNameAsScala(value: Option[String]): DescribeFargateProfileRequest.Builder = {
    value.fold(self) { v =>
      self.fargateProfileName(v)
    }
  }

}

final class DescribeFargateProfileRequestOps(val self: DescribeFargateProfileRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fargateProfileNameAsScala: Option[String] = Option(self.fargateProfileName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFargateProfileRequestOps {

  implicit def toDescribeFargateProfileRequestBuilderOps(
      v: DescribeFargateProfileRequest.Builder
  ): DescribeFargateProfileRequestBuilderOps = new DescribeFargateProfileRequestBuilderOps(v)

  implicit def toDescribeFargateProfileRequestOps(v: DescribeFargateProfileRequest): DescribeFargateProfileRequestOps =
    new DescribeFargateProfileRequestOps(v)

}
