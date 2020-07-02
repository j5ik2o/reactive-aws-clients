// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class NodePropertiesSummaryBuilderOps(val self: NodePropertiesSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isMainNodeAsScala(value: Option[Boolean]): NodePropertiesSummary.Builder = {
    value.fold(self) { v => self.isMainNode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def numNodesAsScala(value: Option[Int]): NodePropertiesSummary.Builder = {
    value.fold(self) { v => self.numNodes(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeIndexAsScala(value: Option[Int]): NodePropertiesSummary.Builder = {
    value.fold(self) { v => self.nodeIndex(v) }
  }

}

final class NodePropertiesSummaryOps(val self: NodePropertiesSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isMainNodeAsScala: Option[Boolean] = Option(self.isMainNode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def numNodesAsScala: Option[Int] = Option(self.numNodes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeIndexAsScala: Option[Int] = Option(self.nodeIndex)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodePropertiesSummaryOps {

  implicit def toNodePropertiesSummaryBuilderOps(v: NodePropertiesSummary.Builder): NodePropertiesSummaryBuilderOps =
    new NodePropertiesSummaryBuilderOps(v)

  implicit def toNodePropertiesSummaryOps(v: NodePropertiesSummary): NodePropertiesSummaryOps =
    new NodePropertiesSummaryOps(v)

}
