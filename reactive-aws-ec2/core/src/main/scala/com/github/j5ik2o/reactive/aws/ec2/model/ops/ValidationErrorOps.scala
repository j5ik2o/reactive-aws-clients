// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ValidationErrorBuilderOps(val self: ValidationError.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala(value: Option[String]): ValidationError.Builder = {
    value.fold(self) { v => self.code(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): ValidationError.Builder = {
    value.fold(self) { v => self.message(v) }
  }

}

final class ValidationErrorOps(val self: ValidationError) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala: Option[String] = Option(self.code)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToValidationErrorOps {

  implicit def toValidationErrorBuilderOps(v: ValidationError.Builder): ValidationErrorBuilderOps =
    new ValidationErrorBuilderOps(v)

  implicit def toValidationErrorOps(v: ValidationError): ValidationErrorOps = new ValidationErrorOps(v)

}
