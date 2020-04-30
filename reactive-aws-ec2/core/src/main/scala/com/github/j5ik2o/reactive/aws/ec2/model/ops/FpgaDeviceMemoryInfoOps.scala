// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FpgaDeviceMemoryInfoBuilderOps(val self: FpgaDeviceMemoryInfo.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sizeInMiBAsScala(value: Option[Int]): FpgaDeviceMemoryInfo.Builder = {
            value.fold(self){ v => self.sizeInMiB(v) }
            } 


}

final class FpgaDeviceMemoryInfoOps(val self: FpgaDeviceMemoryInfo) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sizeInMiBAsScala: Option[Int] = Option(self.sizeInMiB) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFpgaDeviceMemoryInfoOps {

implicit def toFpgaDeviceMemoryInfoBuilderOps(v: FpgaDeviceMemoryInfo.Builder): FpgaDeviceMemoryInfoBuilderOps = new FpgaDeviceMemoryInfoBuilderOps(v)

implicit def toFpgaDeviceMemoryInfoOps(v: FpgaDeviceMemoryInfo): FpgaDeviceMemoryInfoOps = new FpgaDeviceMemoryInfoOps(v)

}

