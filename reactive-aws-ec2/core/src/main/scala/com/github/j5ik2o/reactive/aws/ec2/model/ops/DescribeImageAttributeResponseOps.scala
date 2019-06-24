// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeImageAttributeResponseBuilderOps(val self: DescribeImageAttributeResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDeviceMappingsAsScala(
      value: Option[Seq[BlockDeviceMapping]]
  ): DescribeImageAttributeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.blockDeviceMappings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[String]): DescribeImageAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchPermissionsAsScala(value: Option[Seq[LaunchPermission]]): DescribeImageAttributeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.launchPermissions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productCodesAsScala(value: Option[Seq[ProductCode]]): DescribeImageAttributeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.productCodes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[AttributeValue]): DescribeImageAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kernelIdAsScala(value: Option[AttributeValue]): DescribeImageAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.kernelId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ramdiskIdAsScala(value: Option[AttributeValue]): DescribeImageAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.ramdiskId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sriovNetSupportAsScala(value: Option[AttributeValue]): DescribeImageAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.sriovNetSupport(v)
    }
  }

}

final class DescribeImageAttributeResponseOps(val self: DescribeImageAttributeResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDeviceMappingsAsScala: Option[Seq[BlockDeviceMapping]] = Option(self.blockDeviceMappings).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala: Option[String] = Option(self.imageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchPermissionsAsScala: Option[Seq[LaunchPermission]] = Option(self.launchPermissions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productCodesAsScala: Option[Seq[ProductCode]] = Option(self.productCodes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[AttributeValue] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kernelIdAsScala: Option[AttributeValue] = Option(self.kernelId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ramdiskIdAsScala: Option[AttributeValue] = Option(self.ramdiskId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sriovNetSupportAsScala: Option[AttributeValue] = Option(self.sriovNetSupport)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeImageAttributeResponseOps {

  implicit def toDescribeImageAttributeResponseBuilderOps(
      v: DescribeImageAttributeResponse.Builder
  ): DescribeImageAttributeResponseBuilderOps = new DescribeImageAttributeResponseBuilderOps(v)

  implicit def toDescribeImageAttributeResponseOps(
      v: DescribeImageAttributeResponse
  ): DescribeImageAttributeResponseOps = new DescribeImageAttributeResponseOps(v)

}
