// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ProvisionedBandwidthBuilderOps(val self: ProvisionedBandwidth.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def provisionTimeAsScala(value: Option[java.time.Instant]): ProvisionedBandwidth.Builder = {
            value.fold(self){ v => self.provisionTime(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def provisionedAsScala(value: Option[String]): ProvisionedBandwidth.Builder = {
            value.fold(self){ v => self.provisioned(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestTimeAsScala(value: Option[java.time.Instant]): ProvisionedBandwidth.Builder = {
            value.fold(self){ v => self.requestTime(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestedAsScala(value: Option[String]): ProvisionedBandwidth.Builder = {
            value.fold(self){ v => self.requested(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala(value: Option[String]): ProvisionedBandwidth.Builder = {
            value.fold(self){ v => self.status(v) }
            } 


}

final class ProvisionedBandwidthOps(val self: ProvisionedBandwidth) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def provisionTimeAsScala: Option[java.time.Instant] = Option(self.provisionTime) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def provisionedAsScala: Option[String] = Option(self.provisioned) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestTimeAsScala: Option[java.time.Instant] = Option(self.requestTime) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestedAsScala: Option[String] = Option(self.requested) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala: Option[String] = Option(self.status) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProvisionedBandwidthOps {

implicit def toProvisionedBandwidthBuilderOps(v: ProvisionedBandwidth.Builder): ProvisionedBandwidthBuilderOps = new ProvisionedBandwidthBuilderOps(v)

implicit def toProvisionedBandwidthOps(v: ProvisionedBandwidth): ProvisionedBandwidthOps = new ProvisionedBandwidthOps(v)

}

