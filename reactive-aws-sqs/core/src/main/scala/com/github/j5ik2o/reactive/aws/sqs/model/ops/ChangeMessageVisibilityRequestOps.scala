// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ChangeMessageVisibilityRequestBuilderOps(val self: ChangeMessageVisibilityRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala(value: Option[String]): ChangeMessageVisibilityRequest.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def receiptHandleAsScala(value: Option[String]): ChangeMessageVisibilityRequest.Builder = {
    value.fold(self) { v =>
      self.receiptHandle(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def visibilityTimeoutAsScala(value: Option[Int]): ChangeMessageVisibilityRequest.Builder = {
    value.fold(self) { v =>
      self.visibilityTimeout(v)
    }
  }

}

final class ChangeMessageVisibilityRequestOps(val self: ChangeMessageVisibilityRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def receiptHandleAsScala: Option[String] = Option(self.receiptHandle)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def visibilityTimeoutAsScala: Option[Int] = Option(self.visibilityTimeout)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToChangeMessageVisibilityRequestOps {

  implicit def toChangeMessageVisibilityRequestBuilderOps(
      v: ChangeMessageVisibilityRequest.Builder
  ): ChangeMessageVisibilityRequestBuilderOps = new ChangeMessageVisibilityRequestBuilderOps(v)

  implicit def toChangeMessageVisibilityRequestOps(
      v: ChangeMessageVisibilityRequest
  ): ChangeMessageVisibilityRequestOps = new ChangeMessageVisibilityRequestOps(v)

}
