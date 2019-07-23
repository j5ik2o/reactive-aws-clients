// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class InvokeRequestBuilderOps(val self: InvokeRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def invocationTypeAsScala(value: Option[InvocationType]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.invocationType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logTypeAsScala(value: Option[LogType]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.logType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientContextAsScala(value: Option[String]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.clientContext(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def payloadAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.payload(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala(value: Option[String]): InvokeRequest.Builder = {
    value.fold(self) { v =>
      self.qualifier(v)
    }
  }

}

final class InvokeRequestOps(val self: InvokeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def invocationTypeAsScala: Option[InvocationType] = Option(self.invocationType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logTypeAsScala: Option[LogType] = Option(self.logType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientContextAsScala: Option[String] = Option(self.clientContext)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def payloadAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.payload)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala: Option[String] = Option(self.qualifier)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInvokeRequestOps {

  implicit def toInvokeRequestBuilderOps(v: InvokeRequest.Builder): InvokeRequestBuilderOps =
    new InvokeRequestBuilderOps(v)

  implicit def toInvokeRequestOps(v: InvokeRequest): InvokeRequestOps = new InvokeRequestOps(v)

}
