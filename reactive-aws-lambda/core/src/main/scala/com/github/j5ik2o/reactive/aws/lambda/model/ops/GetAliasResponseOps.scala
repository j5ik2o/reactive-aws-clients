// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetAliasResponseBuilderOps(val self: GetAliasResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def aliasArnAsScala(value: Option[String]): GetAliasResponse.Builder = {
    value.fold(self) { v =>
      self.aliasArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): GetAliasResponse.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionVersionAsScala(value: Option[String]): GetAliasResponse.Builder = {
    value.fold(self) { v =>
      self.functionVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): GetAliasResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routingConfigAsScala(value: Option[AliasRoutingConfiguration]): GetAliasResponse.Builder = {
    value.fold(self) { v =>
      self.routingConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala(value: Option[String]): GetAliasResponse.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  }

}

final class GetAliasResponseOps(val self: GetAliasResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def aliasArnAsScala: Option[String] = Option(self.aliasArn)

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
trait ToGetAliasResponseOps {

  implicit def toGetAliasResponseBuilderOps(v: GetAliasResponse.Builder): GetAliasResponseBuilderOps =
    new GetAliasResponseBuilderOps(v)

  implicit def toGetAliasResponseOps(v: GetAliasResponse): GetAliasResponseOps = new GetAliasResponseOps(v)

}
