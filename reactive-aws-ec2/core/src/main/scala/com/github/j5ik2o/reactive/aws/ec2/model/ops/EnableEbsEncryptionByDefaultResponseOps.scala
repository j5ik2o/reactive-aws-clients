// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EnableEbsEncryptionByDefaultResponseBuilderOps(val self: EnableEbsEncryptionByDefaultResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsEncryptionByDefaultAsScala(value: Option[Boolean]): EnableEbsEncryptionByDefaultResponse.Builder = {
    value.fold(self) { v => self.ebsEncryptionByDefault(v) }
  }

}

final class EnableEbsEncryptionByDefaultResponseOps(val self: EnableEbsEncryptionByDefaultResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsEncryptionByDefaultAsScala: Option[Boolean] = Option(self.ebsEncryptionByDefault)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableEbsEncryptionByDefaultResponseOps {

  implicit def toEnableEbsEncryptionByDefaultResponseBuilderOps(
      v: EnableEbsEncryptionByDefaultResponse.Builder
  ): EnableEbsEncryptionByDefaultResponseBuilderOps = new EnableEbsEncryptionByDefaultResponseBuilderOps(v)

  implicit def toEnableEbsEncryptionByDefaultResponseOps(
      v: EnableEbsEncryptionByDefaultResponse
  ): EnableEbsEncryptionByDefaultResponseOps = new EnableEbsEncryptionByDefaultResponseOps(v)

}
