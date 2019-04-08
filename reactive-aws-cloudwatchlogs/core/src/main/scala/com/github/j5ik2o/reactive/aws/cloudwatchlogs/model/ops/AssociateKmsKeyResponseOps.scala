// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class AssociateKmsKeyResponseBuilderOps(val self: AssociateKmsKeyResponse.Builder) extends AnyVal {}

final class AssociateKmsKeyResponseOps(val self: AssociateKmsKeyResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateKmsKeyResponseOps {

  implicit def toAssociateKmsKeyResponseBuilderOps(
      v: AssociateKmsKeyResponse.Builder
  ): AssociateKmsKeyResponseBuilderOps = new AssociateKmsKeyResponseBuilderOps(v)

  implicit def toAssociateKmsKeyResponseOps(v: AssociateKmsKeyResponse): AssociateKmsKeyResponseOps =
    new AssociateKmsKeyResponseOps(v)

}
