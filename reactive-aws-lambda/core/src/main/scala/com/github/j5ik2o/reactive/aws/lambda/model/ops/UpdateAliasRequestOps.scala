// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UpdateAliasRequestBuilderOps(val self: UpdateAliasRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): UpdateAliasRequest.Builder = {
    value.fold(self) { v => self.functionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): UpdateAliasRequest.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionVersionAsScala(value: Option[String]): UpdateAliasRequest.Builder = {
    value.fold(self) { v => self.functionVersion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): UpdateAliasRequest.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routingConfigAsScala(value: Option[AliasRoutingConfiguration]): UpdateAliasRequest.Builder = {
    value.fold(self) { v => self.routingConfig(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala(value: Option[String]): UpdateAliasRequest.Builder = {
    value.fold(self) { v => self.revisionId(v) }
  }

}

final class UpdateAliasRequestOps(val self: UpdateAliasRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionVersionAsScala: Option[String] = Option(self.functionVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routingConfigAsScala: Option[AliasRoutingConfiguration] = Option(self.routingConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateAliasRequestOps {

  implicit def toUpdateAliasRequestBuilderOps(v: UpdateAliasRequest.Builder): UpdateAliasRequestBuilderOps =
    new UpdateAliasRequestBuilderOps(v)

  implicit def toUpdateAliasRequestOps(v: UpdateAliasRequest): UpdateAliasRequestOps = new UpdateAliasRequestOps(v)

}
