// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetHostReservationPurchasePreviewRequestBuilderOps(
    val self: GetHostReservationPurchasePreviewRequest.Builder
) extends AnyVal {

  final def hostIdSetAsScala(value: Option[Seq[String]]): GetHostReservationPurchasePreviewRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.hostIdSet(v.asJava)
    }
  }

  final def offeringIdAsScala(value: Option[String]): GetHostReservationPurchasePreviewRequest.Builder = {
    value.fold(self) { v =>
      self.offeringId(v)
    }
  }

}

final class GetHostReservationPurchasePreviewRequestOps(val self: GetHostReservationPurchasePreviewRequest)
    extends AnyVal {

  final def hostIdSetAsScala: Option[Seq[String]] = Option(self.hostIdSet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def offeringIdAsScala: Option[String] = Option(self.offeringId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetHostReservationPurchasePreviewRequestOps {

  implicit def toGetHostReservationPurchasePreviewRequestBuilderOps(
      v: GetHostReservationPurchasePreviewRequest.Builder
  ): GetHostReservationPurchasePreviewRequestBuilderOps = new GetHostReservationPurchasePreviewRequestBuilderOps(v)

  implicit def toGetHostReservationPurchasePreviewRequestOps(
      v: GetHostReservationPurchasePreviewRequest
  ): GetHostReservationPurchasePreviewRequestOps = new GetHostReservationPurchasePreviewRequestOps(v)

}
