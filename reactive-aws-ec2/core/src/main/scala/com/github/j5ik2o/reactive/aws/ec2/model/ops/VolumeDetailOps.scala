// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VolumeDetailBuilderOps(val self: VolumeDetail.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sizeAsScala(value: Option[Long]): VolumeDetail.Builder = {
            value.fold(self){ v => self.size(v) }
            } 


}

final class VolumeDetailOps(val self: VolumeDetail) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sizeAsScala: Option[Long] = Option(self.size) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVolumeDetailOps {

implicit def toVolumeDetailBuilderOps(v: VolumeDetail.Builder): VolumeDetailBuilderOps = new VolumeDetailBuilderOps(v)

implicit def toVolumeDetailOps(v: VolumeDetail): VolumeDetailOps = new VolumeDetailOps(v)

}

