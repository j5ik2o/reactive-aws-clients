// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SearchLocalGatewayRoutesResponseBuilderOps(val self: SearchLocalGatewayRoutesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def routesAsScala(value: Option[Seq[LocalGatewayRoute]]): SearchLocalGatewayRoutesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.routes(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): SearchLocalGatewayRoutesResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class SearchLocalGatewayRoutesResponseOps(val self: SearchLocalGatewayRoutesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def routesAsScala: Option[Seq[LocalGatewayRoute]] = Option(self.routes).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSearchLocalGatewayRoutesResponseOps {

implicit def toSearchLocalGatewayRoutesResponseBuilderOps(v: SearchLocalGatewayRoutesResponse.Builder): SearchLocalGatewayRoutesResponseBuilderOps = new SearchLocalGatewayRoutesResponseBuilderOps(v)

implicit def toSearchLocalGatewayRoutesResponseOps(v: SearchLocalGatewayRoutesResponse): SearchLocalGatewayRoutesResponseOps = new SearchLocalGatewayRoutesResponseOps(v)

}

