// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UpdateAliasRequestBuilderOps(val self: UpdateAliasRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): UpdateAliasRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def nameAsScala(value: Option[String]): UpdateAliasRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def functionVersionAsScala(value: Option[String]): UpdateAliasRequest.Builder = {
    value.fold(self) { v =>
      self.functionVersion(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): UpdateAliasRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def routingConfigAsScala(value: Option[AliasRoutingConfiguration]): UpdateAliasRequest.Builder = {
    value.fold(self) { v =>
      self.routingConfig(v)
    }
  } // AliasRoutingConfiguration

  final def revisionIdAsScala(value: Option[String]): UpdateAliasRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  } // String

}

final class UpdateAliasRequestOps(val self: UpdateAliasRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def nameAsScala: Option[String] = Option(self.name) // String

  final def functionVersionAsScala: Option[String] = Option(self.functionVersion) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def routingConfigAsScala: Option[AliasRoutingConfiguration] =
    Option(self.routingConfig) // AliasRoutingConfiguration

  final def revisionIdAsScala: Option[String] = Option(self.revisionId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateAliasRequestOps {

  implicit def toUpdateAliasRequestBuilderOps(v: UpdateAliasRequest.Builder): UpdateAliasRequestBuilderOps =
    new UpdateAliasRequestBuilderOps(v)

  implicit def toUpdateAliasRequestOps(v: UpdateAliasRequest): UpdateAliasRequestOps = new UpdateAliasRequestOps(v)

}
