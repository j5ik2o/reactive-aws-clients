// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ExportImageResponseBuilderOps(val self: ExportImageResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ExportImageResponse.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def diskImageFormatAsScala(value: Option[DiskImageFormat]): ExportImageResponse.Builder = {
    value.fold(self) { v => self.diskImageFormat(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportImageTaskIdAsScala(value: Option[String]): ExportImageResponse.Builder = {
    value.fold(self) { v => self.exportImageTaskId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[String]): ExportImageResponse.Builder = {
    value.fold(self) { v => self.imageId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleNameAsScala(value: Option[String]): ExportImageResponse.Builder = {
    value.fold(self) { v => self.roleName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def progressAsScala(value: Option[String]): ExportImageResponse.Builder = {
    value.fold(self) { v => self.progress(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3ExportLocationAsScala(value: Option[ExportTaskS3Location]): ExportImageResponse.Builder = {
    value.fold(self) { v => self.s3ExportLocation(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[String]): ExportImageResponse.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): ExportImageResponse.Builder = {
    value.fold(self) { v => self.statusMessage(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): ExportImageResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class ExportImageResponseOps(val self: ExportImageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def diskImageFormatAsScala: Option[DiskImageFormat] = Option(self.diskImageFormat)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportImageTaskIdAsScala: Option[String] = Option(self.exportImageTaskId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala: Option[String] = Option(self.imageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleNameAsScala: Option[String] = Option(self.roleName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def progressAsScala: Option[String] = Option(self.progress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3ExportLocationAsScala: Option[ExportTaskS3Location] = Option(self.s3ExportLocation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[String] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportImageResponseOps {

  implicit def toExportImageResponseBuilderOps(v: ExportImageResponse.Builder): ExportImageResponseBuilderOps =
    new ExportImageResponseBuilderOps(v)

  implicit def toExportImageResponseOps(v: ExportImageResponse): ExportImageResponseOps = new ExportImageResponseOps(v)

}
