// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class InvokeRequestBuilderOps(val self: InvokeRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  final def invocationTypeAsScala(value: Option[InvocationType]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.invocationType(v)
    }
  }

  final def logTypeAsScala(value: Option[LogType]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.logType(v)
    }
  }

  final def clientContextAsScala(value: Option[String]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.clientContext(v)
    }
  }

  final def payloadAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.payload(v)
    }
  }

  final def qualifierAsScala(value: Option[String]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.qualifier(v)
    }
  }

}

final class InvokeRequestOps(val self: InvokeRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName)

  final def invocationTypeAsScala: Option[InvocationType] = Option(self.invocationType)

  final def logTypeAsScala: Option[LogType] = Option(self.logType)

  final def clientContextAsScala: Option[String] = Option(self.clientContext)

  final def payloadAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.payload)

  final def qualifierAsScala: Option[String] = Option(self.qualifier)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInvokeRequestOps {

  implicit def toInvokeRequestBuilderOps(v: InvokeRequest.Builder): InvokeRequestBuilderOps =
    new InvokeRequestBuilderOps(v)

  implicit def toInvokeRequestOps(v: InvokeRequest): InvokeRequestOps = new InvokeRequestOps(v)

}
