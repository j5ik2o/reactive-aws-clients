// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class PublishLayerVersionResponseBuilderOps(val self: PublishLayerVersionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentAsScala(value: Option[LayerVersionContentOutput]): PublishLayerVersionResponse.Builder = {
    value.fold(self) { v => self.content(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerArnAsScala(value: Option[String]): PublishLayerVersionResponse.Builder = {
    value.fold(self) { v => self.layerArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerVersionArnAsScala(value: Option[String]): PublishLayerVersionResponse.Builder = {
    value.fold(self) { v => self.layerVersionArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): PublishLayerVersionResponse.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdDateAsScala(value: Option[String]): PublishLayerVersionResponse.Builder = {
    value.fold(self) { v => self.createdDate(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala(value: Option[Long]): PublishLayerVersionResponse.Builder = {
    value.fold(self) { v => self.version(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def compatibleRuntimesAsScala(value: Option[Seq[Runtime]]): PublishLayerVersionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.compatibleRuntimes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseInfoAsScala(value: Option[String]): PublishLayerVersionResponse.Builder = {
    value.fold(self) { v => self.licenseInfo(v) }
  }

}

final class PublishLayerVersionResponseOps(val self: PublishLayerVersionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentAsScala: Option[LayerVersionContentOutput] = Option(self.content)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerArnAsScala: Option[String] = Option(self.layerArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerVersionArnAsScala: Option[String] = Option(self.layerVersionArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdDateAsScala: Option[String] = Option(self.createdDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala: Option[Long] = Option(self.version)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def compatibleRuntimesAsScala: Option[Seq[Runtime]] =
    Option(self.compatibleRuntimes).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseInfoAsScala: Option[String] = Option(self.licenseInfo)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPublishLayerVersionResponseOps {

  implicit def toPublishLayerVersionResponseBuilderOps(
      v: PublishLayerVersionResponse.Builder
  ): PublishLayerVersionResponseBuilderOps = new PublishLayerVersionResponseBuilderOps(v)

  implicit def toPublishLayerVersionResponseOps(v: PublishLayerVersionResponse): PublishLayerVersionResponseOps =
    new PublishLayerVersionResponseOps(v)

}
