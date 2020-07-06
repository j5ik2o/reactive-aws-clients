// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ValidationWarningBuilderOps(val self: ValidationWarning.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorsAsScala(value: Option[Seq[ValidationError]]): ValidationWarning.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.errors(v.asJava)
    }
  }

}

final class ValidationWarningOps(val self: ValidationWarning) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorsAsScala: Option[Seq[ValidationError]] =
    Option(self.errors).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToValidationWarningOps {

  implicit def toValidationWarningBuilderOps(v: ValidationWarning.Builder): ValidationWarningBuilderOps =
    new ValidationWarningBuilderOps(v)

  implicit def toValidationWarningOps(v: ValidationWarning): ValidationWarningOps = new ValidationWarningOps(v)

}
