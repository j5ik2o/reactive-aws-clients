// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class PublishLayerVersionRequestBuilderOps(val self: PublishLayerVersionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerNameAsScala(value: Option[String]): PublishLayerVersionRequest.Builder = {
    value.fold(self) { v =>
      self.layerName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): PublishLayerVersionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentAsScala(value: Option[LayerVersionContentInput]): PublishLayerVersionRequest.Builder = {
    value.fold(self) { v =>
      self.content(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def compatibleRuntimesAsScala(value: Option[Seq[Runtime]]): PublishLayerVersionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.compatibleRuntimes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseInfoAsScala(value: Option[String]): PublishLayerVersionRequest.Builder = {
    value.fold(self) { v =>
      self.licenseInfo(v)
    }
  }

}

final class PublishLayerVersionRequestOps(val self: PublishLayerVersionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerNameAsScala: Option[String] = Option(self.layerName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentAsScala: Option[LayerVersionContentInput] = Option(self.content)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def compatibleRuntimesAsScala: Option[Seq[Runtime]] = Option(self.compatibleRuntimes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
