// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteQueuedReservedInstancesRequestBuilderOps(val self: DeleteQueuedReservedInstancesRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdsAsScala(value: Option[Seq[String]]): DeleteQueuedReservedInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.reservedInstancesIds(v.asJava)
    }
  }

}

final class DeleteQueuedReservedInstancesRequestOps(val self: DeleteQueuedReservedInstancesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdsAsScala: Option[Seq[String]] =
    Option(self.reservedInstancesIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteQueuedReservedInstancesRequestOps {

  implicit def toDeleteQueuedReservedInstancesRequestBuilderOps(
      v: DeleteQueuedReservedInstancesRequest.Builder
  ): DeleteQueuedReservedInstancesRequestBuilderOps = new DeleteQueuedReservedInstancesRequestBuilderOps(v)

  implicit def toDeleteQueuedReservedInstancesRequestOps(
      v: DeleteQueuedReservedInstancesRequest
  ): DeleteQueuedReservedInstancesRequestOps = new DeleteQueuedReservedInstancesRequestOps(v)

}
