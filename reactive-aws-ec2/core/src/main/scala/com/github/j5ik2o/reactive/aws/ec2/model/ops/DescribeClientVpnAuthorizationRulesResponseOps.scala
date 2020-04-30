// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeClientVpnAuthorizationRulesResponseBuilderOps(val self: DescribeClientVpnAuthorizationRulesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def authorizationRulesAsScala(value: Option[Seq[AuthorizationRule]]): DescribeClientVpnAuthorizationRulesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.authorizationRules(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeClientVpnAuthorizationRulesResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeClientVpnAuthorizationRulesResponseOps(val self: DescribeClientVpnAuthorizationRulesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def authorizationRulesAsScala: Option[Seq[AuthorizationRule]] = Option(self.authorizationRules).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClientVpnAuthorizationRulesResponseOps {

implicit def toDescribeClientVpnAuthorizationRulesResponseBuilderOps(v: DescribeClientVpnAuthorizationRulesResponse.Builder): DescribeClientVpnAuthorizationRulesResponseBuilderOps = new DescribeClientVpnAuthorizationRulesResponseBuilderOps(v)

implicit def toDescribeClientVpnAuthorizationRulesResponseOps(v: DescribeClientVpnAuthorizationRulesResponse): DescribeClientVpnAuthorizationRulesResponseOps = new DescribeClientVpnAuthorizationRulesResponseOps(v)

}

