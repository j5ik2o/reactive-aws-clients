// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeExportImageTasksResponseBuilderOps(val self: DescribeExportImageTasksResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportImageTasksAsScala(value: Option[Seq[ExportImageTask]]): DescribeExportImageTasksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.exportImageTasks(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeExportImageTasksResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeExportImageTasksResponseOps(val self: DescribeExportImageTasksResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportImageTasksAsScala: Option[Seq[ExportImageTask]] =
    Option(self.exportImageTasks).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeExportImageTasksResponseOps {

  implicit def toDescribeExportImageTasksResponseBuilderOps(
      v: DescribeExportImageTasksResponse.Builder
  ): DescribeExportImageTasksResponseBuilderOps = new DescribeExportImageTasksResponseBuilderOps(v)

  implicit def toDescribeExportImageTasksResponseOps(
      v: DescribeExportImageTasksResponse
  ): DescribeExportImageTasksResponseOps = new DescribeExportImageTasksResponseOps(v)

}
