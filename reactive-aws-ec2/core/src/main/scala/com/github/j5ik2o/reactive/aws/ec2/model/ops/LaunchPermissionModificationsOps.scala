// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchPermissionModificationsBuilderOps(val self: LaunchPermissionModifications.Builder) extends AnyVal {

  final def addAsScala(value: Option[Seq[LaunchPermission]]): LaunchPermissionModifications.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.add(v.asJava)
    }
  }

  final def removeAsScala(value: Option[Seq[LaunchPermission]]): LaunchPermissionModifications.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.remove(v.asJava)
    }
  }

}

final class LaunchPermissionModificationsOps(val self: LaunchPermissionModifications) extends AnyVal {

  final def addAsScala: Option[Seq[LaunchPermission]] = Option(self.add).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def removeAsScala: Option[Seq[LaunchPermission]] = Option(self.remove).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchPermissionModificationsOps {

  implicit def toLaunchPermissionModificationsBuilderOps(
      v: LaunchPermissionModifications.Builder
  ): LaunchPermissionModificationsBuilderOps = new LaunchPermissionModificationsBuilderOps(v)

  implicit def toLaunchPermissionModificationsOps(v: LaunchPermissionModifications): LaunchPermissionModificationsOps =
    new LaunchPermissionModificationsOps(v)

}
