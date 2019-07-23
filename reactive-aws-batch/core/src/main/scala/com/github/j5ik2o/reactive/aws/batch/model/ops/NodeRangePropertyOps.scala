// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class NodeRangePropertyBuilderOps(val self: NodeRangeProperty.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetNodesAsScala(value: Option[String]): NodeRangeProperty.Builder = {
    value.fold(self) { v =>
      self.targetNodes(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerAsScala(value: Option[ContainerProperties]): NodeRangeProperty.Builder = {
    value.fold(self) { v =>
      self.container(v)
    }
  }

}

final class NodeRangePropertyOps(val self: NodeRangeProperty) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetNodesAsScala: Option[String] = Option(self.targetNodes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerAsScala: Option[ContainerProperties] = Option(self.container)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodeRangePropertyOps {

  implicit def toNodeRangePropertyBuilderOps(v: NodeRangeProperty.Builder): NodeRangePropertyBuilderOps =
    new NodeRangePropertyBuilderOps(v)

  implicit def toNodeRangePropertyOps(v: NodeRangeProperty): NodeRangePropertyOps = new NodeRangePropertyOps(v)

}
