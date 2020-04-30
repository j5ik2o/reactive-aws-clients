// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class HostOfferingBuilderOps(val self: HostOffering.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def currencyCodeAsScala(value: Option[CurrencyCodeValues]): HostOffering.Builder = {
            value.fold(self){ v => self.currencyCode(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def durationAsScala(value: Option[Int]): HostOffering.Builder = {
            value.fold(self){ v => self.duration(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def hourlyPriceAsScala(value: Option[String]): HostOffering.Builder = {
            value.fold(self){ v => self.hourlyPrice(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceFamilyAsScala(value: Option[String]): HostOffering.Builder = {
            value.fold(self){ v => self.instanceFamily(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def offeringIdAsScala(value: Option[String]): HostOffering.Builder = {
            value.fold(self){ v => self.offeringId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def paymentOptionAsScala(value: Option[PaymentOption]): HostOffering.Builder = {
            value.fold(self){ v => self.paymentOption(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def upfrontPriceAsScala(value: Option[String]): HostOffering.Builder = {
            value.fold(self){ v => self.upfrontPrice(v) }
            } 


}

final class HostOfferingOps(val self: HostOffering) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def currencyCodeAsScala: Option[CurrencyCodeValues] = Option(self.currencyCode) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def durationAsScala: Option[Int] = Option(self.duration) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def hourlyPriceAsScala: Option[String] = Option(self.hourlyPrice) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceFamilyAsScala: Option[String] = Option(self.instanceFamily) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def offeringIdAsScala: Option[String] = Option(self.offeringId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def paymentOptionAsScala: Option[PaymentOption] = Option(self.paymentOption) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def upfrontPriceAsScala: Option[String] = Option(self.upfrontPrice) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHostOfferingOps {

implicit def toHostOfferingBuilderOps(v: HostOffering.Builder): HostOfferingBuilderOps = new HostOfferingBuilderOps(v)

implicit def toHostOfferingOps(v: HostOffering): HostOfferingOps = new HostOfferingOps(v)

}

