// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateInstanceMetadataOptionsRequestBuilderOps(val self: LaunchTemplateInstanceMetadataOptionsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def httpTokensAsScala(value: Option[LaunchTemplateHttpTokensState]): LaunchTemplateInstanceMetadataOptionsRequest.Builder = {
            value.fold(self){ v => self.httpTokens(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def httpPutResponseHopLimitAsScala(value: Option[Int]): LaunchTemplateInstanceMetadataOptionsRequest.Builder = {
            value.fold(self){ v => self.httpPutResponseHopLimit(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def httpEndpointAsScala(value: Option[LaunchTemplateInstanceMetadataEndpointState]): LaunchTemplateInstanceMetadataOptionsRequest.Builder = {
            value.fold(self){ v => self.httpEndpoint(v) }
            } 


}

final class LaunchTemplateInstanceMetadataOptionsRequestOps(val self: LaunchTemplateInstanceMetadataOptionsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def httpTokensAsScala: Option[LaunchTemplateHttpTokensState] = Option(self.httpTokens) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def httpPutResponseHopLimitAsScala: Option[Int] = Option(self.httpPutResponseHopLimit) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def httpEndpointAsScala: Option[LaunchTemplateInstanceMetadataEndpointState] = Option(self.httpEndpoint) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateInstanceMetadataOptionsRequestOps {

implicit def toLaunchTemplateInstanceMetadataOptionsRequestBuilderOps(v: LaunchTemplateInstanceMetadataOptionsRequest.Builder): LaunchTemplateInstanceMetadataOptionsRequestBuilderOps = new LaunchTemplateInstanceMetadataOptionsRequestBuilderOps(v)

implicit def toLaunchTemplateInstanceMetadataOptionsRequestOps(v: LaunchTemplateInstanceMetadataOptionsRequest): LaunchTemplateInstanceMetadataOptionsRequestOps = new LaunchTemplateInstanceMetadataOptionsRequestOps(v)

}

