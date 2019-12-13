// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GroundTruthManifestBuilderOps(val self: GroundTruthManifest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3ObjectAsScala(value: Option[S3Object]): GroundTruthManifest.Builder = {
    value.fold(self) { v =>
      self.s3Object(v)
    }
  }

}

final class GroundTruthManifestOps(val self: GroundTruthManifest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3ObjectAsScala: Option[S3Object] = Option(self.s3Object)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGroundTruthManifestOps {

  implicit def toGroundTruthManifestBuilderOps(v: GroundTruthManifest.Builder): GroundTruthManifestBuilderOps =
    new GroundTruthManifestBuilderOps(v)

  implicit def toGroundTruthManifestOps(v: GroundTruthManifest): GroundTruthManifestOps = new GroundTruthManifestOps(v)

}
