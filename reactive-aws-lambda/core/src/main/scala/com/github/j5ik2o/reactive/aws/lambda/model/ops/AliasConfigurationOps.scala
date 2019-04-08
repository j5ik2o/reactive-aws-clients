// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class AliasConfigurationBuilderOps(val self: AliasConfiguration.Builder) extends AnyVal {

  final def aliasArnAsScala(value: Option[String]): AliasConfiguration.Builder = {
    value.fold(self) { v =>
      self.aliasArn(v)
    }
  }

  final def nameAsScala(value: Option[String]): AliasConfiguration.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def functionVersionAsScala(value: Option[String]): AliasConfiguration.Builder = {
    value.fold(self) { v =>
      self.functionVersion(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): AliasConfiguration.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def routingConfigAsScala(value: Option[AliasRoutingConfiguration]): AliasConfiguration.Builder = {
    value.fold(self) { v =>
      self.routingConfig(v)
    }
  }

  final def revisionIdAsScala(value: Option[String]): AliasConfiguration.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  }

}

final class AliasConfigurationOps(val self: AliasConfiguration) extends AnyVal {

  final def aliasArnAsScala: Option[String] = Option(self.aliasArn)

  final def nameAsScala: Option[String] = Option(self.name)

  final def functionVersionAsScala: Option[String] = Option(self.functionVersion)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def routingConfigAsScala: Option[AliasRoutingConfiguration] = Option(self.routingConfig)

  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAliasConfigurationOps {

  implicit def toAliasConfigurationBuilderOps(v: AliasConfiguration.Builder): AliasConfigurationBuilderOps =
    new AliasConfigurationBuilderOps(v)

  implicit def toAliasConfigurationOps(v: AliasConfiguration): AliasConfigurationOps = new AliasConfigurationOps(v)

}
