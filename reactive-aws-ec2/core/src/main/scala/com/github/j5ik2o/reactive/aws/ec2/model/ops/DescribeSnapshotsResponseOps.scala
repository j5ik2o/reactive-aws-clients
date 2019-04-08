// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSnapshotsResponseBuilderOps(val self: DescribeSnapshotsResponse.Builder) extends AnyVal {

  final def snapshotsAsScala(value: Option[Seq[Snapshot]]): DescribeSnapshotsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.snapshots(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeSnapshotsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeSnapshotsResponseOps(val self: DescribeSnapshotsResponse) extends AnyVal {

  final def snapshotsAsScala: Option[Seq[Snapshot]] = Option(self.snapshots).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSnapshotsResponseOps {

  implicit def toDescribeSnapshotsResponseBuilderOps(
      v: DescribeSnapshotsResponse.Builder
  ): DescribeSnapshotsResponseBuilderOps = new DescribeSnapshotsResponseBuilderOps(v)

  implicit def toDescribeSnapshotsResponseOps(v: DescribeSnapshotsResponse): DescribeSnapshotsResponseOps =
    new DescribeSnapshotsResponseOps(v)

}
