// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CreateEnvironmentResponseBuilderOps(val self: CreateEnvironmentResponse.Builder) extends AnyVal {

  final def environmentNameAsScala(value: Option[String]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  } // String

  final def environmentIdAsScala(value: Option[String]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  } // String

  final def applicationNameAsScala(value: Option[String]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  } // String

  final def versionLabelAsScala(value: Option[String]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  } // String

  final def solutionStackNameAsScala(value: Option[String]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  } // String

  final def platformArnAsScala(value: Option[String]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  } // String

  final def templateNameAsScala(value: Option[String]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def endpointURLAsScala(value: Option[String]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.endpointURL(v)
    }
  } // String

  final def cnameAsScala(value: Option[String]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.cname(v)
    }
  } // String

  final def dateCreatedAsScala(value: Option[java.time.Instant]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.dateCreated(v)
    }
  } // Instant

  final def dateUpdatedAsScala(value: Option[java.time.Instant]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.dateUpdated(v)
    }
  } // Instant

  final def statusAsScala(value: Option[EnvironmentStatus]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // String

  final def abortableOperationInProgressAsScala(value: Option[Boolean]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.abortableOperationInProgress(v)
    }
  } // Boolean

  final def healthAsScala(value: Option[EnvironmentHealth]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.health(v)
    }
  } // String

  final def healthStatusAsScala(value: Option[EnvironmentHealthStatus]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.healthStatus(v)
    }
  } // String

  final def resourcesAsScala(value: Option[EnvironmentResourcesDescription]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.resources(v)
    }
  } // EnvironmentResourcesDescription

  final def tierAsScala(value: Option[EnvironmentTier]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.tier(v)
    }
  } // EnvironmentTier

  final def environmentLinksAsScala(value: Option[Seq[EnvironmentLink]]): CreateEnvironmentResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.environmentLinks(v.asJava)
    } // Seq[EnvironmentLink]
  }

  final def environmentArnAsScala(value: Option[String]): CreateEnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.environmentArn(v)
    }
  } // String

}

final class CreateEnvironmentResponseOps(val self: CreateEnvironmentResponse) extends AnyVal {

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

  final def dateCreatedAsScala: Option[java.time.Instant] = Option(self.dateCreated) // Instant

  final def dateUpdatedAsScala: Option[java.time.Instant] = Option(self.dateUpdated) // Instant

  final def statusAsScala: Option[EnvironmentStatus] = Option(self.status) // String

  final def abortableOperationInProgressAsScala: Option[Boolean] = Option(self.abortableOperationInProgress) // Boolean

  final def healthAsScala: Option[EnvironmentHealth] = Option(self.health) // String

  final def healthStatusAsScala: Option[EnvironmentHealthStatus] = Option(self.healthStatus) // String

  final def resourcesAsScala: Option[EnvironmentResourcesDescription] =
    Option(self.resources) // EnvironmentResourcesDescription

  final def tierAsScala: Option[EnvironmentTier] = Option(self.tier) // EnvironmentTier

  final def environmentLinksAsScala: Option[Seq[EnvironmentLink]] = Option(self.environmentLinks).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[EnvironmentLink]

  final def environmentArnAsScala: Option[String] = Option(self.environmentArn) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateEnvironmentResponseOps {

  implicit def toCreateEnvironmentResponseBuilderOps(
      v: CreateEnvironmentResponse.Builder
  ): CreateEnvironmentResponseBuilderOps = new CreateEnvironmentResponseBuilderOps(v)

  implicit def toCreateEnvironmentResponseOps(v: CreateEnvironmentResponse): CreateEnvironmentResponseOps =
    new CreateEnvironmentResponseOps(v)

}
