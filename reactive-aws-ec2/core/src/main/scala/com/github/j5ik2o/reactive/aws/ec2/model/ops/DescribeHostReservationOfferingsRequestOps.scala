// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeHostReservationOfferingsRequestBuilderOps(val self: DescribeHostReservationOfferingsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filterAsScala(value: Option[Seq[Filter]]): DescribeHostReservationOfferingsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filter(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxDurationAsScala(value: Option[Int]): DescribeHostReservationOfferingsRequest.Builder = {
            value.fold(self){ v => self.maxDuration(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): DescribeHostReservationOfferingsRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def minDurationAsScala(value: Option[Int]): DescribeHostReservationOfferingsRequest.Builder = {
            value.fold(self){ v => self.minDuration(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeHostReservationOfferingsRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def offeringIdAsScala(value: Option[String]): DescribeHostReservationOfferingsRequest.Builder = {
            value.fold(self){ v => self.offeringId(v) }
            } 


}

final class DescribeHostReservationOfferingsRequestOps(val self: DescribeHostReservationOfferingsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filterAsScala: Option[Seq[Filter]] = Option(self.filter).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxDurationAsScala: Option[Int] = Option(self.maxDuration) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def minDurationAsScala: Option[Int] = Option(self.minDuration) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def offeringIdAsScala: Option[String] = Option(self.offeringId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeHostReservationOfferingsRequestOps {

implicit def toDescribeHostReservationOfferingsRequestBuilderOps(v: DescribeHostReservationOfferingsRequest.Builder): DescribeHostReservationOfferingsRequestBuilderOps = new DescribeHostReservationOfferingsRequestBuilderOps(v)

implicit def toDescribeHostReservationOfferingsRequestOps(v: DescribeHostReservationOfferingsRequest): DescribeHostReservationOfferingsRequestOps = new DescribeHostReservationOfferingsRequestOps(v)

}

