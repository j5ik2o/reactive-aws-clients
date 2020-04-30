// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeLocalGatewaysResponseBuilderOps(val self: DescribeLocalGatewaysResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def localGatewaysAsScala(value: Option[Seq[LocalGateway]]): DescribeLocalGatewaysResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.localGateways(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeLocalGatewaysResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeLocalGatewaysResponseOps(val self: DescribeLocalGatewaysResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def localGatewaysAsScala: Option[Seq[LocalGateway]] = Option(self.localGateways).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLocalGatewaysResponseOps {

implicit def toDescribeLocalGatewaysResponseBuilderOps(v: DescribeLocalGatewaysResponse.Builder): DescribeLocalGatewaysResponseBuilderOps = new DescribeLocalGatewaysResponseBuilderOps(v)

implicit def toDescribeLocalGatewaysResponseOps(v: DescribeLocalGatewaysResponse): DescribeLocalGatewaysResponseOps = new DescribeLocalGatewaysResponseOps(v)

}

