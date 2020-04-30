// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteFleetsResponseBuilderOps(val self: DeleteFleetsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def successfulFleetDeletionsAsScala(value: Option[Seq[DeleteFleetSuccessItem]]): DeleteFleetsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.successfulFleetDeletions(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def unsuccessfulFleetDeletionsAsScala(value: Option[Seq[DeleteFleetErrorItem]]): DeleteFleetsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.unsuccessfulFleetDeletions(v.asJava) } 
            }


}

final class DeleteFleetsResponseOps(val self: DeleteFleetsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def successfulFleetDeletionsAsScala: Option[Seq[DeleteFleetSuccessItem]] = Option(self.successfulFleetDeletions).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def unsuccessfulFleetDeletionsAsScala: Option[Seq[DeleteFleetErrorItem]] = Option(self.unsuccessfulFleetDeletions).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFleetsResponseOps {

implicit def toDeleteFleetsResponseBuilderOps(v: DeleteFleetsResponse.Builder): DeleteFleetsResponseBuilderOps = new DeleteFleetsResponseBuilderOps(v)

implicit def toDeleteFleetsResponseOps(v: DeleteFleetsResponse): DeleteFleetsResponseOps = new DeleteFleetsResponseOps(v)

}

