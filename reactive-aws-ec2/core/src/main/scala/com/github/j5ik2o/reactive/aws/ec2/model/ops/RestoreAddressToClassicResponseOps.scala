// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RestoreAddressToClassicResponseBuilderOps(val self: RestoreAddressToClassicResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAsScala(value: Option[String]): RestoreAddressToClassicResponse.Builder = {
            value.fold(self){ v => self.publicIp(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala(value: Option[Status]): RestoreAddressToClassicResponse.Builder = {
            value.fold(self){ v => self.status(v) }
            } 


}

final class RestoreAddressToClassicResponseOps(val self: RestoreAddressToClassicResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAsScala: Option[String] = Option(self.publicIp) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala: Option[Status] = Option(self.status) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestoreAddressToClassicResponseOps {

implicit def toRestoreAddressToClassicResponseBuilderOps(v: RestoreAddressToClassicResponse.Builder): RestoreAddressToClassicResponseBuilderOps = new RestoreAddressToClassicResponseBuilderOps(v)

implicit def toRestoreAddressToClassicResponseOps(v: RestoreAddressToClassicResponse): RestoreAddressToClassicResponseOps = new RestoreAddressToClassicResponseOps(v)

}

