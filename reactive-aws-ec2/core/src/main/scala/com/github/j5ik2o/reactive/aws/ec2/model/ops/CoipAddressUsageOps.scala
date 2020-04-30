// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CoipAddressUsageBuilderOps(val self: CoipAddressUsage.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def allocationIdAsScala(value: Option[String]): CoipAddressUsage.Builder = {
            value.fold(self){ v => self.allocationId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def awsAccountIdAsScala(value: Option[String]): CoipAddressUsage.Builder = {
            value.fold(self){ v => self.awsAccountId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def awsServiceAsScala(value: Option[String]): CoipAddressUsage.Builder = {
            value.fold(self){ v => self.awsService(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def coIpAsScala(value: Option[String]): CoipAddressUsage.Builder = {
            value.fold(self){ v => self.coIp(v) }
            } 


}

final class CoipAddressUsageOps(val self: CoipAddressUsage) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def allocationIdAsScala: Option[String] = Option(self.allocationId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def awsAccountIdAsScala: Option[String] = Option(self.awsAccountId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def awsServiceAsScala: Option[String] = Option(self.awsService) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def coIpAsScala: Option[String] = Option(self.coIp) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCoipAddressUsageOps {

implicit def toCoipAddressUsageBuilderOps(v: CoipAddressUsage.Builder): CoipAddressUsageBuilderOps = new CoipAddressUsageBuilderOps(v)

implicit def toCoipAddressUsageOps(v: CoipAddressUsage): CoipAddressUsageOps = new CoipAddressUsageOps(v)

}

