// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class CapacityProviderBuilderOps(val self: CapacityProvider.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProviderArnAsScala(value: Option[String]): CapacityProvider.Builder = {
    value.fold(self) { v =>
      self.capacityProviderArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): CapacityProvider.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[CapacityProviderStatus]): CapacityProvider.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoScalingGroupProviderAsScala(value: Option[AutoScalingGroupProvider]): CapacityProvider.Builder = {
    value.fold(self) { v =>
      self.autoScalingGroupProvider(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): CapacityProvider.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class CapacityProviderOps(val self: CapacityProvider) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProviderArnAsScala: Option[String] = Option(self.capacityProviderArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[CapacityProviderStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoScalingGroupProviderAsScala: Option[AutoScalingGroupProvider] = Option(self.autoScalingGroupProvider)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCapacityProviderOps {

  implicit def toCapacityProviderBuilderOps(v: CapacityProvider.Builder): CapacityProviderBuilderOps =
    new CapacityProviderBuilderOps(v)

  implicit def toCapacityProviderOps(v: CapacityProvider): CapacityProviderOps = new CapacityProviderOps(v)

}
