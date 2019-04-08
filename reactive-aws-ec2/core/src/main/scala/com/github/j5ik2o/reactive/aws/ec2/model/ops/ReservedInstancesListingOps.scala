// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReservedInstancesListingBuilderOps(val self: ReservedInstancesListing.Builder) extends AnyVal {

  final def clientTokenAsScala(value: Option[String]): ReservedInstancesListing.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def createDateAsScala(value: Option[java.time.Instant]): ReservedInstancesListing.Builder = {
    value.fold(self) { v =>
      self.createDate(v)
    }
  }

  final def instanceCountsAsScala(value: Option[Seq[InstanceCount]]): ReservedInstancesListing.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instanceCounts(v.asJava)
    }
  }

  final def priceSchedulesAsScala(value: Option[Seq[PriceSchedule]]): ReservedInstancesListing.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.priceSchedules(v.asJava)
    }
  }

  final def reservedInstancesIdAsScala(value: Option[String]): ReservedInstancesListing.Builder = {
    value.fold(self) { v =>
      self.reservedInstancesId(v)
    }
  }

  final def reservedInstancesListingIdAsScala(value: Option[String]): ReservedInstancesListing.Builder = {
    value.fold(self) { v =>
      self.reservedInstancesListingId(v)
    }
  }

  final def statusAsScala(value: Option[ListingStatus]): ReservedInstancesListing.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def statusMessageAsScala(value: Option[String]): ReservedInstancesListing.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): ReservedInstancesListing.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def updateDateAsScala(value: Option[java.time.Instant]): ReservedInstancesListing.Builder = {
    value.fold(self) { v =>
      self.updateDate(v)
    }
  }

}

final class ReservedInstancesListingOps(val self: ReservedInstancesListing) extends AnyVal {

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def createDateAsScala: Option[java.time.Instant] = Option(self.createDate)

  final def instanceCountsAsScala: Option[Seq[InstanceCount]] = Option(self.instanceCounts).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def priceSchedulesAsScala: Option[Seq[PriceSchedule]] = Option(self.priceSchedules).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def reservedInstancesIdAsScala: Option[String] = Option(self.reservedInstancesId)

  final def reservedInstancesListingIdAsScala: Option[String] = Option(self.reservedInstancesListingId)

  final def statusAsScala: Option[ListingStatus] = Option(self.status)

  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def updateDateAsScala: Option[java.time.Instant] = Option(self.updateDate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReservedInstancesListingOps {

  implicit def toReservedInstancesListingBuilderOps(
      v: ReservedInstancesListing.Builder
  ): ReservedInstancesListingBuilderOps = new ReservedInstancesListingBuilderOps(v)

  implicit def toReservedInstancesListingOps(v: ReservedInstancesListing): ReservedInstancesListingOps =
    new ReservedInstancesListingOps(v)

}
