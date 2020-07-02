// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetProvisionedConcurrencyConfigResponseBuilderOps(val self: GetProvisionedConcurrencyConfigResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestedProvisionedConcurrentExecutionsAsScala(
      value: Option[Int]
  ): GetProvisionedConcurrencyConfigResponse.Builder = {
    value.fold(self) { v => self.requestedProvisionedConcurrentExecutions(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availableProvisionedConcurrentExecutionsAsScala(
      value: Option[Int]
  ): GetProvisionedConcurrencyConfigResponse.Builder = {
    value.fold(self) { v => self.availableProvisionedConcurrentExecutions(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocatedProvisionedConcurrentExecutionsAsScala(
      value: Option[Int]
  ): GetProvisionedConcurrencyConfigResponse.Builder = {
    value.fold(self) { v => self.allocatedProvisionedConcurrentExecutions(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(
      value: Option[ProvisionedConcurrencyStatusEnum]
  ): GetProvisionedConcurrencyConfigResponse.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala(value: Option[String]): GetProvisionedConcurrencyConfigResponse.Builder = {
    value.fold(self) { v => self.statusReason(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala(value: Option[String]): GetProvisionedConcurrencyConfigResponse.Builder = {
    value.fold(self) { v => self.lastModified(v) }
  }

}

final class GetProvisionedConcurrencyConfigResponseOps(val self: GetProvisionedConcurrencyConfigResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestedProvisionedConcurrentExecutionsAsScala: Option[Int] =
    Option(self.requestedProvisionedConcurrentExecutions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availableProvisionedConcurrentExecutionsAsScala: Option[Int] =
    Option(self.availableProvisionedConcurrentExecutions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocatedProvisionedConcurrentExecutionsAsScala: Option[Int] =
    Option(self.allocatedProvisionedConcurrentExecutions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ProvisionedConcurrencyStatusEnum] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala: Option[String] = Option(self.lastModified)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetProvisionedConcurrencyConfigResponseOps {

  implicit def toGetProvisionedConcurrencyConfigResponseBuilderOps(
      v: GetProvisionedConcurrencyConfigResponse.Builder
  ): GetProvisionedConcurrencyConfigResponseBuilderOps = new GetProvisionedConcurrencyConfigResponseBuilderOps(v)

  implicit def toGetProvisionedConcurrencyConfigResponseOps(
      v: GetProvisionedConcurrencyConfigResponse
  ): GetProvisionedConcurrencyConfigResponseOps = new GetProvisionedConcurrencyConfigResponseOps(v)

}
