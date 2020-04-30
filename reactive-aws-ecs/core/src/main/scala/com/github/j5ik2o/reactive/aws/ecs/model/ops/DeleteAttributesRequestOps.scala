// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeleteAttributesRequestBuilderOps(val self: DeleteAttributesRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clusterAsScala(value: Option[String]): DeleteAttributesRequest.Builder = {
            value.fold(self){ v => self.cluster(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attributesAsScala(value: Option[Seq[Attribute]]): DeleteAttributesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributes(v.asJava) } 
            }


}

final class DeleteAttributesRequestOps(val self: DeleteAttributesRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clusterAsScala: Option[String] = Option(self.cluster) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def attributesAsScala: Option[Seq[Attribute]] = Option(self.attributes).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteAttributesRequestOps {

implicit def toDeleteAttributesRequestBuilderOps(v: DeleteAttributesRequest.Builder): DeleteAttributesRequestBuilderOps = new DeleteAttributesRequestBuilderOps(v)

implicit def toDeleteAttributesRequestOps(v: DeleteAttributesRequest): DeleteAttributesRequestOps = new DeleteAttributesRequestOps(v)

}

