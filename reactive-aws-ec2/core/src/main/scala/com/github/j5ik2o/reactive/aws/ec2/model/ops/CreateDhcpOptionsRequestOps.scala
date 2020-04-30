// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateDhcpOptionsRequestBuilderOps(val self: CreateDhcpOptionsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def dhcpConfigurationsAsScala(value: Option[Seq[NewDhcpConfiguration]]): CreateDhcpOptionsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dhcpConfigurations(v.asJava) } 
            }


}

final class CreateDhcpOptionsRequestOps(val self: CreateDhcpOptionsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def dhcpConfigurationsAsScala: Option[Seq[NewDhcpConfiguration]] = Option(self.dhcpConfigurations).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateDhcpOptionsRequestOps {

implicit def toCreateDhcpOptionsRequestBuilderOps(v: CreateDhcpOptionsRequest.Builder): CreateDhcpOptionsRequestBuilderOps = new CreateDhcpOptionsRequestBuilderOps(v)

implicit def toCreateDhcpOptionsRequestOps(v: CreateDhcpOptionsRequest): CreateDhcpOptionsRequestOps = new CreateDhcpOptionsRequestOps(v)

}

