// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribePlacementGroupsRequestBuilderOps(val self: DescribePlacementGroupsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribePlacementGroupsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupNamesAsScala(value: Option[Seq[String]]): DescribePlacementGroupsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.groupNames(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupIdsAsScala(value: Option[Seq[String]]): DescribePlacementGroupsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.groupIds(v.asJava) } 
            }


}

final class DescribePlacementGroupsRequestOps(val self: DescribePlacementGroupsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def groupNamesAsScala: Option[Seq[String]] = Option(self.groupNames).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def groupIdsAsScala: Option[Seq[String]] = Option(self.groupIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribePlacementGroupsRequestOps {

implicit def toDescribePlacementGroupsRequestBuilderOps(v: DescribePlacementGroupsRequest.Builder): DescribePlacementGroupsRequestBuilderOps = new DescribePlacementGroupsRequestBuilderOps(v)

implicit def toDescribePlacementGroupsRequestOps(v: DescribePlacementGroupsRequest): DescribePlacementGroupsRequestOps = new DescribePlacementGroupsRequestOps(v)

}

