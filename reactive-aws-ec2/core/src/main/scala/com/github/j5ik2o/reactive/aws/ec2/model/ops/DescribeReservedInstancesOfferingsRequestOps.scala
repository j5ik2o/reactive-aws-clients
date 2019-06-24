// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeReservedInstancesOfferingsRequestBuilderOps(
    val self: DescribeReservedInstancesOfferingsRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeMarketplaceAsScala(value: Option[Boolean]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.includeMarketplace(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[InstanceType]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxDurationAsScala(value: Option[Long]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.maxDuration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxInstanceCountAsScala(value: Option[Int]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.maxInstanceCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minDurationAsScala(value: Option[Long]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.minDuration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def offeringClassAsScala(
      value: Option[OfferingClassType]
  ): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.offeringClass(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productDescriptionAsScala(
      value: Option[RIProductDescription]
  ): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.productDescription(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesOfferingIdsAsScala(
      value: Option[Seq[String]]
  ): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.reservedInstancesOfferingIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTenancyAsScala(value: Option[Tenancy]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.instanceTenancy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeReservedInstancesOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeMarketplaceAsScala: Option[Boolean] = Option(self.includeMarketplace)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxDurationAsScala: Option[Long] = Option(self.maxDuration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxInstanceCountAsScala: Option[Int] = Option(self.maxInstanceCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minDurationAsScala: Option[Long] = Option(self.minDuration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def offeringClassAsScala: Option[OfferingClassType] = Option(self.offeringClass)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productDescriptionAsScala: Option[RIProductDescription] = Option(self.productDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesOfferingIdsAsScala: Option[Seq[String]] = Option(self.reservedInstancesOfferingIds).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTenancyAsScala: Option[Tenancy] = Option(self.instanceTenancy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
