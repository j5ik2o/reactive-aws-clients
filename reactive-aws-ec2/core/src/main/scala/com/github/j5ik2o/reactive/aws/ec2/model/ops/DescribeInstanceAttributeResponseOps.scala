// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeInstanceAttributeResponseBuilderOps(val self: DescribeInstanceAttributeResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupsAsScala(value: Option[Seq[GroupIdentifier]]): DescribeInstanceAttributeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.groups(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDeviceMappingsAsScala(
      value: Option[Seq[InstanceBlockDeviceMapping]]
  ): DescribeInstanceAttributeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.blockDeviceMappings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disableApiTerminationAsScala(
      value: Option[AttributeBooleanValue]
  ): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.disableApiTermination(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enaSupportAsScala(value: Option[AttributeBooleanValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.enaSupport(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptimizedAsScala(value: Option[AttributeBooleanValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.ebsOptimized(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceInitiatedShutdownBehaviorAsScala(
      value: Option[AttributeValue]
  ): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.instanceInitiatedShutdownBehavior(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[AttributeValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kernelIdAsScala(value: Option[AttributeValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.kernelId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productCodesAsScala(value: Option[Seq[ProductCode]]): DescribeInstanceAttributeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.productCodes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ramdiskIdAsScala(value: Option[AttributeValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.ramdiskId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rootDeviceNameAsScala(value: Option[AttributeValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.rootDeviceName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceDestCheckAsScala(value: Option[AttributeBooleanValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.sourceDestCheck(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sriovNetSupportAsScala(value: Option[AttributeValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.sriovNetSupport(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userDataAsScala(value: Option[AttributeValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.userData(v)
    }
  }

}

final class DescribeInstanceAttributeResponseOps(val self: DescribeInstanceAttributeResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupsAsScala: Option[Seq[GroupIdentifier]] = Option(self.groups).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDeviceMappingsAsScala: Option[Seq[InstanceBlockDeviceMapping]] = Option(self.blockDeviceMappings).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disableApiTerminationAsScala: Option[AttributeBooleanValue] = Option(self.disableApiTermination)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enaSupportAsScala: Option[AttributeBooleanValue] = Option(self.enaSupport)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptimizedAsScala: Option[AttributeBooleanValue] = Option(self.ebsOptimized)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceInitiatedShutdownBehaviorAsScala: Option[AttributeValue] =
    Option(self.instanceInitiatedShutdownBehavior)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[AttributeValue] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kernelIdAsScala: Option[AttributeValue] = Option(self.kernelId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productCodesAsScala: Option[Seq[ProductCode]] = Option(self.productCodes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ramdiskIdAsScala: Option[AttributeValue] = Option(self.ramdiskId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rootDeviceNameAsScala: Option[AttributeValue] = Option(self.rootDeviceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceDestCheckAsScala: Option[AttributeBooleanValue] = Option(self.sourceDestCheck)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sriovNetSupportAsScala: Option[AttributeValue] = Option(self.sriovNetSupport)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userDataAsScala: Option[AttributeValue] = Option(self.userData)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeInstanceAttributeResponseOps {

  implicit def toDescribeInstanceAttributeResponseBuilderOps(
      v: DescribeInstanceAttributeResponse.Builder
  ): DescribeInstanceAttributeResponseBuilderOps = new DescribeInstanceAttributeResponseBuilderOps(v)

  implicit def toDescribeInstanceAttributeResponseOps(
      v: DescribeInstanceAttributeResponse
  ): DescribeInstanceAttributeResponseOps = new DescribeInstanceAttributeResponseOps(v)

}
