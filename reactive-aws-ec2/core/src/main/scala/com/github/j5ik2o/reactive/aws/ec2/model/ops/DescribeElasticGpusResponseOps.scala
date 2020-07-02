// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeElasticGpusResponseBuilderOps(val self: DescribeElasticGpusResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticGpuSetAsScala(value: Option[Seq[ElasticGpus]]): DescribeElasticGpusResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.elasticGpuSet(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeElasticGpusResponse.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeElasticGpusResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeElasticGpusResponseOps(val self: DescribeElasticGpusResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticGpuSetAsScala: Option[Seq[ElasticGpus]] =
    Option(self.elasticGpuSet).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeElasticGpusResponseOps {

  implicit def toDescribeElasticGpusResponseBuilderOps(
      v: DescribeElasticGpusResponse.Builder
  ): DescribeElasticGpusResponseBuilderOps = new DescribeElasticGpusResponseBuilderOps(v)

  implicit def toDescribeElasticGpusResponseOps(v: DescribeElasticGpusResponse): DescribeElasticGpusResponseOps =
    new DescribeElasticGpusResponseOps(v)

}
