// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class CreateClusterResponseBuilderOps(val self: CreateClusterResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clusterAsScala(value: Option[Cluster]): CreateClusterResponse.Builder = {
            value.fold(self){ v => self.cluster(v) }
            } 


}

final class CreateClusterResponseOps(val self: CreateClusterResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clusterAsScala: Option[Cluster] = Option(self.cluster) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateClusterResponseOps {

implicit def toCreateClusterResponseBuilderOps(v: CreateClusterResponse.Builder): CreateClusterResponseBuilderOps = new CreateClusterResponseBuilderOps(v)

implicit def toCreateClusterResponseOps(v: CreateClusterResponse): CreateClusterResponseOps = new CreateClusterResponseOps(v)

}

