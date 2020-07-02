// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetConsoleOutputResponseBuilderOps(val self: GetConsoleOutputResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): GetConsoleOutputResponse.Builder = {
    value.fold(self) { v => self.instanceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputAsScala(value: Option[String]): GetConsoleOutputResponse.Builder = {
    value.fold(self) { v => self.output(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala(value: Option[java.time.Instant]): GetConsoleOutputResponse.Builder = {
    value.fold(self) { v => self.timestamp(v) }
  }

}

final class GetConsoleOutputResponseOps(val self: GetConsoleOutputResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputAsScala: Option[String] = Option(self.output)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetConsoleOutputResponseOps {

  implicit def toGetConsoleOutputResponseBuilderOps(
      v: GetConsoleOutputResponse.Builder
  ): GetConsoleOutputResponseBuilderOps = new GetConsoleOutputResponseBuilderOps(v)

  implicit def toGetConsoleOutputResponseOps(v: GetConsoleOutputResponse): GetConsoleOutputResponseOps =
    new GetConsoleOutputResponseOps(v)

}
