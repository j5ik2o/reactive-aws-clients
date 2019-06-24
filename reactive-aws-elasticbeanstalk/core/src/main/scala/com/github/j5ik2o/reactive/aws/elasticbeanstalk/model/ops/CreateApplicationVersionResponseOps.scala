// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CreateApplicationVersionResponseBuilderOps(val self: CreateApplicationVersionResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationVersionAsScala(
      value: Option[ApplicationVersionDescription]
  ): CreateApplicationVersionResponse.Builder = {
    value.fold(self) { v =>
      self.applicationVersion(v)
    }
  }

}

final class CreateApplicationVersionResponseOps(val self: CreateApplicationVersionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationVersionAsScala: Option[ApplicationVersionDescription] = Option(self.applicationVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateApplicationVersionResponseOps {

  implicit def toCreateApplicationVersionResponseBuilderOps(
      v: CreateApplicationVersionResponse.Builder
  ): CreateApplicationVersionResponseBuilderOps = new CreateApplicationVersionResponseBuilderOps(v)

  implicit def toCreateApplicationVersionResponseOps(
      v: CreateApplicationVersionResponse
  ): CreateApplicationVersionResponseOps = new CreateApplicationVersionResponseOps(v)

}
