// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceMarketOptionsRequestBuilderOps(val self: InstanceMarketOptionsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def marketTypeAsScala(value: Option[MarketType]): InstanceMarketOptionsRequest.Builder = {
            value.fold(self){ v => self.marketType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def spotOptionsAsScala(value: Option[SpotMarketOptions]): InstanceMarketOptionsRequest.Builder = {
            value.fold(self){ v => self.spotOptions(v) }
            } 


}

final class InstanceMarketOptionsRequestOps(val self: InstanceMarketOptionsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def marketTypeAsScala: Option[MarketType] = Option(self.marketType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def spotOptionsAsScala: Option[SpotMarketOptions] = Option(self.spotOptions) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceMarketOptionsRequestOps {

implicit def toInstanceMarketOptionsRequestBuilderOps(v: InstanceMarketOptionsRequest.Builder): InstanceMarketOptionsRequestBuilderOps = new InstanceMarketOptionsRequestBuilderOps(v)

implicit def toInstanceMarketOptionsRequestOps(v: InstanceMarketOptionsRequest): InstanceMarketOptionsRequestOps = new InstanceMarketOptionsRequestOps(v)

}

