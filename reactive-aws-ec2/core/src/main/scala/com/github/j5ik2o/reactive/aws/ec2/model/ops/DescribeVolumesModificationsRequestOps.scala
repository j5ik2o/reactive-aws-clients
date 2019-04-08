// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVolumesModificationsRequestBuilderOps(val self: DescribeVolumesModificationsRequest.Builder)
    extends AnyVal {

  final def volumeIdsAsScala(value: Option[Seq[String]]): DescribeVolumesModificationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.volumeIds(v.asJava)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVolumesModificationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeVolumesModificationsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeVolumesModificationsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribeVolumesModificationsRequestOps(val self: DescribeVolumesModificationsRequest) extends AnyVal {

  final def volumeIdsAsScala: Option[Seq[String]] = Option(self.volumeIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVolumesModificationsRequestOps {

  implicit def toDescribeVolumesModificationsRequestBuilderOps(
      v: DescribeVolumesModificationsRequest.Builder
  ): DescribeVolumesModificationsRequestBuilderOps = new DescribeVolumesModificationsRequestBuilderOps(v)

  implicit def toDescribeVolumesModificationsRequestOps(
      v: DescribeVolumesModificationsRequest
  ): DescribeVolumesModificationsRequestOps = new DescribeVolumesModificationsRequestOps(v)

}
