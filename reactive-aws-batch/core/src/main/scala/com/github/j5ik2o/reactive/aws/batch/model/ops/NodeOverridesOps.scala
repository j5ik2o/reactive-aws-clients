// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class NodeOverridesBuilderOps(val self: NodeOverrides.Builder) extends AnyVal {

  final def nodePropertyOverridesAsScala(value: Option[Seq[NodePropertyOverride]]): NodeOverrides.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.nodePropertyOverrides(v.asJava)
    }
  }

}

final class NodeOverridesOps(val self: NodeOverrides) extends AnyVal {

  final def nodePropertyOverridesAsScala: Option[Seq[NodePropertyOverride]] = Option(self.nodePropertyOverrides).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodeOverridesOps {

  implicit def toNodeOverridesBuilderOps(v: NodeOverrides.Builder): NodeOverridesBuilderOps =
    new NodeOverridesBuilderOps(v)

  implicit def toNodeOverridesOps(v: NodeOverrides): NodeOverridesOps = new NodeOverridesOps(v)

}
