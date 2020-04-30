// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DescribeTaskSetsRequestBuilderOps(val self: DescribeTaskSetsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clusterAsScala(value: Option[String]): DescribeTaskSetsRequest.Builder = {
            value.fold(self){ v => self.cluster(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceAsScala(value: Option[String]): DescribeTaskSetsRequest.Builder = {
            value.fold(self){ v => self.service(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def taskSetsAsScala(value: Option[Seq[String]]): DescribeTaskSetsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.taskSets(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def includeAsScala(value: Option[Seq[TaskSetField]]): DescribeTaskSetsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.include(v.asJava) } 
            }


}

final class DescribeTaskSetsRequestOps(val self: DescribeTaskSetsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clusterAsScala: Option[String] = Option(self.cluster) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceAsScala: Option[String] = Option(self.service) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def taskSetsAsScala: Option[Seq[String]] = Option(self.taskSets).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def includeAsScala: Option[Seq[TaskSetField]] = Option(self.include).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTaskSetsRequestOps {

implicit def toDescribeTaskSetsRequestBuilderOps(v: DescribeTaskSetsRequest.Builder): DescribeTaskSetsRequestBuilderOps = new DescribeTaskSetsRequestBuilderOps(v)

implicit def toDescribeTaskSetsRequestOps(v: DescribeTaskSetsRequest): DescribeTaskSetsRequestOps = new DescribeTaskSetsRequestOps(v)

}

