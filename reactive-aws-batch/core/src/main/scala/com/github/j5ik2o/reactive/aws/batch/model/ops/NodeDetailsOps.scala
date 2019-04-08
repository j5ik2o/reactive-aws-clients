// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class NodeDetailsBuilderOps(val self: NodeDetails.Builder) extends AnyVal {

  final def nodeIndexAsScala(value: Option[Int]): NodeDetails.Builder = {
    value.fold(self) { v =>
      self.nodeIndex(v)
    }
  }

  final def isMainNodeAsScala(value: Option[Boolean]): NodeDetails.Builder = {
    value.fold(self) { v =>
      self.isMainNode(v)
    }
  }

}

final class NodeDetailsOps(val self: NodeDetails) extends AnyVal {

  final def nodeIndexAsScala: Option[Int] = Option(self.nodeIndex)

  final def isMainNodeAsScala: Option[Boolean] = Option(self.isMainNode)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodeDetailsOps {

  implicit def toNodeDetailsBuilderOps(v: NodeDetails.Builder): NodeDetailsBuilderOps = new NodeDetailsBuilderOps(v)

  implicit def toNodeDetailsOps(v: NodeDetails): NodeDetailsOps = new NodeDetailsOps(v)

}
