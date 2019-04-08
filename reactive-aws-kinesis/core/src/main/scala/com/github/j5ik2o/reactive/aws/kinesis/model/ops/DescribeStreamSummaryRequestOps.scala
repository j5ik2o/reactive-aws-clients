// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DescribeStreamSummaryRequestBuilderOps(val self: DescribeStreamSummaryRequest.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): DescribeStreamSummaryRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

}

final class DescribeStreamSummaryRequestOps(val self: DescribeStreamSummaryRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStreamSummaryRequestOps {

  implicit def toDescribeStreamSummaryRequestBuilderOps(
      v: DescribeStreamSummaryRequest.Builder
  ): DescribeStreamSummaryRequestBuilderOps = new DescribeStreamSummaryRequestBuilderOps(v)

  implicit def toDescribeStreamSummaryRequestOps(v: DescribeStreamSummaryRequest): DescribeStreamSummaryRequestOps =
    new DescribeStreamSummaryRequestOps(v)

}
