// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class SSEDescriptionBuilderOps(val self: SSEDescription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[SSEStatus]): SSEDescription.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class SSEDescriptionOps(val self: SSEDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[SSEStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSSEDescriptionOps {

  implicit def toSSEDescriptionBuilderOps(v: SSEDescription.Builder): SSEDescriptionBuilderOps =
    new SSEDescriptionBuilderOps(v)

  implicit def toSSEDescriptionOps(v: SSEDescription): SSEDescriptionOps = new SSEDescriptionOps(v)

}
