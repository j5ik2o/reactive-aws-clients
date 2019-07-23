// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeConversionTasksRequestBuilderOps(val self: DescribeConversionTasksRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conversionTaskIdsAsScala(value: Option[Seq[String]]): DescribeConversionTasksRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.conversionTaskIds(v.asJava)
    }
  }

}

final class DescribeConversionTasksRequestOps(val self: DescribeConversionTasksRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conversionTaskIdsAsScala: Option[Seq[String]] = Option(self.conversionTaskIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeConversionTasksRequestOps {

  implicit def toDescribeConversionTasksRequestBuilderOps(
      v: DescribeConversionTasksRequest.Builder
  ): DescribeConversionTasksRequestBuilderOps = new DescribeConversionTasksRequestBuilderOps(v)

  implicit def toDescribeConversionTasksRequestOps(
      v: DescribeConversionTasksRequest
  ): DescribeConversionTasksRequestOps = new DescribeConversionTasksRequestOps(v)

}
