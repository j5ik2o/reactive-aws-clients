// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PurchaseScheduledInstancesResponseBuilderOps(val self: PurchaseScheduledInstancesResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scheduledInstanceSetAsScala(
      value: Option[Seq[ScheduledInstance]]
  ): PurchaseScheduledInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.scheduledInstanceSet(v.asJava)
    }
  }

}

final class PurchaseScheduledInstancesResponseOps(val self: PurchaseScheduledInstancesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scheduledInstanceSetAsScala: Option[Seq[ScheduledInstance]] = Option(self.scheduledInstanceSet).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPurchaseScheduledInstancesResponseOps {

  implicit def toPurchaseScheduledInstancesResponseBuilderOps(
      v: PurchaseScheduledInstancesResponse.Builder
  ): PurchaseScheduledInstancesResponseBuilderOps = new PurchaseScheduledInstancesResponseBuilderOps(v)

  implicit def toPurchaseScheduledInstancesResponseOps(
      v: PurchaseScheduledInstancesResponse
  ): PurchaseScheduledInstancesResponseOps = new PurchaseScheduledInstancesResponseOps(v)

}
