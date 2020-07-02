// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class LayerVersionsListItemBuilderOps(val self: LayerVersionsListItem.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerVersionArnAsScala(value: Option[String]): LayerVersionsListItem.Builder = {
    value.fold(self) { v => self.layerVersionArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala(value: Option[Long]): LayerVersionsListItem.Builder = {
    value.fold(self) { v => self.version(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): LayerVersionsListItem.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdDateAsScala(value: Option[String]): LayerVersionsListItem.Builder = {
    value.fold(self) { v => self.createdDate(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def compatibleRuntimesAsScala(value: Option[Seq[Runtime]]): LayerVersionsListItem.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.compatibleRuntimes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseInfoAsScala(value: Option[String]): LayerVersionsListItem.Builder = {
    value.fold(self) { v => self.licenseInfo(v) }
  }

}

final class LayerVersionsListItemOps(val self: LayerVersionsListItem) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerVersionArnAsScala: Option[String] = Option(self.layerVersionArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala: Option[Long] = Option(self.version)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdDateAsScala: Option[String] = Option(self.createdDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def compatibleRuntimesAsScala: Option[Seq[Runtime]] =
    Option(self.compatibleRuntimes).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseInfoAsScala: Option[String] = Option(self.licenseInfo)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLayerVersionsListItemOps {

  implicit def toLayerVersionsListItemBuilderOps(v: LayerVersionsListItem.Builder): LayerVersionsListItemBuilderOps =
    new LayerVersionsListItemBuilderOps(v)

  implicit def toLayerVersionsListItemOps(v: LayerVersionsListItem): LayerVersionsListItemOps =
    new LayerVersionsListItemOps(v)

}
