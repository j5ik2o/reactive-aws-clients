// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class UpdateEnvironmentResponseBuilderOps(val self: UpdateEnvironmentResponse.Builder) extends AnyVal {

  final def environmentNameAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  final def environmentIdAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  }

  final def applicationNameAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  final def versionLabelAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  }

  final def solutionStackNameAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  }

  final def platformArnAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  }

  final def templateNameAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def endpointURLAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.endpointURL(v)
    }
  }

  final def cnameAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.cname(v)
    }
  }

  final def dateCreatedAsScala(value: Option[java.time.Instant]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.dateCreated(v)
    }
  }

  final def dateUpdatedAsScala(value: Option[java.time.Instant]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.dateUpdated(v)
    }
  }

  final def statusAsScala(value: Option[EnvironmentStatus]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def abortableOperationInProgressAsScala(value: Option[Boolean]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.abortableOperationInProgress(v)
    }
  }

  final def healthAsScala(value: Option[EnvironmentHealth]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.health(v)
    }
  }

  final def healthStatusAsScala(value: Option[EnvironmentHealthStatus]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.healthStatus(v)
    }
  }

  final def resourcesAsScala(value: Option[EnvironmentResourcesDescription]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.resources(v)
    }
  }

  final def tierAsScala(value: Option[EnvironmentTier]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.tier(v)
    }
  }

  final def environmentLinksAsScala(value: Option[Seq[EnvironmentLink]]): UpdateEnvironmentResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.environmentLinks(v.asJava)
    }
  }

  final def environmentArnAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.environmentArn(v)
    }
  }

}

final class UpdateEnvironmentResponseOps(val self: UpdateEnvironmentResponse) extends AnyVal {

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
trait ToUpdateEnvironmentResponseOps {

  implicit def toUpdateEnvironmentResponseBuilderOps(
      v: UpdateEnvironmentResponse.Builder
  ): UpdateEnvironmentResponseBuilderOps = new UpdateEnvironmentResponseBuilderOps(v)

  implicit def toUpdateEnvironmentResponseOps(v: UpdateEnvironmentResponse): UpdateEnvironmentResponseOps =
    new UpdateEnvironmentResponseOps(v)

}
