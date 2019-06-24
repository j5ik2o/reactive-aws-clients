// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class CognitoOptionsBuilderOps(val self: CognitoOptions.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala(value: Option[Boolean]): CognitoOptions.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userPoolIdAsScala(value: Option[String]): CognitoOptions.Builder = {
    value.fold(self) { v =>
      self.userPoolId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def identityPoolIdAsScala(value: Option[String]): CognitoOptions.Builder = {
    value.fold(self) { v =>
      self.identityPoolId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala(value: Option[String]): CognitoOptions.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  }

}

final class CognitoOptionsOps(val self: CognitoOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userPoolIdAsScala: Option[String] = Option(self.userPoolId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def identityPoolIdAsScala: Option[String] = Option(self.identityPoolId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala: Option[String] = Option(self.roleArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCognitoOptionsOps {

  implicit def toCognitoOptionsBuilderOps(v: CognitoOptions.Builder): CognitoOptionsBuilderOps =
    new CognitoOptionsBuilderOps(v)

  implicit def toCognitoOptionsOps(v: CognitoOptions): CognitoOptionsOps = new CognitoOptionsOps(v)

}
