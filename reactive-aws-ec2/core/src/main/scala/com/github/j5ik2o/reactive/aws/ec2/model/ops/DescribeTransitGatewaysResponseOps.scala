// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTransitGatewaysResponseBuilderOps(val self: DescribeTransitGatewaysResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewaysAsScala(value: Option[Seq[TransitGateway]]): DescribeTransitGatewaysResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.transitGateways(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeTransitGatewaysResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeTransitGatewaysResponseOps(val self: DescribeTransitGatewaysResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def transitGatewaysAsScala: Option[Seq[TransitGateway]] = Option(self.transitGateways).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTransitGatewaysResponseOps {

implicit def toDescribeTransitGatewaysResponseBuilderOps(v: DescribeTransitGatewaysResponse.Builder): DescribeTransitGatewaysResponseBuilderOps = new DescribeTransitGatewaysResponseBuilderOps(v)

implicit def toDescribeTransitGatewaysResponseOps(v: DescribeTransitGatewaysResponse): DescribeTransitGatewaysResponseOps = new DescribeTransitGatewaysResponseOps(v)

}

