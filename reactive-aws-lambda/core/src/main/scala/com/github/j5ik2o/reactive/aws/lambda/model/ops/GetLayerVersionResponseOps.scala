// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetLayerVersionResponseBuilderOps(val self: GetLayerVersionResponse.Builder) extends AnyVal {

  final def contentAsScala(value: Option[LayerVersionContentOutput]): GetLayerVersionResponse.Builder = {
    value.fold(self) { v =>
      self.content(v)
    }
  } // LayerVersionContentOutput

  final def layerArnAsScala(value: Option[String]): GetLayerVersionResponse.Builder = {
    value.fold(self) { v =>
      self.layerArn(v)
    }
  } // String

  final def layerVersionArnAsScala(value: Option[String]): GetLayerVersionResponse.Builder = {
    value.fold(self) { v =>
      self.layerVersionArn(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): GetLayerVersionResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def createdDateAsScala(value: Option[String]): GetLayerVersionResponse.Builder = {
    value.fold(self) { v =>
      self.createdDate(v)
    }
  } // String

  final def versionAsScala(value: Option[Long]): GetLayerVersionResponse.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  } // Long

  final def compatibleRuntimesAsScala(value: Option[Seq[Runtime]]): GetLayerVersionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.compatibleRuntimes(v.asJava)
    } // Seq[String]
  }

  final def licenseInfoAsScala(value: Option[String]): GetLayerVersionResponse.Builder = {
    value.fold(self) { v =>
      self.licenseInfo(v)
    }
  } // String

}

final class GetLayerVersionResponseOps(val self: GetLayerVersionResponse) extends AnyVal {

  final def contentAsScala: Option[LayerVersionContentOutput] = Option(self.content) // LayerVersionContentOutput

  final def layerArnAsScala: Option[String] = Option(self.layerArn) // String

  final def layerVersionArnAsScala: Option[String] = Option(self.layerVersionArn) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def createdDateAsScala: Option[String] = Option(self.createdDate) // String

  final def versionAsScala: Option[Long] = Option(self.version) // Long

  final def compatibleRuntimesAsScala: Option[Seq[Runtime]] = Option(self.compatibleRuntimes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def licenseInfoAsScala: Option[String] = Option(self.licenseInfo) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLayerVersionResponseOps {

  implicit def toGetLayerVersionResponseBuilderOps(
      v: GetLayerVersionResponse.Builder
  ): GetLayerVersionResponseBuilderOps = new GetLayerVersionResponseBuilderOps(v)

  implicit def toGetLayerVersionResponseOps(v: GetLayerVersionResponse): GetLayerVersionResponseOps =
    new GetLayerVersionResponseOps(v)

}
