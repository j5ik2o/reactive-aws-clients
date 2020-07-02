// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class DeleteFargateProfileRequestBuilderOps(val self: DeleteFargateProfileRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): DeleteFargateProfileRequest.Builder = {
    value.fold(self) { v => self.clusterName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fargateProfileNameAsScala(value: Option[String]): DeleteFargateProfileRequest.Builder = {
    value.fold(self) { v => self.fargateProfileName(v) }
  }

}

final class DeleteFargateProfileRequestOps(val self: DeleteFargateProfileRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fargateProfileNameAsScala: Option[String] = Option(self.fargateProfileName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFargateProfileRequestOps {

  implicit def toDeleteFargateProfileRequestBuilderOps(
      v: DeleteFargateProfileRequest.Builder
  ): DeleteFargateProfileRequestBuilderOps = new DeleteFargateProfileRequestBuilderOps(v)

  implicit def toDeleteFargateProfileRequestOps(v: DeleteFargateProfileRequest): DeleteFargateProfileRequestOps =
    new DeleteFargateProfileRequestOps(v)

}
