// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class UpdateEnvironmentResponseBuilderOps(val self: UpdateEnvironmentResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.environmentName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.environmentId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.applicationName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionLabelAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.versionLabel(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackNameAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.solutionStackName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.platformArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.templateName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointURLAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.endpointURL(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cnameAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.cname(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateCreatedAsScala(value: Option[java.time.Instant]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.dateCreated(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateUpdatedAsScala(value: Option[java.time.Instant]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.dateUpdated(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[EnvironmentStatus]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def abortableOperationInProgressAsScala(value: Option[Boolean]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.abortableOperationInProgress(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthAsScala(value: Option[EnvironmentHealth]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.health(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthStatusAsScala(value: Option[EnvironmentHealthStatus]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.healthStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourcesAsScala(value: Option[EnvironmentResourcesDescription]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.resources(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tierAsScala(value: Option[EnvironmentTier]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.tier(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentLinksAsScala(value: Option[Seq[EnvironmentLink]]): UpdateEnvironmentResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.environmentLinks(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentArnAsScala(value: Option[String]): UpdateEnvironmentResponse.Builder = {
    value.fold(self) { v => self.environmentArn(v) }
  }

}

final class UpdateEnvironmentResponseOps(val self: UpdateEnvironmentResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionLabelAsScala: Option[String] = Option(self.versionLabel)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala: Option[String] = Option(self.templateName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointURLAsScala: Option[String] = Option(self.endpointURL)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cnameAsScala: Option[String] = Option(self.cname)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateCreatedAsScala: Option[java.time.Instant] = Option(self.dateCreated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateUpdatedAsScala: Option[java.time.Instant] = Option(self.dateUpdated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[EnvironmentStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def abortableOperationInProgressAsScala: Option[Boolean] = Option(self.abortableOperationInProgress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthAsScala: Option[EnvironmentHealth] = Option(self.health)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthStatusAsScala: Option[EnvironmentHealthStatus] = Option(self.healthStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourcesAsScala: Option[EnvironmentResourcesDescription] = Option(self.resources)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tierAsScala: Option[EnvironmentTier] = Option(self.tier)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentLinksAsScala: Option[Seq[EnvironmentLink]] =
    Option(self.environmentLinks).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
