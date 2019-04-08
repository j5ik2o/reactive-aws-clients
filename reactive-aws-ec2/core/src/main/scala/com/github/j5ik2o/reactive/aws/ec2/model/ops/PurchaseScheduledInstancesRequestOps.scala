// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PurchaseScheduledInstancesRequestBuilderOps(val self: PurchaseScheduledInstancesRequest.Builder)
    extends AnyVal {

  final def clientTokenAsScala(value: Option[String]): PurchaseScheduledInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def purchaseRequestsAsScala(value: Option[Seq[PurchaseRequest]]): PurchaseScheduledInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.purchaseRequests(v.asJava)
    }
  }

}

final class PurchaseScheduledInstancesRequestOps(val self: PurchaseScheduledInstancesRequest) extends AnyVal {

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def purchaseRequestsAsScala: Option[Seq[PurchaseRequest]] = Option(self.purchaseRequests).map { v =>
    import scala.collection.JavaConverters._; v.asScala
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
