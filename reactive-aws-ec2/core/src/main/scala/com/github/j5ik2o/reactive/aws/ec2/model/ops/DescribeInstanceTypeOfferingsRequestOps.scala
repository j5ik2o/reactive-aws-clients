// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeInstanceTypeOfferingsRequestBuilderOps(val self: DescribeInstanceTypeOfferingsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def locationTypeAsScala(value: Option[LocationType]): DescribeInstanceTypeOfferingsRequest.Builder = {
            value.fold(self){ v => self.locationType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribeInstanceTypeOfferingsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): DescribeInstanceTypeOfferingsRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeInstanceTypeOfferingsRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeInstanceTypeOfferingsRequestOps(val self: DescribeInstanceTypeOfferingsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def locationTypeAsScala: Option[LocationType] = Option(self.locationType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeInstanceTypeOfferingsRequestOps {

implicit def toDescribeInstanceTypeOfferingsRequestBuilderOps(v: DescribeInstanceTypeOfferingsRequest.Builder): DescribeInstanceTypeOfferingsRequestBuilderOps = new DescribeInstanceTypeOfferingsRequestBuilderOps(v)

implicit def toDescribeInstanceTypeOfferingsRequestOps(v: DescribeInstanceTypeOfferingsRequest): DescribeInstanceTypeOfferingsRequestOps = new DescribeInstanceTypeOfferingsRequestOps(v)

}

