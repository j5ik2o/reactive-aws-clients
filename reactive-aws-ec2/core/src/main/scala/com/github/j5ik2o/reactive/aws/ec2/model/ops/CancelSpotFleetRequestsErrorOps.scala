// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelSpotFleetRequestsErrorBuilderOps(val self: CancelSpotFleetRequestsError.Builder) extends AnyVal {

  final def codeAsScala(value: Option[CancelBatchErrorCode]): CancelSpotFleetRequestsError.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  }

  final def messageAsScala(value: Option[String]): CancelSpotFleetRequestsError.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

}

final class CancelSpotFleetRequestsErrorOps(val self: CancelSpotFleetRequestsError) extends AnyVal {

  final def codeAsScala: Option[CancelBatchErrorCode] = Option(self.code)

  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelSpotFleetRequestsErrorOps {

  implicit def toCancelSpotFleetRequestsErrorBuilderOps(
      v: CancelSpotFleetRequestsError.Builder
  ): CancelSpotFleetRequestsErrorBuilderOps = new CancelSpotFleetRequestsErrorBuilderOps(v)

  implicit def toCancelSpotFleetRequestsErrorOps(v: CancelSpotFleetRequestsError): CancelSpotFleetRequestsErrorOps =
    new CancelSpotFleetRequestsErrorOps(v)

}
