// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeExportImageTasksRequestBuilderOps(val self: DescribeExportImageTasksRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeExportImageTasksRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportImageTaskIdsAsScala(value: Option[Seq[String]]): DescribeExportImageTasksRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.exportImageTaskIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeExportImageTasksRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeExportImageTasksRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeExportImageTasksRequestOps(val self: DescribeExportImageTasksRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] =
    Option(self.filters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportImageTaskIdsAsScala: Option[Seq[String]] =
    Option(self.exportImageTaskIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeExportImageTasksRequestOps {

  implicit def toDescribeExportImageTasksRequestBuilderOps(
      v: DescribeExportImageTasksRequest.Builder
  ): DescribeExportImageTasksRequestBuilderOps = new DescribeExportImageTasksRequestBuilderOps(v)

  implicit def toDescribeExportImageTasksRequestOps(
      v: DescribeExportImageTasksRequest
  ): DescribeExportImageTasksRequestOps = new DescribeExportImageTasksRequestOps(v)

}
