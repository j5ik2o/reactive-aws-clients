// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DeleteProjectResponseBuilderOps(val self: DeleteProjectResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ProjectStatus]): DeleteProjectResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class DeleteProjectResponseOps(val self: DeleteProjectResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ProjectStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteProjectResponseOps {

  implicit def toDeleteProjectResponseBuilderOps(v: DeleteProjectResponse.Builder): DeleteProjectResponseBuilderOps =
    new DeleteProjectResponseBuilderOps(v)

  implicit def toDeleteProjectResponseOps(v: DeleteProjectResponse): DeleteProjectResponseOps =
    new DeleteProjectResponseOps(v)

}
