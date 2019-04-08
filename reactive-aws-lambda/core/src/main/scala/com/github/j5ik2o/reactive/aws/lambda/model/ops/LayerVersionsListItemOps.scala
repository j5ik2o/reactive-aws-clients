// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class LayerVersionsListItemBuilderOps(val self: LayerVersionsListItem.Builder) extends AnyVal {

  final def layerVersionArnAsScala(value: Option[String]): LayerVersionsListItem.Builder = {
    value.fold(self) { v =>
      self.layerVersionArn(v)
    }
  } // String

  final def versionAsScala(value: Option[Long]): LayerVersionsListItem.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  } // Long

  final def descriptionAsScala(value: Option[String]): LayerVersionsListItem.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def createdDateAsScala(value: Option[String]): LayerVersionsListItem.Builder = {
    value.fold(self) { v =>
      self.createdDate(v)
    }
  } // String

  final def compatibleRuntimesAsScala(value: Option[Seq[Runtime]]): LayerVersionsListItem.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.compatibleRuntimes(v.asJava)
    } // Seq[Runtime]
  }

  final def licenseInfoAsScala(value: Option[String]): LayerVersionsListItem.Builder = {
    value.fold(self) { v =>
      self.licenseInfo(v)
    }
  } // String

}

final class LayerVersionsListItemOps(val self: LayerVersionsListItem) extends AnyVal {

  final def layerVersionArnAsScala: Option[String] = Option(self.layerVersionArn) // String

  final def versionAsScala: Option[Long] = Option(self.version) // Long

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def createdDateAsScala: Option[String] = Option(self.createdDate) // String

  final def compatibleRuntimesAsScala: Option[Seq[Runtime]] = Option(self.compatibleRuntimes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Runtime]

  final def licenseInfoAsScala: Option[String] = Option(self.licenseInfo) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLayerVersionsListItemOps {

  implicit def toLayerVersionsListItemBuilderOps(v: LayerVersionsListItem.Builder): LayerVersionsListItemBuilderOps =
    new LayerVersionsListItemBuilderOps(v)

  implicit def toLayerVersionsListItemOps(v: LayerVersionsListItem): LayerVersionsListItemOps =
    new LayerVersionsListItemOps(v)

}
