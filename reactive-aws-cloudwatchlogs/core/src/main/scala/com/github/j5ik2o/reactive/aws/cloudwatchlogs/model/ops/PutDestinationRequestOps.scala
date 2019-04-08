// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutDestinationRequestBuilderOps(val self: PutDestinationRequest.Builder) extends AnyVal {

  final def destinationNameAsScala(value: Option[String]): PutDestinationRequest.Builder = {
    value.fold(self) { v =>
      self.destinationName(v)
    }
  } // String

  final def targetArnAsScala(value: Option[String]): PutDestinationRequest.Builder = {
    value.fold(self) { v =>
      self.targetArn(v)
    }
  } // String

  final def roleArnAsScala(value: Option[String]): PutDestinationRequest.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  } // String

}

final class PutDestinationRequestOps(val self: PutDestinationRequest) extends AnyVal {

  final def destinationNameAsScala: Option[String] = Option(self.destinationName) // String

  final def targetArnAsScala: Option[String] = Option(self.targetArn) // String

  final def roleArnAsScala: Option[String] = Option(self.roleArn) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutDestinationRequestOps {

  implicit def toPutDestinationRequestBuilderOps(v: PutDestinationRequest.Builder): PutDestinationRequestBuilderOps =
    new PutDestinationRequestBuilderOps(v)

  implicit def toPutDestinationRequestOps(v: PutDestinationRequest): PutDestinationRequestOps =
    new PutDestinationRequestOps(v)

}
