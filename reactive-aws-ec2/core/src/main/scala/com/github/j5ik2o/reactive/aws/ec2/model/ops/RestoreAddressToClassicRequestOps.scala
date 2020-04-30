// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RestoreAddressToClassicRequestBuilderOps(val self: RestoreAddressToClassicRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAsScala(value: Option[String]): RestoreAddressToClassicRequest.Builder = {
            value.fold(self){ v => self.publicIp(v) }
            } 


}

final class RestoreAddressToClassicRequestOps(val self: RestoreAddressToClassicRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAsScala: Option[String] = Option(self.publicIp) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestoreAddressToClassicRequestOps {

implicit def toRestoreAddressToClassicRequestBuilderOps(v: RestoreAddressToClassicRequest.Builder): RestoreAddressToClassicRequestBuilderOps = new RestoreAddressToClassicRequestBuilderOps(v)

implicit def toRestoreAddressToClassicRequestOps(v: RestoreAddressToClassicRequest): RestoreAddressToClassicRequestOps = new RestoreAddressToClassicRequestOps(v)

}

