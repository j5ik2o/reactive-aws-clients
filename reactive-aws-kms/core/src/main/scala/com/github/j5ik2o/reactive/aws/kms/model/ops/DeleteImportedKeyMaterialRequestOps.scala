// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class DeleteImportedKeyMaterialRequestBuilderOps(val self: DeleteImportedKeyMaterialRequest.Builder)
    extends AnyVal {

  final def keyIdAsScala(value: Option[String]): DeleteImportedKeyMaterialRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

}

final class DeleteImportedKeyMaterialRequestOps(val self: DeleteImportedKeyMaterialRequest) extends AnyVal {

  final def keyIdAsScala: Option[String] = Option(self.keyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteImportedKeyMaterialRequestOps {

  implicit def toDeleteImportedKeyMaterialRequestBuilderOps(
      v: DeleteImportedKeyMaterialRequest.Builder
  ): DeleteImportedKeyMaterialRequestBuilderOps = new DeleteImportedKeyMaterialRequestBuilderOps(v)

  implicit def toDeleteImportedKeyMaterialRequestOps(
      v: DeleteImportedKeyMaterialRequest
  ): DeleteImportedKeyMaterialRequestOps = new DeleteImportedKeyMaterialRequestOps(v)

}
