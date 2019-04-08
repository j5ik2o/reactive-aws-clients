// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeElasticGpusResponseBuilderOps(val self: DescribeElasticGpusResponse.Builder) extends AnyVal {

  final def elasticGpuSetAsScala(value: Option[Seq[ElasticGpus]]): DescribeElasticGpusResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.elasticGpuSet(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeElasticGpusResponse.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeElasticGpusResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeElasticGpusResponseOps(val self: DescribeElasticGpusResponse) extends AnyVal {

  final def elasticGpuSetAsScala: Option[Seq[ElasticGpus]] = Option(self.elasticGpuSet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

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
