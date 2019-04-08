// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeElasticGpusRequestBuilderOps(val self: DescribeElasticGpusRequest.Builder) extends AnyVal {

  final def elasticGpuIdsAsScala(value: Option[Seq[String]]): DescribeElasticGpusRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.elasticGpuIds(v.asJava)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeElasticGpusRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeElasticGpusRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeElasticGpusRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeElasticGpusRequestOps(val self: DescribeElasticGpusRequest) extends AnyVal {

  final def elasticGpuIdsAsScala: Option[Seq[String]] = Option(self.elasticGpuIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeElasticGpusRequestOps {

  implicit def toDescribeElasticGpusRequestBuilderOps(
      v: DescribeElasticGpusRequest.Builder
  ): DescribeElasticGpusRequestBuilderOps = new DescribeElasticGpusRequestBuilderOps(v)

  implicit def toDescribeElasticGpusRequestOps(v: DescribeElasticGpusRequest): DescribeElasticGpusRequestOps =
    new DescribeElasticGpusRequestOps(v)

}
