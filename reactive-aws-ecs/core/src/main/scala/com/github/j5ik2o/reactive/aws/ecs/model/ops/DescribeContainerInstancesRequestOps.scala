// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DescribeContainerInstancesRequestBuilderOps(val self: DescribeContainerInstancesRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clusterAsScala(value: Option[String]): DescribeContainerInstancesRequest.Builder = {
            value.fold(self){ v => self.cluster(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def containerInstancesAsScala(value: Option[Seq[String]]): DescribeContainerInstancesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.containerInstances(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def includeAsScala(value: Option[Seq[ContainerInstanceField]]): DescribeContainerInstancesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.include(v.asJava) } 
            }


}

final class DescribeContainerInstancesRequestOps(val self: DescribeContainerInstancesRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clusterAsScala: Option[String] = Option(self.cluster) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def containerInstancesAsScala: Option[Seq[String]] = Option(self.containerInstances).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def includeAsScala: Option[Seq[ContainerInstanceField]] = Option(self.include).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeContainerInstancesRequestOps {

implicit def toDescribeContainerInstancesRequestBuilderOps(v: DescribeContainerInstancesRequest.Builder): DescribeContainerInstancesRequestBuilderOps = new DescribeContainerInstancesRequestBuilderOps(v)

implicit def toDescribeContainerInstancesRequestOps(v: DescribeContainerInstancesRequest): DescribeContainerInstancesRequestOps = new DescribeContainerInstancesRequestOps(v)

}

