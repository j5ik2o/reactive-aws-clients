// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeDhcpOptionsRequestBuilderOps(val self: DescribeDhcpOptionsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def dhcpOptionsIdsAsScala(value: Option[Seq[String]]): DescribeDhcpOptionsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dhcpOptionsIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribeDhcpOptionsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeDhcpOptionsRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): DescribeDhcpOptionsRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 


}

final class DescribeDhcpOptionsRequestOps(val self: DescribeDhcpOptionsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def dhcpOptionsIdsAsScala: Option[Seq[String]] = Option(self.dhcpOptionsIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeDhcpOptionsRequestOps {

implicit def toDescribeDhcpOptionsRequestBuilderOps(v: DescribeDhcpOptionsRequest.Builder): DescribeDhcpOptionsRequestBuilderOps = new DescribeDhcpOptionsRequestBuilderOps(v)

implicit def toDescribeDhcpOptionsRequestOps(v: DescribeDhcpOptionsRequest): DescribeDhcpOptionsRequestOps = new DescribeDhcpOptionsRequestOps(v)

}

