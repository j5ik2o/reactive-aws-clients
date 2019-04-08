// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class EnvironmentLinkBuilderOps(val self: EnvironmentLink.Builder) extends AnyVal {

  final def linkNameAsScala(value: Option[String]): EnvironmentLink.Builder = {
    value.fold(self) { v =>
      self.linkName(v)
    }
  }

  final def environmentNameAsScala(value: Option[String]): EnvironmentLink.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

}

final class EnvironmentLinkOps(val self: EnvironmentLink) extends AnyVal {

  final def linkNameAsScala: Option[String] = Option(self.linkName)

  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnvironmentLinkOps {

  implicit def toEnvironmentLinkBuilderOps(v: EnvironmentLink.Builder): EnvironmentLinkBuilderOps =
    new EnvironmentLinkBuilderOps(v)

  implicit def toEnvironmentLinkOps(v: EnvironmentLink): EnvironmentLinkOps = new EnvironmentLinkOps(v)

}
