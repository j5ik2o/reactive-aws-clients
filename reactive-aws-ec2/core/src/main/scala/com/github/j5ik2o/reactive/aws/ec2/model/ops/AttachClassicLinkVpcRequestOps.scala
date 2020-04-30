// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AttachClassicLinkVpcRequestBuilderOps(val self: AttachClassicLinkVpcRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupsAsScala(value: Option[Seq[String]]): AttachClassicLinkVpcRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.groups(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala(value: Option[String]): AttachClassicLinkVpcRequest.Builder = {
            value.fold(self){ v => self.instanceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala(value: Option[String]): AttachClassicLinkVpcRequest.Builder = {
            value.fold(self){ v => self.vpcId(v) }
            } 


}

final class AttachClassicLinkVpcRequestOps(val self: AttachClassicLinkVpcRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def groupsAsScala: Option[Seq[String]] = Option(self.groups).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala: Option[String] = Option(self.instanceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala: Option[String] = Option(self.vpcId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttachClassicLinkVpcRequestOps {

implicit def toAttachClassicLinkVpcRequestBuilderOps(v: AttachClassicLinkVpcRequest.Builder): AttachClassicLinkVpcRequestBuilderOps = new AttachClassicLinkVpcRequestBuilderOps(v)

implicit def toAttachClassicLinkVpcRequestOps(v: AttachClassicLinkVpcRequest): AttachClassicLinkVpcRequestOps = new AttachClassicLinkVpcRequestOps(v)

}

