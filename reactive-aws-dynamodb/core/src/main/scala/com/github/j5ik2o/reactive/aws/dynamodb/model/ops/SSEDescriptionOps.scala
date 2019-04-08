// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class SSEDescriptionBuilderOps(val self: SSEDescription.Builder) extends AnyVal {

  final def statusAsScala(value: Option[SSEStatus]): SSEDescription.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def sseTypeAsScala(value: Option[SSEType]): SSEDescription.Builder = {
    value.fold(self) { v =>
      self.sseType(v)
    }
  }

  final def kmsMasterKeyArnAsScala(value: Option[String]): SSEDescription.Builder = {
    value.fold(self) { v =>
      self.kmsMasterKeyArn(v)
    }
  }

}

final class SSEDescriptionOps(val self: SSEDescription) extends AnyVal {

  final def statusAsScala: Option[SSEStatus] = Option(self.status)

  final def sseTypeAsScala: Option[SSEType] = Option(self.sseType)

  final def kmsMasterKeyArnAsScala: Option[String] = Option(self.kmsMasterKeyArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSSEDescriptionOps {

  implicit def toSSEDescriptionBuilderOps(v: SSEDescription.Builder): SSEDescriptionBuilderOps =
    new SSEDescriptionBuilderOps(v)

  implicit def toSSEDescriptionOps(v: SSEDescription): SSEDescriptionOps = new SSEDescriptionOps(v)

}
