// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFleetInstancesRequestBuilderOps(val self: DescribeFleetInstancesRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): DescribeFleetInstancesRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeFleetInstancesRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fleetIdAsScala(value: Option[String]): DescribeFleetInstancesRequest.Builder = {
            value.fold(self){ v => self.fleetId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribeFleetInstancesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }


}

final class DescribeFleetInstancesRequestOps(val self: DescribeFleetInstancesRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fleetIdAsScala: Option[String] = Option(self.fleetId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFleetInstancesRequestOps {

implicit def toDescribeFleetInstancesRequestBuilderOps(v: DescribeFleetInstancesRequest.Builder): DescribeFleetInstancesRequestBuilderOps = new DescribeFleetInstancesRequestBuilderOps(v)

implicit def toDescribeFleetInstancesRequestOps(v: DescribeFleetInstancesRequest): DescribeFleetInstancesRequestOps = new DescribeFleetInstancesRequestOps(v)

}

