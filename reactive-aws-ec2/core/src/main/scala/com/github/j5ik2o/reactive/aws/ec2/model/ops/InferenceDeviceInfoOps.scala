// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InferenceDeviceInfoBuilderOps(val self: InferenceDeviceInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala(value: Option[Int]): InferenceDeviceInfo.Builder = {
    value.fold(self) { v => self.count(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): InferenceDeviceInfo.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def manufacturerAsScala(value: Option[String]): InferenceDeviceInfo.Builder = {
    value.fold(self) { v => self.manufacturer(v) }
  }

}

final class InferenceDeviceInfoOps(val self: InferenceDeviceInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala: Option[Int] = Option(self.count)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def manufacturerAsScala: Option[String] = Option(self.manufacturer)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInferenceDeviceInfoOps {

  implicit def toInferenceDeviceInfoBuilderOps(v: InferenceDeviceInfo.Builder): InferenceDeviceInfoBuilderOps =
    new InferenceDeviceInfoBuilderOps(v)

  implicit def toInferenceDeviceInfoOps(v: InferenceDeviceInfo): InferenceDeviceInfoOps = new InferenceDeviceInfoOps(v)

}
