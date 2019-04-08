// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RequestSpotInstancesRequestBuilderOps(val self: RequestSpotInstancesRequest.Builder) extends AnyVal {

  final def availabilityZoneGroupAsScala(value: Option[String]): RequestSpotInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.availabilityZoneGroup(v)
    }
  }

  final def blockDurationMinutesAsScala(value: Option[Int]): RequestSpotInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.blockDurationMinutes(v)
    }
  }

  final def clientTokenAsScala(value: Option[String]): RequestSpotInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def instanceCountAsScala(value: Option[Int]): RequestSpotInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.instanceCount(v)
    }
  }

  final def launchGroupAsScala(value: Option[String]): RequestSpotInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.launchGroup(v)
    }
  }

  final def launchSpecificationAsScala(
      value: Option[RequestSpotLaunchSpecification]
  ): RequestSpotInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.launchSpecification(v)
    }
  }

  final def spotPriceAsScala(value: Option[String]): RequestSpotInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.spotPrice(v)
    }
  }

  final def typeAsScala(value: Option[SpotInstanceType]): RequestSpotInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def validFromAsScala(value: Option[java.time.Instant]): RequestSpotInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.validFrom(v)
    }
  }

  final def validUntilAsScala(value: Option[java.time.Instant]): RequestSpotInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.validUntil(v)
    }
  }

  final def instanceInterruptionBehaviorAsScala(
      value: Option[InstanceInterruptionBehavior]
  ): RequestSpotInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.instanceInterruptionBehavior(v)
    }
  }

}

final class RequestSpotInstancesRequestOps(val self: RequestSpotInstancesRequest) extends AnyVal {

  final def availabilityZoneGroupAsScala: Option[String] = Option(self.availabilityZoneGroup)

  final def blockDurationMinutesAsScala: Option[Int] = Option(self.blockDurationMinutes)

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  final def launchGroupAsScala: Option[String] = Option(self.launchGroup)

  final def launchSpecificationAsScala: Option[RequestSpotLaunchSpecification] = Option(self.launchSpecification)

  final def spotPriceAsScala: Option[String] = Option(self.spotPrice)

  final def typeAsScala: Option[SpotInstanceType] = Option(self.`type`)

  final def validFromAsScala: Option[java.time.Instant] = Option(self.validFrom)

  final def validUntilAsScala: Option[java.time.Instant] = Option(self.validUntil)

  final def instanceInterruptionBehaviorAsScala: Option[InstanceInterruptionBehavior] =
    Option(self.instanceInterruptionBehavior)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRequestSpotInstancesRequestOps {

  implicit def toRequestSpotInstancesRequestBuilderOps(
      v: RequestSpotInstancesRequest.Builder
  ): RequestSpotInstancesRequestBuilderOps = new RequestSpotInstancesRequestBuilderOps(v)

  implicit def toRequestSpotInstancesRequestOps(v: RequestSpotInstancesRequest): RequestSpotInstancesRequestOps =
    new RequestSpotInstancesRequestOps(v)

}
