// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LoadPermissionModificationsBuilderOps(val self: LoadPermissionModifications.Builder) extends AnyVal {

  final def addAsScala(value: Option[Seq[LoadPermissionRequest]]): LoadPermissionModifications.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.add(v.asJava)
    }
  }

  final def removeAsScala(value: Option[Seq[LoadPermissionRequest]]): LoadPermissionModifications.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.remove(v.asJava)
    }
  }

}

final class LoadPermissionModificationsOps(val self: LoadPermissionModifications) extends AnyVal {

  final def addAsScala: Option[Seq[LoadPermissionRequest]] = Option(self.add).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def removeAsScala: Option[Seq[LoadPermissionRequest]] = Option(self.remove).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLoadPermissionModificationsOps {

  implicit def toLoadPermissionModificationsBuilderOps(
      v: LoadPermissionModifications.Builder
  ): LoadPermissionModificationsBuilderOps = new LoadPermissionModificationsBuilderOps(v)

  implicit def toLoadPermissionModificationsOps(v: LoadPermissionModifications): LoadPermissionModificationsOps =
    new LoadPermissionModificationsOps(v)

}
