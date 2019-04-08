// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutDestinationResponseBuilderOps(val self: PutDestinationResponse.Builder) extends AnyVal {

  final def destinationAsScala(value: Option[Destination]): PutDestinationResponse.Builder = {
    value.fold(self) { v =>
      self.destination(v)
    }
  } // Destination

}

final class PutDestinationResponseOps(val self: PutDestinationResponse) extends AnyVal {

  final def destinationAsScala: Option[Destination] = Option(self.destination) // Destination

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutDestinationResponseOps {

  implicit def toPutDestinationResponseBuilderOps(v: PutDestinationResponse.Builder): PutDestinationResponseBuilderOps =
    new PutDestinationResponseBuilderOps(v)

  implicit def toPutDestinationResponseOps(v: PutDestinationResponse): PutDestinationResponseOps =
    new PutDestinationResponseOps(v)

}
