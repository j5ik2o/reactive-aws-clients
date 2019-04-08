// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class UpdateEnvironmentResponseBuilderOps(val self: UpdateEnvironmentResponse.Builder) extends AnyVal {

  final def environmentNameAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  } // String

  final def environmentIdAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  } // String

  final def applicationNameAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  } // String

  final def versionLabelAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  } // String

  final def solutionStackNameAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  } // String

  final def platformArnAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  } // String

  final def templateNameAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def endpointURLAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.endpointURL(v)
    }
  } // String

  final def cnameAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.cname(v)
    }
  } // String

  final def dateCreatedAsScala(value: Option[java.time.Instant]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.dateCreated(v)
    }
  } // java.time.Instant

  final def dateUpdatedAsScala(value: Option[java.time.Instant]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.dateUpdated(v)
    }
  } // java.time.Instant

  final def statusAsScala(value: Option[EnvironmentStatus]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // EnvironmentStatus

  final def abortableOperationInProgressAsScala(value: Option[Boolean]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.abortableOperationInProgress(v)
    }
  } // Boolean

  final def healthAsScala(value: Option[EnvironmentHealth]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.health(v)
    }
  } // EnvironmentHealth

  final def healthStatusAsScala(value: Option[EnvironmentHealthStatus]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.healthStatus(v)
    }
  } // EnvironmentHealthStatus

  final def resourcesAsScala(value: Option[EnvironmentResourcesDescription]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.resources(v)
    }
  } // EnvironmentResourcesDescription

  final def tierAsScala(value: Option[EnvironmentTier]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.tier(v)
    }
  } // EnvironmentTier

  final def environmentLinksAsScala(value: Option[Seq[EnvironmentLink]]): UpdateEnvironmentResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.environmentLinks(v.asJava)
    } // Seq[EnvironmentLink]
  }

  final def environmentArnAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.environmentArn(v)
    }
  } // String

}

final class UpdateEnvironmentResponseOps(val self: UpdateEnvironmentResponse) extends AnyVal {

  final def environmentNameAsScala: Option[String] = Option(self.environmentName) // String

  final def environmentIdAsScala: Option[String] = Option(self.environmentId) // String

  final def applicationNameAsScala: Option[String] = Option(self.applicationName) // String

  final def versionLabelAsScala: Option[String] = Option(self.versionLabel) // String

  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName) // String

  final def platformArnAsScala: Option[String] = Option(self.platformArn) // String

  final def templateNameAsScala: Option[String] = Option(self.templateName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def endpointURLAsScala: Option[String] = Option(self.endpointURL) // String

  final def cnameAsScala: Option[String] = Option(self.cname) // String

  final def dateCreatedAsScala: Option[java.time.Instant] = Option(self.dateCreated) // java.time.Instant

  final def dateUpdatedAsScala: Option[java.time.Instant] = Option(self.dateUpdated) // java.time.Instant

  final def statusAsScala: Option[EnvironmentStatus] = Option(self.status) // EnvironmentStatus

  final def abortableOperationInProgressAsScala: Option[Boolean] = Option(self.abortableOperationInProgress) // Boolean

  final def healthAsScala: Option[EnvironmentHealth] = Option(self.health) // EnvironmentHealth

  final def healthStatusAsScala: Option[EnvironmentHealthStatus] = Option(self.healthStatus) // EnvironmentHealthStatus

  final def resourcesAsScala: Option[EnvironmentResourcesDescription] =
    Option(self.resources) // EnvironmentResourcesDescription

  final def tierAsScala: Option[EnvironmentTier] = Option(self.tier) // EnvironmentTier

  final def environmentLinksAsScala: Option[Seq[EnvironmentLink]] = Option(self.environmentLinks).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[EnvironmentLink]

  final def environmentArnAsScala: Option[String] = Option(self.environmentArn) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateEnvironmentResponseOps {

  implicit def toUpdateEnvironmentResponseBuilderOps(
      v: UpdateEnvironmentResponse.Builder
  ): UpdateEnvironmentResponseBuilderOps = new UpdateEnvironmentResponseBuilderOps(v)

  implicit def toUpdateEnvironmentResponseOps(v: UpdateEnvironmentResponse): UpdateEnvironmentResponseOps =
    new UpdateEnvironmentResponseOps(v)

}
