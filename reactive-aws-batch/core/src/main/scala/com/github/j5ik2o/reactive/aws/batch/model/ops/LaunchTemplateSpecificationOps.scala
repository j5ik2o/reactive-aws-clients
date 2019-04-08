// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class LaunchTemplateSpecificationBuilderOps(val self: LaunchTemplateSpecification.Builder) extends AnyVal {

  final def launchTemplateIdAsScala(value: Option[String]): LaunchTemplateSpecification.Builder = {
    value.fold(self) { v =>
      self.launchTemplateId(v)
    }
  }

  final def launchTemplateNameAsScala(value: Option[String]): LaunchTemplateSpecification.Builder = {
    value.fold(self) { v =>
      self.launchTemplateName(v)
    }
  }

  final def versionAsScala(value: Option[String]): LaunchTemplateSpecification.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

}

final class LaunchTemplateSpecificationOps(val self: LaunchTemplateSpecification) extends AnyVal {

  final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId)

  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  final def versionAsScala: Option[String] = Option(self.version)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateSpecificationOps {

  implicit def toLaunchTemplateSpecificationBuilderOps(
      v: LaunchTemplateSpecification.Builder
  ): LaunchTemplateSpecificationBuilderOps = new LaunchTemplateSpecificationBuilderOps(v)

  implicit def toLaunchTemplateSpecificationOps(v: LaunchTemplateSpecification): LaunchTemplateSpecificationOps =
    new LaunchTemplateSpecificationOps(v)

}
