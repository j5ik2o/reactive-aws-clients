// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class DeleteProvisionedConcurrencyConfigRequestBuilderOps(
    val self: DeleteProvisionedConcurrencyConfigRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): DeleteProvisionedConcurrencyConfigRequest.Builder = {
    value.fold(self) { v => self.functionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala(value: Option[String]): DeleteProvisionedConcurrencyConfigRequest.Builder = {
    value.fold(self) { v => self.qualifier(v) }
  }

}

final class DeleteProvisionedConcurrencyConfigRequestOps(val self: DeleteProvisionedConcurrencyConfigRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala: Option[String] = Option(self.qualifier)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteProvisionedConcurrencyConfigRequestOps {

  implicit def toDeleteProvisionedConcurrencyConfigRequestBuilderOps(
      v: DeleteProvisionedConcurrencyConfigRequest.Builder
  ): DeleteProvisionedConcurrencyConfigRequestBuilderOps = new DeleteProvisionedConcurrencyConfigRequestBuilderOps(v)

  implicit def toDeleteProvisionedConcurrencyConfigRequestOps(
      v: DeleteProvisionedConcurrencyConfigRequest
  ): DeleteProvisionedConcurrencyConfigRequestOps = new DeleteProvisionedConcurrencyConfigRequestOps(v)

}
