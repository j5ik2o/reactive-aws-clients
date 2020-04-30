// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVolumesRequestBuilderOps(val self: DescribeVolumesRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVolumesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def volumeIdsAsScala(value: Option[Seq[String]]): DescribeVolumesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.volumeIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): DescribeVolumesRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeVolumesRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeVolumesRequestOps(val self: DescribeVolumesRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def volumeIdsAsScala: Option[Seq[String]] = Option(self.volumeIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVolumesRequestOps {

implicit def toDescribeVolumesRequestBuilderOps(v: DescribeVolumesRequest.Builder): DescribeVolumesRequestBuilderOps = new DescribeVolumesRequestBuilderOps(v)

implicit def toDescribeVolumesRequestOps(v: DescribeVolumesRequest): DescribeVolumesRequestOps = new DescribeVolumesRequestOps(v)

}

