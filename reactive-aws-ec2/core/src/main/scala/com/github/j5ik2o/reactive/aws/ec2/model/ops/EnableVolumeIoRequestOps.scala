// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EnableVolumeIoRequestBuilderOps(val self: EnableVolumeIoRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def volumeIdAsScala(value: Option[String]): EnableVolumeIoRequest.Builder = {
            value.fold(self){ v => self.volumeId(v) }
            } 


}

final class EnableVolumeIoRequestOps(val self: EnableVolumeIoRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def volumeIdAsScala: Option[String] = Option(self.volumeId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableVolumeIoRequestOps {

implicit def toEnableVolumeIoRequestBuilderOps(v: EnableVolumeIoRequest.Builder): EnableVolumeIoRequestBuilderOps = new EnableVolumeIoRequestBuilderOps(v)

implicit def toEnableVolumeIoRequestOps(v: EnableVolumeIoRequest): EnableVolumeIoRequestOps = new EnableVolumeIoRequestOps(v)

}

