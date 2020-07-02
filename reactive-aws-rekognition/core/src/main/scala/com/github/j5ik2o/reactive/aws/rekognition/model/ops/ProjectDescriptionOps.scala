// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class ProjectDescriptionBuilderOps(val self: ProjectDescription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectArnAsScala(value: Option[String]): ProjectDescription.Builder = {
    value.fold(self) { v => self.projectArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimestampAsScala(value: Option[java.time.Instant]): ProjectDescription.Builder = {
    value.fold(self) { v => self.creationTimestamp(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ProjectStatus]): ProjectDescription.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class ProjectDescriptionOps(val self: ProjectDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectArnAsScala: Option[String] = Option(self.projectArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimestampAsScala: Option[java.time.Instant] = Option(self.creationTimestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ProjectStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProjectDescriptionOps {

  implicit def toProjectDescriptionBuilderOps(v: ProjectDescription.Builder): ProjectDescriptionBuilderOps =
    new ProjectDescriptionBuilderOps(v)

  implicit def toProjectDescriptionOps(v: ProjectDescription): ProjectDescriptionOps = new ProjectDescriptionOps(v)

}
