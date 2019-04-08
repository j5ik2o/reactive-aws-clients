// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class NodeTypeSpecificValueBuilderOps(val self: NodeTypeSpecificValue.Builder) extends AnyVal {

  final def nodeTypeAsScala(value: Option[String]): NodeTypeSpecificValue.Builder = {
    value.fold(self) { v =>
      self.nodeType(v)
    }
  }

  final def valueAsScala(value: Option[String]): NodeTypeSpecificValue.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class NodeTypeSpecificValueOps(val self: NodeTypeSpecificValue) extends AnyVal {

  final def nodeTypeAsScala: Option[String] = Option(self.nodeType)

  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodeTypeSpecificValueOps {

  implicit def toNodeTypeSpecificValueBuilderOps(v: NodeTypeSpecificValue.Builder): NodeTypeSpecificValueBuilderOps =
    new NodeTypeSpecificValueBuilderOps(v)

  implicit def toNodeTypeSpecificValueOps(v: NodeTypeSpecificValue): NodeTypeSpecificValueOps =
    new NodeTypeSpecificValueOps(v)

}
