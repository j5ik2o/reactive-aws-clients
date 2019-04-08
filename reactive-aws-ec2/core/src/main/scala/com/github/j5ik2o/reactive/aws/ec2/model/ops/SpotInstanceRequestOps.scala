// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotInstanceRequestBuilderOps(val self: SpotInstanceRequest.Builder) extends AnyVal {

  final def actualBlockHourlyPriceAsScala(value: Option[String]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.actualBlockHourlyPrice(v)
    }
  }

  final def availabilityZoneGroupAsScala(value: Option[String]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.availabilityZoneGroup(v)
    }
  }

  final def blockDurationMinutesAsScala(value: Option[Int]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.blockDurationMinutes(v)
    }
  }

  final def createTimeAsScala(value: Option[java.time.Instant]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.createTime(v)
    }
  }

  final def faultAsScala(value: Option[SpotInstanceStateFault]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.fault(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def launchGroupAsScala(value: Option[String]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.launchGroup(v)
    }
  }

  final def launchSpecificationAsScala(value: Option[LaunchSpecification]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.launchSpecification(v)
    }
  }

  final def launchedAvailabilityZoneAsScala(value: Option[String]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.launchedAvailabilityZone(v)
    }
  }

  final def productDescriptionAsScala(value: Option[RIProductDescription]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.productDescription(v)
    }
  }

  final def spotInstanceRequestIdAsScala(value: Option[String]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.spotInstanceRequestId(v)
    }
  }

  final def spotPriceAsScala(value: Option[String]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.spotPrice(v)
    }
  }

  final def stateAsScala(value: Option[SpotInstanceState]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def statusAsScala(value: Option[SpotInstanceStatus]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): SpotInstanceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def typeAsScala(value: Option[SpotInstanceType]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def validFromAsScala(value: Option[java.time.Instant]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.validFrom(v)
    }
  }

  final def validUntilAsScala(value: Option[java.time.Instant]): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.validUntil(v)
    }
  }

  final def instanceInterruptionBehaviorAsScala(
      value: Option[InstanceInterruptionBehavior]
  ): SpotInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.instanceInterruptionBehavior(v)
    }
  }

}

final class SpotInstanceRequestOps(val self: SpotInstanceRequest) extends AnyVal {

  final def actualBlockHourlyPriceAsScala: Option[String] = Option(self.actualBlockHourlyPrice)

  final def availabilityZoneGroupAsScala: Option[String] = Option(self.availabilityZoneGroup)

  final def blockDurationMinutesAsScala: Option[Int] = Option(self.blockDurationMinutes)

  final def createTimeAsScala: Option[java.time.Instant] = Option(self.createTime)

  final def faultAsScala: Option[SpotInstanceStateFault] = Option(self.fault)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def launchGroupAsScala: Option[String] = Option(self.launchGroup)

  final def launchSpecificationAsScala: Option[LaunchSpecification] = Option(self.launchSpecification)

  final def launchedAvailabilityZoneAsScala: Option[String] = Option(self.launchedAvailabilityZone)

  final def productDescriptionAsScala: Option[RIProductDescription] = Option(self.productDescription)

  final def spotInstanceRequestIdAsScala: Option[String] = Option(self.spotInstanceRequestId)

  final def spotPriceAsScala: Option[String] = Option(self.spotPrice)

  final def stateAsScala: Option[SpotInstanceState] = Option(self.state)

  final def statusAsScala: Option[SpotInstanceStatus] = Option(self.status)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def typeAsScala: Option[SpotInstanceType] = Option(self.`type`)

  final def validFromAsScala: Option[java.time.Instant] = Option(self.validFrom)

  final def validUntilAsScala: Option[java.time.Instant] = Option(self.validUntil)

  final def instanceInterruptionBehaviorAsScala: Option[InstanceInterruptionBehavior] =
    Option(self.instanceInterruptionBehavior)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotInstanceRequestOps {

  implicit def toSpotInstanceRequestBuilderOps(v: SpotInstanceRequest.Builder): SpotInstanceRequestBuilderOps =
    new SpotInstanceRequestBuilderOps(v)

  implicit def toSpotInstanceRequestOps(v: SpotInstanceRequest): SpotInstanceRequestOps = new SpotInstanceRequestOps(v)

}
