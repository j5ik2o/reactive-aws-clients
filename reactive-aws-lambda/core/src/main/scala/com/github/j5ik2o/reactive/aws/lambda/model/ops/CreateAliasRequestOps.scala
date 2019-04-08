// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class CreateAliasRequestBuilderOps(val self: CreateAliasRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): CreateAliasRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  final def nameAsScala(value: Option[String]): CreateAliasRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def functionVersionAsScala(value: Option[String]): CreateAliasRequest.Builder = {
    value.fold(self) { v =>
      self.functionVersion(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): CreateAliasRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def routingConfigAsScala(value: Option[AliasRoutingConfiguration]): CreateAliasRequest.Builder = {
    value.fold(self) { v =>
      self.routingConfig(v)
    }
  }

}

final class CreateAliasRequestOps(val self: CreateAliasRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName)

  final def nameAsScala: Option[String] = Option(self.name)

  final def functionVersionAsScala: Option[String] = Option(self.functionVersion)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def routingConfigAsScala: Option[AliasRoutingConfiguration] = Option(self.routingConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateAliasRequestOps {

  implicit def toCreateAliasRequestBuilderOps(v: CreateAliasRequest.Builder): CreateAliasRequestBuilderOps =
    new CreateAliasRequestBuilderOps(v)

  implicit def toCreateAliasRequestOps(v: CreateAliasRequest): CreateAliasRequestOps = new CreateAliasRequestOps(v)

}
