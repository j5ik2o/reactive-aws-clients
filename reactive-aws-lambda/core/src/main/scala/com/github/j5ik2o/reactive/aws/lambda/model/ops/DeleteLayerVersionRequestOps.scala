// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class DeleteLayerVersionRequestBuilderOps(val self: DeleteLayerVersionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerNameAsScala(value: Option[String]): DeleteLayerVersionRequest.Builder = {
    value.fold(self) { v =>
      self.layerName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionNumberAsScala(value: Option[Long]): DeleteLayerVersionRequest.Builder = {
    value.fold(self) { v =>
      self.versionNumber(v)
    }
  }

}

final class DeleteLayerVersionRequestOps(val self: DeleteLayerVersionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerNameAsScala: Option[String] = Option(self.layerName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionNumberAsScala: Option[Long] = Option(self.versionNumber)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLayerVersionRequestOps {

  implicit def toDeleteLayerVersionRequestBuilderOps(
      v: DeleteLayerVersionRequest.Builder
  ): DeleteLayerVersionRequestBuilderOps = new DeleteLayerVersionRequestBuilderOps(v)

  implicit def toDeleteLayerVersionRequestOps(v: DeleteLayerVersionRequest): DeleteLayerVersionRequestOps =
    new DeleteLayerVersionRequestOps(v)

}
