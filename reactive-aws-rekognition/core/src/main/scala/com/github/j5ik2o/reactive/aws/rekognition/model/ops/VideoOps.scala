// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class VideoBuilderOps(val self: Video.Builder) extends AnyVal {

  final def s3ObjectAsScala(value: Option[S3Object]): Video.Builder = {
    value.fold(self) { v =>
      self.s3Object(v)
    }
  }

}

final class VideoOps(val self: Video) extends AnyVal {

  final def s3ObjectAsScala: Option[S3Object] = Option(self.s3Object)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVideoOps {

  implicit def toVideoBuilderOps(v: Video.Builder): VideoBuilderOps = new VideoBuilderOps(v)

  implicit def toVideoOps(v: Video): VideoOps = new VideoOps(v)

}
