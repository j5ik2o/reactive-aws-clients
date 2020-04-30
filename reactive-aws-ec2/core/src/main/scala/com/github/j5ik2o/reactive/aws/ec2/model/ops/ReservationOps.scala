// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReservationBuilderOps(val self: Reservation.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupsAsScala(value: Option[Seq[GroupIdentifier]]): Reservation.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.groups(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instancesAsScala(value: Option[Seq[Instance]]): Reservation.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instances(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ownerIdAsScala(value: Option[String]): Reservation.Builder = {
            value.fold(self){ v => self.ownerId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requesterIdAsScala(value: Option[String]): Reservation.Builder = {
            value.fold(self){ v => self.requesterId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def reservationIdAsScala(value: Option[String]): Reservation.Builder = {
            value.fold(self){ v => self.reservationId(v) }
            } 


}

final class ReservationOps(val self: Reservation) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def groupsAsScala: Option[Seq[GroupIdentifier]] = Option(self.groups).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def instancesAsScala: Option[Seq[Instance]] = Option(self.instances).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ownerIdAsScala: Option[String] = Option(self.ownerId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requesterIdAsScala: Option[String] = Option(self.requesterId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def reservationIdAsScala: Option[String] = Option(self.reservationId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReservationOps {

implicit def toReservationBuilderOps(v: Reservation.Builder): ReservationBuilderOps = new ReservationBuilderOps(v)

implicit def toReservationOps(v: Reservation): ReservationOps = new ReservationOps(v)

}

