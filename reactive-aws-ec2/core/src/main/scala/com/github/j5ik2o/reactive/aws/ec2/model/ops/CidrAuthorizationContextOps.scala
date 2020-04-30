// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CidrAuthorizationContextBuilderOps(val self: CidrAuthorizationContext.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala(value: Option[String]): CidrAuthorizationContext.Builder = {
            value.fold(self){ v => self.message(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def signatureAsScala(value: Option[String]): CidrAuthorizationContext.Builder = {
            value.fold(self){ v => self.signature(v) }
            } 


}

final class CidrAuthorizationContextOps(val self: CidrAuthorizationContext) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala: Option[String] = Option(self.message) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def signatureAsScala: Option[String] = Option(self.signature) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCidrAuthorizationContextOps {

implicit def toCidrAuthorizationContextBuilderOps(v: CidrAuthorizationContext.Builder): CidrAuthorizationContextBuilderOps = new CidrAuthorizationContextBuilderOps(v)

implicit def toCidrAuthorizationContextOps(v: CidrAuthorizationContext): CidrAuthorizationContextOps = new CidrAuthorizationContextOps(v)

}

