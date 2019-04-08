// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeReservedInstancesResponseBuilderOps(val self: DescribeReservedInstancesResponse.Builder)
    extends AnyVal {

  final def reservedInstancesAsScala(
      value: Option[Seq[ReservedInstances]]
  ): DescribeReservedInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.reservedInstances(v.asJava)
    }
  }

}

final class DescribeReservedInstancesResponseOps(val self: DescribeReservedInstancesResponse) extends AnyVal {

  final def reservedInstancesAsScala: Option[Seq[ReservedInstances]] = Option(self.reservedInstances).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeReservedInstancesResponseOps {

  implicit def toDescribeReservedInstancesResponseBuilderOps(
      v: DescribeReservedInstancesResponse.Builder
  ): DescribeReservedInstancesResponseBuilderOps = new DescribeReservedInstancesResponseBuilderOps(v)

  implicit def toDescribeReservedInstancesResponseOps(
      v: DescribeReservedInstancesResponse
  ): DescribeReservedInstancesResponseOps = new DescribeReservedInstancesResponseOps(v)

}
