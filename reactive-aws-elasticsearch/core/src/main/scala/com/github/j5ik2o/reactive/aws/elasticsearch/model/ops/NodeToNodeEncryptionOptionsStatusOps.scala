// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class NodeToNodeEncryptionOptionsStatusBuilderOps(val self: NodeToNodeEncryptionOptionsStatus.Builder)
    extends AnyVal {

  final def optionsAsScala(value: Option[NodeToNodeEncryptionOptions]): NodeToNodeEncryptionOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  } // NodeToNodeEncryptionOptions

  final def statusAsScala(value: Option[OptionStatus]): NodeToNodeEncryptionOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // OptionStatus

}

final class NodeToNodeEncryptionOptionsStatusOps(val self: NodeToNodeEncryptionOptionsStatus) extends AnyVal {

  final def optionsAsScala: Option[NodeToNodeEncryptionOptions] = Option(self.options) // NodeToNodeEncryptionOptions

  final def statusAsScala: Option[OptionStatus] = Option(self.status) // OptionStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodeToNodeEncryptionOptionsStatusOps {

  implicit def toNodeToNodeEncryptionOptionsStatusBuilderOps(
      v: NodeToNodeEncryptionOptionsStatus.Builder
  ): NodeToNodeEncryptionOptionsStatusBuilderOps = new NodeToNodeEncryptionOptionsStatusBuilderOps(v)

  implicit def toNodeToNodeEncryptionOptionsStatusOps(
      v: NodeToNodeEncryptionOptionsStatus
  ): NodeToNodeEncryptionOptionsStatusOps = new NodeToNodeEncryptionOptionsStatusOps(v)

}
