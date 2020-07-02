// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PurchaseRequestBuilderOps(val self: PurchaseRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala(value: Option[Int]): PurchaseRequest.Builder = {
    value.fold(self) { v => self.instanceCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def purchaseTokenAsScala(value: Option[String]): PurchaseRequest.Builder = {
    value.fold(self) { v => self.purchaseToken(v) }
  }

}

final class PurchaseRequestOps(val self: PurchaseRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def purchaseTokenAsScala: Option[String] = Option(self.purchaseToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPurchaseRequestOps {

  implicit def toPurchaseRequestBuilderOps(v: PurchaseRequest.Builder): PurchaseRequestBuilderOps =
    new PurchaseRequestBuilderOps(v)

  implicit def toPurchaseRequestOps(v: PurchaseRequest): PurchaseRequestOps = new PurchaseRequestOps(v)

}
