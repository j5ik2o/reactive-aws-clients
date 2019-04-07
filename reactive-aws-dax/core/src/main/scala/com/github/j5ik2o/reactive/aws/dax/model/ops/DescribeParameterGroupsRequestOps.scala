// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeParameterGroupsRequestBuilderOps(val self: DescribeParameterGroupsRequest.Builder) extends AnyVal {

  final def withParameterGroupNamesAsScala(value: Option[Seq[String]]): DescribeParameterGroupsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameterGroupNames(v.asJava)
    } // Seq[String]
  }

  final def withMaxResultsAsScala(value: Option[Int]): DescribeParameterGroupsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

  final def withNextTokenAsScala(value: Option[String]): DescribeParameterGroupsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeParameterGroupsRequestOps(val self: DescribeParameterGroupsRequest) extends AnyVal {

  final def parameterGroupNamesAsScala: Option[Seq[String]] = Option(self.parameterGroupNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

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
