// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcClassicLinkRequestBuilderOps(val self: DescribeVpcClassicLinkRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVpcClassicLinkRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdsAsScala(value: Option[Seq[String]]): DescribeVpcClassicLinkRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.vpcIds(v.asJava) } 
            }


}

final class DescribeVpcClassicLinkRequestOps(val self: DescribeVpcClassicLinkRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def vpcIdsAsScala: Option[Seq[String]] = Option(self.vpcIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcClassicLinkRequestOps {

implicit def toDescribeVpcClassicLinkRequestBuilderOps(v: DescribeVpcClassicLinkRequest.Builder): DescribeVpcClassicLinkRequestBuilderOps = new DescribeVpcClassicLinkRequestBuilderOps(v)

implicit def toDescribeVpcClassicLinkRequestOps(v: DescribeVpcClassicLinkRequest): DescribeVpcClassicLinkRequestOps = new DescribeVpcClassicLinkRequestOps(v)

}

