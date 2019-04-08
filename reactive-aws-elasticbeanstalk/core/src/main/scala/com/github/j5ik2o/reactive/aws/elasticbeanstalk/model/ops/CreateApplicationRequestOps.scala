// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CreateApplicationRequestBuilderOps(val self: CreateApplicationRequest.Builder) extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): CreateApplicationRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): CreateApplicationRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def resourceLifecycleConfigAsScala(
      value: Option[ApplicationResourceLifecycleConfig]
  ): CreateApplicationRequest.Builder = {
    value.fold(self) { v =>
      self.resourceLifecycleConfig(v)
    }
  } // ApplicationResourceLifecycleConfig

}

final class CreateApplicationRequestOps(val self: CreateApplicationRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def resourceLifecycleConfigAsScala: Option[ApplicationResourceLifecycleConfig] =
    Option(self.resourceLifecycleConfig) // ApplicationResourceLifecycleConfig

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateApplicationRequestOps {

  implicit def toCreateApplicationRequestBuilderOps(
      v: CreateApplicationRequest.Builder
  ): CreateApplicationRequestBuilderOps = new CreateApplicationRequestBuilderOps(v)

  implicit def toCreateApplicationRequestOps(v: CreateApplicationRequest): CreateApplicationRequestOps =
    new CreateApplicationRequestOps(v)

}
