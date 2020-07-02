// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class SwapEnvironmentCnamEsRequestBuilderOps(val self: SwapEnvironmentCnamEsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceEnvironmentIdAsScala(value: Option[String]): SwapEnvironmentCnamEsRequest.Builder = {
    value.fold(self) { v => self.sourceEnvironmentId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceEnvironmentNameAsScala(value: Option[String]): SwapEnvironmentCnamEsRequest.Builder = {
    value.fold(self) { v => self.sourceEnvironmentName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationEnvironmentIdAsScala(value: Option[String]): SwapEnvironmentCnamEsRequest.Builder = {
    value.fold(self) { v => self.destinationEnvironmentId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationEnvironmentNameAsScala(value: Option[String]): SwapEnvironmentCnamEsRequest.Builder = {
    value.fold(self) { v => self.destinationEnvironmentName(v) }
  }

}

final class SwapEnvironmentCnamEsRequestOps(val self: SwapEnvironmentCnamEsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceEnvironmentIdAsScala: Option[String] = Option(self.sourceEnvironmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceEnvironmentNameAsScala: Option[String] = Option(self.sourceEnvironmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationEnvironmentIdAsScala: Option[String] = Option(self.destinationEnvironmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationEnvironmentNameAsScala: Option[String] = Option(self.destinationEnvironmentName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSwapEnvironmentCnamEsRequestOps {

  implicit def toSwapEnvironmentCnamEsRequestBuilderOps(
      v: SwapEnvironmentCnamEsRequest.Builder
  ): SwapEnvironmentCnamEsRequestBuilderOps = new SwapEnvironmentCnamEsRequestBuilderOps(v)

  implicit def toSwapEnvironmentCnamEsRequestOps(v: SwapEnvironmentCnamEsRequest): SwapEnvironmentCnamEsRequestOps =
    new SwapEnvironmentCnamEsRequestOps(v)

}
