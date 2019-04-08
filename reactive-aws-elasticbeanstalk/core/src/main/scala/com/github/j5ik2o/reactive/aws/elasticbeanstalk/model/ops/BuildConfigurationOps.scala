// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class BuildConfigurationBuilderOps(val self: BuildConfiguration.Builder) extends AnyVal {

  final def artifactNameAsScala(value: Option[String]): BuildConfiguration.Builder = {
    value.fold(self) { v =>
      self.artifactName(v)
    }
  } // String

  final def codeBuildServiceRoleAsScala(value: Option[String]): BuildConfiguration.Builder = {
    value.fold(self) { v =>
      self.codeBuildServiceRole(v)
    }
  } // String

  final def computeTypeAsScala(value: Option[ComputeType]): BuildConfiguration.Builder = {
    value.fold(self) { v =>
      self.computeType(v)
    }
  } // String

  final def imageAsScala(value: Option[String]): BuildConfiguration.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  } // String

  final def timeoutInMinutesAsScala(value: Option[Int]): BuildConfiguration.Builder = {
    value.fold(self) { v =>
      self.timeoutInMinutes(v)
    }
  } // Int

}

final class BuildConfigurationOps(val self: BuildConfiguration) extends AnyVal {

  final def artifactNameAsScala: Option[String] = Option(self.artifactName) // String

  final def codeBuildServiceRoleAsScala: Option[String] = Option(self.codeBuildServiceRole) // String

  final def computeTypeAsScala: Option[ComputeType] = Option(self.computeType) // String

  final def imageAsScala: Option[String] = Option(self.image) // String

  final def timeoutInMinutesAsScala: Option[Int] = Option(self.timeoutInMinutes) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBuildConfigurationOps {

  implicit def toBuildConfigurationBuilderOps(v: BuildConfiguration.Builder): BuildConfigurationBuilderOps =
    new BuildConfigurationBuilderOps(v)

  implicit def toBuildConfigurationOps(v: BuildConfiguration): BuildConfigurationOps = new BuildConfigurationOps(v)

}
