// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class EnvironmentTierBuilderOps(val self: EnvironmentTier.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): EnvironmentTier.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def typeAsScala(value: Option[String]): EnvironmentTier.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def versionAsScala(value: Option[String]): EnvironmentTier.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

}

final class EnvironmentTierOps(val self: EnvironmentTier) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def typeAsScala: Option[String] = Option(self.`type`)

  final def versionAsScala: Option[String] = Option(self.version)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnvironmentTierOps {

  implicit def toEnvironmentTierBuilderOps(v: EnvironmentTier.Builder): EnvironmentTierBuilderOps =
    new EnvironmentTierBuilderOps(v)

  implicit def toEnvironmentTierOps(v: EnvironmentTier): EnvironmentTierOps = new EnvironmentTierOps(v)

}
