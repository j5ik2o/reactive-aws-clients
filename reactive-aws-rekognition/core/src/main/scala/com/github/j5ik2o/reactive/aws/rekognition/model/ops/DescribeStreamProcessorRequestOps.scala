// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DescribeStreamProcessorRequestBuilderOps(val self: DescribeStreamProcessorRequest.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): DescribeStreamProcessorRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

}

final class DescribeStreamProcessorRequestOps(val self: DescribeStreamProcessorRequest) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStreamProcessorRequestOps {

  implicit def toDescribeStreamProcessorRequestBuilderOps(
      v: DescribeStreamProcessorRequest.Builder
  ): DescribeStreamProcessorRequestBuilderOps = new DescribeStreamProcessorRequestBuilderOps(v)

  implicit def toDescribeStreamProcessorRequestOps(
      v: DescribeStreamProcessorRequest
  ): DescribeStreamProcessorRequestOps = new DescribeStreamProcessorRequestOps(v)

}
