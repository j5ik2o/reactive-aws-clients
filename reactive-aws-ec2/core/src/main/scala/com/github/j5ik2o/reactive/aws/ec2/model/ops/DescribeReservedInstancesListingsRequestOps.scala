// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeReservedInstancesListingsRequestBuilderOps(val self: DescribeReservedInstancesListingsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribeReservedInstancesListingsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def reservedInstancesIdAsScala(value: Option[String]): DescribeReservedInstancesListingsRequest.Builder = {
            value.fold(self){ v => self.reservedInstancesId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def reservedInstancesListingIdAsScala(value: Option[String]): DescribeReservedInstancesListingsRequest.Builder = {
            value.fold(self){ v => self.reservedInstancesListingId(v) }
            } 


}

final class DescribeReservedInstancesListingsRequestOps(val self: DescribeReservedInstancesListingsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def reservedInstancesIdAsScala: Option[String] = Option(self.reservedInstancesId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def reservedInstancesListingIdAsScala: Option[String] = Option(self.reservedInstancesListingId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeReservedInstancesListingsRequestOps {

implicit def toDescribeReservedInstancesListingsRequestBuilderOps(v: DescribeReservedInstancesListingsRequest.Builder): DescribeReservedInstancesListingsRequestBuilderOps = new DescribeReservedInstancesListingsRequestBuilderOps(v)

implicit def toDescribeReservedInstancesListingsRequestOps(v: DescribeReservedInstancesListingsRequest): DescribeReservedInstancesListingsRequestOps = new DescribeReservedInstancesListingsRequestOps(v)

}

