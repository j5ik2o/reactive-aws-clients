// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class LogPublishingOptionBuilderOps(val self: LogPublishingOption.Builder) extends AnyVal {

  final def cloudWatchLogsLogGroupArnAsScala(value: Option[String]): LogPublishingOption.Builder = {
    value.fold(self) { v =>
      self.cloudWatchLogsLogGroupArn(v)
    }
  } // String

  final def enabledAsScala(value: Option[Boolean]): LogPublishingOption.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  } // Boolean

}

final class LogPublishingOptionOps(val self: LogPublishingOption) extends AnyVal {

  final def cloudWatchLogsLogGroupArnAsScala: Option[String] = Option(self.cloudWatchLogsLogGroupArn) // String

  final def enabledAsScala: Option[Boolean] = Option(self.enabled) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLogPublishingOptionOps {

  implicit def toLogPublishingOptionBuilderOps(v: LogPublishingOption.Builder): LogPublishingOptionBuilderOps =
    new LogPublishingOptionBuilderOps(v)

  implicit def toLogPublishingOptionOps(v: LogPublishingOption): LogPublishingOptionOps = new LogPublishingOptionOps(v)

}
