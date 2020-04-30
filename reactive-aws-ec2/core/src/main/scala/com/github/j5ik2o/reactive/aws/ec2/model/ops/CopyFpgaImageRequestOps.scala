// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CopyFpgaImageRequestBuilderOps(val self: CopyFpgaImageRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sourceFpgaImageIdAsScala(value: Option[String]): CopyFpgaImageRequest.Builder = {
            value.fold(self){ v => self.sourceFpgaImageId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala(value: Option[String]): CopyFpgaImageRequest.Builder = {
            value.fold(self){ v => self.description(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nameAsScala(value: Option[String]): CopyFpgaImageRequest.Builder = {
            value.fold(self){ v => self.name(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sourceRegionAsScala(value: Option[String]): CopyFpgaImageRequest.Builder = {
            value.fold(self){ v => self.sourceRegion(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala(value: Option[String]): CopyFpgaImageRequest.Builder = {
            value.fold(self){ v => self.clientToken(v) }
            } 


}

final class CopyFpgaImageRequestOps(val self: CopyFpgaImageRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sourceFpgaImageIdAsScala: Option[String] = Option(self.sourceFpgaImageId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala: Option[String] = Option(self.description) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nameAsScala: Option[String] = Option(self.name) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sourceRegionAsScala: Option[String] = Option(self.sourceRegion) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala: Option[String] = Option(self.clientToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCopyFpgaImageRequestOps {

implicit def toCopyFpgaImageRequestBuilderOps(v: CopyFpgaImageRequest.Builder): CopyFpgaImageRequestBuilderOps = new CopyFpgaImageRequestBuilderOps(v)

implicit def toCopyFpgaImageRequestOps(v: CopyFpgaImageRequest): CopyFpgaImageRequestOps = new CopyFpgaImageRequestOps(v)

}

