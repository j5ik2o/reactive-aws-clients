// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class LayersListItemBuilderOps(val self: LayersListItem.Builder) extends AnyVal {

  final def layerNameAsScala(value: Option[String]): LayersListItem.Builder = {
    value.fold(self) { v =>
      self.layerName(v)
    }
  } // String

  final def layerArnAsScala(value: Option[String]): LayersListItem.Builder = {
    value.fold(self) { v =>
      self.layerArn(v)
    }
  } // String

  final def latestMatchingVersionAsScala(value: Option[LayerVersionsListItem]): LayersListItem.Builder = {
    value.fold(self) { v =>
      self.latestMatchingVersion(v)
    }
  } // LayerVersionsListItem

}

final class LayersListItemOps(val self: LayersListItem) extends AnyVal {

  final def layerNameAsScala: Option[String] = Option(self.layerName) // String

  final def layerArnAsScala: Option[String] = Option(self.layerArn) // String

  final def latestMatchingVersionAsScala: Option[LayerVersionsListItem] =
    Option(self.latestMatchingVersion) // LayerVersionsListItem

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLayersListItemOps {

  implicit def toLayersListItemBuilderOps(v: LayersListItem.Builder): LayersListItemBuilderOps =
    new LayersListItemBuilderOps(v)

  implicit def toLayersListItemOps(v: LayersListItem): LayersListItemOps = new LayersListItemOps(v)

}
