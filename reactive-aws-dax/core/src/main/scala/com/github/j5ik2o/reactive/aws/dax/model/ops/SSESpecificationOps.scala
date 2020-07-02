// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class SSESpecificationBuilderOps(val self: SSESpecification.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala(value: Option[Boolean]): SSESpecification.Builder = {
    value.fold(self) { v => self.enabled(v) }
  }

}

final class SSESpecificationOps(val self: SSESpecification) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSSESpecificationOps {

  implicit def toSSESpecificationBuilderOps(v: SSESpecification.Builder): SSESpecificationBuilderOps =
    new SSESpecificationBuilderOps(v)

  implicit def toSSESpecificationOps(v: SSESpecification): SSESpecificationOps = new SSESpecificationOps(v)

}
