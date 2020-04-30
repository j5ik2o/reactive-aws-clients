// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTrafficMirrorFiltersRequestBuilderOps(val self: DescribeTrafficMirrorFiltersRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorFilterIdsAsScala(value: Option[Seq[String]]): DescribeTrafficMirrorFiltersRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.trafficMirrorFilterIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribeTrafficMirrorFiltersRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): DescribeTrafficMirrorFiltersRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeTrafficMirrorFiltersRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeTrafficMirrorFiltersRequestOps(val self: DescribeTrafficMirrorFiltersRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def trafficMirrorFilterIdsAsScala: Option[Seq[String]] = Option(self.trafficMirrorFilterIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTrafficMirrorFiltersRequestOps {

implicit def toDescribeTrafficMirrorFiltersRequestBuilderOps(v: DescribeTrafficMirrorFiltersRequest.Builder): DescribeTrafficMirrorFiltersRequestBuilderOps = new DescribeTrafficMirrorFiltersRequestBuilderOps(v)

implicit def toDescribeTrafficMirrorFiltersRequestOps(v: DescribeTrafficMirrorFiltersRequest): DescribeTrafficMirrorFiltersRequestOps = new DescribeTrafficMirrorFiltersRequestOps(v)

}

