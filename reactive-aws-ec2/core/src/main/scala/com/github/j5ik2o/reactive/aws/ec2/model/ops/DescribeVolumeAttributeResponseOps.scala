// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVolumeAttributeResponseBuilderOps(val self: DescribeVolumeAttributeResponse.Builder)
    extends AnyVal {

  final def autoEnableIOAsScala(value: Option[AttributeBooleanValue]): DescribeVolumeAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.autoEnableIO(v)
    }
  }

  final def productCodesAsScala(value: Option[Seq[ProductCode]]): DescribeVolumeAttributeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.productCodes(v.asJava)
    }
  }

  final def volumeIdAsScala(value: Option[String]): DescribeVolumeAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.volumeId(v)
    }
  }

}

final class DescribeVolumeAttributeResponseOps(val self: DescribeVolumeAttributeResponse) extends AnyVal {

  final def autoEnableIOAsScala: Option[AttributeBooleanValue] = Option(self.autoEnableIO)

  final def productCodesAsScala: Option[Seq[ProductCode]] = Option(self.productCodes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVolumeAttributeResponseOps {

  implicit def toDescribeVolumeAttributeResponseBuilderOps(
      v: DescribeVolumeAttributeResponse.Builder
  ): DescribeVolumeAttributeResponseBuilderOps = new DescribeVolumeAttributeResponseBuilderOps(v)

  implicit def toDescribeVolumeAttributeResponseOps(
      v: DescribeVolumeAttributeResponse
  ): DescribeVolumeAttributeResponseOps = new DescribeVolumeAttributeResponseOps(v)

}
