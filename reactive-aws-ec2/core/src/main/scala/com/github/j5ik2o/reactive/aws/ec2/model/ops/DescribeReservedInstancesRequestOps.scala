// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeReservedInstancesRequestBuilderOps(val self: DescribeReservedInstancesRequest.Builder)
    extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeReservedInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def offeringClassAsScala(value: Option[OfferingClassType]): DescribeReservedInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.offeringClass(v)
    }
  }

  final def reservedInstancesIdsAsScala(value: Option[Seq[String]]): DescribeReservedInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.reservedInstancesIds(v.asJava)
    }
  }

  final def offeringTypeAsScala(value: Option[OfferingTypeValues]): DescribeReservedInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.offeringType(v)
    }
  }

}

final class DescribeReservedInstancesRequestOps(val self: DescribeReservedInstancesRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def offeringClassAsScala: Option[OfferingClassType] = Option(self.offeringClass)

  final def reservedInstancesIdsAsScala: Option[Seq[String]] = Option(self.reservedInstancesIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

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
