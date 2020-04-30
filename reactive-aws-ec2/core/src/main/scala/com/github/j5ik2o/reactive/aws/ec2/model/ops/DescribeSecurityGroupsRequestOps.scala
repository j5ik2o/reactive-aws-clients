// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSecurityGroupsRequestBuilderOps(val self: DescribeSecurityGroupsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribeSecurityGroupsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupIdsAsScala(value: Option[Seq[String]]): DescribeSecurityGroupsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.groupIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupNamesAsScala(value: Option[Seq[String]]): DescribeSecurityGroupsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.groupNames(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeSecurityGroupsRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): DescribeSecurityGroupsRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 


}

final class DescribeSecurityGroupsRequestOps(val self: DescribeSecurityGroupsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def groupIdsAsScala: Option[Seq[String]] = Option(self.groupIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def groupNamesAsScala: Option[Seq[String]] = Option(self.groupNames).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSecurityGroupsRequestOps {

implicit def toDescribeSecurityGroupsRequestBuilderOps(v: DescribeSecurityGroupsRequest.Builder): DescribeSecurityGroupsRequestBuilderOps = new DescribeSecurityGroupsRequestBuilderOps(v)

implicit def toDescribeSecurityGroupsRequestOps(v: DescribeSecurityGroupsRequest): DescribeSecurityGroupsRequestOps = new DescribeSecurityGroupsRequestOps(v)

}

