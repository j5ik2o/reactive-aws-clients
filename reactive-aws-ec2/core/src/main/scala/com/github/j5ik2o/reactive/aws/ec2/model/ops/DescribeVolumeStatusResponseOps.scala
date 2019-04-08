// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVolumeStatusResponseBuilderOps(val self: DescribeVolumeStatusResponse.Builder) extends AnyVal {

  final def nextTokenAsScala(value: Option[String]): DescribeVolumeStatusResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def volumeStatusesAsScala(value: Option[Seq[VolumeStatusItem]]): DescribeVolumeStatusResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.volumeStatuses(v.asJava)
    }
  }

}

final class DescribeVolumeStatusResponseOps(val self: DescribeVolumeStatusResponse) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def volumeStatusesAsScala: Option[Seq[VolumeStatusItem]] = Option(self.volumeStatuses).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVolumeStatusResponseOps {

  implicit def toDescribeVolumeStatusResponseBuilderOps(
      v: DescribeVolumeStatusResponse.Builder
  ): DescribeVolumeStatusResponseBuilderOps = new DescribeVolumeStatusResponseBuilderOps(v)

  implicit def toDescribeVolumeStatusResponseOps(v: DescribeVolumeStatusResponse): DescribeVolumeStatusResponseOps =
    new DescribeVolumeStatusResponseOps(v)

}
