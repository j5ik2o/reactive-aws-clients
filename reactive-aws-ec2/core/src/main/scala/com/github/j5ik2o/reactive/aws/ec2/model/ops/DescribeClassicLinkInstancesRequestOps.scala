// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeClassicLinkInstancesRequestBuilderOps(val self: DescribeClassicLinkInstancesRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribeClassicLinkInstancesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdsAsScala(value: Option[Seq[String]]): DescribeClassicLinkInstancesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): DescribeClassicLinkInstancesRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeClassicLinkInstancesRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeClassicLinkInstancesRequestOps(val self: DescribeClassicLinkInstancesRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def instanceIdsAsScala: Option[Seq[String]] = Option(self.instanceIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClassicLinkInstancesRequestOps {

implicit def toDescribeClassicLinkInstancesRequestBuilderOps(v: DescribeClassicLinkInstancesRequest.Builder): DescribeClassicLinkInstancesRequestBuilderOps = new DescribeClassicLinkInstancesRequestBuilderOps(v)

implicit def toDescribeClassicLinkInstancesRequestOps(v: DescribeClassicLinkInstancesRequest): DescribeClassicLinkInstancesRequestOps = new DescribeClassicLinkInstancesRequestOps(v)

}

