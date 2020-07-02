// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ServerSideEncryptionRuleBuilderOps(val self: ServerSideEncryptionRule.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applyServerSideEncryptionByDefaultAsScala(
      value: Option[ServerSideEncryptionByDefault]
  ): ServerSideEncryptionRule.Builder = {
    value.fold(self) { v => self.applyServerSideEncryptionByDefault(v) }
  }

}

final class ServerSideEncryptionRuleOps(val self: ServerSideEncryptionRule) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applyServerSideEncryptionByDefaultAsScala: Option[ServerSideEncryptionByDefault] =
    Option(self.applyServerSideEncryptionByDefault)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToServerSideEncryptionRuleOps {

  implicit def toServerSideEncryptionRuleBuilderOps(
      v: ServerSideEncryptionRule.Builder
  ): ServerSideEncryptionRuleBuilderOps = new ServerSideEncryptionRuleBuilderOps(v)

  implicit def toServerSideEncryptionRuleOps(v: ServerSideEncryptionRule): ServerSideEncryptionRuleOps =
    new ServerSideEncryptionRuleOps(v)

}
