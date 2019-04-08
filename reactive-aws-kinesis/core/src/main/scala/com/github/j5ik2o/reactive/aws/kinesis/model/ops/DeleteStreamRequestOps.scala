// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DeleteStreamRequestBuilderOps(val self: DeleteStreamRequest.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): DeleteStreamRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

  final def enforceConsumerDeletionAsScala(value: Option[Boolean]): DeleteStreamRequest.Builder = {
    value.fold(self) { v =>
      self.enforceConsumerDeletion(v)
    }
  } // Boolean

}

final class DeleteStreamRequestOps(val self: DeleteStreamRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

  final def enforceConsumerDeletionAsScala: Option[Boolean] = Option(self.enforceConsumerDeletion) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteStreamRequestOps {

  implicit def toDeleteStreamRequestBuilderOps(v: DeleteStreamRequest.Builder): DeleteStreamRequestBuilderOps =
    new DeleteStreamRequestBuilderOps(v)

  implicit def toDeleteStreamRequestOps(v: DeleteStreamRequest): DeleteStreamRequestOps = new DeleteStreamRequestOps(v)

}
