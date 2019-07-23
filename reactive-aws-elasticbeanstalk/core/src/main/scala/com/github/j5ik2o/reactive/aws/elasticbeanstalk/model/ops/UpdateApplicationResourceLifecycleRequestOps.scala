// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class UpdateApplicationResourceLifecycleRequestBuilderOps(
    val self: UpdateApplicationResourceLifecycleRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): UpdateApplicationResourceLifecycleRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceLifecycleConfigAsScala(
      value: Option[ApplicationResourceLifecycleConfig]
  ): UpdateApplicationResourceLifecycleRequest.Builder = {
    value.fold(self) { v =>
      self.resourceLifecycleConfig(v)
    }
  }

}

final class UpdateApplicationResourceLifecycleRequestOps(val self: UpdateApplicationResourceLifecycleRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceLifecycleConfigAsScala: Option[ApplicationResourceLifecycleConfig] =
    Option(self.resourceLifecycleConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateApplicationResourceLifecycleRequestOps {

  implicit def toUpdateApplicationResourceLifecycleRequestBuilderOps(
      v: UpdateApplicationResourceLifecycleRequest.Builder
  ): UpdateApplicationResourceLifecycleRequestBuilderOps = new UpdateApplicationResourceLifecycleRequestBuilderOps(v)

  implicit def toUpdateApplicationResourceLifecycleRequestOps(
      v: UpdateApplicationResourceLifecycleRequest
  ): UpdateApplicationResourceLifecycleRequestOps = new UpdateApplicationResourceLifecycleRequestOps(v)

}
