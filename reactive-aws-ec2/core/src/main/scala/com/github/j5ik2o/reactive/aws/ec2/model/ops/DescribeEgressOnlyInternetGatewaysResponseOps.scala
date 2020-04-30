// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeEgressOnlyInternetGatewaysResponseBuilderOps(val self: DescribeEgressOnlyInternetGatewaysResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def egressOnlyInternetGatewaysAsScala(value: Option[Seq[EgressOnlyInternetGateway]]): DescribeEgressOnlyInternetGatewaysResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.egressOnlyInternetGateways(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeEgressOnlyInternetGatewaysResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeEgressOnlyInternetGatewaysResponseOps(val self: DescribeEgressOnlyInternetGatewaysResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def egressOnlyInternetGatewaysAsScala: Option[Seq[EgressOnlyInternetGateway]] = Option(self.egressOnlyInternetGateways).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEgressOnlyInternetGatewaysResponseOps {

implicit def toDescribeEgressOnlyInternetGatewaysResponseBuilderOps(v: DescribeEgressOnlyInternetGatewaysResponse.Builder): DescribeEgressOnlyInternetGatewaysResponseBuilderOps = new DescribeEgressOnlyInternetGatewaysResponseBuilderOps(v)

implicit def toDescribeEgressOnlyInternetGatewaysResponseOps(v: DescribeEgressOnlyInternetGatewaysResponse): DescribeEgressOnlyInternetGatewaysResponseOps = new DescribeEgressOnlyInternetGatewaysResponseOps(v)

}

