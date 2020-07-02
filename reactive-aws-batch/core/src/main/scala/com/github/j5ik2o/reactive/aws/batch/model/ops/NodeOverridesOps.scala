// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class NodeOverridesBuilderOps(val self: NodeOverrides.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def numNodesAsScala(value: Option[Int]): NodeOverrides.Builder = {
    value.fold(self) { v => self.numNodes(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodePropertyOverridesAsScala(value: Option[Seq[NodePropertyOverride]]): NodeOverrides.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.nodePropertyOverrides(v.asJava)
    }
  }

}

final class NodeOverridesOps(val self: NodeOverrides) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def numNodesAsScala: Option[Int] = Option(self.numNodes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodePropertyOverridesAsScala: Option[Seq[NodePropertyOverride]] =
    Option(self.nodePropertyOverrides).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodeOverridesOps {

  implicit def toNodeOverridesBuilderOps(v: NodeOverrides.Builder): NodeOverridesBuilderOps =
    new NodeOverridesBuilderOps(v)

  implicit def toNodeOverridesOps(v: NodeOverrides): NodeOverridesOps = new NodeOverridesOps(v)

}
