// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateGraphqlApiRequestBuilderOps(val self: UpdateGraphqlApiRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): UpdateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  final def nameAsScala(value: Option[String]): UpdateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def logConfigAsScala(value: Option[LogConfig]): UpdateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.logConfig(v)
    }
  }

  final def authenticationTypeAsScala(value: Option[AuthenticationType]): UpdateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.authenticationType(v)
    }
  }

  final def userPoolConfigAsScala(value: Option[UserPoolConfig]): UpdateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.userPoolConfig(v)
    }
  }

  final def openIDConnectConfigAsScala(value: Option[OpenIDConnectConfig]): UpdateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.openIDConnectConfig(v)
    }
  }

}

final class UpdateGraphqlApiRequestOps(val self: UpdateGraphqlApiRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId)

  final def nameAsScala: Option[String] = Option(self.name)

  final def logConfigAsScala: Option[LogConfig] = Option(self.logConfig)

  final def authenticationTypeAsScala: Option[AuthenticationType] = Option(self.authenticationType)

  final def userPoolConfigAsScala: Option[UserPoolConfig] = Option(self.userPoolConfig)

  final def openIDConnectConfigAsScala: Option[OpenIDConnectConfig] = Option(self.openIDConnectConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateGraphqlApiRequestOps {

  implicit def toUpdateGraphqlApiRequestBuilderOps(
      v: UpdateGraphqlApiRequest.Builder
  ): UpdateGraphqlApiRequestBuilderOps = new UpdateGraphqlApiRequestBuilderOps(v)

  implicit def toUpdateGraphqlApiRequestOps(v: UpdateGraphqlApiRequest): UpdateGraphqlApiRequestOps =
    new UpdateGraphqlApiRequestOps(v)

}
