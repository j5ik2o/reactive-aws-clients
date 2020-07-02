// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UserPoolConfigBuilderOps(val self: UserPoolConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userPoolIdAsScala(value: Option[String]): UserPoolConfig.Builder = {
    value.fold(self) { v => self.userPoolId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def awsRegionAsScala(value: Option[String]): UserPoolConfig.Builder = {
    value.fold(self) { v => self.awsRegion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultActionAsScala(value: Option[DefaultAction]): UserPoolConfig.Builder = {
    value.fold(self) { v => self.defaultAction(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def appIdClientRegexAsScala(value: Option[String]): UserPoolConfig.Builder = {
    value.fold(self) { v => self.appIdClientRegex(v) }
  }

}

final class UserPoolConfigOps(val self: UserPoolConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userPoolIdAsScala: Option[String] = Option(self.userPoolId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def awsRegionAsScala: Option[String] = Option(self.awsRegion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultActionAsScala: Option[DefaultAction] = Option(self.defaultAction)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def appIdClientRegexAsScala: Option[String] = Option(self.appIdClientRegex)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUserPoolConfigOps {

  implicit def toUserPoolConfigBuilderOps(v: UserPoolConfig.Builder): UserPoolConfigBuilderOps =
    new UserPoolConfigBuilderOps(v)

  implicit def toUserPoolConfigOps(v: UserPoolConfig): UserPoolConfigOps = new UserPoolConfigOps(v)

}
