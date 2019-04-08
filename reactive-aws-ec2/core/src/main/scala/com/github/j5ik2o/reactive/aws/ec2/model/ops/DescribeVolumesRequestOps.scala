// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVolumesRequestBuilderOps(val self: DescribeVolumesRequest.Builder) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVolumesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def volumeIdsAsScala(value: Option[Seq[String]]): DescribeVolumesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.volumeIds(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeVolumesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeVolumesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeVolumesRequestOps(val self: DescribeVolumesRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def volumeIdsAsScala: Option[Seq[String]] = Option(self.volumeIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVolumesRequestOps {

  implicit def toDescribeVolumesRequestBuilderOps(v: DescribeVolumesRequest.Builder): DescribeVolumesRequestBuilderOps =
    new DescribeVolumesRequestBuilderOps(v)

  implicit def toDescribeVolumesRequestOps(v: DescribeVolumesRequest): DescribeVolumesRequestOps =
    new DescribeVolumesRequestOps(v)

}
