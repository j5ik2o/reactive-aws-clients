// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UserPoolConfigBuilderOps(val self: UserPoolConfig.Builder) extends AnyVal {

  final def userPoolIdAsScala(value: Option[String]): UserPoolConfig.Builder = {
    value.fold(self) { v =>
      self.userPoolId(v)
    }
  } // String

  final def awsRegionAsScala(value: Option[String]): UserPoolConfig.Builder = {
    value.fold(self) { v =>
      self.awsRegion(v)
    }
  } // String

  final def defaultActionAsScala(value: Option[DefaultAction]): UserPoolConfig.Builder = {
    value.fold(self) { v =>
      self.defaultAction(v)
    }
  } // DefaultAction

  final def appIdClientRegexAsScala(value: Option[String]): UserPoolConfig.Builder = {
    value.fold(self) { v =>
      self.appIdClientRegex(v)
    }
  } // String

}

final class UserPoolConfigOps(val self: UserPoolConfig) extends AnyVal {

  final def userPoolIdAsScala: Option[String] = Option(self.userPoolId) // String

  final def awsRegionAsScala: Option[String] = Option(self.awsRegion) // String

  final def defaultActionAsScala: Option[DefaultAction] = Option(self.defaultAction) // DefaultAction

  final def appIdClientRegexAsScala: Option[String] = Option(self.appIdClientRegex) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUserPoolConfigOps {

  implicit def toUserPoolConfigBuilderOps(v: UserPoolConfig.Builder): UserPoolConfigBuilderOps =
    new UserPoolConfigBuilderOps(v)

  implicit def toUserPoolConfigOps(v: UserPoolConfig): UserPoolConfigOps = new UserPoolConfigOps(v)

}
