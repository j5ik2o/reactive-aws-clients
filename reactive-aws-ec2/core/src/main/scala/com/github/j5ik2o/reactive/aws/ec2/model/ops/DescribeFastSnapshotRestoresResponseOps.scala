// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFastSnapshotRestoresResponseBuilderOps(val self: DescribeFastSnapshotRestoresResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fastSnapshotRestoresAsScala(
      value: Option[Seq[DescribeFastSnapshotRestoreSuccessItem]]
  ): DescribeFastSnapshotRestoresResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.fastSnapshotRestores(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeFastSnapshotRestoresResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeFastSnapshotRestoresResponseOps(val self: DescribeFastSnapshotRestoresResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fastSnapshotRestoresAsScala: Option[Seq[DescribeFastSnapshotRestoreSuccessItem]] =
    Option(self.fastSnapshotRestores).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFastSnapshotRestoresResponseOps {

  implicit def toDescribeFastSnapshotRestoresResponseBuilderOps(
      v: DescribeFastSnapshotRestoresResponse.Builder
  ): DescribeFastSnapshotRestoresResponseBuilderOps = new DescribeFastSnapshotRestoresResponseBuilderOps(v)

  implicit def toDescribeFastSnapshotRestoresResponseOps(
      v: DescribeFastSnapshotRestoresResponse
  ): DescribeFastSnapshotRestoresResponseOps = new DescribeFastSnapshotRestoresResponseOps(v)

}
