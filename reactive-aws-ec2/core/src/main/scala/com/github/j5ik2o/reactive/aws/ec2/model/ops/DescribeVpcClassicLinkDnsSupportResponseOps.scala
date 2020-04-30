// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcClassicLinkDnsSupportResponseBuilderOps(val self: DescribeVpcClassicLinkDnsSupportResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeVpcClassicLinkDnsSupportResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcsAsScala(value: Option[Seq[ClassicLinkDnsSupport]]): DescribeVpcClassicLinkDnsSupportResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.vpcs(v.asJava) } 
            }


}

final class DescribeVpcClassicLinkDnsSupportResponseOps(val self: DescribeVpcClassicLinkDnsSupportResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def vpcsAsScala: Option[Seq[ClassicLinkDnsSupport]] = Option(self.vpcs).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcClassicLinkDnsSupportResponseOps {

implicit def toDescribeVpcClassicLinkDnsSupportResponseBuilderOps(v: DescribeVpcClassicLinkDnsSupportResponse.Builder): DescribeVpcClassicLinkDnsSupportResponseBuilderOps = new DescribeVpcClassicLinkDnsSupportResponseBuilderOps(v)

implicit def toDescribeVpcClassicLinkDnsSupportResponseOps(v: DescribeVpcClassicLinkDnsSupportResponse): DescribeVpcClassicLinkDnsSupportResponseOps = new DescribeVpcClassicLinkDnsSupportResponseOps(v)

}

