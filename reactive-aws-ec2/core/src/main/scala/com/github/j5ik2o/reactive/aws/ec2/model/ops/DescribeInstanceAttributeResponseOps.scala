// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeInstanceAttributeResponseBuilderOps(val self: DescribeInstanceAttributeResponse.Builder)
    extends AnyVal {

  final def groupsAsScala(value: Option[Seq[GroupIdentifier]]): DescribeInstanceAttributeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.groups(v.asJava)
    }
  }

  final def blockDeviceMappingsAsScala(
      value: Option[Seq[InstanceBlockDeviceMapping]]
  ): DescribeInstanceAttributeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.blockDeviceMappings(v.asJava)
    }
  }

  final def disableApiTerminationAsScala(
      value: Option[AttributeBooleanValue]
  ): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.disableApiTermination(v)
    }
  }

  final def enaSupportAsScala(value: Option[AttributeBooleanValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.enaSupport(v)
    }
  }

  final def ebsOptimizedAsScala(value: Option[AttributeBooleanValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.ebsOptimized(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def instanceInitiatedShutdownBehaviorAsScala(
      value: Option[AttributeValue]
  ): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.instanceInitiatedShutdownBehavior(v)
    }
  }

  final def instanceTypeAsScala(value: Option[AttributeValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def kernelIdAsScala(value: Option[AttributeValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.kernelId(v)
    }
  }

  final def productCodesAsScala(value: Option[Seq[ProductCode]]): DescribeInstanceAttributeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.productCodes(v.asJava)
    }
  }

  final def ramdiskIdAsScala(value: Option[AttributeValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.ramdiskId(v)
    }
  }

  final def rootDeviceNameAsScala(value: Option[AttributeValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.rootDeviceName(v)
    }
  }

  final def sourceDestCheckAsScala(value: Option[AttributeBooleanValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.sourceDestCheck(v)
    }
  }

  final def sriovNetSupportAsScala(value: Option[AttributeValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.sriovNetSupport(v)
    }
  }

  final def userDataAsScala(value: Option[AttributeValue]): DescribeInstanceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.userData(v)
    }
  }

}

final class DescribeInstanceAttributeResponseOps(val self: DescribeInstanceAttributeResponse) extends AnyVal {

  final def groupsAsScala: Option[Seq[GroupIdentifier]] = Option(self.groups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def blockDeviceMappingsAsScala: Option[Seq[InstanceBlockDeviceMapping]] = Option(self.blockDeviceMappings).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

  final def disableApiTerminationAsScala: Option[AttributeBooleanValue] = Option(self.disableApiTermination)

  final def enaSupportAsScala: Option[AttributeBooleanValue] = Option(self.enaSupport)

  final def ebsOptimizedAsScala: Option[AttributeBooleanValue] = Option(self.ebsOptimized)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def instanceInitiatedShutdownBehaviorAsScala: Option[AttributeValue] =
    Option(self.instanceInitiatedShutdownBehavior)

  final def instanceTypeAsScala: Option[AttributeValue] = Option(self.instanceType)

  final def kernelIdAsScala: Option[AttributeValue] = Option(self.kernelId)

  final def productCodesAsScala: Option[Seq[ProductCode]] = Option(self.productCodes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def ramdiskIdAsScala: Option[AttributeValue] = Option(self.ramdiskId)

  final def rootDeviceNameAsScala: Option[AttributeValue] = Option(self.rootDeviceName)

  final def sourceDestCheckAsScala: Option[AttributeBooleanValue] = Option(self.sourceDestCheck)

  final def sriovNetSupportAsScala: Option[AttributeValue] = Option(self.sriovNetSupport)

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
