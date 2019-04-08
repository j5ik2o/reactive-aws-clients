// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class AddLayerVersionPermissionRequestBuilderOps(val self: AddLayerVersionPermissionRequest.Builder)
    extends AnyVal {

  final def layerNameAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.layerName(v)
    }
  } // String

  final def versionNumberAsScala(value: Option[Long]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.versionNumber(v)
    }
  } // Long

  final def statementIdAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.statementId(v)
    }
  } // String

  final def actionAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.action(v)
    }
  } // String

  final def principalAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.principal(v)
    }
  } // String

  final def organizationIdAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.organizationId(v)
    }
  } // String

  final def revisionIdAsScala(value: Option[String]): AddLayerVersionPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  } // String

}

final class AddLayerVersionPermissionRequestOps(val self: AddLayerVersionPermissionRequest) extends AnyVal {

  final def layerNameAsScala: Option[String] = Option(self.layerName) // String

  final def versionNumberAsScala: Option[Long] = Option(self.versionNumber) // Long

  final def statementIdAsScala: Option[String] = Option(self.statementId) // String

  final def actionAsScala: Option[String] = Option(self.action) // String

  final def principalAsScala: Option[String] = Option(self.principal) // String

  final def organizationIdAsScala: Option[String] = Option(self.organizationId) // String

  final def revisionIdAsScala: Option[String] = Option(self.revisionId) // String

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
