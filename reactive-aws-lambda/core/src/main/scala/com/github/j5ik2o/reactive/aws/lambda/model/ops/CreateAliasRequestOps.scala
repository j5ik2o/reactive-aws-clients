// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class CreateAliasRequestBuilderOps(val self: CreateAliasRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): CreateAliasRequest.Builder = {
    value.fold(self) { v => self.functionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): CreateAliasRequest.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionVersionAsScala(value: Option[String]): CreateAliasRequest.Builder = {
    value.fold(self) { v => self.functionVersion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateAliasRequest.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routingConfigAsScala(value: Option[AliasRoutingConfiguration]): CreateAliasRequest.Builder = {
    value.fold(self) { v => self.routingConfig(v) }
  }

}

final class CreateAliasRequestOps(val self: CreateAliasRequest) extends AnyVal {

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

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateAliasRequestOps {

  implicit def toCreateAliasRequestBuilderOps(v: CreateAliasRequest.Builder): CreateAliasRequestBuilderOps =
    new CreateAliasRequestBuilderOps(v)

  implicit def toCreateAliasRequestOps(v: CreateAliasRequest): CreateAliasRequestOps = new CreateAliasRequestOps(v)

}
