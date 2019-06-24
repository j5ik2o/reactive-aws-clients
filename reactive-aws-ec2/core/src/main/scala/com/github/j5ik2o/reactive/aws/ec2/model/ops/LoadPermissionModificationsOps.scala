// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LoadPermissionModificationsBuilderOps(val self: LoadPermissionModifications.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addAsScala(value: Option[Seq[LoadPermissionRequest]]): LoadPermissionModifications.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.add(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def removeAsScala(value: Option[Seq[LoadPermissionRequest]]): LoadPermissionModifications.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.remove(v.asJava)
    }
  }

}

final class LoadPermissionModificationsOps(val self: LoadPermissionModifications) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addAsScala: Option[Seq[LoadPermissionRequest]] = Option(self.add).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def removeAsScala: Option[Seq[LoadPermissionRequest]] = Option(self.remove).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
