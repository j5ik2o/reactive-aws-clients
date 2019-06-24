// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutDestinationRequestBuilderOps(val self: PutDestinationRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationNameAsScala(value: Option[String]): PutDestinationRequest.Builder = {
    value.fold(self) { v =>
      self.destinationName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetArnAsScala(value: Option[String]): PutDestinationRequest.Builder = {
    value.fold(self) { v =>
      self.targetArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala(value: Option[String]): PutDestinationRequest.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  }

}

final class PutDestinationRequestOps(val self: PutDestinationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationNameAsScala: Option[String] = Option(self.destinationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetArnAsScala: Option[String] = Option(self.targetArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala: Option[String] = Option(self.roleArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutDestinationRequestOps {

  implicit def toPutDestinationRequestBuilderOps(v: PutDestinationRequest.Builder): PutDestinationRequestBuilderOps =
    new PutDestinationRequestBuilderOps(v)

  implicit def toPutDestinationRequestOps(v: PutDestinationRequest): PutDestinationRequestOps =
    new PutDestinationRequestOps(v)

}
