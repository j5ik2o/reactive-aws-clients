// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVolumesModificationsResponseBuilderOps(val self: DescribeVolumesModificationsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumesModificationsAsScala(
      value: Option[Seq[VolumeModification]]
  ): DescribeVolumesModificationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.volumesModifications(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeVolumesModificationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeVolumesModificationsResponseOps(val self: DescribeVolumesModificationsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumesModificationsAsScala: Option[Seq[VolumeModification]] = Option(self.volumesModifications).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVolumesModificationsResponseOps {

  implicit def toDescribeVolumesModificationsResponseBuilderOps(
      v: DescribeVolumesModificationsResponse.Builder
  ): DescribeVolumesModificationsResponseBuilderOps = new DescribeVolumesModificationsResponseBuilderOps(v)

  implicit def toDescribeVolumesModificationsResponseOps(
      v: DescribeVolumesModificationsResponse
  ): DescribeVolumesModificationsResponseOps = new DescribeVolumesModificationsResponseOps(v)

}
