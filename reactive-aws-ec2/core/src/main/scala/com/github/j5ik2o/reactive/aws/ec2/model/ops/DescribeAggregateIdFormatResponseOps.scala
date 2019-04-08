// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeAggregateIdFormatResponseBuilderOps(val self: DescribeAggregateIdFormatResponse.Builder)
    extends AnyVal {

  final def useLongIdsAggregatedAsScala(value: Option[Boolean]): DescribeAggregateIdFormatResponse.Builder = {
    value.fold(self) { v =>
      self.useLongIdsAggregated(v)
    }
  }

  final def statusesAsScala(value: Option[Seq[IdFormat]]): DescribeAggregateIdFormatResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.statuses(v.asJava)
    }
  }

}

final class DescribeAggregateIdFormatResponseOps(val self: DescribeAggregateIdFormatResponse) extends AnyVal {

  final def useLongIdsAggregatedAsScala: Option[Boolean] = Option(self.useLongIdsAggregated)

  final def statusesAsScala: Option[Seq[IdFormat]] = Option(self.statuses).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAggregateIdFormatResponseOps {

  implicit def toDescribeAggregateIdFormatResponseBuilderOps(
      v: DescribeAggregateIdFormatResponse.Builder
  ): DescribeAggregateIdFormatResponseBuilderOps = new DescribeAggregateIdFormatResponseBuilderOps(v)

  implicit def toDescribeAggregateIdFormatResponseOps(
      v: DescribeAggregateIdFormatResponse
  ): DescribeAggregateIdFormatResponseOps = new DescribeAggregateIdFormatResponseOps(v)

}
