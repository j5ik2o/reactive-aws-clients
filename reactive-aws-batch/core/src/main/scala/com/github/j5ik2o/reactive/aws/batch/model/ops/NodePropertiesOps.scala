// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class NodePropertiesBuilderOps(val self: NodeProperties.Builder) extends AnyVal {

  final def numNodesAsScala(value: Option[Int]): NodeProperties.Builder = {
    value.fold(self) { v =>
      self.numNodes(v)
    }
  } // Int

  final def mainNodeAsScala(value: Option[Int]): NodeProperties.Builder = {
    value.fold(self) { v =>
      self.mainNode(v)
    }
  } // Int

  final def nodeRangePropertiesAsScala(value: Option[Seq[NodeRangeProperty]]): NodeProperties.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.nodeRangeProperties(v.asJava)
    } // Seq[NodeRangeProperty]
  }

}

final class NodePropertiesOps(val self: NodeProperties) extends AnyVal {

  final def numNodesAsScala: Option[Int] = Option(self.numNodes) // Int

  final def mainNodeAsScala: Option[Int] = Option(self.mainNode) // Int

  final def nodeRangePropertiesAsScala: Option[Seq[NodeRangeProperty]] = Option(self.nodeRangeProperties).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[NodeRangeProperty]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodePropertiesOps {

  implicit def toNodePropertiesBuilderOps(v: NodeProperties.Builder): NodePropertiesBuilderOps =
    new NodePropertiesBuilderOps(v)

  implicit def toNodePropertiesOps(v: NodeProperties): NodePropertiesOps = new NodePropertiesOps(v)

}
