// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DiskImageDescriptionBuilderOps(val self: DiskImageDescription.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def checksumAsScala(value: Option[String]): DiskImageDescription.Builder = {
            value.fold(self){ v => self.checksum(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def formatAsScala(value: Option[DiskImageFormat]): DiskImageDescription.Builder = {
            value.fold(self){ v => self.format(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def importManifestUrlAsScala(value: Option[String]): DiskImageDescription.Builder = {
            value.fold(self){ v => self.importManifestUrl(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sizeAsScala(value: Option[Long]): DiskImageDescription.Builder = {
            value.fold(self){ v => self.size(v) }
            } 


}

final class DiskImageDescriptionOps(val self: DiskImageDescription) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def checksumAsScala: Option[String] = Option(self.checksum) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def formatAsScala: Option[DiskImageFormat] = Option(self.format) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def importManifestUrlAsScala: Option[String] = Option(self.importManifestUrl) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sizeAsScala: Option[Long] = Option(self.size) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDiskImageDescriptionOps {

implicit def toDiskImageDescriptionBuilderOps(v: DiskImageDescription.Builder): DiskImageDescriptionBuilderOps = new DiskImageDescriptionBuilderOps(v)

implicit def toDiskImageDescriptionOps(v: DiskImageDescription): DiskImageDescriptionOps = new DiskImageDescriptionOps(v)

}

