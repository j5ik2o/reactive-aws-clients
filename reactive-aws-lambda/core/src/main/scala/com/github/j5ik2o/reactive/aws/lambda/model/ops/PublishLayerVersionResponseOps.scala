// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class PublishLayerVersionResponseBuilderOps(val self: PublishLayerVersionResponse.Builder) extends AnyVal {

  final def contentAsScala(value: Option[LayerVersionContentOutput]): PublishLayerVersionResponse.Builder = {
    value.fold(self) { v =>
      self.content(v)
    }
  }

  final def layerArnAsScala(value: Option[String]): PublishLayerVersionResponse.Builder = {
    value.fold(self) { v =>
      self.layerArn(v)
    }
  }

  final def layerVersionArnAsScala(value: Option[String]): PublishLayerVersionResponse.Builder = {
    value.fold(self) { v =>
      self.layerVersionArn(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): PublishLayerVersionResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def createdDateAsScala(value: Option[String]): PublishLayerVersionResponse.Builder = {
    value.fold(self) { v =>
      self.createdDate(v)
    }
  }

  final def versionAsScala(value: Option[Long]): PublishLayerVersionResponse.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

  final def compatibleRuntimesAsScala(value: Option[Seq[Runtime]]): PublishLayerVersionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.compatibleRuntimes(v.asJava)
    }
  }

  final def licenseInfoAsScala(value: Option[String]): PublishLayerVersionResponse.Builder = {
    value.fold(self) { v =>
      self.licenseInfo(v)
    }
  }

}

final class PublishLayerVersionResponseOps(val self: PublishLayerVersionResponse) extends AnyVal {

  final def contentAsScala: Option[LayerVersionContentOutput] = Option(self.content)

  final def layerArnAsScala: Option[String] = Option(self.layerArn)

  final def layerVersionArnAsScala: Option[String] = Option(self.layerVersionArn)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def createdDateAsScala: Option[String] = Option(self.createdDate)

  final def versionAsScala: Option[Long] = Option(self.version)

  final def compatibleRuntimesAsScala: Option[Seq[Runtime]] = Option(self.compatibleRuntimes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

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
