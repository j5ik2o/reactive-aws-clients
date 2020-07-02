// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSnapshotAttributeResponseBuilderOps(val self: DescribeSnapshotAttributeResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createVolumePermissionsAsScala(
      value: Option[Seq[CreateVolumePermission]]
  ): DescribeSnapshotAttributeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.createVolumePermissions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productCodesAsScala(value: Option[Seq[ProductCode]]): DescribeSnapshotAttributeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.productCodes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala(value: Option[String]): DescribeSnapshotAttributeResponse.Builder = {
    value.fold(self) { v => self.snapshotId(v) }
  }

}

final class DescribeSnapshotAttributeResponseOps(val self: DescribeSnapshotAttributeResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createVolumePermissionsAsScala: Option[Seq[CreateVolumePermission]] =
    Option(self.createVolumePermissions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productCodesAsScala: Option[Seq[ProductCode]] =
    Option(self.productCodes).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
