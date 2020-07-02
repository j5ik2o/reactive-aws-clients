// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class LogSetupBuilderOps(val self: LogSetup.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typesAsScala(value: Option[Seq[LogType]]): LogSetup.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.types(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala(value: Option[Boolean]): LogSetup.Builder = {
    value.fold(self) { v => self.enabled(v) }
  }

}

final class LogSetupOps(val self: LogSetup) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typesAsScala: Option[Seq[LogType]] =
    Option(self.types).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLogSetupOps {

  implicit def toLogSetupBuilderOps(v: LogSetup.Builder): LogSetupBuilderOps = new LogSetupBuilderOps(v)

  implicit def toLogSetupOps(v: LogSetup): LogSetupOps = new LogSetupOps(v)

}
