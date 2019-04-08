// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class LayerVersionsListItemBuilderOps(val self: LayerVersionsListItem.Builder) extends AnyVal {

  final def layerVersionArnAsScala(value: Option[String]): LayerVersionsListItem.Builder = {
    value.fold(self) { v =>
      self.layerVersionArn(v)
    }
  }

  final def versionAsScala(value: Option[Long]): LayerVersionsListItem.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): LayerVersionsListItem.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def createdDateAsScala(value: Option[String]): LayerVersionsListItem.Builder = {
    value.fold(self) { v =>
      self.createdDate(v)
    }
  }

  final def compatibleRuntimesAsScala(value: Option[Seq[Runtime]]): LayerVersionsListItem.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.compatibleRuntimes(v.asJava)
    }
  }

  final def licenseInfoAsScala(value: Option[String]): LayerVersionsListItem.Builder = {
    value.fold(self) { v =>
      self.licenseInfo(v)
    }
  }

}

final class LayerVersionsListItemOps(val self: LayerVersionsListItem) extends AnyVal {

  final def layerVersionArnAsScala: Option[String] = Option(self.layerVersionArn)

  final def versionAsScala: Option[Long] = Option(self.version)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def createdDateAsScala: Option[String] = Option(self.createdDate)

  final def compatibleRuntimesAsScala: Option[Seq[Runtime]] = Option(self.compatibleRuntimes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def licenseInfoAsScala: Option[String] = Option(self.licenseInfo)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLayerVersionsListItemOps {

  implicit def toLayerVersionsListItemBuilderOps(v: LayerVersionsListItem.Builder): LayerVersionsListItemBuilderOps =
    new LayerVersionsListItemBuilderOps(v)

  implicit def toLayerVersionsListItemOps(v: LayerVersionsListItem): LayerVersionsListItemOps =
    new LayerVersionsListItemOps(v)

}
