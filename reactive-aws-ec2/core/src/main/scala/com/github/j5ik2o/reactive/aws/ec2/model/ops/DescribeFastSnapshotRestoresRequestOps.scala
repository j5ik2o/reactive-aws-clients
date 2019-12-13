// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFastSnapshotRestoresRequestBuilderOps(val self: DescribeFastSnapshotRestoresRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeFastSnapshotRestoresRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeFastSnapshotRestoresRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeFastSnapshotRestoresRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeFastSnapshotRestoresRequestOps(val self: DescribeFastSnapshotRestoresRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFastSnapshotRestoresRequestOps {

  implicit def toDescribeFastSnapshotRestoresRequestBuilderOps(
      v: DescribeFastSnapshotRestoresRequest.Builder
  ): DescribeFastSnapshotRestoresRequestBuilderOps = new DescribeFastSnapshotRestoresRequestBuilderOps(v)

  implicit def toDescribeFastSnapshotRestoresRequestOps(
      v: DescribeFastSnapshotRestoresRequest
  ): DescribeFastSnapshotRestoresRequestOps = new DescribeFastSnapshotRestoresRequestOps(v)

}
