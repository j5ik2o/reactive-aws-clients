// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportVolumeRequestBuilderOps(val self: ImportVolumeRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala(value: Option[String]): ImportVolumeRequest.Builder = {
            value.fold(self){ v => self.availabilityZone(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala(value: Option[String]): ImportVolumeRequest.Builder = {
            value.fold(self){ v => self.description(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def imageAsScala(value: Option[DiskImageDetail]): ImportVolumeRequest.Builder = {
            value.fold(self){ v => self.image(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def volumeAsScala(value: Option[VolumeDetail]): ImportVolumeRequest.Builder = {
            value.fold(self){ v => self.volume(v) }
            } 


}

final class ImportVolumeRequestOps(val self: ImportVolumeRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala: Option[String] = Option(self.description) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def imageAsScala: Option[DiskImageDetail] = Option(self.image) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def volumeAsScala: Option[VolumeDetail] = Option(self.volume) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportVolumeRequestOps {

implicit def toImportVolumeRequestBuilderOps(v: ImportVolumeRequest.Builder): ImportVolumeRequestBuilderOps = new ImportVolumeRequestBuilderOps(v)

implicit def toImportVolumeRequestOps(v: ImportVolumeRequest): ImportVolumeRequestOps = new ImportVolumeRequestOps(v)

}

