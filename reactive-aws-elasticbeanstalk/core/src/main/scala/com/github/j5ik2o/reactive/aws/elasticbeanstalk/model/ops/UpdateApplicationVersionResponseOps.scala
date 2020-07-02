// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class UpdateApplicationVersionResponseBuilderOps(val self: UpdateApplicationVersionResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationVersionAsScala(
      value: Option[ApplicationVersionDescription]
  ): UpdateApplicationVersionResponse.Builder = {
    value.fold(self) { v => self.applicationVersion(v) }
  }

}

final class UpdateApplicationVersionResponseOps(val self: UpdateApplicationVersionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationVersionAsScala: Option[ApplicationVersionDescription] = Option(self.applicationVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateApplicationVersionResponseOps {

  implicit def toUpdateApplicationVersionResponseBuilderOps(
      v: UpdateApplicationVersionResponse.Builder
  ): UpdateApplicationVersionResponseBuilderOps = new UpdateApplicationVersionResponseBuilderOps(v)

  implicit def toUpdateApplicationVersionResponseOps(
      v: UpdateApplicationVersionResponse
  ): UpdateApplicationVersionResponseOps = new UpdateApplicationVersionResponseOps(v)

}
