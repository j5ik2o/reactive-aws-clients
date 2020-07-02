// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class LayerVersionContentOutputBuilderOps(val self: LayerVersionContentOutput.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def locationAsScala(value: Option[String]): LayerVersionContentOutput.Builder = {
    value.fold(self) { v => self.location(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeSha256AsScala(value: Option[String]): LayerVersionContentOutput.Builder = {
    value.fold(self) { v => self.codeSha256(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeSizeAsScala(value: Option[Long]): LayerVersionContentOutput.Builder = {
    value.fold(self) { v => self.codeSize(v) }
  }

}

final class LayerVersionContentOutputOps(val self: LayerVersionContentOutput) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def locationAsScala: Option[String] = Option(self.location)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeSha256AsScala: Option[String] = Option(self.codeSha256)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeSizeAsScala: Option[Long] = Option(self.codeSize)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLayerVersionContentOutputOps {

  implicit def toLayerVersionContentOutputBuilderOps(
      v: LayerVersionContentOutput.Builder
  ): LayerVersionContentOutputBuilderOps = new LayerVersionContentOutputBuilderOps(v)

  implicit def toLayerVersionContentOutputOps(v: LayerVersionContentOutput): LayerVersionContentOutputOps =
    new LayerVersionContentOutputOps(v)

}
