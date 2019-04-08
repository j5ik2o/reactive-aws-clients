// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class AuthorizationConfigBuilderOps(val self: AuthorizationConfig.Builder) extends AnyVal {

  final def authorizationTypeAsScala(value: Option[AuthorizationType]): AuthorizationConfig.Builder = {
    value.fold(self) { v =>
      self.authorizationType(v)
    }
  }

  final def awsIamConfigAsScala(value: Option[AwsIamConfig]): AuthorizationConfig.Builder = {
    value.fold(self) { v =>
      self.awsIamConfig(v)
    }
  }

}

final class AuthorizationConfigOps(val self: AuthorizationConfig) extends AnyVal {

  final def authorizationTypeAsScala: Option[AuthorizationType] = Option(self.authorizationType)

  final def awsIamConfigAsScala: Option[AwsIamConfig] = Option(self.awsIamConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAuthorizationConfigOps {

  implicit def toAuthorizationConfigBuilderOps(v: AuthorizationConfig.Builder): AuthorizationConfigBuilderOps =
    new AuthorizationConfigBuilderOps(v)

  implicit def toAuthorizationConfigOps(v: AuthorizationConfig): AuthorizationConfigOps = new AuthorizationConfigOps(v)

}
