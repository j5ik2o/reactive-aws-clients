// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeAccountAttributesRequestBuilderOps(val self: DescribeAccountAttributesRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attributeNamesAsScala(value: Option[Seq[AccountAttributeName]]): DescribeAccountAttributesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributeNames(v.asJava) } 
            }


}

final class DescribeAccountAttributesRequestOps(val self: DescribeAccountAttributesRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def attributeNamesAsScala: Option[Seq[AccountAttributeName]] = Option(self.attributeNames).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAccountAttributesRequestOps {

implicit def toDescribeAccountAttributesRequestBuilderOps(v: DescribeAccountAttributesRequest.Builder): DescribeAccountAttributesRequestBuilderOps = new DescribeAccountAttributesRequestBuilderOps(v)

implicit def toDescribeAccountAttributesRequestOps(v: DescribeAccountAttributesRequest): DescribeAccountAttributesRequestOps = new DescribeAccountAttributesRequestOps(v)

}

