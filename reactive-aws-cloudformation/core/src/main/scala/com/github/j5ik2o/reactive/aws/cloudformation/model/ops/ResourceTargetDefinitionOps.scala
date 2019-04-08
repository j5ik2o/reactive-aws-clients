// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ResourceTargetDefinitionBuilderOps(val self: ResourceTargetDefinition.Builder) extends AnyVal {

  final def attributeAsScala(value: Option[ResourceAttribute]): ResourceTargetDefinition.Builder = {
    value.fold(self) { v =>
      self.attribute(v)
    }
  }

  final def nameAsScala(value: Option[String]): ResourceTargetDefinition.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def requiresRecreationAsScala(value: Option[RequiresRecreation]): ResourceTargetDefinition.Builder = {
    value.fold(self) { v =>
      self.requiresRecreation(v)
    }
  }

}

final class ResourceTargetDefinitionOps(val self: ResourceTargetDefinition) extends AnyVal {

  final def attributeAsScala: Option[ResourceAttribute] = Option(self.attribute)

  final def nameAsScala: Option[String] = Option(self.name)

  final def requiresRecreationAsScala: Option[RequiresRecreation] = Option(self.requiresRecreation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResourceTargetDefinitionOps {

  implicit def toResourceTargetDefinitionBuilderOps(
      v: ResourceTargetDefinition.Builder
  ): ResourceTargetDefinitionBuilderOps = new ResourceTargetDefinitionBuilderOps(v)

  implicit def toResourceTargetDefinitionOps(v: ResourceTargetDefinition): ResourceTargetDefinitionOps =
    new ResourceTargetDefinitionOps(v)

}
