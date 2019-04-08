// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class RequestPaymentConfigurationBuilderOps(val self: RequestPaymentConfiguration.Builder) extends AnyVal {

  final def payerAsScala(value: Option[Payer]): RequestPaymentConfiguration.Builder = {
    value.fold(self) { v =>
      self.payer(v)
    }
  }

}

final class RequestPaymentConfigurationOps(val self: RequestPaymentConfiguration) extends AnyVal {

  final def payerAsScala: Option[Payer] = Option(self.payer)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRequestPaymentConfigurationOps {

  implicit def toRequestPaymentConfigurationBuilderOps(
      v: RequestPaymentConfiguration.Builder
  ): RequestPaymentConfigurationBuilderOps = new RequestPaymentConfigurationBuilderOps(v)

  implicit def toRequestPaymentConfigurationOps(v: RequestPaymentConfiguration): RequestPaymentConfigurationOps =
    new RequestPaymentConfigurationOps(v)

}
