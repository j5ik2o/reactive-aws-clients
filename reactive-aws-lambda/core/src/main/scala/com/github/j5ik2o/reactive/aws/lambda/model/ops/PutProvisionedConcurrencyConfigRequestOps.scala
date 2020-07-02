// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class PutProvisionedConcurrencyConfigRequestBuilderOps(val self: PutProvisionedConcurrencyConfigRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): PutProvisionedConcurrencyConfigRequest.Builder = {
    value.fold(self) { v => self.functionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala(value: Option[String]): PutProvisionedConcurrencyConfigRequest.Builder = {
    value.fold(self) { v => self.qualifier(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedConcurrentExecutionsAsScala(
      value: Option[Int]
  ): PutProvisionedConcurrencyConfigRequest.Builder = {
    value.fold(self) { v => self.provisionedConcurrentExecutions(v) }
  }

}

final class PutProvisionedConcurrencyConfigRequestOps(val self: PutProvisionedConcurrencyConfigRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala: Option[String] = Option(self.qualifier)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedConcurrentExecutionsAsScala: Option[Int] = Option(self.provisionedConcurrentExecutions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutProvisionedConcurrencyConfigRequestOps {

  implicit def toPutProvisionedConcurrencyConfigRequestBuilderOps(
      v: PutProvisionedConcurrencyConfigRequest.Builder
  ): PutProvisionedConcurrencyConfigRequestBuilderOps = new PutProvisionedConcurrencyConfigRequestBuilderOps(v)

  implicit def toPutProvisionedConcurrencyConfigRequestOps(
      v: PutProvisionedConcurrencyConfigRequest
  ): PutProvisionedConcurrencyConfigRequestOps = new PutProvisionedConcurrencyConfigRequestOps(v)

}
