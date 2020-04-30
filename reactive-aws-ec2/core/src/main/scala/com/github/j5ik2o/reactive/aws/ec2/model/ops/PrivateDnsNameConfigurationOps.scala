// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PrivateDnsNameConfigurationBuilderOps(val self: PrivateDnsNameConfiguration.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala(value: Option[DnsNameState]): PrivateDnsNameConfiguration.Builder = {
            value.fold(self){ v => self.state(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala(value: Option[String]): PrivateDnsNameConfiguration.Builder = {
            value.fold(self){ v => self.`type`(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def valueAsScala(value: Option[String]): PrivateDnsNameConfiguration.Builder = {
            value.fold(self){ v => self.value(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nameAsScala(value: Option[String]): PrivateDnsNameConfiguration.Builder = {
            value.fold(self){ v => self.name(v) }
            } 


}

final class PrivateDnsNameConfigurationOps(val self: PrivateDnsNameConfiguration) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala: Option[DnsNameState] = Option(self.state) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala: Option[String] = Option(self.`type`) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def valueAsScala: Option[String] = Option(self.value) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nameAsScala: Option[String] = Option(self.name) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPrivateDnsNameConfigurationOps {

implicit def toPrivateDnsNameConfigurationBuilderOps(v: PrivateDnsNameConfiguration.Builder): PrivateDnsNameConfigurationBuilderOps = new PrivateDnsNameConfigurationBuilderOps(v)

implicit def toPrivateDnsNameConfigurationOps(v: PrivateDnsNameConfiguration): PrivateDnsNameConfigurationOps = new PrivateDnsNameConfigurationOps(v)

}

