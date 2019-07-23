// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReservedInstancesListingBuilderOps(val self: ReservedInstancesListing.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): ReservedInstancesListing.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createDateAsScala(value: Option[java.time.Instant]): ReservedInstancesListing.Builder = {
    value.fold(self) { v =>
      self.createDate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountsAsScala(value: Option[Seq[InstanceCount]]): ReservedInstancesListing.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceCounts(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priceSchedulesAsScala(value: Option[Seq[PriceSchedule]]): ReservedInstancesListing.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.priceSchedules(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdAsScala(value: Option[String]): ReservedInstancesListing.Builder = {
    value.fold(self) { v =>
      self.reservedInstancesId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesListingIdAsScala(value: Option[String]): ReservedInstancesListing.Builder = {
    value.fold(self) { v =>
      self.reservedInstancesListingId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ListingStatus]): ReservedInstancesListing.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): ReservedInstancesListing.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): ReservedInstancesListing.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateDateAsScala(value: Option[java.time.Instant]): ReservedInstancesListing.Builder = {
    value.fold(self) { v =>
      self.updateDate(v)
    }
  }

}

final class ReservedInstancesListingOps(val self: ReservedInstancesListing) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createDateAsScala: Option[java.time.Instant] = Option(self.createDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountsAsScala: Option[Seq[InstanceCount]] = Option(self.instanceCounts).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priceSchedulesAsScala: Option[Seq[PriceSchedule]] = Option(self.priceSchedules).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdAsScala: Option[String] = Option(self.reservedInstancesId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesListingIdAsScala: Option[String] = Option(self.reservedInstancesListingId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ListingStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
