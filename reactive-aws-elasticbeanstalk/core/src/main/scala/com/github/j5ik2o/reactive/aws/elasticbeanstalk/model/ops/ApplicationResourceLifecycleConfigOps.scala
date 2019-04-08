// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ApplicationResourceLifecycleConfigBuilderOps(val self: ApplicationResourceLifecycleConfig.Builder)
    extends AnyVal {

  final def serviceRoleAsScala(value: Option[String]): ApplicationResourceLifecycleConfig.Builder = {
    value.fold(self) { v =>
      self.serviceRole(v)
    }
  } // String

  final def versionLifecycleConfigAsScala(
      value: Option[ApplicationVersionLifecycleConfig]
  ): ApplicationResourceLifecycleConfig.Builder = {
    value.fold(self) { v =>
      self.versionLifecycleConfig(v)
    }
  } // ApplicationVersionLifecycleConfig

}

final class ApplicationResourceLifecycleConfigOps(val self: ApplicationResourceLifecycleConfig) extends AnyVal {

  final def serviceRoleAsScala: Option[String] = Option(self.serviceRole) // String

  final def versionLifecycleConfigAsScala: Option[ApplicationVersionLifecycleConfig] =
    Option(self.versionLifecycleConfig) // ApplicationVersionLifecycleConfig

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToApplicationResourceLifecycleConfigOps {

  implicit def toApplicationResourceLifecycleConfigBuilderOps(
      v: ApplicationResourceLifecycleConfig.Builder
  ): ApplicationResourceLifecycleConfigBuilderOps = new ApplicationResourceLifecycleConfigBuilderOps(v)

  implicit def toApplicationResourceLifecycleConfigOps(
      v: ApplicationResourceLifecycleConfig
  ): ApplicationResourceLifecycleConfigOps = new ApplicationResourceLifecycleConfigOps(v)

}
