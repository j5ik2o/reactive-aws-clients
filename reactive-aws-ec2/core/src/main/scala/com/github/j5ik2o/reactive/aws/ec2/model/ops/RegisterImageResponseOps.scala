// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RegisterImageResponseBuilderOps(val self: RegisterImageResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def imageIdAsScala(value: Option[String]): RegisterImageResponse.Builder = {
            value.fold(self){ v => self.imageId(v) }
            } 


}

final class RegisterImageResponseOps(val self: RegisterImageResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def imageIdAsScala: Option[String] = Option(self.imageId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterImageResponseOps {

implicit def toRegisterImageResponseBuilderOps(v: RegisterImageResponse.Builder): RegisterImageResponseBuilderOps = new RegisterImageResponseBuilderOps(v)

implicit def toRegisterImageResponseOps(v: RegisterImageResponse): RegisterImageResponseOps = new RegisterImageResponseOps(v)

}

