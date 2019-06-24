// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class SSESpecificationBuilderOps(val self: SSESpecification.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala(value: Option[Boolean]): SSESpecification.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseTypeAsScala(value: Option[SSEType]): SSESpecification.Builder = {
    value.fold(self) { v =>
      self.sseType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsMasterKeyIdAsScala(value: Option[String]): SSESpecification.Builder = {
    value.fold(self) { v =>
      self.kmsMasterKeyId(v)
    }
  }

}

final class SSESpecificationOps(val self: SSESpecification) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseTypeAsScala: Option[SSEType] = Option(self.sseType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsMasterKeyIdAsScala: Option[String] = Option(self.kmsMasterKeyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSSESpecificationOps {

  implicit def toSSESpecificationBuilderOps(v: SSESpecification.Builder): SSESpecificationBuilderOps =
    new SSESpecificationBuilderOps(v)

  implicit def toSSESpecificationOps(v: SSESpecification): SSESpecificationOps = new SSESpecificationOps(v)

}
