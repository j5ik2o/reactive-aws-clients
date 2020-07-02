// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotInstanceStateFaultBuilderOps(val self: SpotInstanceStateFault.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala(value: Option[String]): SpotInstanceStateFault.Builder = {
    value.fold(self) { v => self.code(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): SpotInstanceStateFault.Builder = {
    value.fold(self) { v => self.message(v) }
  }

}

final class SpotInstanceStateFaultOps(val self: SpotInstanceStateFault) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala: Option[String] = Option(self.code)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotInstanceStateFaultOps {

  implicit def toSpotInstanceStateFaultBuilderOps(v: SpotInstanceStateFault.Builder): SpotInstanceStateFaultBuilderOps =
    new SpotInstanceStateFaultBuilderOps(v)

  implicit def toSpotInstanceStateFaultOps(v: SpotInstanceStateFault): SpotInstanceStateFaultOps =
    new SpotInstanceStateFaultOps(v)

}
