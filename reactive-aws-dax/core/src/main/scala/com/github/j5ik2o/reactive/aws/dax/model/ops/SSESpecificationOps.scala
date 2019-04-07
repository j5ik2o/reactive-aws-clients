// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class SSESpecificationBuilderOps(val self: SSESpecification.Builder) extends AnyVal {

  final def withEnabledAsScala(value: Option[Boolean]): SSESpecification.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  } // Boolean

}

final class SSESpecificationOps(val self: SSESpecification) extends AnyVal {

  final def enabledAsScala: Option[Boolean] = Option(self.enabled) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSSESpecificationOps {

  implicit def toSSESpecificationBuilderOps(v: SSESpecification.Builder): SSESpecificationBuilderOps =
    new SSESpecificationBuilderOps(v)

  implicit def toSSESpecificationOps(v: SSESpecification): SSESpecificationOps = new SSESpecificationOps(v)

}
