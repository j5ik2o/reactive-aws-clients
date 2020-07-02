// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class LayerVersionContentInputBuilderOps(val self: LayerVersionContentInput.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3BucketAsScala(value: Option[String]): LayerVersionContentInput.Builder = {
    value.fold(self) { v => self.s3Bucket(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3KeyAsScala(value: Option[String]): LayerVersionContentInput.Builder = {
    value.fold(self) { v => self.s3Key(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3ObjectVersionAsScala(value: Option[String]): LayerVersionContentInput.Builder = {
    value.fold(self) { v => self.s3ObjectVersion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zipFileAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): LayerVersionContentInput.Builder = {
    value.fold(self) { v => self.zipFile(v) }
  }

}

final class LayerVersionContentInputOps(val self: LayerVersionContentInput) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3BucketAsScala: Option[String] = Option(self.s3Bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3KeyAsScala: Option[String] = Option(self.s3Key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3ObjectVersionAsScala: Option[String] = Option(self.s3ObjectVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zipFileAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.zipFile)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLayerVersionContentInputOps {

  implicit def toLayerVersionContentInputBuilderOps(
      v: LayerVersionContentInput.Builder
  ): LayerVersionContentInputBuilderOps = new LayerVersionContentInputBuilderOps(v)

  implicit def toLayerVersionContentInputOps(v: LayerVersionContentInput): LayerVersionContentInputOps =
    new LayerVersionContentInputOps(v)

}
