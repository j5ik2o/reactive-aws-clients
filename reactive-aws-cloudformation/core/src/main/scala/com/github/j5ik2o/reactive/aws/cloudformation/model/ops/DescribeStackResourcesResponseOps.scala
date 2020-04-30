// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackResourcesResponseBuilderOps(val self: DescribeStackResourcesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackResourcesAsScala(value: Option[Seq[StackResource]]): DescribeStackResourcesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.stackResources(v.asJava) } 
            }


}

final class DescribeStackResourcesResponseOps(val self: DescribeStackResourcesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def stackResourcesAsScala: Option[Seq[StackResource]] = Option(self.stackResources).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackResourcesResponseOps {

implicit def toDescribeStackResourcesResponseBuilderOps(v: DescribeStackResourcesResponse.Builder): DescribeStackResourcesResponseBuilderOps = new DescribeStackResourcesResponseBuilderOps(v)

implicit def toDescribeStackResourcesResponseOps(v: DescribeStackResourcesResponse): DescribeStackResourcesResponseOps = new DescribeStackResourcesResponseOps(v)

}

