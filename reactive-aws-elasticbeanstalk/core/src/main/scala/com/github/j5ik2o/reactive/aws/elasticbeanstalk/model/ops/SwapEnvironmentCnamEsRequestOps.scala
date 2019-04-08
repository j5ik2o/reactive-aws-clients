// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class SwapEnvironmentCnamEsRequestBuilderOps(val self: SwapEnvironmentCnamEsRequest.Builder) extends AnyVal {

  final def sourceEnvironmentIdAsScala(value: Option[String]): SwapEnvironmentCnamEsRequest.Builder = {
    value.fold(self) { v =>
      self.sourceEnvironmentId(v)
    }
  } // String

  final def sourceEnvironmentNameAsScala(value: Option[String]): SwapEnvironmentCnamEsRequest.Builder = {
    value.fold(self) { v =>
      self.sourceEnvironmentName(v)
    }
  } // String

  final def destinationEnvironmentIdAsScala(value: Option[String]): SwapEnvironmentCnamEsRequest.Builder = {
    value.fold(self) { v =>
      self.destinationEnvironmentId(v)
    }
  } // String

  final def destinationEnvironmentNameAsScala(value: Option[String]): SwapEnvironmentCnamEsRequest.Builder = {
    value.fold(self) { v =>
      self.destinationEnvironmentName(v)
    }
  } // String

}

final class SwapEnvironmentCnamEsRequestOps(val self: SwapEnvironmentCnamEsRequest) extends AnyVal {

  final def sourceEnvironmentIdAsScala: Option[String] = Option(self.sourceEnvironmentId) // String

  final def sourceEnvironmentNameAsScala: Option[String] = Option(self.sourceEnvironmentName) // String

  final def destinationEnvironmentIdAsScala: Option[String] = Option(self.destinationEnvironmentId) // String

  final def destinationEnvironmentNameAsScala: Option[String] = Option(self.destinationEnvironmentName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSwapEnvironmentCnamEsRequestOps {

  implicit def toSwapEnvironmentCnamEsRequestBuilderOps(
      v: SwapEnvironmentCnamEsRequest.Builder
  ): SwapEnvironmentCnamEsRequestBuilderOps = new SwapEnvironmentCnamEsRequestBuilderOps(v)

  implicit def toSwapEnvironmentCnamEsRequestOps(v: SwapEnvironmentCnamEsRequest): SwapEnvironmentCnamEsRequestOps =
    new SwapEnvironmentCnamEsRequestOps(v)

}
