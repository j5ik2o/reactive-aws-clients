// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AcceptReservedInstancesExchangeQuoteResponseBuilderOps(val self: AcceptReservedInstancesExchangeQuoteResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def exchangeIdAsScala(value: Option[String]): AcceptReservedInstancesExchangeQuoteResponse.Builder = {
            value.fold(self){ v => self.exchangeId(v) }
            } 


}

final class AcceptReservedInstancesExchangeQuoteResponseOps(val self: AcceptReservedInstancesExchangeQuoteResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def exchangeIdAsScala: Option[String] = Option(self.exchangeId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAcceptReservedInstancesExchangeQuoteResponseOps {

implicit def toAcceptReservedInstancesExchangeQuoteResponseBuilderOps(v: AcceptReservedInstancesExchangeQuoteResponse.Builder): AcceptReservedInstancesExchangeQuoteResponseBuilderOps = new AcceptReservedInstancesExchangeQuoteResponseBuilderOps(v)

implicit def toAcceptReservedInstancesExchangeQuoteResponseOps(v: AcceptReservedInstancesExchangeQuoteResponse): AcceptReservedInstancesExchangeQuoteResponseOps = new AcceptReservedInstancesExchangeQuoteResponseOps(v)

}

