// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class EnvironmentErrorBuilderOps(val self: EnvironmentError.Builder) extends AnyVal {

  final def errorCodeAsScala(value: Option[String]): EnvironmentError.Builder = {
    value.fold(self) { v =>
      self.errorCode(v)
    }
  } // String

  final def messageAsScala(value: Option[String]): EnvironmentError.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  } // String

}

final class EnvironmentErrorOps(val self: EnvironmentError) extends AnyVal {

  final def errorCodeAsScala: Option[String] = Option(self.errorCode) // String

  final def messageAsScala: Option[String] = Option(self.message) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnvironmentErrorOps {

  implicit def toEnvironmentErrorBuilderOps(v: EnvironmentError.Builder): EnvironmentErrorBuilderOps =
    new EnvironmentErrorBuilderOps(v)

  implicit def toEnvironmentErrorOps(v: EnvironmentError): EnvironmentErrorOps = new EnvironmentErrorOps(v)

}
