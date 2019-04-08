// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackResourceDriftsResponseBuilderOps(val self: DescribeStackResourceDriftsResponse.Builder)
    extends AnyVal {

  final def stackResourceDriftsAsScala(
      value: Option[Seq[StackResourceDrift]]
  ): DescribeStackResourceDriftsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.stackResourceDrifts(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeStackResourceDriftsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeStackResourceDriftsResponseOps(val self: DescribeStackResourceDriftsResponse) extends AnyVal {

  final def stackResourceDriftsAsScala: Option[Seq[StackResourceDrift]] = Option(self.stackResourceDrifts).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

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
