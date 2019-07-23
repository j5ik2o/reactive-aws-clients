// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class CognitoOptionsStatusBuilderOps(val self: CognitoOptionsStatus.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala(value: Option[CognitoOptions]): CognitoOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[OptionStatus]): CognitoOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class CognitoOptionsStatusOps(val self: CognitoOptionsStatus) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala: Option[CognitoOptions] = Option(self.options)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[OptionStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCognitoOptionsStatusOps {

  implicit def toCognitoOptionsStatusBuilderOps(v: CognitoOptionsStatus.Builder): CognitoOptionsStatusBuilderOps =
    new CognitoOptionsStatusBuilderOps(v)

  implicit def toCognitoOptionsStatusOps(v: CognitoOptionsStatus): CognitoOptionsStatusOps =
    new CognitoOptionsStatusOps(v)

}
