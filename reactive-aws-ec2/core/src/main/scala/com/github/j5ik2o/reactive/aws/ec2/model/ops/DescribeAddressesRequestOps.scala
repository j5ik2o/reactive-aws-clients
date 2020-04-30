// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeAddressesRequestBuilderOps(val self: DescribeAddressesRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribeAddressesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpsAsScala(value: Option[Seq[String]]): DescribeAddressesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.publicIps(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def allocationIdsAsScala(value: Option[Seq[String]]): DescribeAddressesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.allocationIds(v.asJava) } 
            }


}

final class DescribeAddressesRequestOps(val self: DescribeAddressesRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def publicIpsAsScala: Option[Seq[String]] = Option(self.publicIps).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def allocationIdsAsScala: Option[Seq[String]] = Option(self.allocationIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAddressesRequestOps {

implicit def toDescribeAddressesRequestBuilderOps(v: DescribeAddressesRequest.Builder): DescribeAddressesRequestBuilderOps = new DescribeAddressesRequestBuilderOps(v)

implicit def toDescribeAddressesRequestOps(v: DescribeAddressesRequest): DescribeAddressesRequestOps = new DescribeAddressesRequestOps(v)

}

