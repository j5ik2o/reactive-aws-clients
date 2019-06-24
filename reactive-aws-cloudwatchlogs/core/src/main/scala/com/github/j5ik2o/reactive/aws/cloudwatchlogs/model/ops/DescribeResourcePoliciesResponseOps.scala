// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeResourcePoliciesResponseBuilderOps(val self: DescribeResourcePoliciesResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourcePoliciesAsScala(value: Option[Seq[ResourcePolicy]]): DescribeResourcePoliciesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resourcePolicies(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeResourcePoliciesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeResourcePoliciesResponseOps(val self: DescribeResourcePoliciesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourcePoliciesAsScala: Option[Seq[ResourcePolicy]] = Option(self.resourcePolicies).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeResourcePoliciesResponseOps {

  implicit def toDescribeResourcePoliciesResponseBuilderOps(
      v: DescribeResourcePoliciesResponse.Builder
  ): DescribeResourcePoliciesResponseBuilderOps = new DescribeResourcePoliciesResponseBuilderOps(v)

  implicit def toDescribeResourcePoliciesResponseOps(
      v: DescribeResourcePoliciesResponse
  ): DescribeResourcePoliciesResponseOps = new DescribeResourcePoliciesResponseOps(v)

}
