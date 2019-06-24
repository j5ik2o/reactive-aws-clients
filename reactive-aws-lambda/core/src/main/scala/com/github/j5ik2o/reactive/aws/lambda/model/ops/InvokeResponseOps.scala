// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class InvokeResponseBuilderOps(val self: InvokeResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusCodeAsScala(value: Option[Int]): InvokeResponse.Builder = {
    value.fold(self) { v =>
      self.statusCode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionErrorAsScala(value: Option[String]): InvokeResponse.Builder = {
    value.fold(self) { v =>
      self.functionError(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logResultAsScala(value: Option[String]): InvokeResponse.Builder = {
    value.fold(self) { v =>
      self.logResult(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def payloadAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): InvokeResponse.Builder = {
    value.fold(self) { v =>
      self.payload(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executedVersionAsScala(value: Option[String]): InvokeResponse.Builder = {
    value.fold(self) { v =>
      self.executedVersion(v)
    }
  }

}

final class InvokeResponseOps(val self: InvokeResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusCodeAsScala: Option[Int] = Option(self.statusCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionErrorAsScala: Option[String] = Option(self.functionError)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logResultAsScala: Option[String] = Option(self.logResult)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def payloadAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.payload)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executedVersionAsScala: Option[String] = Option(self.executedVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInvokeResponseOps {

  implicit def toInvokeResponseBuilderOps(v: InvokeResponse.Builder): InvokeResponseBuilderOps =
    new InvokeResponseBuilderOps(v)

  implicit def toInvokeResponseOps(v: InvokeResponse): InvokeResponseOps = new InvokeResponseOps(v)

}
