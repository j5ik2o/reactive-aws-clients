// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ResetEbsDefaultKmsKeyIdResponseBuilderOps(val self: ResetEbsDefaultKmsKeyIdResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala(value: Option[String]): ResetEbsDefaultKmsKeyIdResponse.Builder = {
    value.fold(self) { v =>
      self.kmsKeyId(v)
    }
  }

}

final class ResetEbsDefaultKmsKeyIdResponseOps(val self: ResetEbsDefaultKmsKeyIdResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResetEbsDefaultKmsKeyIdResponseOps {

  implicit def toResetEbsDefaultKmsKeyIdResponseBuilderOps(
      v: ResetEbsDefaultKmsKeyIdResponse.Builder
  ): ResetEbsDefaultKmsKeyIdResponseBuilderOps = new ResetEbsDefaultKmsKeyIdResponseBuilderOps(v)

  implicit def toResetEbsDefaultKmsKeyIdResponseOps(
      v: ResetEbsDefaultKmsKeyIdResponse
  ): ResetEbsDefaultKmsKeyIdResponseOps = new ResetEbsDefaultKmsKeyIdResponseOps(v)

}
