// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class PartialFailureBuilderOps(val self: PartialFailure.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureResourceAsScala(value: Option[String]): PartialFailure.Builder = {
    value.fold(self) { v =>
      self.failureResource(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exceptionTypeAsScala(value: Option[String]): PartialFailure.Builder = {
    value.fold(self) { v =>
      self.exceptionType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureCodeAsScala(value: Option[String]): PartialFailure.Builder = {
    value.fold(self) { v =>
      self.failureCode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureDescriptionAsScala(value: Option[String]): PartialFailure.Builder = {
    value.fold(self) { v =>
      self.failureDescription(v)
    }
  }

}

final class PartialFailureOps(val self: PartialFailure) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureResourceAsScala: Option[String] = Option(self.failureResource)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exceptionTypeAsScala: Option[String] = Option(self.exceptionType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureCodeAsScala: Option[String] = Option(self.failureCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureDescriptionAsScala: Option[String] = Option(self.failureDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPartialFailureOps {

  implicit def toPartialFailureBuilderOps(v: PartialFailure.Builder): PartialFailureBuilderOps =
    new PartialFailureBuilderOps(v)

  implicit def toPartialFailureOps(v: PartialFailure): PartialFailureOps = new PartialFailureOps(v)

}
