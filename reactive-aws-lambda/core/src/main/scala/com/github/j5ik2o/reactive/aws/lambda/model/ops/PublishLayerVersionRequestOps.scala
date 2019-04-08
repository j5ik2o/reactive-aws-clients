// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class PublishLayerVersionRequestBuilderOps(val self: PublishLayerVersionRequest.Builder) extends AnyVal {

  final def layerNameAsScala(value: Option[String]): PublishLayerVersionRequest.Builder = {
    value.fold(self) { v =>
      self.layerName(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): PublishLayerVersionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def contentAsScala(value: Option[LayerVersionContentInput]): PublishLayerVersionRequest.Builder = {
    value.fold(self) { v =>
      self.content(v)
    }
  } // LayerVersionContentInput

  final def compatibleRuntimesAsScala(value: Option[Seq[Runtime]]): PublishLayerVersionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.compatibleRuntimes(v.asJava)
    } // Seq[String]
  }

  final def licenseInfoAsScala(value: Option[String]): PublishLayerVersionRequest.Builder = {
    value.fold(self) { v =>
      self.licenseInfo(v)
    }
  } // String

}

final class PublishLayerVersionRequestOps(val self: PublishLayerVersionRequest) extends AnyVal {

  final def layerNameAsScala: Option[String] = Option(self.layerName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def contentAsScala: Option[LayerVersionContentInput] = Option(self.content) // LayerVersionContentInput

  final def compatibleRuntimesAsScala: Option[Seq[Runtime]] = Option(self.compatibleRuntimes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def licenseInfoAsScala: Option[String] = Option(self.licenseInfo) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPublishLayerVersionRequestOps {

  implicit def toPublishLayerVersionRequestBuilderOps(
      v: PublishLayerVersionRequest.Builder
  ): PublishLayerVersionRequestBuilderOps = new PublishLayerVersionRequestBuilderOps(v)

  implicit def toPublishLayerVersionRequestOps(v: PublishLayerVersionRequest): PublishLayerVersionRequestOps =
    new PublishLayerVersionRequestOps(v)

}
