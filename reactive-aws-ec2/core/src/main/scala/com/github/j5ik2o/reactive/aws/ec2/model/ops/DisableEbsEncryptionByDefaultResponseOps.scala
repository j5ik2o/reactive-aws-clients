// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisableEbsEncryptionByDefaultResponseBuilderOps(val self: DisableEbsEncryptionByDefaultResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsEncryptionByDefaultAsScala(value: Option[Boolean]): DisableEbsEncryptionByDefaultResponse.Builder = {
    value.fold(self) { v => self.ebsEncryptionByDefault(v) }
  }

}

final class DisableEbsEncryptionByDefaultResponseOps(val self: DisableEbsEncryptionByDefaultResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsEncryptionByDefaultAsScala: Option[Boolean] = Option(self.ebsEncryptionByDefault)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableEbsEncryptionByDefaultResponseOps {

  implicit def toDisableEbsEncryptionByDefaultResponseBuilderOps(
      v: DisableEbsEncryptionByDefaultResponse.Builder
  ): DisableEbsEncryptionByDefaultResponseBuilderOps = new DisableEbsEncryptionByDefaultResponseBuilderOps(v)

  implicit def toDisableEbsEncryptionByDefaultResponseOps(
      v: DisableEbsEncryptionByDefaultResponse
  ): DisableEbsEncryptionByDefaultResponseOps = new DisableEbsEncryptionByDefaultResponseOps(v)

}
