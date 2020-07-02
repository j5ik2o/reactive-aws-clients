// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DisassociateKmsKeyRequestBuilderOps(val self: DisassociateKmsKeyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): DisassociateKmsKeyRequest.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

}

final class DisassociateKmsKeyRequestOps(val self: DisassociateKmsKeyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisassociateKmsKeyRequestOps {

  implicit def toDisassociateKmsKeyRequestBuilderOps(
      v: DisassociateKmsKeyRequest.Builder
  ): DisassociateKmsKeyRequestBuilderOps = new DisassociateKmsKeyRequestBuilderOps(v)

  implicit def toDisassociateKmsKeyRequestOps(v: DisassociateKmsKeyRequest): DisassociateKmsKeyRequestOps =
    new DisassociateKmsKeyRequestOps(v)

}
