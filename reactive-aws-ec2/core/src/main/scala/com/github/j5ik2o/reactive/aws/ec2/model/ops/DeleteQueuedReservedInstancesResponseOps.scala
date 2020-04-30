// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteQueuedReservedInstancesResponseBuilderOps(val self: DeleteQueuedReservedInstancesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def successfulQueuedPurchaseDeletionsAsScala(value: Option[Seq[SuccessfulQueuedPurchaseDeletion]]): DeleteQueuedReservedInstancesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.successfulQueuedPurchaseDeletions(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def failedQueuedPurchaseDeletionsAsScala(value: Option[Seq[FailedQueuedPurchaseDeletion]]): DeleteQueuedReservedInstancesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failedQueuedPurchaseDeletions(v.asJava) } 
            }


}

final class DeleteQueuedReservedInstancesResponseOps(val self: DeleteQueuedReservedInstancesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def successfulQueuedPurchaseDeletionsAsScala: Option[Seq[SuccessfulQueuedPurchaseDeletion]] = Option(self.successfulQueuedPurchaseDeletions).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def failedQueuedPurchaseDeletionsAsScala: Option[Seq[FailedQueuedPurchaseDeletion]] = Option(self.failedQueuedPurchaseDeletions).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteQueuedReservedInstancesResponseOps {

implicit def toDeleteQueuedReservedInstancesResponseBuilderOps(v: DeleteQueuedReservedInstancesResponse.Builder): DeleteQueuedReservedInstancesResponseBuilderOps = new DeleteQueuedReservedInstancesResponseBuilderOps(v)

implicit def toDeleteQueuedReservedInstancesResponseOps(v: DeleteQueuedReservedInstancesResponse): DeleteQueuedReservedInstancesResponseOps = new DeleteQueuedReservedInstancesResponseOps(v)

}

