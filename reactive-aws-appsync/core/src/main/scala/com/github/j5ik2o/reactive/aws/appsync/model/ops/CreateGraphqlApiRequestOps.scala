// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateGraphqlApiRequestBuilderOps(val self: CreateGraphqlApiRequest.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): CreateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def logConfigAsScala(value: Option[LogConfig]): CreateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.logConfig(v)
    }
  } // LogConfig

  final def authenticationTypeAsScala(value: Option[AuthenticationType]): CreateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.authenticationType(v)
    }
  } // String

  final def userPoolConfigAsScala(value: Option[UserPoolConfig]): CreateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.userPoolConfig(v)
    }
  } // UserPoolConfig

  final def openIDConnectConfigAsScala(value: Option[OpenIDConnectConfig]): CreateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.openIDConnectConfig(v)
    }
  } // OpenIDConnectConfig

}

final class CreateGraphqlApiRequestOps(val self: CreateGraphqlApiRequest) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name) // String

  final def logConfigAsScala: Option[LogConfig] = Option(self.logConfig) // LogConfig

  final def authenticationTypeAsScala: Option[AuthenticationType] = Option(self.authenticationType) // String

  final def userPoolConfigAsScala: Option[UserPoolConfig] = Option(self.userPoolConfig) // UserPoolConfig

  final def openIDConnectConfigAsScala: Option[OpenIDConnectConfig] =
    Option(self.openIDConnectConfig) // OpenIDConnectConfig

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateGraphqlApiRequestOps {

  implicit def toCreateGraphqlApiRequestBuilderOps(
      v: CreateGraphqlApiRequest.Builder
  ): CreateGraphqlApiRequestBuilderOps = new CreateGraphqlApiRequestBuilderOps(v)

  implicit def toCreateGraphqlApiRequestOps(v: CreateGraphqlApiRequest): CreateGraphqlApiRequestOps =
    new CreateGraphqlApiRequestOps(v)

}
