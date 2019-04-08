// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class LaunchConfigurationBuilderOps(val self: LaunchConfiguration.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): LaunchConfiguration.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

}

final class LaunchConfigurationOps(val self: LaunchConfiguration) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchConfigurationOps {

  implicit def toLaunchConfigurationBuilderOps(v: LaunchConfiguration.Builder): LaunchConfigurationBuilderOps =
    new LaunchConfigurationBuilderOps(v)

  implicit def toLaunchConfigurationOps(v: LaunchConfiguration): LaunchConfigurationOps = new LaunchConfigurationOps(v)

}
