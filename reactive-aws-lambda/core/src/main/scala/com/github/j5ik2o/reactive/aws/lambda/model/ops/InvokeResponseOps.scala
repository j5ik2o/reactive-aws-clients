// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class InvokeResponseBuilderOps(val self: InvokeResponse.Builder) extends AnyVal {

  final def statusCodeAsScala(value: Option[Int]): InvokeResponse.Builder = {
    value.fold(self) { v =>
      self.statusCode(v)
    }
  } // Int

  final def functionErrorAsScala(value: Option[String]): InvokeResponse.Builder = {
    value.fold(self) { v =>
      self.functionError(v)
    }
  } // String

  final def logResultAsScala(value: Option[String]): InvokeResponse.Builder = {
    value.fold(self) { v =>
      self.logResult(v)
    }
  } // String

  final def payloadAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): InvokeResponse.Builder = {
    value.fold(self) { v =>
      self.payload(v)
    }
  } // software.amazon.awssdk.core.SdkBytes

  final def executedVersionAsScala(value: Option[String]): InvokeResponse.Builder = {
    value.fold(self) { v =>
      self.executedVersion(v)
    }
  } // String

}

final class InvokeResponseOps(val self: InvokeResponse) extends AnyVal {

  final def statusCodeAsScala: Option[Int] = Option(self.statusCode) // Int

  final def functionErrorAsScala: Option[String] = Option(self.functionError) // String

  final def logResultAsScala: Option[String] = Option(self.logResult) // String

  final def payloadAsScala: Option[software.amazon.awssdk.core.SdkBytes] =
    Option(self.payload) // software.amazon.awssdk.core.SdkBytes

  final def executedVersionAsScala: Option[String] = Option(self.executedVersion) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInvokeResponseOps {

  implicit def toInvokeResponseBuilderOps(v: InvokeResponse.Builder): InvokeResponseBuilderOps =
    new InvokeResponseBuilderOps(v)

  implicit def toInvokeResponseOps(v: InvokeResponse): InvokeResponseOps = new InvokeResponseOps(v)

}
