// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class LogPublishingOptionsStatusBuilderOps(val self: LogPublishingOptionsStatus.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala(value: Option[Map[LogType, LogPublishingOption]]): LogPublishingOptionsStatus.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.options(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[OptionStatus]): LogPublishingOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class LogPublishingOptionsStatusOps(val self: LogPublishingOptionsStatus) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala: Option[Map[LogType, LogPublishingOption]] = Option(self.options).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[OptionStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLogPublishingOptionsStatusOps {

  implicit def toLogPublishingOptionsStatusBuilderOps(
      v: LogPublishingOptionsStatus.Builder
  ): LogPublishingOptionsStatusBuilderOps = new LogPublishingOptionsStatusBuilderOps(v)

  implicit def toLogPublishingOptionsStatusOps(v: LogPublishingOptionsStatus): LogPublishingOptionsStatusOps =
    new LogPublishingOptionsStatusOps(v)

}
