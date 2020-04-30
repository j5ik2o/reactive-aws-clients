// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EbsInstanceBlockDeviceSpecificationBuilderOps(val self: EbsInstanceBlockDeviceSpecification.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def deleteOnTerminationAsScala(value: Option[Boolean]): EbsInstanceBlockDeviceSpecification.Builder = {
            value.fold(self){ v => self.deleteOnTermination(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def volumeIdAsScala(value: Option[String]): EbsInstanceBlockDeviceSpecification.Builder = {
            value.fold(self){ v => self.volumeId(v) }
            } 


}

final class EbsInstanceBlockDeviceSpecificationOps(val self: EbsInstanceBlockDeviceSpecification) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def deleteOnTerminationAsScala: Option[Boolean] = Option(self.deleteOnTermination) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def volumeIdAsScala: Option[String] = Option(self.volumeId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEbsInstanceBlockDeviceSpecificationOps {

implicit def toEbsInstanceBlockDeviceSpecificationBuilderOps(v: EbsInstanceBlockDeviceSpecification.Builder): EbsInstanceBlockDeviceSpecificationBuilderOps = new EbsInstanceBlockDeviceSpecificationBuilderOps(v)

implicit def toEbsInstanceBlockDeviceSpecificationOps(v: EbsInstanceBlockDeviceSpecification): EbsInstanceBlockDeviceSpecificationOps = new EbsInstanceBlockDeviceSpecificationOps(v)

}

