// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeReservedInstancesModificationsResponseBuilderOps(
    val self: DescribeReservedInstancesModificationsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeReservedInstancesModificationsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesModificationsAsScala(
      value: Option[Seq[ReservedInstancesModification]]
  ): DescribeReservedInstancesModificationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.reservedInstancesModifications(v.asJava)
    }
  }

}

final class DescribeReservedInstancesModificationsResponseOps(val self: DescribeReservedInstancesModificationsResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesModificationsAsScala: Option[Seq[ReservedInstancesModification]] =
    Option(self.reservedInstancesModifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeReservedInstancesModificationsResponseOps {

  implicit def toDescribeReservedInstancesModificationsResponseBuilderOps(
      v: DescribeReservedInstancesModificationsResponse.Builder
  ): DescribeReservedInstancesModificationsResponseBuilderOps =
    new DescribeReservedInstancesModificationsResponseBuilderOps(v)

  implicit def toDescribeReservedInstancesModificationsResponseOps(
      v: DescribeReservedInstancesModificationsResponse
  ): DescribeReservedInstancesModificationsResponseOps = new DescribeReservedInstancesModificationsResponseOps(v)

}
