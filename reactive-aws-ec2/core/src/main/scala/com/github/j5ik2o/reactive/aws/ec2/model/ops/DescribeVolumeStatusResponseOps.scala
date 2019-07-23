// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVolumeStatusResponseBuilderOps(val self: DescribeVolumeStatusResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeVolumeStatusResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeStatusesAsScala(value: Option[Seq[VolumeStatusItem]]): DescribeVolumeStatusResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.volumeStatuses(v.asJava)
    }
  }

}

final class DescribeVolumeStatusResponseOps(val self: DescribeVolumeStatusResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeStatusesAsScala: Option[Seq[VolumeStatusItem]] = Option(self.volumeStatuses).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
