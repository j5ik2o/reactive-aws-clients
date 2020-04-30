// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetHostReservationPurchasePreviewResponseBuilderOps(val self: GetHostReservationPurchasePreviewResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): GetHostReservationPurchasePreviewResponse.Builder = {
            value.fold(self){ v => self.currencyCode(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def purchaseAsScala(value: Option[Seq[Purchase]]): GetHostReservationPurchasePreviewResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.purchase(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def totalHourlyPriceAsScala(value: Option[String]): GetHostReservationPurchasePreviewResponse.Builder = {
            value.fold(self){ v => self.totalHourlyPrice(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def totalUpfrontPriceAsScala(value: Option[String]): GetHostReservationPurchasePreviewResponse.Builder = {
            value.fold(self){ v => self.totalUpfrontPrice(v) }
            } 


}

final class GetHostReservationPurchasePreviewResponseOps(val self: GetHostReservationPurchasePreviewResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def purchaseAsScala: Option[Seq[Purchase]] = Option(self.purchase).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def totalHourlyPriceAsScala: Option[String] = Option(self.totalHourlyPrice) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def totalUpfrontPriceAsScala: Option[String] = Option(self.totalUpfrontPrice) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetHostReservationPurchasePreviewResponseOps {

implicit def toGetHostReservationPurchasePreviewResponseBuilderOps(v: GetHostReservationPurchasePreviewResponse.Builder): GetHostReservationPurchasePreviewResponseBuilderOps = new GetHostReservationPurchasePreviewResponseBuilderOps(v)

implicit def toGetHostReservationPurchasePreviewResponseOps(v: GetHostReservationPurchasePreviewResponse): GetHostReservationPurchasePreviewResponseOps = new GetHostReservationPurchasePreviewResponseOps(v)

}

