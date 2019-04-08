// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DisassociateKmsKeyResponseBuilderOps(val self: DisassociateKmsKeyResponse.Builder) extends AnyVal {}

final class DisassociateKmsKeyResponseOps(val self: DisassociateKmsKeyResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisassociateKmsKeyResponseOps {

  implicit def toDisassociateKmsKeyResponseBuilderOps(
      v: DisassociateKmsKeyResponse.Builder
  ): DisassociateKmsKeyResponseBuilderOps = new DisassociateKmsKeyResponseBuilderOps(v)

  implicit def toDisassociateKmsKeyResponseOps(v: DisassociateKmsKeyResponse): DisassociateKmsKeyResponseOps =
    new DisassociateKmsKeyResponseOps(v)

}
