// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class CognitoOptionsBuilderOps(val self: CognitoOptions.Builder) extends AnyVal {

  final def enabledAsScala(value: Option[Boolean]): CognitoOptions.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  } // Boolean

  final def userPoolIdAsScala(value: Option[String]): CognitoOptions.Builder = {
    value.fold(self) { v =>
      self.userPoolId(v)
    }
  } // String

  final def identityPoolIdAsScala(value: Option[String]): CognitoOptions.Builder = {
    value.fold(self) { v =>
      self.identityPoolId(v)
    }
  } // String

  final def roleArnAsScala(value: Option[String]): CognitoOptions.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  } // String

}

final class CognitoOptionsOps(val self: CognitoOptions) extends AnyVal {

  final def enabledAsScala: Option[Boolean] = Option(self.enabled) // Boolean

  final def userPoolIdAsScala: Option[String] = Option(self.userPoolId) // String

  final def identityPoolIdAsScala: Option[String] = Option(self.identityPoolId) // String

  final def roleArnAsScala: Option[String] = Option(self.roleArn) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCognitoOptionsOps {

  implicit def toCognitoOptionsBuilderOps(v: CognitoOptions.Builder): CognitoOptionsBuilderOps =
    new CognitoOptionsBuilderOps(v)

  implicit def toCognitoOptionsOps(v: CognitoOptions): CognitoOptionsOps = new CognitoOptionsOps(v)

}
