// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReservationBuilderOps(val self: Reservation.Builder) extends AnyVal {

  final def groupsAsScala(value: Option[Seq[GroupIdentifier]]): Reservation.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.groups(v.asJava)
    }
  }

  final def instancesAsScala(value: Option[Seq[Instance]]): Reservation.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instances(v.asJava)
    }
  }

  final def ownerIdAsScala(value: Option[String]): Reservation.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  final def requesterIdAsScala(value: Option[String]): Reservation.Builder = {
    value.fold(self) { v =>
      self.requesterId(v)
    }
  }

  final def reservationIdAsScala(value: Option[String]): Reservation.Builder = {
    value.fold(self) { v =>
      self.reservationId(v)
    }
  }

}

final class ReservationOps(val self: Reservation) extends AnyVal {

  final def groupsAsScala: Option[Seq[GroupIdentifier]] = Option(self.groups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def instancesAsScala: Option[Seq[Instance]] = Option(self.instances).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  final def requesterIdAsScala: Option[String] = Option(self.requesterId)

  final def reservationIdAsScala: Option[String] = Option(self.reservationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReservationOps {

  implicit def toReservationBuilderOps(v: Reservation.Builder): ReservationBuilderOps = new ReservationBuilderOps(v)

  implicit def toReservationOps(v: Reservation): ReservationOps = new ReservationOps(v)

}
