// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeImageAttributeRequestBuilderOps(val self: DescribeImageAttributeRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attributeAsScala(value: Option[ImageAttributeName]): DescribeImageAttributeRequest.Builder = {
            value.fold(self){ v => self.attribute(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def imageIdAsScala(value: Option[String]): DescribeImageAttributeRequest.Builder = {
            value.fold(self){ v => self.imageId(v) }
            } 


}

final class DescribeImageAttributeRequestOps(val self: DescribeImageAttributeRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attributeAsScala: Option[ImageAttributeName] = Option(self.attribute) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def imageIdAsScala: Option[String] = Option(self.imageId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeImageAttributeRequestOps {

implicit def toDescribeImageAttributeRequestBuilderOps(v: DescribeImageAttributeRequest.Builder): DescribeImageAttributeRequestBuilderOps = new DescribeImageAttributeRequestBuilderOps(v)

implicit def toDescribeImageAttributeRequestOps(v: DescribeImageAttributeRequest): DescribeImageAttributeRequestOps = new DescribeImageAttributeRequestOps(v)

}

