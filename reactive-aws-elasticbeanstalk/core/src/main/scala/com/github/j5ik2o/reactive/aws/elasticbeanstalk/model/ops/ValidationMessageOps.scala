// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ValidationMessageBuilderOps(val self: ValidationMessage.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): ValidationMessage.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def severityAsScala(value: Option[ValidationSeverity]): ValidationMessage.Builder = {
    value.fold(self) { v =>
      self.severity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala(value: Option[String]): ValidationMessage.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionNameAsScala(value: Option[String]): ValidationMessage.Builder = {
    value.fold(self) { v =>
      self.optionName(v)
    }
  }

}

final class ValidationMessageOps(val self: ValidationMessage) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def severityAsScala: Option[ValidationSeverity] = Option(self.severity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala: Option[String] = Option(self.namespace)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionNameAsScala: Option[String] = Option(self.optionName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToValidationMessageOps {

  implicit def toValidationMessageBuilderOps(v: ValidationMessage.Builder): ValidationMessageBuilderOps =
    new ValidationMessageBuilderOps(v)

  implicit def toValidationMessageOps(v: ValidationMessage): ValidationMessageOps = new ValidationMessageOps(v)

}
