// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class TmpfsBuilderOps(val self: Tmpfs.Builder) extends AnyVal {

  final def containerPathAsScala(value: Option[String]): Tmpfs.Builder = {
    value.fold(self) { v =>
      self.containerPath(v)
    }
  }

  final def sizeAsScala(value: Option[Int]): Tmpfs.Builder = {
    value.fold(self) { v =>
      self.size(v)
    }
  }

  final def mountOptionsAsScala(value: Option[Seq[String]]): Tmpfs.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.mountOptions(v.asJava)
    }
  }

}

final class TmpfsOps(val self: Tmpfs) extends AnyVal {

  final def containerPathAsScala: Option[String] = Option(self.containerPath)

  final def sizeAsScala: Option[Int] = Option(self.size)

  final def mountOptionsAsScala: Option[Seq[String]] = Option(self.mountOptions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTmpfsOps {

  implicit def toTmpfsBuilderOps(v: Tmpfs.Builder): TmpfsBuilderOps = new TmpfsBuilderOps(v)

  implicit def toTmpfsOps(v: Tmpfs): TmpfsOps = new TmpfsOps(v)

}
