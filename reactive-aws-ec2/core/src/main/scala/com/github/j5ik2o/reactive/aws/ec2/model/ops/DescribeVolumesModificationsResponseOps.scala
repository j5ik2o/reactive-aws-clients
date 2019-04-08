// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVolumesModificationsResponseBuilderOps(val self: DescribeVolumesModificationsResponse.Builder)
    extends AnyVal {

  final def volumesModificationsAsScala(
      value: Option[Seq[VolumeModification]]
  ): DescribeVolumesModificationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.volumesModifications(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeVolumesModificationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeVolumesModificationsResponseOps(val self: DescribeVolumesModificationsResponse) extends AnyVal {

  final def volumesModificationsAsScala: Option[Seq[VolumeModification]] = Option(self.volumesModifications).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

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
