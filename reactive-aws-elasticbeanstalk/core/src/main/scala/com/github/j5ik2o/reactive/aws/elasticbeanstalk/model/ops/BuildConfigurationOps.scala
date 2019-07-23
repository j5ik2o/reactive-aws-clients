// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class BuildConfigurationBuilderOps(val self: BuildConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def artifactNameAsScala(value: Option[String]): BuildConfiguration.Builder = {
    value.fold(self) { v =>
      self.artifactName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeBuildServiceRoleAsScala(value: Option[String]): BuildConfiguration.Builder = {
    value.fold(self) { v =>
      self.codeBuildServiceRole(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeTypeAsScala(value: Option[ComputeType]): BuildConfiguration.Builder = {
    value.fold(self) { v =>
      self.computeType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala(value: Option[String]): BuildConfiguration.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutInMinutesAsScala(value: Option[Int]): BuildConfiguration.Builder = {
    value.fold(self) { v =>
      self.timeoutInMinutes(v)
    }
  }

}

final class BuildConfigurationOps(val self: BuildConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def artifactNameAsScala: Option[String] = Option(self.artifactName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeBuildServiceRoleAsScala: Option[String] = Option(self.codeBuildServiceRole)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeTypeAsScala: Option[ComputeType] = Option(self.computeType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala: Option[String] = Option(self.image)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutInMinutesAsScala: Option[Int] = Option(self.timeoutInMinutes)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBuildConfigurationOps {

  implicit def toBuildConfigurationBuilderOps(v: BuildConfiguration.Builder): BuildConfigurationBuilderOps =
    new BuildConfigurationBuilderOps(v)

  implicit def toBuildConfigurationOps(v: BuildConfiguration): BuildConfigurationOps = new BuildConfigurationOps(v)

}
