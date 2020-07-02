// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EnableFastSnapshotRestoresRequestBuilderOps(val self: EnableFastSnapshotRestoresRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZonesAsScala(value: Option[Seq[String]]): EnableFastSnapshotRestoresRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.availabilityZones(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceSnapshotIdsAsScala(value: Option[Seq[String]]): EnableFastSnapshotRestoresRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.sourceSnapshotIds(v.asJava)
    }
  }

}

final class EnableFastSnapshotRestoresRequestOps(val self: EnableFastSnapshotRestoresRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZonesAsScala: Option[Seq[String]] =
    Option(self.availabilityZones).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceSnapshotIdsAsScala: Option[Seq[String]] =
    Option(self.sourceSnapshotIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableFastSnapshotRestoresRequestOps {

  implicit def toEnableFastSnapshotRestoresRequestBuilderOps(
      v: EnableFastSnapshotRestoresRequest.Builder
  ): EnableFastSnapshotRestoresRequestBuilderOps = new EnableFastSnapshotRestoresRequestBuilderOps(v)

  implicit def toEnableFastSnapshotRestoresRequestOps(
      v: EnableFastSnapshotRestoresRequest
  ): EnableFastSnapshotRestoresRequestOps = new EnableFastSnapshotRestoresRequestOps(v)

}
