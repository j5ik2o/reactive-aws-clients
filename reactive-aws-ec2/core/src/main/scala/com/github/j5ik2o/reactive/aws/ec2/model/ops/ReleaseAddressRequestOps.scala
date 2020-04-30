// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReleaseAddressRequestBuilderOps(val self: ReleaseAddressRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def allocationIdAsScala(value: Option[String]): ReleaseAddressRequest.Builder = {
            value.fold(self){ v => self.allocationId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAsScala(value: Option[String]): ReleaseAddressRequest.Builder = {
            value.fold(self){ v => self.publicIp(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkBorderGroupAsScala(value: Option[String]): ReleaseAddressRequest.Builder = {
            value.fold(self){ v => self.networkBorderGroup(v) }
            } 


}

final class ReleaseAddressRequestOps(val self: ReleaseAddressRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def allocationIdAsScala: Option[String] = Option(self.allocationId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAsScala: Option[String] = Option(self.publicIp) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkBorderGroupAsScala: Option[String] = Option(self.networkBorderGroup) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReleaseAddressRequestOps {

implicit def toReleaseAddressRequestBuilderOps(v: ReleaseAddressRequest.Builder): ReleaseAddressRequestBuilderOps = new ReleaseAddressRequestBuilderOps(v)

implicit def toReleaseAddressRequestOps(v: ReleaseAddressRequest): ReleaseAddressRequestOps = new ReleaseAddressRequestOps(v)

}

