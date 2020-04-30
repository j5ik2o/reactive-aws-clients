// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelSpotInstanceRequestsRequestBuilderOps(val self: CancelSpotInstanceRequestsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def spotInstanceRequestIdsAsScala(value: Option[Seq[String]]): CancelSpotInstanceRequestsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.spotInstanceRequestIds(v.asJava) } 
            }


}

final class CancelSpotInstanceRequestsRequestOps(val self: CancelSpotInstanceRequestsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def spotInstanceRequestIdsAsScala: Option[Seq[String]] = Option(self.spotInstanceRequestIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelSpotInstanceRequestsRequestOps {

implicit def toCancelSpotInstanceRequestsRequestBuilderOps(v: CancelSpotInstanceRequestsRequest.Builder): CancelSpotInstanceRequestsRequestBuilderOps = new CancelSpotInstanceRequestsRequestBuilderOps(v)

implicit def toCancelSpotInstanceRequestsRequestOps(v: CancelSpotInstanceRequestsRequest): CancelSpotInstanceRequestsRequestOps = new CancelSpotInstanceRequestsRequestOps(v)

}

