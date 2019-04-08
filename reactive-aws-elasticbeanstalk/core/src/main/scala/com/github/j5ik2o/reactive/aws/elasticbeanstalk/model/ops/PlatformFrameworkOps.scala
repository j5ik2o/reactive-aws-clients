// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class PlatformFrameworkBuilderOps(val self: PlatformFramework.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): PlatformFramework.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def versionAsScala(value: Option[String]): PlatformFramework.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  } // String

}

final class PlatformFrameworkOps(val self: PlatformFramework) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name) // String

  final def versionAsScala: Option[String] = Option(self.version) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPlatformFrameworkOps {

  implicit def toPlatformFrameworkBuilderOps(v: PlatformFramework.Builder): PlatformFrameworkBuilderOps =
    new PlatformFrameworkBuilderOps(v)

  implicit def toPlatformFrameworkOps(v: PlatformFramework): PlatformFrameworkOps = new PlatformFrameworkOps(v)

}
