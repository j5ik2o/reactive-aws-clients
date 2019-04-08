// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeReservedInstancesModificationsRequestBuilderOps(
    val self: DescribeReservedInstancesModificationsRequest.Builder
) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeReservedInstancesModificationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def reservedInstancesModificationIdsAsScala(
      value: Option[Seq[String]]
  ): DescribeReservedInstancesModificationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.reservedInstancesModificationIds(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeReservedInstancesModificationsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeReservedInstancesModificationsRequestOps(val self: DescribeReservedInstancesModificationsRequest)
    extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def reservedInstancesModificationIdsAsScala: Option[Seq[String]] =
    Option(self.reservedInstancesModificationIds).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeReservedInstancesModificationsRequestOps {

  implicit def toDescribeReservedInstancesModificationsRequestBuilderOps(
      v: DescribeReservedInstancesModificationsRequest.Builder
  ): DescribeReservedInstancesModificationsRequestBuilderOps =
    new DescribeReservedInstancesModificationsRequestBuilderOps(v)

  implicit def toDescribeReservedInstancesModificationsRequestOps(
      v: DescribeReservedInstancesModificationsRequest
  ): DescribeReservedInstancesModificationsRequestOps = new DescribeReservedInstancesModificationsRequestOps(v)

}
