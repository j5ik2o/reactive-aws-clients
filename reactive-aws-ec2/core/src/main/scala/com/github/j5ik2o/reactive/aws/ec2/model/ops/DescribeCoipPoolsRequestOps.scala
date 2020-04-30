// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeCoipPoolsRequestBuilderOps(val self: DescribeCoipPoolsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def poolIdsAsScala(value: Option[Seq[String]]): DescribeCoipPoolsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.poolIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribeCoipPoolsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): DescribeCoipPoolsRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeCoipPoolsRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeCoipPoolsRequestOps(val self: DescribeCoipPoolsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def poolIdsAsScala: Option[Seq[String]] = Option(self.poolIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeCoipPoolsRequestOps {

implicit def toDescribeCoipPoolsRequestBuilderOps(v: DescribeCoipPoolsRequest.Builder): DescribeCoipPoolsRequestBuilderOps = new DescribeCoipPoolsRequestBuilderOps(v)

implicit def toDescribeCoipPoolsRequestOps(v: DescribeCoipPoolsRequest): DescribeCoipPoolsRequestOps = new DescribeCoipPoolsRequestOps(v)

}

