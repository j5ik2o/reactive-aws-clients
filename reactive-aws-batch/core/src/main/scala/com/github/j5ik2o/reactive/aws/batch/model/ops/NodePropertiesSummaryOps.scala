// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class NodePropertiesSummaryBuilderOps(val self: NodePropertiesSummary.Builder) extends AnyVal {

  final def isMainNodeAsScala(value: Option[Boolean]): NodePropertiesSummary.Builder = {
    value.fold(self) { v =>
      self.isMainNode(v)
    }
  } // Boolean

  final def numNodesAsScala(value: Option[Int]): NodePropertiesSummary.Builder = {
    value.fold(self) { v =>
      self.numNodes(v)
    }
  } // Int

  final def nodeIndexAsScala(value: Option[Int]): NodePropertiesSummary.Builder = {
    value.fold(self) { v =>
      self.nodeIndex(v)
    }
  } // Int

}

final class NodePropertiesSummaryOps(val self: NodePropertiesSummary) extends AnyVal {

  final def isMainNodeAsScala: Option[Boolean] = Option(self.isMainNode) // Boolean

  final def numNodesAsScala: Option[Int] = Option(self.numNodes) // Int

  final def nodeIndexAsScala: Option[Int] = Option(self.nodeIndex) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodePropertiesSummaryOps {

  implicit def toNodePropertiesSummaryBuilderOps(v: NodePropertiesSummary.Builder): NodePropertiesSummaryBuilderOps =
    new NodePropertiesSummaryBuilderOps(v)

  implicit def toNodePropertiesSummaryOps(v: NodePropertiesSummary): NodePropertiesSummaryOps =
    new NodePropertiesSummaryOps(v)

}
