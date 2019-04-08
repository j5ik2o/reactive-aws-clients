// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class InvokeRequestBuilderOps(val self: InvokeRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def invocationTypeAsScala(value: Option[InvocationType]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.invocationType(v)
    }
  } // InvocationType

  final def logTypeAsScala(value: Option[LogType]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.logType(v)
    }
  } // LogType

  final def clientContextAsScala(value: Option[String]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.clientContext(v)
    }
  } // String

  final def payloadAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.payload(v)
    }
  } // software.amazon.awssdk.core.SdkBytes

  final def qualifierAsScala(value: Option[String]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.qualifier(v)
    }
  } // String

}

final class InvokeRequestOps(val self: InvokeRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def invocationTypeAsScala: Option[InvocationType] = Option(self.invocationType) // InvocationType

  final def logTypeAsScala: Option[LogType] = Option(self.logType) // LogType

  final def clientContextAsScala: Option[String] = Option(self.clientContext) // String

  final def payloadAsScala: Option[software.amazon.awssdk.core.SdkBytes] =
    Option(self.payload) // software.amazon.awssdk.core.SdkBytes

  final def qualifierAsScala: Option[String] = Option(self.qualifier) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInvokeRequestOps {

  implicit def toInvokeRequestBuilderOps(v: InvokeRequest.Builder): InvokeRequestBuilderOps =
    new InvokeRequestBuilderOps(v)

  implicit def toInvokeRequestOps(v: InvokeRequest): InvokeRequestOps = new InvokeRequestOps(v)

}
