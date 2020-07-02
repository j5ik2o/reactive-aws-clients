// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeAvailabilityZonesRequestBuilderOps(val self: DescribeAvailabilityZonesRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeAvailabilityZonesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zoneNamesAsScala(value: Option[Seq[String]]): DescribeAvailabilityZonesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.zoneNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zoneIdsAsScala(value: Option[Seq[String]]): DescribeAvailabilityZonesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.zoneIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allAvailabilityZonesAsScala(value: Option[Boolean]): DescribeAvailabilityZonesRequest.Builder = {
    value.fold(self) { v => self.allAvailabilityZones(v) }
  }

}

final class DescribeAvailabilityZonesRequestOps(val self: DescribeAvailabilityZonesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] =
    Option(self.filters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zoneNamesAsScala: Option[Seq[String]] =
    Option(self.zoneNames).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zoneIdsAsScala: Option[Seq[String]] =
    Option(self.zoneIds).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allAvailabilityZonesAsScala: Option[Boolean] = Option(self.allAvailabilityZones)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAvailabilityZonesRequestOps {

  implicit def toDescribeAvailabilityZonesRequestBuilderOps(
      v: DescribeAvailabilityZonesRequest.Builder
  ): DescribeAvailabilityZonesRequestBuilderOps = new DescribeAvailabilityZonesRequestBuilderOps(v)

  implicit def toDescribeAvailabilityZonesRequestOps(
      v: DescribeAvailabilityZonesRequest
  ): DescribeAvailabilityZonesRequestOps = new DescribeAvailabilityZonesRequestOps(v)

}
