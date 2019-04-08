// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class AddLayerVersionPermissionRequestBuilderOps(val self: AddLayerVersionPermissionRequest.Builder)
    extends AnyVal {

  final def layerNameAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.layerName(v)
    }
  }

  final def versionNumberAsScala(value: Option[Long]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.versionNumber(v)
    }
  }

  final def statementIdAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.statementId(v)
    }
  }

  final def actionAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.action(v)
    }
  }

  final def principalAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.principal(v)
    }
  }

  final def organizationIdAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.organizationId(v)
    }
  }

  final def revisionIdAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  }

}

final class AddLayerVersionPermissionRequestOps(val self: AddLayerVersionPermissionRequest) extends AnyVal {

  final def layerNameAsScala: Option[String] = Option(self.layerName)

  final def versionNumberAsScala: Option[Long] = Option(self.versionNumber)

  final def statementIdAsScala: Option[String] = Option(self.statementId)

  final def actionAsScala: Option[String] = Option(self.action)

  final def principalAsScala: Option[String] = Option(self.principal)

  final def organizationIdAsScala: Option[String] = Option(self.organizationId)

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
