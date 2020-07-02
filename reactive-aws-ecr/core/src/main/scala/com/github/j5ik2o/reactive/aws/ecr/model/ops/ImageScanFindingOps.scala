// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class ImageScanFindingBuilderOps(val self: ImageScanFinding.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): ImageScanFinding.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ImageScanFinding.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uriAsScala(value: Option[String]): ImageScanFinding.Builder = {
    value.fold(self) { v => self.uri(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def severityAsScala(value: Option[FindingSeverity]): ImageScanFinding.Builder = {
    value.fold(self) { v => self.severity(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala(value: Option[Seq[Attribute]]): ImageScanFinding.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributes(v.asJava)
    }
  }

}

final class ImageScanFindingOps(val self: ImageScanFinding) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uriAsScala: Option[String] = Option(self.uri)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def severityAsScala: Option[FindingSeverity] = Option(self.severity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala: Option[Seq[Attribute]] =
    Option(self.attributes).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImageScanFindingOps {

  implicit def toImageScanFindingBuilderOps(v: ImageScanFinding.Builder): ImageScanFindingBuilderOps =
    new ImageScanFindingBuilderOps(v)

  implicit def toImageScanFindingOps(v: ImageScanFinding): ImageScanFindingOps = new ImageScanFindingOps(v)

}
