// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class UpdateApplicationResourceLifecycleResponseBuilderOps(
    val self: UpdateApplicationResourceLifecycleResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): UpdateApplicationResourceLifecycleResponse.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceLifecycleConfigAsScala(
      value: Option[ApplicationResourceLifecycleConfig]
  ): UpdateApplicationResourceLifecycleResponse.Builder = {
    value.fold(self) { v =>
      self.resourceLifecycleConfig(v)
    }
  }

}

final class UpdateApplicationResourceLifecycleResponseOps(val self: UpdateApplicationResourceLifecycleResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceLifecycleConfigAsScala: Option[ApplicationResourceLifecycleConfig] =
    Option(self.resourceLifecycleConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateApplicationResourceLifecycleResponseOps {

  implicit def toUpdateApplicationResourceLifecycleResponseBuilderOps(
      v: UpdateApplicationResourceLifecycleResponse.Builder
  ): UpdateApplicationResourceLifecycleResponseBuilderOps = new UpdateApplicationResourceLifecycleResponseBuilderOps(v)

  implicit def toUpdateApplicationResourceLifecycleResponseOps(
      v: UpdateApplicationResourceLifecycleResponse
  ): UpdateApplicationResourceLifecycleResponseOps = new UpdateApplicationResourceLifecycleResponseOps(v)

}
