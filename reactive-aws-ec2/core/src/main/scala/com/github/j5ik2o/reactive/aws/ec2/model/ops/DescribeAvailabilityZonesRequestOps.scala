// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeAvailabilityZonesRequestBuilderOps(val self: DescribeAvailabilityZonesRequest.Builder)
    extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeAvailabilityZonesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def zoneNamesAsScala(value: Option[Seq[String]]): DescribeAvailabilityZonesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.zoneNames(v.asJava)
    }
  }

  final def zoneIdsAsScala(value: Option[Seq[String]]): DescribeAvailabilityZonesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.zoneIds(v.asJava)
    }
  }

}

final class DescribeAvailabilityZonesRequestOps(val self: DescribeAvailabilityZonesRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def zoneNamesAsScala: Option[Seq[String]] = Option(self.zoneNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def zoneIdsAsScala: Option[Seq[String]] = Option(self.zoneIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

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
