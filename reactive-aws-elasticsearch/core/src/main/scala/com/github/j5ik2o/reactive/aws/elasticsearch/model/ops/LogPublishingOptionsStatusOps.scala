// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class LogPublishingOptionsStatusBuilderOps(val self: LogPublishingOptionsStatus.Builder) extends AnyVal {

  final def optionsAsScala(value: Option[Map[LogType, LogPublishingOption]]): LogPublishingOptionsStatus.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.options(v.asJava)
    } // Map[String, LogPublishingOption]
  }

  final def statusAsScala(value: Option[OptionStatus]): LogPublishingOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // OptionStatus

}

final class LogPublishingOptionsStatusOps(val self: LogPublishingOptionsStatus) extends AnyVal {

  final def optionsAsScala: Option[Map[LogType, LogPublishingOption]] = Option(self.options).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, LogPublishingOption]

  final def statusAsScala: Option[OptionStatus] = Option(self.status) // OptionStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLogPublishingOptionsStatusOps {

  implicit def toLogPublishingOptionsStatusBuilderOps(
      v: LogPublishingOptionsStatus.Builder
  ): LogPublishingOptionsStatusBuilderOps = new LogPublishingOptionsStatusBuilderOps(v)

  implicit def toLogPublishingOptionsStatusOps(v: LogPublishingOptionsStatus): LogPublishingOptionsStatusOps =
    new LogPublishingOptionsStatusOps(v)

}
