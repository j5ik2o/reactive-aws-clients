// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVolumeStatusRequestBuilderOps(val self: DescribeVolumeStatusRequest.Builder) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVolumeStatusRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeVolumeStatusRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeVolumeStatusRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def volumeIdsAsScala(value: Option[Seq[String]]): DescribeVolumeStatusRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.volumeIds(v.asJava)
    }
  }

}

final class DescribeVolumeStatusRequestOps(val self: DescribeVolumeStatusRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def volumeIdsAsScala: Option[Seq[String]] = Option(self.volumeIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVolumeStatusRequestOps {

  implicit def toDescribeVolumeStatusRequestBuilderOps(
      v: DescribeVolumeStatusRequest.Builder
  ): DescribeVolumeStatusRequestBuilderOps = new DescribeVolumeStatusRequestBuilderOps(v)

  implicit def toDescribeVolumeStatusRequestOps(v: DescribeVolumeStatusRequest): DescribeVolumeStatusRequestOps =
    new DescribeVolumeStatusRequestOps(v)

}
