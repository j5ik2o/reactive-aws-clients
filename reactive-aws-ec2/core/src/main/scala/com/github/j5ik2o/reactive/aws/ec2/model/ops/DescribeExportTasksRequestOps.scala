// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeExportTasksRequestBuilderOps(val self: DescribeExportTasksRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportTaskIdsAsScala(value: Option[Seq[String]]): DescribeExportTasksRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.exportTaskIds(v.asJava)
    }
  }

}

final class DescribeExportTasksRequestOps(val self: DescribeExportTasksRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportTaskIdsAsScala: Option[Seq[String]] = Option(self.exportTaskIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeExportTasksRequestOps {

  implicit def toDescribeExportTasksRequestBuilderOps(
      v: DescribeExportTasksRequest.Builder
  ): DescribeExportTasksRequestBuilderOps = new DescribeExportTasksRequestBuilderOps(v)

  implicit def toDescribeExportTasksRequestOps(v: DescribeExportTasksRequest): DescribeExportTasksRequestOps =
    new DescribeExportTasksRequestOps(v)

}
