// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceTypeInfoBuilderOps(val self: InstanceTypeInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[InstanceType]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentGenerationAsScala(value: Option[Boolean]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.currentGeneration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def freeTierEligibleAsScala(value: Option[Boolean]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.freeTierEligible(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def supportedUsageClassesAsScala(value: Option[Seq[UsageClassType]]): InstanceTypeInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.supportedUsageClasses(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def supportedRootDevicesAsScala(value: Option[Seq[RootDeviceType]]): InstanceTypeInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.supportedRootDevices(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bareMetalAsScala(value: Option[Boolean]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.bareMetal(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hypervisorAsScala(value: Option[InstanceTypeHypervisor]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.hypervisor(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def processorInfoAsScala(value: Option[ProcessorInfo]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.processorInfo(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vCpuInfoAsScala(value: Option[VCpuInfo]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.vCpuInfo(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryInfoAsScala(value: Option[MemoryInfo]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.memoryInfo(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceStorageSupportedAsScala(value: Option[Boolean]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.instanceStorageSupported(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceStorageInfoAsScala(value: Option[InstanceStorageInfo]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.instanceStorageInfo(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsInfoAsScala(value: Option[EbsInfo]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.ebsInfo(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInfoAsScala(value: Option[NetworkInfo]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.networkInfo(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def gpuInfoAsScala(value: Option[GpuInfo]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.gpuInfo(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaInfoAsScala(value: Option[FpgaInfo]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.fpgaInfo(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementGroupInfoAsScala(value: Option[PlacementGroupInfo]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.placementGroupInfo(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inferenceAcceleratorInfoAsScala(value: Option[InferenceAcceleratorInfo]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.inferenceAcceleratorInfo(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hibernationSupportedAsScala(value: Option[Boolean]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.hibernationSupported(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def burstablePerformanceSupportedAsScala(value: Option[Boolean]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.burstablePerformanceSupported(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dedicatedHostsSupportedAsScala(value: Option[Boolean]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.dedicatedHostsSupported(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoRecoverySupportedAsScala(value: Option[Boolean]): InstanceTypeInfo.Builder = {
    value.fold(self) { v =>
      self.autoRecoverySupported(v)
    }
  }

}

final class InstanceTypeInfoOps(val self: InstanceTypeInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentGenerationAsScala: Option[Boolean] = Option(self.currentGeneration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def freeTierEligibleAsScala: Option[Boolean] = Option(self.freeTierEligible)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def supportedUsageClassesAsScala: Option[Seq[UsageClassType]] = Option(self.supportedUsageClasses).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def supportedRootDevicesAsScala: Option[Seq[RootDeviceType]] = Option(self.supportedRootDevices).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bareMetalAsScala: Option[Boolean] = Option(self.bareMetal)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hypervisorAsScala: Option[InstanceTypeHypervisor] = Option(self.hypervisor)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def processorInfoAsScala: Option[ProcessorInfo] = Option(self.processorInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vCpuInfoAsScala: Option[VCpuInfo] = Option(self.vCpuInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryInfoAsScala: Option[MemoryInfo] = Option(self.memoryInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceStorageSupportedAsScala: Option[Boolean] = Option(self.instanceStorageSupported)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceStorageInfoAsScala: Option[InstanceStorageInfo] = Option(self.instanceStorageInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsInfoAsScala: Option[EbsInfo] = Option(self.ebsInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInfoAsScala: Option[NetworkInfo] = Option(self.networkInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def gpuInfoAsScala: Option[GpuInfo] = Option(self.gpuInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaInfoAsScala: Option[FpgaInfo] = Option(self.fpgaInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementGroupInfoAsScala: Option[PlacementGroupInfo] = Option(self.placementGroupInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inferenceAcceleratorInfoAsScala: Option[InferenceAcceleratorInfo] = Option(self.inferenceAcceleratorInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hibernationSupportedAsScala: Option[Boolean] = Option(self.hibernationSupported)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def burstablePerformanceSupportedAsScala: Option[Boolean] = Option(self.burstablePerformanceSupported)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dedicatedHostsSupportedAsScala: Option[Boolean] = Option(self.dedicatedHostsSupported)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoRecoverySupportedAsScala: Option[Boolean] = Option(self.autoRecoverySupported)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceTypeInfoOps {

  implicit def toInstanceTypeInfoBuilderOps(v: InstanceTypeInfo.Builder): InstanceTypeInfoBuilderOps =
    new InstanceTypeInfoBuilderOps(v)

  implicit def toInstanceTypeInfoOps(v: InstanceTypeInfo): InstanceTypeInfoOps = new InstanceTypeInfoOps(v)

}
