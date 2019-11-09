// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ExportImageRequestBuilderOps(val self: ExportImageRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): ExportImageRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ExportImageRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def diskImageFormatAsScala(value: Option[DiskImageFormat]): ExportImageRequest.Builder = {
    value.fold(self) { v =>
      self.diskImageFormat(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[String]): ExportImageRequest.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3ExportLocationAsScala(value: Option[ExportTaskS3LocationRequest]): ExportImageRequest.Builder = {
    value.fold(self) { v =>
      self.s3ExportLocation(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleNameAsScala(value: Option[String]): ExportImageRequest.Builder = {
    value.fold(self) { v =>
      self.roleName(v)
    }
  }

}

final class ExportImageRequestOps(val self: ExportImageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def diskImageFormatAsScala: Option[DiskImageFormat] = Option(self.diskImageFormat)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala: Option[String] = Option(self.imageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3ExportLocationAsScala: Option[ExportTaskS3LocationRequest] = Option(self.s3ExportLocation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleNameAsScala: Option[String] = Option(self.roleName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportImageRequestOps {

  implicit def toExportImageRequestBuilderOps(v: ExportImageRequest.Builder): ExportImageRequestBuilderOps =
    new ExportImageRequestBuilderOps(v)

  implicit def toExportImageRequestOps(v: ExportImageRequest): ExportImageRequestOps = new ExportImageRequestOps(v)

}
