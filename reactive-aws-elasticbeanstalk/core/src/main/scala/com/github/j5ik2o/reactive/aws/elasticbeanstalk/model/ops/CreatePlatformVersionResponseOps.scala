// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CreatePlatformVersionResponseBuilderOps(val self: CreatePlatformVersionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformSummaryAsScala(value: Option[PlatformSummary]): CreatePlatformVersionResponse.Builder = {
    value.fold(self) { v => self.platformSummary(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformBuilderAsScala(value: Option[PlatformBuilder]): CreatePlatformVersionResponse.Builder = {
    value.fold(self) { v => self.platformBuilder(v) }
  }

}

final class CreatePlatformVersionResponseOps(val self: CreatePlatformVersionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformSummaryAsScala: Option[PlatformSummary] = Option(self.platformSummary)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformBuilderAsScala: Option[PlatformBuilder] = Option(self.platformBuilder)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreatePlatformVersionResponseOps {

  implicit def toCreatePlatformVersionResponseBuilderOps(
      v: CreatePlatformVersionResponse.Builder
  ): CreatePlatformVersionResponseBuilderOps = new CreatePlatformVersionResponseBuilderOps(v)

  implicit def toCreatePlatformVersionResponseOps(v: CreatePlatformVersionResponse): CreatePlatformVersionResponseOps =
    new CreatePlatformVersionResponseOps(v)

}
