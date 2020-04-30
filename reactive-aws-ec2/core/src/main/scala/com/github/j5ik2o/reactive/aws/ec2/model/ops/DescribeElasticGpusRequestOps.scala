// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeElasticGpusRequestBuilderOps(val self: DescribeElasticGpusRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticGpuIdsAsScala(value: Option[Seq[String]]): DescribeElasticGpusRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.elasticGpuIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribeElasticGpusRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): DescribeElasticGpusRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeElasticGpusRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeElasticGpusRequestOps(val self: DescribeElasticGpusRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def elasticGpuIdsAsScala: Option[Seq[String]] = Option(self.elasticGpuIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeElasticGpusRequestOps {

implicit def toDescribeElasticGpusRequestBuilderOps(v: DescribeElasticGpusRequest.Builder): DescribeElasticGpusRequestBuilderOps = new DescribeElasticGpusRequestBuilderOps(v)

implicit def toDescribeElasticGpusRequestOps(v: DescribeElasticGpusRequest): DescribeElasticGpusRequestOps = new DescribeElasticGpusRequestOps(v)

}

