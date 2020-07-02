// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetProvisionedConcurrencyConfigRequestBuilderOps(val self: GetProvisionedConcurrencyConfigRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): GetProvisionedConcurrencyConfigRequest.Builder = {
    value.fold(self) { v => self.functionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala(value: Option[String]): GetProvisionedConcurrencyConfigRequest.Builder = {
    value.fold(self) { v => self.qualifier(v) }
  }

}

final class GetProvisionedConcurrencyConfigRequestOps(val self: GetProvisionedConcurrencyConfigRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala: Option[String] = Option(self.qualifier)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetProvisionedConcurrencyConfigRequestOps {

  implicit def toGetProvisionedConcurrencyConfigRequestBuilderOps(
      v: GetProvisionedConcurrencyConfigRequest.Builder
  ): GetProvisionedConcurrencyConfigRequestBuilderOps = new GetProvisionedConcurrencyConfigRequestBuilderOps(v)

  implicit def toGetProvisionedConcurrencyConfigRequestOps(
      v: GetProvisionedConcurrencyConfigRequest
  ): GetProvisionedConcurrencyConfigRequestOps = new GetProvisionedConcurrencyConfigRequestOps(v)

}
