// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class SummaryBuilderOps(val self: Summary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3ObjectAsScala(value: Option[S3Object]): Summary.Builder = {
    value.fold(self) { v => self.s3Object(v) }
  }

}

final class SummaryOps(val self: Summary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3ObjectAsScala: Option[S3Object] = Option(self.s3Object)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSummaryOps {

  implicit def toSummaryBuilderOps(v: Summary.Builder): SummaryBuilderOps = new SummaryBuilderOps(v)

  implicit def toSummaryOps(v: Summary): SummaryOps = new SummaryOps(v)

}
