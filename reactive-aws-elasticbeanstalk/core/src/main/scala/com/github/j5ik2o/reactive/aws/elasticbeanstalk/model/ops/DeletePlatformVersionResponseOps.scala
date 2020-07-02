// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DeletePlatformVersionResponseBuilderOps(val self: DeletePlatformVersionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformSummaryAsScala(value: Option[PlatformSummary]): DeletePlatformVersionResponse.Builder = {
    value.fold(self) { v => self.platformSummary(v) }
  }

}

final class DeletePlatformVersionResponseOps(val self: DeletePlatformVersionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformSummaryAsScala: Option[PlatformSummary] = Option(self.platformSummary)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeletePlatformVersionResponseOps {

  implicit def toDeletePlatformVersionResponseBuilderOps(
      v: DeletePlatformVersionResponse.Builder
  ): DeletePlatformVersionResponseBuilderOps = new DeletePlatformVersionResponseBuilderOps(v)

  implicit def toDeletePlatformVersionResponseOps(v: DeletePlatformVersionResponse): DeletePlatformVersionResponseOps =
    new DeletePlatformVersionResponseOps(v)

}
