// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PurchaseScheduledInstancesRequestBuilderOps(val self: PurchaseScheduledInstancesRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): PurchaseScheduledInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def purchaseRequestsAsScala(value: Option[Seq[PurchaseRequest]]): PurchaseScheduledInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.purchaseRequests(v.asJava)
    }
  }

}

final class PurchaseScheduledInstancesRequestOps(val self: PurchaseScheduledInstancesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def purchaseRequestsAsScala: Option[Seq[PurchaseRequest]] = Option(self.purchaseRequests).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPurchaseScheduledInstancesRequestOps {

  implicit def toPurchaseScheduledInstancesRequestBuilderOps(
      v: PurchaseScheduledInstancesRequest.Builder
  ): PurchaseScheduledInstancesRequestBuilderOps = new PurchaseScheduledInstancesRequestBuilderOps(v)

  implicit def toPurchaseScheduledInstancesRequestOps(
      v: PurchaseScheduledInstancesRequest
  ): PurchaseScheduledInstancesRequestOps = new PurchaseScheduledInstancesRequestOps(v)

}
