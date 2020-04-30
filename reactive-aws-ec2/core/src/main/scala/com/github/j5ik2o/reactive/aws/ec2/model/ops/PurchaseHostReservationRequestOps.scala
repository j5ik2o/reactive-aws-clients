// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PurchaseHostReservationRequestBuilderOps(val self: PurchaseHostReservationRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala(value: Option[String]): PurchaseHostReservationRequest.Builder = {
            value.fold(self){ v => self.clientToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): PurchaseHostReservationRequest.Builder = {
            value.fold(self){ v => self.currencyCode(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def hostIdSetAsScala(value: Option[Seq[String]]): PurchaseHostReservationRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.hostIdSet(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def limitPriceAsScala(value: Option[String]): PurchaseHostReservationRequest.Builder = {
            value.fold(self){ v => self.limitPrice(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def offeringIdAsScala(value: Option[String]): PurchaseHostReservationRequest.Builder = {
            value.fold(self){ v => self.offeringId(v) }
            } 


}

final class PurchaseHostReservationRequestOps(val self: PurchaseHostReservationRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala: Option[String] = Option(self.clientToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def hostIdSetAsScala: Option[Seq[String]] = Option(self.hostIdSet).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def limitPriceAsScala: Option[String] = Option(self.limitPrice) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def offeringIdAsScala: Option[String] = Option(self.offeringId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPurchaseHostReservationRequestOps {

implicit def toPurchaseHostReservationRequestBuilderOps(v: PurchaseHostReservationRequest.Builder): PurchaseHostReservationRequestBuilderOps = new PurchaseHostReservationRequestBuilderOps(v)

implicit def toPurchaseHostReservationRequestOps(v: PurchaseHostReservationRequest): PurchaseHostReservationRequestOps = new PurchaseHostReservationRequestOps(v)

}

