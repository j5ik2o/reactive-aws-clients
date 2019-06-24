// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeAvailabilityZonesResponseBuilderOps(val self: DescribeAvailabilityZonesResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZonesAsScala(
      value: Option[Seq[AvailabilityZone]]
  ): DescribeAvailabilityZonesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.availabilityZones(v.asJava)
    }
  }

}

final class DescribeAvailabilityZonesResponseOps(val self: DescribeAvailabilityZonesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZonesAsScala: Option[Seq[AvailabilityZone]] = Option(self.availabilityZones).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAvailabilityZonesResponseOps {

  implicit def toDescribeAvailabilityZonesResponseBuilderOps(
      v: DescribeAvailabilityZonesResponse.Builder
  ): DescribeAvailabilityZonesResponseBuilderOps = new DescribeAvailabilityZonesResponseBuilderOps(v)

  implicit def toDescribeAvailabilityZonesResponseOps(
      v: DescribeAvailabilityZonesResponse
  ): DescribeAvailabilityZonesResponseOps = new DescribeAvailabilityZonesResponseOps(v)

}
