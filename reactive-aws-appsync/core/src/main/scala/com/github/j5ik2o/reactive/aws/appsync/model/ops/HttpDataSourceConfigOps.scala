// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class HttpDataSourceConfigBuilderOps(val self: HttpDataSourceConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointAsScala(value: Option[String]): HttpDataSourceConfig.Builder = {
    value.fold(self) { v =>
      self.endpoint(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authorizationConfigAsScala(value: Option[AuthorizationConfig]): HttpDataSourceConfig.Builder = {
    value.fold(self) { v =>
      self.authorizationConfig(v)
    }
  }

}

final class HttpDataSourceConfigOps(val self: HttpDataSourceConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointAsScala: Option[String] = Option(self.endpoint)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authorizationConfigAsScala: Option[AuthorizationConfig] = Option(self.authorizationConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHttpDataSourceConfigOps {

  implicit def toHttpDataSourceConfigBuilderOps(v: HttpDataSourceConfig.Builder): HttpDataSourceConfigBuilderOps =
    new HttpDataSourceConfigBuilderOps(v)

  implicit def toHttpDataSourceConfigOps(v: HttpDataSourceConfig): HttpDataSourceConfigOps =
    new HttpDataSourceConfigOps(v)

}
