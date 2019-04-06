// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class HttpDataSourceConfigBuilderOps(val self: HttpDataSourceConfig.Builder) extends AnyVal {

  final def withEndpointAsScala(value: Option[String]): HttpDataSourceConfig.Builder = {
    value.fold(self) { v =>
      self.endpoint(v)
    }
  } // String

  final def withAuthorizationConfigAsScala(value: Option[AuthorizationConfig]): HttpDataSourceConfig.Builder = {
    value.fold(self) { v =>
      self.authorizationConfig(v)
    }
  } // AuthorizationConfig

}

final class HttpDataSourceConfigOps(val self: HttpDataSourceConfig) extends AnyVal {

  final def endpointAsScala: Option[String] = Option(self.endpoint) // String

  final def authorizationConfigAsScala: Option[AuthorizationConfig] =
    Option(self.authorizationConfig) // AuthorizationConfig

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHttpDataSourceConfigOps {

  implicit def toHttpDataSourceConfigBuilderOps(v: HttpDataSourceConfig.Builder): HttpDataSourceConfigBuilderOps =
    new HttpDataSourceConfigBuilderOps(v)

  implicit def toHttpDataSourceConfigOps(v: HttpDataSourceConfig): HttpDataSourceConfigOps =
    new HttpDataSourceConfigOps(v)

}
