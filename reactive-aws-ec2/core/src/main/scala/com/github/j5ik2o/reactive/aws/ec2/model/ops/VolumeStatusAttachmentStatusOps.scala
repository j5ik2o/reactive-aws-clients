// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VolumeStatusAttachmentStatusBuilderOps(val self: VolumeStatusAttachmentStatus.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ioPerformanceAsScala(value: Option[String]): VolumeStatusAttachmentStatus.Builder = {
            value.fold(self){ v => self.ioPerformance(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala(value: Option[String]): VolumeStatusAttachmentStatus.Builder = {
            value.fold(self){ v => self.instanceId(v) }
            } 


}

final class VolumeStatusAttachmentStatusOps(val self: VolumeStatusAttachmentStatus) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ioPerformanceAsScala: Option[String] = Option(self.ioPerformance) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala: Option[String] = Option(self.instanceId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVolumeStatusAttachmentStatusOps {

implicit def toVolumeStatusAttachmentStatusBuilderOps(v: VolumeStatusAttachmentStatus.Builder): VolumeStatusAttachmentStatusBuilderOps = new VolumeStatusAttachmentStatusBuilderOps(v)

implicit def toVolumeStatusAttachmentStatusOps(v: VolumeStatusAttachmentStatus): VolumeStatusAttachmentStatusOps = new VolumeStatusAttachmentStatusOps(v)

}

