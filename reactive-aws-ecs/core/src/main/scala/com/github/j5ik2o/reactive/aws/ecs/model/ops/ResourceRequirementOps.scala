// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ResourceRequirementBuilderOps(val self: ResourceRequirement.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): ResourceRequirement.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[ResourceType]): ResourceRequirement.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

}

final class ResourceRequirementOps(val self: ResourceRequirement) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[ResourceType] = Option(self.`type`)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResourceRequirementOps {

  implicit def toResourceRequirementBuilderOps(v: ResourceRequirement.Builder): ResourceRequirementBuilderOps =
    new ResourceRequirementBuilderOps(v)

  implicit def toResourceRequirementOps(v: ResourceRequirement): ResourceRequirementOps = new ResourceRequirementOps(v)

}
