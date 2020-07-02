// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeParameterGroupsResponseBuilderOps(val self: DescribeParameterGroupsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeParameterGroupsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupsAsScala(value: Option[Seq[ParameterGroup]]): DescribeParameterGroupsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameterGroups(v.asJava)
    }
  }

}

final class DescribeParameterGroupsResponseOps(val self: DescribeParameterGroupsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupsAsScala: Option[Seq[ParameterGroup]] =
    Option(self.parameterGroups).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeParameterGroupsResponseOps {

  implicit def toDescribeParameterGroupsResponseBuilderOps(
      v: DescribeParameterGroupsResponse.Builder
  ): DescribeParameterGroupsResponseBuilderOps = new DescribeParameterGroupsResponseBuilderOps(v)

  implicit def toDescribeParameterGroupsResponseOps(
      v: DescribeParameterGroupsResponse
  ): DescribeParameterGroupsResponseOps = new DescribeParameterGroupsResponseOps(v)

}
