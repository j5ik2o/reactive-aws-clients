// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribePlacementGroupsResponseBuilderOps(val self: DescribePlacementGroupsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def placementGroupsAsScala(value: Option[Seq[PlacementGroup]]): DescribePlacementGroupsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.placementGroups(v.asJava) } 
            }


}

final class DescribePlacementGroupsResponseOps(val self: DescribePlacementGroupsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def placementGroupsAsScala: Option[Seq[PlacementGroup]] = Option(self.placementGroups).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribePlacementGroupsResponseOps {

implicit def toDescribePlacementGroupsResponseBuilderOps(v: DescribePlacementGroupsResponse.Builder): DescribePlacementGroupsResponseBuilderOps = new DescribePlacementGroupsResponseBuilderOps(v)

implicit def toDescribePlacementGroupsResponseOps(v: DescribePlacementGroupsResponse): DescribePlacementGroupsResponseOps = new DescribePlacementGroupsResponseOps(v)

}

