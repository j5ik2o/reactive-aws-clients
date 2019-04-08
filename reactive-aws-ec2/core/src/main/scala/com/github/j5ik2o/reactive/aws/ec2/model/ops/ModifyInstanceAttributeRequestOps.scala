// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyInstanceAttributeRequestBuilderOps(val self: ModifyInstanceAttributeRequest.Builder) extends AnyVal {

  final def sourceDestCheckAsScala(value: Option[AttributeBooleanValue]): ModifyInstanceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.sourceDestCheck(v)
    }
  }

  final def attributeAsScala(value: Option[InstanceAttributeName]): ModifyInstanceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.attribute(v)
    }
  }

  final def blockDeviceMappingsAsScala(
      value: Option[Seq[InstanceBlockDeviceMappingSpecification]]
  ): ModifyInstanceAttributeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.blockDeviceMappings(v.asJava)
    }
  }

  final def disableApiTerminationAsScala(
      value: Option[AttributeBooleanValue]
  ): ModifyInstanceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.disableApiTermination(v)
    }
  }

  final def ebsOptimizedAsScala(value: Option[AttributeBooleanValue]): ModifyInstanceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.ebsOptimized(v)
    }
  }

  final def enaSupportAsScala(value: Option[AttributeBooleanValue]): ModifyInstanceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.enaSupport(v)
    }
  }

  final def groupsAsScala(value: Option[Seq[String]]): ModifyInstanceAttributeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.groups(v.asJava)
    }
  }

  final def instanceIdAsScala(value: Option[String]): ModifyInstanceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def instanceInitiatedShutdownBehaviorAsScala(
      value: Option[AttributeValue]
  ): ModifyInstanceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.instanceInitiatedShutdownBehavior(v)
    }
  }

  final def instanceTypeAsScala(value: Option[AttributeValue]): ModifyInstanceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def kernelAsScala(value: Option[AttributeValue]): ModifyInstanceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.kernel(v)
    }
  }

  final def ramdiskAsScala(value: Option[AttributeValue]): ModifyInstanceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.ramdisk(v)
    }
  }

  final def sriovNetSupportAsScala(value: Option[AttributeValue]): ModifyInstanceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.sriovNetSupport(v)
    }
  }

  final def userDataAsScala(value: Option[BlobAttributeValue]): ModifyInstanceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.userData(v)
    }
  }

  final def valueAsScala(value: Option[String]): ModifyInstanceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class ModifyInstanceAttributeRequestOps(val self: ModifyInstanceAttributeRequest) extends AnyVal {

  final def sourceDestCheckAsScala: Option[AttributeBooleanValue] = Option(self.sourceDestCheck)

  final def attributeAsScala: Option[InstanceAttributeName] = Option(self.attribute)

  final def blockDeviceMappingsAsScala: Option[Seq[InstanceBlockDeviceMappingSpecification]] =
    Option(self.blockDeviceMappings).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def disableApiTerminationAsScala: Option[AttributeBooleanValue] = Option(self.disableApiTermination)

  final def ebsOptimizedAsScala: Option[AttributeBooleanValue] = Option(self.ebsOptimized)

  final def enaSupportAsScala: Option[AttributeBooleanValue] = Option(self.enaSupport)

  final def groupsAsScala: Option[Seq[String]] = Option(self.groups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def instanceInitiatedShutdownBehaviorAsScala: Option[AttributeValue] =
    Option(self.instanceInitiatedShutdownBehavior)

  final def instanceTypeAsScala: Option[AttributeValue] = Option(self.instanceType)

  final def kernelAsScala: Option[AttributeValue] = Option(self.kernel)

  final def ramdiskAsScala: Option[AttributeValue] = Option(self.ramdisk)

  final def sriovNetSupportAsScala: Option[AttributeValue] = Option(self.sriovNetSupport)

  final def userDataAsScala: Option[BlobAttributeValue] = Option(self.userData)

  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyInstanceAttributeRequestOps {

  implicit def toModifyInstanceAttributeRequestBuilderOps(
      v: ModifyInstanceAttributeRequest.Builder
  ): ModifyInstanceAttributeRequestBuilderOps = new ModifyInstanceAttributeRequestBuilderOps(v)

  implicit def toModifyInstanceAttributeRequestOps(
      v: ModifyInstanceAttributeRequest
  ): ModifyInstanceAttributeRequestOps = new ModifyInstanceAttributeRequestOps(v)

}
