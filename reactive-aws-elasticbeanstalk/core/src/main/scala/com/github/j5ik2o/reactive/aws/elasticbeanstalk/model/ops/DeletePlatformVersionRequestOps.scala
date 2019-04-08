// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DeletePlatformVersionRequestBuilderOps(val self: DeletePlatformVersionRequest.Builder) extends AnyVal {

  final def platformArnAsScala(value: Option[String]): DeletePlatformVersionRequest.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  }

}

final class DeletePlatformVersionRequestOps(val self: DeletePlatformVersionRequest) extends AnyVal {

  final def platformArnAsScala: Option[String] = Option(self.platformArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeletePlatformVersionRequestOps {

  implicit def toDeletePlatformVersionRequestBuilderOps(
      v: DeletePlatformVersionRequest.Builder
  ): DeletePlatformVersionRequestBuilderOps = new DeletePlatformVersionRequestBuilderOps(v)

  implicit def toDeletePlatformVersionRequestOps(v: DeletePlatformVersionRequest): DeletePlatformVersionRequestOps =
    new DeletePlatformVersionRequestOps(v)

}
