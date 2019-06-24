// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackResourceDriftsResponseBuilderOps(val self: DescribeStackResourceDriftsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackResourceDriftsAsScala(
      value: Option[Seq[StackResourceDrift]]
  ): DescribeStackResourceDriftsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.stackResourceDrifts(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeStackResourceDriftsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeStackResourceDriftsResponseOps(val self: DescribeStackResourceDriftsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackResourceDriftsAsScala: Option[Seq[StackResourceDrift]] = Option(self.stackResourceDrifts).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackResourceDriftsResponseOps {

  implicit def toDescribeStackResourceDriftsResponseBuilderOps(
      v: DescribeStackResourceDriftsResponse.Builder
  ): DescribeStackResourceDriftsResponseBuilderOps = new DescribeStackResourceDriftsResponseBuilderOps(v)

  implicit def toDescribeStackResourceDriftsResponseOps(
      v: DescribeStackResourceDriftsResponse
  ): DescribeStackResourceDriftsResponseOps = new DescribeStackResourceDriftsResponseOps(v)

}
