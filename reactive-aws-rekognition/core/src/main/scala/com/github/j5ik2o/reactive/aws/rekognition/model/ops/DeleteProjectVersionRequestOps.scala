// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DeleteProjectVersionRequestBuilderOps(val self: DeleteProjectVersionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectVersionArnAsScala(value: Option[String]): DeleteProjectVersionRequest.Builder = {
    value.fold(self) { v => self.projectVersionArn(v) }
  }

}

final class DeleteProjectVersionRequestOps(val self: DeleteProjectVersionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectVersionArnAsScala: Option[String] = Option(self.projectVersionArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteProjectVersionRequestOps {

  implicit def toDeleteProjectVersionRequestBuilderOps(
      v: DeleteProjectVersionRequest.Builder
  ): DeleteProjectVersionRequestBuilderOps = new DeleteProjectVersionRequestBuilderOps(v)

  implicit def toDeleteProjectVersionRequestOps(v: DeleteProjectVersionRequest): DeleteProjectVersionRequestOps =
    new DeleteProjectVersionRequestOps(v)

}
