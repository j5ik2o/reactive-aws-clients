// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVolumePermissionModificationsBuilderOps(val self: CreateVolumePermissionModifications.Builder)
    extends AnyVal {

  final def addAsScala(value: Option[Seq[CreateVolumePermission]]): CreateVolumePermissionModifications.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.add(v.asJava)
    }
  }

  final def removeAsScala(value: Option[Seq[CreateVolumePermission]]): CreateVolumePermissionModifications.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.remove(v.asJava)
    }
  }

}

final class CreateVolumePermissionModificationsOps(val self: CreateVolumePermissionModifications) extends AnyVal {

  final def addAsScala: Option[Seq[CreateVolumePermission]] = Option(self.add).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def removeAsScala: Option[Seq[CreateVolumePermission]] = Option(self.remove).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVolumePermissionModificationsOps {

  implicit def toCreateVolumePermissionModificationsBuilderOps(
      v: CreateVolumePermissionModifications.Builder
  ): CreateVolumePermissionModificationsBuilderOps = new CreateVolumePermissionModificationsBuilderOps(v)

  implicit def toCreateVolumePermissionModificationsOps(
      v: CreateVolumePermissionModifications
  ): CreateVolumePermissionModificationsOps = new CreateVolumePermissionModificationsOps(v)

}
