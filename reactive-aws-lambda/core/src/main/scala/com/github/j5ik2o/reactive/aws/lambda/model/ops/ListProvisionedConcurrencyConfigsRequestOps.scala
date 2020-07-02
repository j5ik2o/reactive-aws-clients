// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListProvisionedConcurrencyConfigsRequestBuilderOps(
    val self: ListProvisionedConcurrencyConfigsRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): ListProvisionedConcurrencyConfigsRequest.Builder = {
    value.fold(self) { v => self.functionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala(value: Option[String]): ListProvisionedConcurrencyConfigsRequest.Builder = {
    value.fold(self) { v => self.marker(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxItemsAsScala(value: Option[Int]): ListProvisionedConcurrencyConfigsRequest.Builder = {
    value.fold(self) { v => self.maxItems(v) }
  }

}

final class ListProvisionedConcurrencyConfigsRequestOps(val self: ListProvisionedConcurrencyConfigsRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala: Option[String] = Option(self.marker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxItemsAsScala: Option[Int] = Option(self.maxItems)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListProvisionedConcurrencyConfigsRequestOps {

  implicit def toListProvisionedConcurrencyConfigsRequestBuilderOps(
      v: ListProvisionedConcurrencyConfigsRequest.Builder
  ): ListProvisionedConcurrencyConfigsRequestBuilderOps = new ListProvisionedConcurrencyConfigsRequestBuilderOps(v)

  implicit def toListProvisionedConcurrencyConfigsRequestOps(
      v: ListProvisionedConcurrencyConfigsRequest
  ): ListProvisionedConcurrencyConfigsRequestOps = new ListProvisionedConcurrencyConfigsRequestOps(v)

}
