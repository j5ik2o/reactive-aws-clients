// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeParameterGroupsRequestBuilderOps(val self: DescribeParameterGroupsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupNamesAsScala(value: Option[Seq[String]]): DescribeParameterGroupsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameterGroupNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeParameterGroupsRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeParameterGroupsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeParameterGroupsRequestOps(val self: DescribeParameterGroupsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupNamesAsScala: Option[Seq[String]] =
    Option(self.parameterGroupNames).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeParameterGroupsRequestOps {

  implicit def toDescribeParameterGroupsRequestBuilderOps(
      v: DescribeParameterGroupsRequest.Builder
  ): DescribeParameterGroupsRequestBuilderOps = new DescribeParameterGroupsRequestBuilderOps(v)

  implicit def toDescribeParameterGroupsRequestOps(
      v: DescribeParameterGroupsRequest
  ): DescribeParameterGroupsRequestOps = new DescribeParameterGroupsRequestOps(v)

}
