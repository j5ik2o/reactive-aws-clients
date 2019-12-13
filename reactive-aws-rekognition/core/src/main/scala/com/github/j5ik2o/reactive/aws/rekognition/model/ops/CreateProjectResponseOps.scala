// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CreateProjectResponseBuilderOps(val self: CreateProjectResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectArnAsScala(value: Option[String]): CreateProjectResponse.Builder = {
    value.fold(self) { v =>
      self.projectArn(v)
    }
  }

}

final class CreateProjectResponseOps(val self: CreateProjectResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectArnAsScala: Option[String] = Option(self.projectArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateProjectResponseOps {

  implicit def toCreateProjectResponseBuilderOps(v: CreateProjectResponse.Builder): CreateProjectResponseBuilderOps =
    new CreateProjectResponseBuilderOps(v)

  implicit def toCreateProjectResponseOps(v: CreateProjectResponse): CreateProjectResponseOps =
    new CreateProjectResponseOps(v)

}
