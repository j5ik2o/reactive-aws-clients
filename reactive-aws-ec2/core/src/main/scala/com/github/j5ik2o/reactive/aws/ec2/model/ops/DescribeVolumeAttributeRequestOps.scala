// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVolumeAttributeRequestBuilderOps(val self: DescribeVolumeAttributeRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeAsScala(value: Option[VolumeAttributeName]): DescribeVolumeAttributeRequest.Builder = {
    value.fold(self) { v => self.attribute(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala(value: Option[String]): DescribeVolumeAttributeRequest.Builder = {
    value.fold(self) { v => self.volumeId(v) }
  }

}

final class DescribeVolumeAttributeRequestOps(val self: DescribeVolumeAttributeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeAsScala: Option[VolumeAttributeName] = Option(self.attribute)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVolumeAttributeRequestOps {

  implicit def toDescribeVolumeAttributeRequestBuilderOps(
      v: DescribeVolumeAttributeRequest.Builder
  ): DescribeVolumeAttributeRequestBuilderOps = new DescribeVolumeAttributeRequestBuilderOps(v)

  implicit def toDescribeVolumeAttributeRequestOps(
      v: DescribeVolumeAttributeRequest
  ): DescribeVolumeAttributeRequestOps = new DescribeVolumeAttributeRequestOps(v)

}
