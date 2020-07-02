// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DeleteProjectVersionResponseBuilderOps(val self: DeleteProjectVersionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ProjectVersionStatus]): DeleteProjectVersionResponse.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class DeleteProjectVersionResponseOps(val self: DeleteProjectVersionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ProjectVersionStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteProjectVersionResponseOps {

  implicit def toDeleteProjectVersionResponseBuilderOps(
      v: DeleteProjectVersionResponse.Builder
  ): DeleteProjectVersionResponseBuilderOps = new DeleteProjectVersionResponseBuilderOps(v)

  implicit def toDeleteProjectVersionResponseOps(v: DeleteProjectVersionResponse): DeleteProjectVersionResponseOps =
    new DeleteProjectVersionResponseOps(v)

}
