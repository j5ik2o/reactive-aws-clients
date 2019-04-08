// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DescribeStreamSummaryResponseBuilderOps(val self: DescribeStreamSummaryResponse.Builder) extends AnyVal {

  final def streamDescriptionSummaryAsScala(
      value: Option[StreamDescriptionSummary]
  ): DescribeStreamSummaryResponse.Builder = {
    value.fold(self) { v =>
      self.streamDescriptionSummary(v)
    }
  }

}

final class DescribeStreamSummaryResponseOps(val self: DescribeStreamSummaryResponse) extends AnyVal {

  final def streamDescriptionSummaryAsScala: Option[StreamDescriptionSummary] = Option(self.streamDescriptionSummary)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStreamSummaryResponseOps {

  implicit def toDescribeStreamSummaryResponseBuilderOps(
      v: DescribeStreamSummaryResponse.Builder
  ): DescribeStreamSummaryResponseBuilderOps = new DescribeStreamSummaryResponseBuilderOps(v)

  implicit def toDescribeStreamSummaryResponseOps(v: DescribeStreamSummaryResponse): DescribeStreamSummaryResponseOps =
    new DescribeStreamSummaryResponseOps(v)

}
