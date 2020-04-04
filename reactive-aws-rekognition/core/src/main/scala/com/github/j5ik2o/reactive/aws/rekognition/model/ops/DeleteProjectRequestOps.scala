// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DeleteProjectRequestBuilderOps(val self: DeleteProjectRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectArnAsScala(value: Option[String]): DeleteProjectRequest.Builder = {
    value.fold(self) { v =>
      self.projectArn(v)
    }
  }

}

final class DeleteProjectRequestOps(val self: DeleteProjectRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectArnAsScala: Option[String] = Option(self.projectArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteProjectRequestOps {

  implicit def toDeleteProjectRequestBuilderOps(v: DeleteProjectRequest.Builder): DeleteProjectRequestBuilderOps =
    new DeleteProjectRequestBuilderOps(v)

  implicit def toDeleteProjectRequestOps(v: DeleteProjectRequest): DeleteProjectRequestOps =
    new DeleteProjectRequestOps(v)

}
