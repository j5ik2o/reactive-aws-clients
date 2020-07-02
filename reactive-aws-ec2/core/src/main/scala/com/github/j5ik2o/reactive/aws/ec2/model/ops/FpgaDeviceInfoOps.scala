// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FpgaDeviceInfoBuilderOps(val self: FpgaDeviceInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): FpgaDeviceInfo.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def manufacturerAsScala(value: Option[String]): FpgaDeviceInfo.Builder = {
    value.fold(self) { v => self.manufacturer(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala(value: Option[Int]): FpgaDeviceInfo.Builder = {
    value.fold(self) { v => self.count(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryInfoAsScala(value: Option[FpgaDeviceMemoryInfo]): FpgaDeviceInfo.Builder = {
    value.fold(self) { v => self.memoryInfo(v) }
  }

}

final class FpgaDeviceInfoOps(val self: FpgaDeviceInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def manufacturerAsScala: Option[String] = Option(self.manufacturer)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala: Option[Int] = Option(self.count)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryInfoAsScala: Option[FpgaDeviceMemoryInfo] = Option(self.memoryInfo)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFpgaDeviceInfoOps {

  implicit def toFpgaDeviceInfoBuilderOps(v: FpgaDeviceInfo.Builder): FpgaDeviceInfoBuilderOps =
    new FpgaDeviceInfoBuilderOps(v)

  implicit def toFpgaDeviceInfoOps(v: FpgaDeviceInfo): FpgaDeviceInfoOps = new FpgaDeviceInfoOps(v)

}
