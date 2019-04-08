// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class NodeRangePropertyBuilderOps(val self: NodeRangeProperty.Builder) extends AnyVal {

  final def targetNodesAsScala(value: Option[String]): NodeRangeProperty.Builder = {
    value.fold(self) { v =>
      self.targetNodes(v)
    }
  } // String

  final def containerAsScala(value: Option[ContainerProperties]): NodeRangeProperty.Builder = {
    value.fold(self) { v =>
      self.container(v)
    }
  } // ContainerProperties

}

final class NodeRangePropertyOps(val self: NodeRangeProperty) extends AnyVal {

  final def targetNodesAsScala: Option[String] = Option(self.targetNodes) // String

  final def containerAsScala: Option[ContainerProperties] = Option(self.container) // ContainerProperties

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodeRangePropertyOps {

  implicit def toNodeRangePropertyBuilderOps(v: NodeRangeProperty.Builder): NodeRangePropertyBuilderOps =
    new NodeRangePropertyBuilderOps(v)

  implicit def toNodeRangePropertyOps(v: NodeRangeProperty): NodeRangePropertyOps = new NodeRangePropertyOps(v)

}
