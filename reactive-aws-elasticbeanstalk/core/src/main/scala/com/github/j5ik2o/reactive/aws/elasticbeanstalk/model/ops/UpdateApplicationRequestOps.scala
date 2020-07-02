// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class UpdateApplicationRequestBuilderOps(val self: UpdateApplicationRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): UpdateApplicationRequest.Builder = {
    value.fold(self) { v => self.applicationName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): UpdateApplicationRequest.Builder = {
    value.fold(self) { v => self.description(v) }
  }

}

final class UpdateApplicationRequestOps(val self: UpdateApplicationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateApplicationRequestOps {

  implicit def toUpdateApplicationRequestBuilderOps(
      v: UpdateApplicationRequest.Builder
  ): UpdateApplicationRequestBuilderOps = new UpdateApplicationRequestBuilderOps(v)

  implicit def toUpdateApplicationRequestOps(v: UpdateApplicationRequest): UpdateApplicationRequestOps =
    new UpdateApplicationRequestOps(v)

}
