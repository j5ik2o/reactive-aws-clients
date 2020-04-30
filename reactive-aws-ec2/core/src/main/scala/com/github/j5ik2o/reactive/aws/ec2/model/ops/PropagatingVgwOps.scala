// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PropagatingVgwBuilderOps(val self: PropagatingVgw.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def gatewayIdAsScala(value: Option[String]): PropagatingVgw.Builder = {
            value.fold(self){ v => self.gatewayId(v) }
            } 


}

final class PropagatingVgwOps(val self: PropagatingVgw) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def gatewayIdAsScala: Option[String] = Option(self.gatewayId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPropagatingVgwOps {

implicit def toPropagatingVgwBuilderOps(v: PropagatingVgw.Builder): PropagatingVgwBuilderOps = new PropagatingVgwBuilderOps(v)

implicit def toPropagatingVgwOps(v: PropagatingVgw): PropagatingVgwOps = new PropagatingVgwOps(v)

}

