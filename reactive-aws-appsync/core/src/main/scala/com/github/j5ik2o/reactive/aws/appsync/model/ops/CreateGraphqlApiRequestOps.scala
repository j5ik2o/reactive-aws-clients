// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateGraphqlApiRequestBuilderOps(val self: CreateGraphqlApiRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): CreateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logConfigAsScala(value: Option[LogConfig]): CreateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.logConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authenticationTypeAsScala(value: Option[AuthenticationType]): CreateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.authenticationType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userPoolConfigAsScala(value: Option[UserPoolConfig]): CreateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.userPoolConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def openIDConnectConfigAsScala(value: Option[OpenIDConnectConfig]): CreateGraphqlApiRequest.Builder = {
    value.fold(self) { v =>
      self.openIDConnectConfig(v)
    }
  }

}

final class CreateGraphqlApiRequestOps(val self: CreateGraphqlApiRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logConfigAsScala: Option[LogConfig] = Option(self.logConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authenticationTypeAsScala: Option[AuthenticationType] = Option(self.authenticationType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userPoolConfigAsScala: Option[UserPoolConfig] = Option(self.userPoolConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def openIDConnectConfigAsScala: Option[OpenIDConnectConfig] = Option(self.openIDConnectConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateGraphqlApiRequestOps {

  implicit def toCreateGraphqlApiRequestBuilderOps(
      v: CreateGraphqlApiRequest.Builder
  ): CreateGraphqlApiRequestBuilderOps = new CreateGraphqlApiRequestBuilderOps(v)

  implicit def toCreateGraphqlApiRequestOps(v: CreateGraphqlApiRequest): CreateGraphqlApiRequestOps =
    new CreateGraphqlApiRequestOps(v)

}
