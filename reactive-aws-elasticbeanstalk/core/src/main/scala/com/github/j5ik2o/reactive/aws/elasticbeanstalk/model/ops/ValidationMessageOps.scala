// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ValidationMessageBuilderOps(val self: ValidationMessage.Builder) extends AnyVal {

  final def messageAsScala(value: Option[String]): ValidationMessage.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  } // String

  final def severityAsScala(value: Option[ValidationSeverity]): ValidationMessage.Builder = {
    value.fold(self) { v =>
      self.severity(v)
    }
  } // ValidationSeverity

  final def namespaceAsScala(value: Option[String]): ValidationMessage.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  } // String

  final def optionNameAsScala(value: Option[String]): ValidationMessage.Builder = {
    value.fold(self) { v =>
      self.optionName(v)
    }
  } // String

}

final class ValidationMessageOps(val self: ValidationMessage) extends AnyVal {

  final def messageAsScala: Option[String] = Option(self.message) // String

  final def severityAsScala: Option[ValidationSeverity] = Option(self.severity) // ValidationSeverity

  final def namespaceAsScala: Option[String] = Option(self.namespace) // String

  final def optionNameAsScala: Option[String] = Option(self.optionName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToValidationMessageOps {

  implicit def toValidationMessageBuilderOps(v: ValidationMessage.Builder): ValidationMessageBuilderOps =
    new ValidationMessageBuilderOps(v)

  implicit def toValidationMessageOps(v: ValidationMessage): ValidationMessageOps = new ValidationMessageOps(v)

}
