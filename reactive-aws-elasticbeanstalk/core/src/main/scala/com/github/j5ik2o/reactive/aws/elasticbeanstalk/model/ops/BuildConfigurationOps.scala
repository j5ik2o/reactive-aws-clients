// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class BuildConfigurationBuilderOps(val self: BuildConfiguration.Builder) extends AnyVal {

  final def artifactNameAsScala(value: Option[String]): BuildConfiguration.Builder = {
    value.fold(self) { v =>
      self.artifactName(v)
    }
  }

  final def codeBuildServiceRoleAsScala(value: Option[String]): BuildConfiguration.Builder = {
    value.fold(self) { v =>
      self.codeBuildServiceRole(v)
    }
  }

  final def computeTypeAsScala(value: Option[ComputeType]): BuildConfiguration.Builder = {
    value.fold(self) { v =>
      self.computeType(v)
    }
  }

  final def imageAsScala(value: Option[String]): BuildConfiguration.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

  final def timeoutInMinutesAsScala(value: Option[Int]): BuildConfiguration.Builder = {
    value.fold(self) { v =>
      self.timeoutInMinutes(v)
    }
  }

}

final class BuildConfigurationOps(val self: BuildConfiguration) extends AnyVal {

  final def artifactNameAsScala: Option[String] = Option(self.artifactName)

  final def codeBuildServiceRoleAsScala: Option[String] = Option(self.codeBuildServiceRole)

  final def computeTypeAsScala: Option[ComputeType] = Option(self.computeType)

  final def imageAsScala: Option[String] = Option(self.image)

  final def timeoutInMinutesAsScala: Option[Int] = Option(self.timeoutInMinutes)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBuildConfigurationOps {

  implicit def toBuildConfigurationBuilderOps(v: BuildConfiguration.Builder): BuildConfigurationBuilderOps =
    new BuildConfigurationBuilderOps(v)

  implicit def toBuildConfigurationOps(v: BuildConfiguration): BuildConfigurationOps = new BuildConfigurationOps(v)

}
