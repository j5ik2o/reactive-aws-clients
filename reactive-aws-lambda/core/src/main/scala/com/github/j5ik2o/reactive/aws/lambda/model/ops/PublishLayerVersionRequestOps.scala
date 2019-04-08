// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class PublishLayerVersionRequestBuilderOps(val self: PublishLayerVersionRequest.Builder) extends AnyVal {

  final def layerNameAsScala(value: Option[String]): PublishLayerVersionRequest.Builder = {
    value.fold(self) { v =>
      self.layerName(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): PublishLayerVersionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def contentAsScala(value: Option[LayerVersionContentInput]): PublishLayerVersionRequest.Builder = {
    value.fold(self) { v =>
      self.content(v)
    }
  }

  final def compatibleRuntimesAsScala(value: Option[Seq[Runtime]]): PublishLayerVersionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.compatibleRuntimes(v.asJava)
    }
  }

  final def licenseInfoAsScala(value: Option[String]): PublishLayerVersionRequest.Builder = {
    value.fold(self) { v =>
      self.licenseInfo(v)
    }
  }

}

final class PublishLayerVersionRequestOps(val self: PublishLayerVersionRequest) extends AnyVal {

  final def layerNameAsScala: Option[String] = Option(self.layerName)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def contentAsScala: Option[LayerVersionContentInput] = Option(self.content)

  final def compatibleRuntimesAsScala: Option[Seq[Runtime]] = Option(self.compatibleRuntimes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def licenseInfoAsScala: Option[String] = Option(self.licenseInfo)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPublishLayerVersionRequestOps {

  implicit def toPublishLayerVersionRequestBuilderOps(
      v: PublishLayerVersionRequest.Builder
  ): PublishLayerVersionRequestBuilderOps = new PublishLayerVersionRequestBuilderOps(v)

  implicit def toPublishLayerVersionRequestOps(v: PublishLayerVersionRequest): PublishLayerVersionRequestOps =
    new PublishLayerVersionRequestOps(v)

}
