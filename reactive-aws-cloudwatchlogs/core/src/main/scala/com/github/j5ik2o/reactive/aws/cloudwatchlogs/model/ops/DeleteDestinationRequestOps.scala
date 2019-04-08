// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteDestinationRequestBuilderOps(val self: DeleteDestinationRequest.Builder) extends AnyVal {

  final def destinationNameAsScala(value: Option[String]): DeleteDestinationRequest.Builder = {
    value.fold(self) { v =>
      self.destinationName(v)
    }
  }

}

final class DeleteDestinationRequestOps(val self: DeleteDestinationRequest) extends AnyVal {

  final def destinationNameAsScala: Option[String] = Option(self.destinationName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteDestinationRequestOps {

  implicit def toDeleteDestinationRequestBuilderOps(
      v: DeleteDestinationRequest.Builder
  ): DeleteDestinationRequestBuilderOps = new DeleteDestinationRequestBuilderOps(v)

  implicit def toDeleteDestinationRequestOps(v: DeleteDestinationRequest): DeleteDestinationRequestOps =
    new DeleteDestinationRequestOps(v)

}
