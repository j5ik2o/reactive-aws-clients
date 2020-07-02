// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class AddLayerVersionPermissionRequestBuilderOps(val self: AddLayerVersionPermissionRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerNameAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v => self.layerName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionNumberAsScala(value: Option[Long]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v => self.versionNumber(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statementIdAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v => self.statementId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v => self.action(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def principalAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v => self.principal(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def organizationIdAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v => self.organizationId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v => self.revisionId(v) }
  }

}

final class AddLayerVersionPermissionRequestOps(val self: AddLayerVersionPermissionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerNameAsScala: Option[String] = Option(self.layerName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionNumberAsScala: Option[Long] = Option(self.versionNumber)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statementIdAsScala: Option[String] = Option(self.statementId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionAsScala: Option[String] = Option(self.action)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def principalAsScala: Option[String] = Option(self.principal)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def organizationIdAsScala: Option[String] = Option(self.organizationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddLayerVersionPermissionRequestOps {

  implicit def toAddLayerVersionPermissionRequestBuilderOps(
      v: AddLayerVersionPermissionRequest.Builder
  ): AddLayerVersionPermissionRequestBuilderOps = new AddLayerVersionPermissionRequestBuilderOps(v)

  implicit def toAddLayerVersionPermissionRequestOps(
      v: AddLayerVersionPermissionRequest
  ): AddLayerVersionPermissionRequestOps = new AddLayerVersionPermissionRequestOps(v)

}
