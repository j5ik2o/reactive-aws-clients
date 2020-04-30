// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteVolumeRequestBuilderOps(val self: DeleteVolumeRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def volumeIdAsScala(value: Option[String]): DeleteVolumeRequest.Builder = {
            value.fold(self){ v => self.volumeId(v) }
            } 


}

final class DeleteVolumeRequestOps(val self: DeleteVolumeRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def volumeIdAsScala: Option[String] = Option(self.volumeId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteVolumeRequestOps {

implicit def toDeleteVolumeRequestBuilderOps(v: DeleteVolumeRequest.Builder): DeleteVolumeRequestBuilderOps = new DeleteVolumeRequestBuilderOps(v)

implicit def toDeleteVolumeRequestOps(v: DeleteVolumeRequest): DeleteVolumeRequestOps = new DeleteVolumeRequestOps(v)

}

