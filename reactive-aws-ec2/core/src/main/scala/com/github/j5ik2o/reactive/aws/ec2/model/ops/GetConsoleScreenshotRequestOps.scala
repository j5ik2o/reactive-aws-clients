// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetConsoleScreenshotRequestBuilderOps(val self: GetConsoleScreenshotRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): GetConsoleScreenshotRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def wakeUpAsScala(value: Option[Boolean]): GetConsoleScreenshotRequest.Builder = {
    value.fold(self) { v =>
      self.wakeUp(v)
    }
  }

}

final class GetConsoleScreenshotRequestOps(val self: GetConsoleScreenshotRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def wakeUpAsScala: Option[Boolean] = Option(self.wakeUp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetConsoleScreenshotRequestOps {

  implicit def toGetConsoleScreenshotRequestBuilderOps(
      v: GetConsoleScreenshotRequest.Builder
  ): GetConsoleScreenshotRequestBuilderOps = new GetConsoleScreenshotRequestBuilderOps(v)

  implicit def toGetConsoleScreenshotRequestOps(v: GetConsoleScreenshotRequest): GetConsoleScreenshotRequestOps =
    new GetConsoleScreenshotRequestOps(v)

}
