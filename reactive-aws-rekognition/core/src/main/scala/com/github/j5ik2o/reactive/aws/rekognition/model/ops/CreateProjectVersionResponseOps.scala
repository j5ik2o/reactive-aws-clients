// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CreateProjectVersionResponseBuilderOps(val self: CreateProjectVersionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectVersionArnAsScala(value: Option[String]): CreateProjectVersionResponse.Builder = {
    value.fold(self) { v => self.projectVersionArn(v) }
  }

}

final class CreateProjectVersionResponseOps(val self: CreateProjectVersionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectVersionArnAsScala: Option[String] = Option(self.projectVersionArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateProjectVersionResponseOps {

  implicit def toCreateProjectVersionResponseBuilderOps(
      v: CreateProjectVersionResponse.Builder
  ): CreateProjectVersionResponseBuilderOps = new CreateProjectVersionResponseBuilderOps(v)

  implicit def toCreateProjectVersionResponseOps(v: CreateProjectVersionResponse): CreateProjectVersionResponseOps =
    new CreateProjectVersionResponseOps(v)

}
