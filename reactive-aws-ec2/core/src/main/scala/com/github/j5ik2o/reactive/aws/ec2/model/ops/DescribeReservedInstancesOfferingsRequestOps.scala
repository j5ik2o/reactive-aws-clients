// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeReservedInstancesOfferingsRequestBuilderOps(
    val self: DescribeReservedInstancesOfferingsRequest.Builder
) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def includeMarketplaceAsScala(value: Option[Boolean]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.includeMarketplace(v)
    }
  }

  final def instanceTypeAsScala(value: Option[InstanceType]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def maxDurationAsScala(value: Option[Long]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.maxDuration(v)
    }
  }

  final def maxInstanceCountAsScala(value: Option[Int]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.maxInstanceCount(v)
    }
  }

  final def minDurationAsScala(value: Option[Long]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.minDuration(v)
    }
  }

  final def offeringClassAsScala(
      value: Option[OfferingClassType]
  ): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.offeringClass(v)
    }
  }

  final def productDescriptionAsScala(
      value: Option[RIProductDescription]
  ): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.productDescription(v)
    }
  }

  final def reservedInstancesOfferingIdsAsScala(
      value: Option[Seq[String]]
  ): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.reservedInstancesOfferingIds(v.asJava)
    }
  }

  final def instanceTenancyAsScala(value: Option[Tenancy]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.instanceTenancy(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def offeringTypeAsScala(
      value: Option[OfferingTypeValues]
  ): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.offeringType(v)
    }
  }

}

final class DescribeReservedInstancesOfferingsRequestOps(val self: DescribeReservedInstancesOfferingsRequest)
    extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def includeMarketplaceAsScala: Option[Boolean] = Option(self.includeMarketplace)

  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  final def maxDurationAsScala: Option[Long] = Option(self.maxDuration)

  final def maxInstanceCountAsScala: Option[Int] = Option(self.maxInstanceCount)

  final def minDurationAsScala: Option[Long] = Option(self.minDuration)

  final def offeringClassAsScala: Option[OfferingClassType] = Option(self.offeringClass)

  final def productDescriptionAsScala: Option[RIProductDescription] = Option(self.productDescription)

  final def reservedInstancesOfferingIdsAsScala: Option[Seq[String]] = Option(self.reservedInstancesOfferingIds).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

  final def instanceTenancyAsScala: Option[Tenancy] = Option(self.instanceTenancy)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def offeringTypeAsScala: Option[OfferingTypeValues] = Option(self.offeringType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeReservedInstancesOfferingsRequestOps {

  implicit def toDescribeReservedInstancesOfferingsRequestBuilderOps(
      v: DescribeReservedInstancesOfferingsRequest.Builder
  ): DescribeReservedInstancesOfferingsRequestBuilderOps = new DescribeReservedInstancesOfferingsRequestBuilderOps(v)

  implicit def toDescribeReservedInstancesOfferingsRequestOps(
      v: DescribeReservedInstancesOfferingsRequest
  ): DescribeReservedInstancesOfferingsRequestOps = new DescribeReservedInstancesOfferingsRequestOps(v)

}
