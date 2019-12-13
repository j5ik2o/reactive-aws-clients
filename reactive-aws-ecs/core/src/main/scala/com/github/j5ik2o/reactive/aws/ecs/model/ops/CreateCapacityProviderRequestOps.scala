// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class CreateCapacityProviderRequestBuilderOps(val self: CreateCapacityProviderRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): CreateCapacityProviderRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoScalingGroupProviderAsScala(
      value: Option[AutoScalingGroupProvider]
  ): CreateCapacityProviderRequest.Builder = {
    value.fold(self) { v =>
      self.autoScalingGroupProvider(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): CreateCapacityProviderRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class CreateCapacityProviderRequestOps(val self: CreateCapacityProviderRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoScalingGroupProviderAsScala: Option[AutoScalingGroupProvider] = Option(self.autoScalingGroupProvider)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateCapacityProviderRequestOps {

  implicit def toCreateCapacityProviderRequestBuilderOps(
      v: CreateCapacityProviderRequest.Builder
  ): CreateCapacityProviderRequestBuilderOps = new CreateCapacityProviderRequestBuilderOps(v)

  implicit def toCreateCapacityProviderRequestOps(v: CreateCapacityProviderRequest): CreateCapacityProviderRequestOps =
    new CreateCapacityProviderRequestOps(v)

}
