// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetConsoleOutputRequestBuilderOps(val self: GetConsoleOutputRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): GetConsoleOutputRequest.Builder = {
    value.fold(self) { v => self.instanceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def latestAsScala(value: Option[Boolean]): GetConsoleOutputRequest.Builder = {
    value.fold(self) { v => self.latest(v) }
  }

}

final class GetConsoleOutputRequestOps(val self: GetConsoleOutputRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def latestAsScala: Option[Boolean] = Option(self.latest)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetConsoleOutputRequestOps {

  implicit def toGetConsoleOutputRequestBuilderOps(
      v: GetConsoleOutputRequest.Builder
  ): GetConsoleOutputRequestBuilderOps = new GetConsoleOutputRequestBuilderOps(v)

  implicit def toGetConsoleOutputRequestOps(v: GetConsoleOutputRequest): GetConsoleOutputRequestOps =
    new GetConsoleOutputRequestOps(v)

}
