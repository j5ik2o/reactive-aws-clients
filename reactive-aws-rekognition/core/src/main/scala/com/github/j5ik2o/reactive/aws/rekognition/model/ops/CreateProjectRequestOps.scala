// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CreateProjectRequestBuilderOps(val self: CreateProjectRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectNameAsScala(value: Option[String]): CreateProjectRequest.Builder = {
    value.fold(self) { v => self.projectName(v) }
  }

}

final class CreateProjectRequestOps(val self: CreateProjectRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectNameAsScala: Option[String] = Option(self.projectName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateProjectRequestOps {

  implicit def toCreateProjectRequestBuilderOps(v: CreateProjectRequest.Builder): CreateProjectRequestBuilderOps =
    new CreateProjectRequestBuilderOps(v)

  implicit def toCreateProjectRequestOps(v: CreateProjectRequest): CreateProjectRequestOps =
    new CreateProjectRequestOps(v)

}
