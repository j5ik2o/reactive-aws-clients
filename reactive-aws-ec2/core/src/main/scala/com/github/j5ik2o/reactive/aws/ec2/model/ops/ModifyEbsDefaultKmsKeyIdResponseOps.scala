// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyEbsDefaultKmsKeyIdResponseBuilderOps(val self: ModifyEbsDefaultKmsKeyIdResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala(value: Option[String]): ModifyEbsDefaultKmsKeyIdResponse.Builder = {
    value.fold(self) { v => self.kmsKeyId(v) }
  }

}

final class ModifyEbsDefaultKmsKeyIdResponseOps(val self: ModifyEbsDefaultKmsKeyIdResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyEbsDefaultKmsKeyIdResponseOps {

  implicit def toModifyEbsDefaultKmsKeyIdResponseBuilderOps(
      v: ModifyEbsDefaultKmsKeyIdResponse.Builder
  ): ModifyEbsDefaultKmsKeyIdResponseBuilderOps = new ModifyEbsDefaultKmsKeyIdResponseBuilderOps(v)

  implicit def toModifyEbsDefaultKmsKeyIdResponseOps(
      v: ModifyEbsDefaultKmsKeyIdResponse
  ): ModifyEbsDefaultKmsKeyIdResponseOps = new ModifyEbsDefaultKmsKeyIdResponseOps(v)

}
