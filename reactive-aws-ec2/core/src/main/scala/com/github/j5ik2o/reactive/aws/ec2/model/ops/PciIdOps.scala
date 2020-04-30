// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PciIdBuilderOps(val self: PciId.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def deviceIdAsScala(value: Option[String]): PciId.Builder = {
            value.fold(self){ v => self.deviceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vendorIdAsScala(value: Option[String]): PciId.Builder = {
            value.fold(self){ v => self.vendorId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subsystemIdAsScala(value: Option[String]): PciId.Builder = {
            value.fold(self){ v => self.subsystemId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subsystemVendorIdAsScala(value: Option[String]): PciId.Builder = {
            value.fold(self){ v => self.subsystemVendorId(v) }
            } 


}

final class PciIdOps(val self: PciId) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def deviceIdAsScala: Option[String] = Option(self.deviceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vendorIdAsScala: Option[String] = Option(self.vendorId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subsystemIdAsScala: Option[String] = Option(self.subsystemId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subsystemVendorIdAsScala: Option[String] = Option(self.subsystemVendorId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPciIdOps {

implicit def toPciIdBuilderOps(v: PciId.Builder): PciIdBuilderOps = new PciIdBuilderOps(v)

implicit def toPciIdOps(v: PciId): PciIdOps = new PciIdOps(v)

}

