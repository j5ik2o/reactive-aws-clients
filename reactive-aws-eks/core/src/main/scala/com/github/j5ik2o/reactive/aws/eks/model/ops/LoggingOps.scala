// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class LoggingBuilderOps(val self: Logging.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterLoggingAsScala(value: Option[Seq[LogSetup]]): Logging.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.clusterLogging(v.asJava)
    }
  }

}

final class LoggingOps(val self: Logging) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterLoggingAsScala: Option[Seq[LogSetup]] = Option(self.clusterLogging).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLoggingOps {

  implicit def toLoggingBuilderOps(v: Logging.Builder): LoggingBuilderOps = new LoggingBuilderOps(v)

  implicit def toLoggingOps(v: Logging): LoggingOps = new LoggingOps(v)

}
