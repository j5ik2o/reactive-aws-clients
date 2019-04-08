// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetConsoleScreenshotResponseBuilderOps(val self: GetConsoleScreenshotResponse.Builder) extends AnyVal {

  final def imageDataAsScala(value: Option[String]): GetConsoleScreenshotResponse.Builder = {
    value.fold(self) { v =>
      self.imageData(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): GetConsoleScreenshotResponse.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

}

final class GetConsoleScreenshotResponseOps(val self: GetConsoleScreenshotResponse) extends AnyVal {

  final def imageDataAsScala: Option[String] = Option(self.imageData)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetConsoleScreenshotResponseOps {

  implicit def toGetConsoleScreenshotResponseBuilderOps(
      v: GetConsoleScreenshotResponse.Builder
  ): GetConsoleScreenshotResponseBuilderOps = new GetConsoleScreenshotResponseBuilderOps(v)

  implicit def toGetConsoleScreenshotResponseOps(v: GetConsoleScreenshotResponse): GetConsoleScreenshotResponseOps =
    new GetConsoleScreenshotResponseOps(v)

}
