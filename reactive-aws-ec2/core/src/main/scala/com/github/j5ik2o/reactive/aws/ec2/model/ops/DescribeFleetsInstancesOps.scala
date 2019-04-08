// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFleetsInstancesBuilderOps(val self: DescribeFleetsInstances.Builder) extends AnyVal {

  final def launchTemplateAndOverridesAsScala(
      value: Option[LaunchTemplateAndOverridesResponse]
  ): DescribeFleetsInstances.Builder = {
    value.fold(self) { v =>
      self.launchTemplateAndOverrides(v)
    }
  }

  final def lifecycleAsScala(value: Option[InstanceLifecycle]): DescribeFleetsInstances.Builder = {
    value.fold(self) { v =>
      self.lifecycle(v)
    }
  }

  final def instanceIdsAsScala(value: Option[Seq[String]]): DescribeFleetsInstances.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instanceIds(v.asJava)
    }
  }

  final def instanceTypeAsScala(value: Option[InstanceType]): DescribeFleetsInstances.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def platformAsScala(value: Option[PlatformValues]): DescribeFleetsInstances.Builder = {
    value.fold(self) { v =>
      self.platform(v)
    }
  }

}

final class DescribeFleetsInstancesOps(val self: DescribeFleetsInstances) extends AnyVal {

  final def launchTemplateAndOverridesAsScala: Option[LaunchTemplateAndOverridesResponse] =
    Option(self.launchTemplateAndOverrides)

  final def lifecycleAsScala: Option[InstanceLifecycle] = Option(self.lifecycle)

  final def instanceIdsAsScala: Option[Seq[String]] = Option(self.instanceIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  final def platformAsScala: Option[PlatformValues] = Option(self.platform)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFleetsInstancesOps {

  implicit def toDescribeFleetsInstancesBuilderOps(
      v: DescribeFleetsInstances.Builder
  ): DescribeFleetsInstancesBuilderOps = new DescribeFleetsInstancesBuilderOps(v)

  implicit def toDescribeFleetsInstancesOps(v: DescribeFleetsInstances): DescribeFleetsInstancesOps =
    new DescribeFleetsInstancesOps(v)

}
