// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class AssociateKmsKeyRequestBuilderOps(val self: AssociateKmsKeyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): AssociateKmsKeyRequest.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala(value: Option[String]): AssociateKmsKeyRequest.Builder = {
    value.fold(self) { v => self.kmsKeyId(v) }
  }

}

final class AssociateKmsKeyRequestOps(val self: AssociateKmsKeyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateKmsKeyRequestOps {

  implicit def toAssociateKmsKeyRequestBuilderOps(v: AssociateKmsKeyRequest.Builder): AssociateKmsKeyRequestBuilderOps =
    new AssociateKmsKeyRequestBuilderOps(v)

  implicit def toAssociateKmsKeyRequestOps(v: AssociateKmsKeyRequest): AssociateKmsKeyRequestOps =
    new AssociateKmsKeyRequestOps(v)

}
