// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotInstanceRequestBuilderOps(val self: SpotInstanceRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actualBlockHourlyPriceAsScala(value: Option[String]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.actualBlockHourlyPrice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneGroupAsScala(value: Option[String]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.availabilityZoneGroup(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDurationMinutesAsScala(value: Option[Int]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.blockDurationMinutes(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createTimeAsScala(value: Option[java.time.Instant]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.createTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faultAsScala(value: Option[SpotInstanceStateFault]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.fault(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchGroupAsScala(value: Option[String]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.launchGroup(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchSpecificationAsScala(value: Option[LaunchSpecification]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.launchSpecification(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchedAvailabilityZoneAsScala(value: Option[String]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.launchedAvailabilityZone(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productDescriptionAsScala(value: Option[RIProductDescription]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.productDescription(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotInstanceRequestIdAsScala(value: Option[String]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.spotInstanceRequestId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotPriceAsScala(value: Option[String]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.spotPrice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[SpotInstanceState]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[SpotInstanceStatus]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): SpotInstanceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[SpotInstanceType]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validFromAsScala(value: Option[java.time.Instant]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.validFrom(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validUntilAsScala(value: Option[java.time.Instant]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.validUntil(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceInterruptionBehaviorAsScala(
      value: Option[InstanceInterruptionBehavior]
  ): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.instanceInterruptionBehavior(v)
    }
  }

}

final class SpotInstanceRequestOps(val self: SpotInstanceRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actualBlockHourlyPriceAsScala: Option[String] = Option(self.actualBlockHourlyPrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneGroupAsScala: Option[String] = Option(self.availabilityZoneGroup)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDurationMinutesAsScala: Option[Int] = Option(self.blockDurationMinutes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createTimeAsScala: Option[java.time.Instant] = Option(self.createTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faultAsScala: Option[SpotInstanceStateFault] = Option(self.fault)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchGroupAsScala: Option[String] = Option(self.launchGroup)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchSpecificationAsScala: Option[LaunchSpecification] = Option(self.launchSpecification)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchedAvailabilityZoneAsScala: Option[String] = Option(self.launchedAvailabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productDescriptionAsScala: Option[RIProductDescription] = Option(self.productDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotInstanceRequestIdAsScala: Option[String] = Option(self.spotInstanceRequestId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotPriceAsScala: Option[String] = Option(self.spotPrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[SpotInstanceState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[SpotInstanceStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[SpotInstanceType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validFromAsScala: Option[java.time.Instant] = Option(self.validFrom)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validUntilAsScala: Option[java.time.Instant] = Option(self.validUntil)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceInterruptionBehaviorAsScala: Option[InstanceInterruptionBehavior] =
    Option(self.instanceInterruptionBehavior)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotInstanceRequestOps {

  implicit def toSpotInstanceRequestBuilderOps(v: SpotInstanceRequest.Builder): SpotInstanceRequestBuilderOps =
    new SpotInstanceRequestBuilderOps(v)

  implicit def toSpotInstanceRequestOps(v: SpotInstanceRequest): SpotInstanceRequestOps = new SpotInstanceRequestOps(v)

}
