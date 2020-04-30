// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcsResponseBuilderOps(val self: DescribeVpcsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcsAsScala(value: Option[Seq[Vpc]]): DescribeVpcsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.vpcs(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeVpcsResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeVpcsResponseOps(val self: DescribeVpcsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def vpcsAsScala: Option[Seq[Vpc]] = Option(self.vpcs).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcsResponseOps {

implicit def toDescribeVpcsResponseBuilderOps(v: DescribeVpcsResponse.Builder): DescribeVpcsResponseBuilderOps = new DescribeVpcsResponseBuilderOps(v)

implicit def toDescribeVpcsResponseOps(v: DescribeVpcsResponse): DescribeVpcsResponseOps = new DescribeVpcsResponseOps(v)

}

