// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class NodePropertyOverrideBuilderOps(val self: NodePropertyOverride.Builder) extends AnyVal {

  final def targetNodesAsScala(value: Option[String]): NodePropertyOverride.Builder = {
    value.fold(self) { v =>
      self.targetNodes(v)
    }
  } // String

  final def containerOverridesAsScala(value: Option[ContainerOverrides]): NodePropertyOverride.Builder = {
    value.fold(self) { v =>
      self.containerOverrides(v)
    }
  } // ContainerOverrides

}

final class NodePropertyOverrideOps(val self: NodePropertyOverride) extends AnyVal {

  final def targetNodesAsScala: Option[String] = Option(self.targetNodes) // String

  final def containerOverridesAsScala: Option[ContainerOverrides] =
    Option(self.containerOverrides) // ContainerOverrides

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodePropertyOverrideOps {

  implicit def toNodePropertyOverrideBuilderOps(v: NodePropertyOverride.Builder): NodePropertyOverrideBuilderOps =
    new NodePropertyOverrideBuilderOps(v)

  implicit def toNodePropertyOverrideOps(v: NodePropertyOverride): NodePropertyOverrideOps =
    new NodePropertyOverrideOps(v)

}
