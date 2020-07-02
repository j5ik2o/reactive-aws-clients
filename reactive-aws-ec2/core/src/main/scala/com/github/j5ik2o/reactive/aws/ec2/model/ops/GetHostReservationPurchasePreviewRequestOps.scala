// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetHostReservationPurchasePreviewRequestBuilderOps(
    val self: GetHostReservationPurchasePreviewRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostIdSetAsScala(value: Option[Seq[String]]): GetHostReservationPurchasePreviewRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.hostIdSet(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def offeringIdAsScala(value: Option[String]): GetHostReservationPurchasePreviewRequest.Builder = {
    value.fold(self) { v => self.offeringId(v) }
  }

}

final class GetHostReservationPurchasePreviewRequestOps(val self: GetHostReservationPurchasePreviewRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostIdSetAsScala: Option[Seq[String]] =
    Option(self.hostIdSet).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
