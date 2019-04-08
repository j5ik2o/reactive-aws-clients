// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSnapshotAttributeResponseBuilderOps(val self: DescribeSnapshotAttributeResponse.Builder)
    extends AnyVal {

  final def createVolumePermissionsAsScala(
      value: Option[Seq[CreateVolumePermission]]
  ): DescribeSnapshotAttributeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.createVolumePermissions(v.asJava)
    }
  }

  final def productCodesAsScala(value: Option[Seq[ProductCode]]): DescribeSnapshotAttributeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.productCodes(v.asJava)
    }
  }

  final def snapshotIdAsScala(value: Option[String]): DescribeSnapshotAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.snapshotId(v)
    }
  }

}

final class DescribeSnapshotAttributeResponseOps(val self: DescribeSnapshotAttributeResponse) extends AnyVal {

  final def createVolumePermissionsAsScala: Option[Seq[CreateVolumePermission]] =
    Option(self.createVolumePermissions).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def productCodesAsScala: Option[Seq[ProductCode]] = Option(self.productCodes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSnapshotAttributeResponseOps {

  implicit def toDescribeSnapshotAttributeResponseBuilderOps(
      v: DescribeSnapshotAttributeResponse.Builder
  ): DescribeSnapshotAttributeResponseBuilderOps = new DescribeSnapshotAttributeResponseBuilderOps(v)

  implicit def toDescribeSnapshotAttributeResponseOps(
      v: DescribeSnapshotAttributeResponse
  ): DescribeSnapshotAttributeResponseOps = new DescribeSnapshotAttributeResponseOps(v)

}
