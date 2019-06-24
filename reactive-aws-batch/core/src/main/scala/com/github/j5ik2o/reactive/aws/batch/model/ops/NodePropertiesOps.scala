// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class NodePropertiesBuilderOps(val self: NodeProperties.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def numNodesAsScala(value: Option[Int]): NodeProperties.Builder = {
    value.fold(self) { v =>
      self.numNodes(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mainNodeAsScala(value: Option[Int]): NodeProperties.Builder = {
    value.fold(self) { v =>
      self.mainNode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeRangePropertiesAsScala(value: Option[Seq[NodeRangeProperty]]): NodeProperties.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.nodeRangeProperties(v.asJava)
    }
  }

}

final class NodePropertiesOps(val self: NodeProperties) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def numNodesAsScala: Option[Int] = Option(self.numNodes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mainNodeAsScala: Option[Int] = Option(self.mainNode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeRangePropertiesAsScala: Option[Seq[NodeRangeProperty]] = Option(self.nodeRangeProperties).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodePropertiesOps {

  implicit def toNodePropertiesBuilderOps(v: NodeProperties.Builder): NodePropertiesBuilderOps =
    new NodePropertiesBuilderOps(v)

  implicit def toNodePropertiesOps(v: NodeProperties): NodePropertiesOps = new NodePropertiesOps(v)

}
