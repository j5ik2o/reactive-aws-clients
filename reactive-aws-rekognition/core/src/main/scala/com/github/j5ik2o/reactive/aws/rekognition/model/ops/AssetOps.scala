// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class AssetBuilderOps(val self: Asset.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groundTruthManifestAsScala(value: Option[GroundTruthManifest]): Asset.Builder = {
    value.fold(self) { v => self.groundTruthManifest(v) }
  }

}

final class AssetOps(val self: Asset) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groundTruthManifestAsScala: Option[GroundTruthManifest] = Option(self.groundTruthManifest)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssetOps {

  implicit def toAssetBuilderOps(v: Asset.Builder): AssetBuilderOps = new AssetBuilderOps(v)

  implicit def toAssetOps(v: Asset): AssetOps = new AssetOps(v)

}
