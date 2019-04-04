// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class OutputLocationBuilderOps(val self: OutputLocation.Builder) extends AnyVal {

  final def withS3AsScala(value: Option[S3Location]): OutputLocation.Builder = {
    value.fold(self) { v =>
      self.s3(v)
    }
  } // S3Location

}

final class OutputLocationOps(val self: OutputLocation) extends AnyVal {

  final def s3AsScala: Option[S3Location] = Option(self.s3) // S3Location

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOutputLocationOps {

  implicit def toOutputLocationBuilderOps(v: OutputLocation.Builder): OutputLocationBuilderOps =
    new OutputLocationBuilderOps(v)

  implicit def toOutputLocationOps(v: OutputLocation): OutputLocationOps = new OutputLocationOps(v)

}
