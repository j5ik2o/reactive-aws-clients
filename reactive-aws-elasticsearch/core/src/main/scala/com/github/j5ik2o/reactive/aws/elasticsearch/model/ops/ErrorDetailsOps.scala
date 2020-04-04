// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ErrorDetailsBuilderOps(val self: ErrorDetails.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorTypeAsScala(value: Option[String]): ErrorDetails.Builder = {
    value.fold(self) { v =>
      self.errorType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorMessageAsScala(value: Option[String]): ErrorDetails.Builder = {
    value.fold(self) { v =>
      self.errorMessage(v)
    }
  }

}

final class ErrorDetailsOps(val self: ErrorDetails) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorTypeAsScala: Option[String] = Option(self.errorType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorMessageAsScala: Option[String] = Option(self.errorMessage)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToErrorDetailsOps {

  implicit def toErrorDetailsBuilderOps(v: ErrorDetails.Builder): ErrorDetailsBuilderOps = new ErrorDetailsBuilderOps(v)

  implicit def toErrorDetailsOps(v: ErrorDetails): ErrorDetailsOps = new ErrorDetailsOps(v)

}
