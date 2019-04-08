// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class EnvironmentDescriptionBuilderOps(val self: EnvironmentDescription.Builder) extends AnyVal {

  final def environmentNameAsScala(value: Option[String]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  final def environmentIdAsScala(value: Option[String]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  }

  final def applicationNameAsScala(value: Option[String]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  final def versionLabelAsScala(value: Option[String]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  }

  final def solutionStackNameAsScala(value: Option[String]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  }

  final def platformArnAsScala(value: Option[String]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  }

  final def templateNameAsScala(value: Option[String]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def endpointURLAsScala(value: Option[String]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.endpointURL(v)
    }
  }

  final def cnameAsScala(value: Option[String]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.cname(v)
    }
  }

  final def dateCreatedAsScala(value: Option[java.time.Instant]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.dateCreated(v)
    }
  }

  final def dateUpdatedAsScala(value: Option[java.time.Instant]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.dateUpdated(v)
    }
  }

  final def statusAsScala(value: Option[EnvironmentStatus]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def abortableOperationInProgressAsScala(value: Option[Boolean]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.abortableOperationInProgress(v)
    }
  }

  final def healthAsScala(value: Option[EnvironmentHealth]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.health(v)
    }
  }

  final def healthStatusAsScala(value: Option[EnvironmentHealthStatus]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.healthStatus(v)
    }
  }

  final def resourcesAsScala(value: Option[EnvironmentResourcesDescription]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.resources(v)
    }
  }

  final def tierAsScala(value: Option[EnvironmentTier]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.tier(v)
    }
  }

  final def environmentLinksAsScala(value: Option[Seq[EnvironmentLink]]): EnvironmentDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.environmentLinks(v.asJava)
    }
  }

  final def environmentArnAsScala(value: Option[String]): EnvironmentDescription.Builder = {
    value.fold(self) { v =>
      self.environmentArn(v)
    }
  }

}

final class EnvironmentDescriptionOps(val self: EnvironmentDescription) extends AnyVal {

  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  final def versionLabelAsScala: Option[String] = Option(self.versionLabel)

  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName)

  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  final def templateNameAsScala: Option[String] = Option(self.templateName)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def endpointURLAsScala: Option[String] = Option(self.endpointURL)

  final def cnameAsScala: Option[String] = Option(self.cname)

  final def dateCreatedAsScala: Option[java.time.Instant] = Option(self.dateCreated)

  final def dateUpdatedAsScala: Option[java.time.Instant] = Option(self.dateUpdated)

  final def statusAsScala: Option[EnvironmentStatus] = Option(self.status)

  final def abortableOperationInProgressAsScala: Option[Boolean] = Option(self.abortableOperationInProgress)

  final def healthAsScala: Option[EnvironmentHealth] = Option(self.health)

  final def healthStatusAsScala: Option[EnvironmentHealthStatus] = Option(self.healthStatus)

  final def resourcesAsScala: Option[EnvironmentResourcesDescription] = Option(self.resources)

  final def tierAsScala: Option[EnvironmentTier] = Option(self.tier)

  final def environmentLinksAsScala: Option[Seq[EnvironmentLink]] = Option(self.environmentLinks).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def environmentArnAsScala: Option[String] = Option(self.environmentArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnvironmentDescriptionOps {

  implicit def toEnvironmentDescriptionBuilderOps(v: EnvironmentDescription.Builder): EnvironmentDescriptionBuilderOps =
    new EnvironmentDescriptionBuilderOps(v)

  implicit def toEnvironmentDescriptionOps(v: EnvironmentDescription): EnvironmentDescriptionOps =
    new EnvironmentDescriptionOps(v)

}
