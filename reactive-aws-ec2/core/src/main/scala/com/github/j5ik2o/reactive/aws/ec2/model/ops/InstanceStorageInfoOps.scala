// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceStorageInfoBuilderOps(val self: InstanceStorageInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalSizeInGBAsScala(value: Option[Long]): InstanceStorageInfo.Builder = {
    value.fold(self) { v =>
      self.totalSizeInGB(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disksAsScala(value: Option[Seq[DiskInfo]]): InstanceStorageInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.disks(v.asJava)
    }
  }

}

final class InstanceStorageInfoOps(val self: InstanceStorageInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalSizeInGBAsScala: Option[Long] = Option(self.totalSizeInGB)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disksAsScala: Option[Seq[DiskInfo]] = Option(self.disks).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceStorageInfoOps {

  implicit def toInstanceStorageInfoBuilderOps(v: InstanceStorageInfo.Builder): InstanceStorageInfoBuilderOps =
    new InstanceStorageInfoBuilderOps(v)

  implicit def toInstanceStorageInfoOps(v: InstanceStorageInfo): InstanceStorageInfoOps = new InstanceStorageInfoOps(v)

}
