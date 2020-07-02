// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CognitoUserPoolConfigBuilderOps(val self: CognitoUserPoolConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userPoolIdAsScala(value: Option[String]): CognitoUserPoolConfig.Builder = {
    value.fold(self) { v => self.userPoolId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def awsRegionAsScala(value: Option[String]): CognitoUserPoolConfig.Builder = {
    value.fold(self) { v => self.awsRegion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def appIdClientRegexAsScala(value: Option[String]): CognitoUserPoolConfig.Builder = {
    value.fold(self) { v => self.appIdClientRegex(v) }
  }

}

final class CognitoUserPoolConfigOps(val self: CognitoUserPoolConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userPoolIdAsScala: Option[String] = Option(self.userPoolId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def awsRegionAsScala: Option[String] = Option(self.awsRegion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def appIdClientRegexAsScala: Option[String] = Option(self.appIdClientRegex)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCognitoUserPoolConfigOps {

  implicit def toCognitoUserPoolConfigBuilderOps(v: CognitoUserPoolConfig.Builder): CognitoUserPoolConfigBuilderOps =
    new CognitoUserPoolConfigBuilderOps(v)

  implicit def toCognitoUserPoolConfigOps(v: CognitoUserPoolConfig): CognitoUserPoolConfigOps =
    new CognitoUserPoolConfigOps(v)

}
