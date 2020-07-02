// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeReservedInstancesRequestBuilderOps(val self: DescribeReservedInstancesRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeReservedInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def offeringClassAsScala(value: Option[OfferingClassType]): DescribeReservedInstancesRequest.Builder = {
    value.fold(self) { v => self.offeringClass(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdsAsScala(value: Option[Seq[String]]): DescribeReservedInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.reservedInstancesIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def offeringTypeAsScala(value: Option[OfferingTypeValues]): DescribeReservedInstancesRequest.Builder = {
    value.fold(self) { v => self.offeringType(v) }
  }

}

final class DescribeReservedInstancesRequestOps(val self: DescribeReservedInstancesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] =
    Option(self.filters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def offeringClassAsScala: Option[OfferingClassType] = Option(self.offeringClass)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdsAsScala: Option[Seq[String]] =
    Option(self.reservedInstancesIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def offeringTypeAsScala: Option[OfferingTypeValues] = Option(self.offeringType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeReservedInstancesRequestOps {

  implicit def toDescribeReservedInstancesRequestBuilderOps(
      v: DescribeReservedInstancesRequest.Builder
  ): DescribeReservedInstancesRequestBuilderOps = new DescribeReservedInstancesRequestBuilderOps(v)

  implicit def toDescribeReservedInstancesRequestOps(
      v: DescribeReservedInstancesRequest
  ): DescribeReservedInstancesRequestOps = new DescribeReservedInstancesRequestOps(v)

}
