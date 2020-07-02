// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetLayerVersionByArnResponseBuilderOps(val self: GetLayerVersionByArnResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentAsScala(value: Option[LayerVersionContentOutput]): GetLayerVersionByArnResponse.Builder = {
    value.fold(self) { v => self.content(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerArnAsScala(value: Option[String]): GetLayerVersionByArnResponse.Builder = {
    value.fold(self) { v => self.layerArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerVersionArnAsScala(value: Option[String]): GetLayerVersionByArnResponse.Builder = {
    value.fold(self) { v => self.layerVersionArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): GetLayerVersionByArnResponse.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdDateAsScala(value: Option[String]): GetLayerVersionByArnResponse.Builder = {
    value.fold(self) { v => self.createdDate(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala(value: Option[Long]): GetLayerVersionByArnResponse.Builder = {
    value.fold(self) { v => self.version(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def compatibleRuntimesAsScala(value: Option[Seq[Runtime]]): GetLayerVersionByArnResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.compatibleRuntimes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseInfoAsScala(value: Option[String]): GetLayerVersionByArnResponse.Builder = {
    value.fold(self) { v => self.licenseInfo(v) }
  }

}

final class GetLayerVersionByArnResponseOps(val self: GetLayerVersionByArnResponse) extends AnyVal {

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
trait ToGetLayerVersionByArnResponseOps {

  implicit def toGetLayerVersionByArnResponseBuilderOps(
      v: GetLayerVersionByArnResponse.Builder
  ): GetLayerVersionByArnResponseBuilderOps = new GetLayerVersionByArnResponseBuilderOps(v)

  implicit def toGetLayerVersionByArnResponseOps(v: GetLayerVersionByArnResponse): GetLayerVersionByArnResponseOps =
    new GetLayerVersionByArnResponseOps(v)

}
