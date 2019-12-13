// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class RecordHandlerProgressRequestBuilderOps(val self: RecordHandlerProgressRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bearerTokenAsScala(value: Option[String]): RecordHandlerProgressRequest.Builder = {
    value.fold(self) { v =>
      self.bearerToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationStatusAsScala(value: Option[OperationStatus]): RecordHandlerProgressRequest.Builder = {
    value.fold(self) { v =>
      self.operationStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentOperationStatusAsScala(value: Option[OperationStatus]): RecordHandlerProgressRequest.Builder = {
    value.fold(self) { v =>
      self.currentOperationStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): RecordHandlerProgressRequest.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorCodeAsScala(value: Option[HandlerErrorCode]): RecordHandlerProgressRequest.Builder = {
    value.fold(self) { v =>
      self.errorCode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceModelAsScala(value: Option[String]): RecordHandlerProgressRequest.Builder = {
    value.fold(self) { v =>
      self.resourceModel(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): RecordHandlerProgressRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

}

final class RecordHandlerProgressRequestOps(val self: RecordHandlerProgressRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bearerTokenAsScala: Option[String] = Option(self.bearerToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationStatusAsScala: Option[OperationStatus] = Option(self.operationStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentOperationStatusAsScala: Option[OperationStatus] = Option(self.currentOperationStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorCodeAsScala: Option[HandlerErrorCode] = Option(self.errorCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceModelAsScala: Option[String] = Option(self.resourceModel)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRecordHandlerProgressRequestOps {

  implicit def toRecordHandlerProgressRequestBuilderOps(
      v: RecordHandlerProgressRequest.Builder
  ): RecordHandlerProgressRequestBuilderOps = new RecordHandlerProgressRequestBuilderOps(v)

  implicit def toRecordHandlerProgressRequestOps(v: RecordHandlerProgressRequest): RecordHandlerProgressRequestOps =
    new RecordHandlerProgressRequestOps(v)

}
