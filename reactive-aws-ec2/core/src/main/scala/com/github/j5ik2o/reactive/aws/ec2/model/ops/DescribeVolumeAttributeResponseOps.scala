// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVolumeAttributeResponseBuilderOps(val self: DescribeVolumeAttributeResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoEnableIOAsScala(value: Option[AttributeBooleanValue]): DescribeVolumeAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.autoEnableIO(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productCodesAsScala(value: Option[Seq[ProductCode]]): DescribeVolumeAttributeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.productCodes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala(value: Option[String]): DescribeVolumeAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.volumeId(v)
    }
  }

}

final class DescribeVolumeAttributeResponseOps(val self: DescribeVolumeAttributeResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoEnableIOAsScala: Option[AttributeBooleanValue] = Option(self.autoEnableIO)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productCodesAsScala: Option[Seq[ProductCode]] = Option(self.productCodes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
