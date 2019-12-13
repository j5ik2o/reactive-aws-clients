// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class RegisterTypeResponseBuilderOps(val self: RegisterTypeResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registrationTokenAsScala(value: Option[String]): RegisterTypeResponse.Builder = {
    value.fold(self) { v =>
      self.registrationToken(v)
    }
  }

}

final class RegisterTypeResponseOps(val self: RegisterTypeResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registrationTokenAsScala: Option[String] = Option(self.registrationToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterTypeResponseOps {

  implicit def toRegisterTypeResponseBuilderOps(v: RegisterTypeResponse.Builder): RegisterTypeResponseBuilderOps =
    new RegisterTypeResponseBuilderOps(v)

  implicit def toRegisterTypeResponseOps(v: RegisterTypeResponse): RegisterTypeResponseOps =
    new RegisterTypeResponseOps(v)

}
