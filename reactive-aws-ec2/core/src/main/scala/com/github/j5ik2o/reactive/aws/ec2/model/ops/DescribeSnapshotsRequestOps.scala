// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSnapshotsRequestBuilderOps(val self: DescribeSnapshotsRequest.Builder) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeSnapshotsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeSnapshotsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeSnapshotsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def ownerIdsAsScala(value: Option[Seq[String]]): DescribeSnapshotsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ownerIds(v.asJava)
    }
  }

  final def restorableByUserIdsAsScala(value: Option[Seq[String]]): DescribeSnapshotsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.restorableByUserIds(v.asJava)
    }
  }

  final def snapshotIdsAsScala(value: Option[Seq[String]]): DescribeSnapshotsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.snapshotIds(v.asJava)
    }
  }

}

final class DescribeSnapshotsRequestOps(val self: DescribeSnapshotsRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def ownerIdsAsScala: Option[Seq[String]] = Option(self.ownerIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def restorableByUserIdsAsScala: Option[Seq[String]] = Option(self.restorableByUserIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def snapshotIdsAsScala: Option[Seq[String]] = Option(self.snapshotIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSnapshotsRequestOps {

  implicit def toDescribeSnapshotsRequestBuilderOps(
      v: DescribeSnapshotsRequest.Builder
  ): DescribeSnapshotsRequestBuilderOps = new DescribeSnapshotsRequestBuilderOps(v)

  implicit def toDescribeSnapshotsRequestOps(v: DescribeSnapshotsRequest): DescribeSnapshotsRequestOps =
    new DescribeSnapshotsRequestOps(v)

}
