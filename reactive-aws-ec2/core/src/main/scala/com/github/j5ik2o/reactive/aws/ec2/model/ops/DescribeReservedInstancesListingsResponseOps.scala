// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeReservedInstancesListingsResponseBuilderOps(val self: DescribeReservedInstancesListingsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def reservedInstancesListingsAsScala(value: Option[Seq[ReservedInstancesListing]]): DescribeReservedInstancesListingsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.reservedInstancesListings(v.asJava) } 
            }


}

final class DescribeReservedInstancesListingsResponseOps(val self: DescribeReservedInstancesListingsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def reservedInstancesListingsAsScala: Option[Seq[ReservedInstancesListing]] = Option(self.reservedInstancesListings).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeReservedInstancesListingsResponseOps {

implicit def toDescribeReservedInstancesListingsResponseBuilderOps(v: DescribeReservedInstancesListingsResponse.Builder): DescribeReservedInstancesListingsResponseBuilderOps = new DescribeReservedInstancesListingsResponseBuilderOps(v)

implicit def toDescribeReservedInstancesListingsResponseOps(v: DescribeReservedInstancesListingsResponse): DescribeReservedInstancesListingsResponseOps = new DescribeReservedInstancesListingsResponseOps(v)

}

