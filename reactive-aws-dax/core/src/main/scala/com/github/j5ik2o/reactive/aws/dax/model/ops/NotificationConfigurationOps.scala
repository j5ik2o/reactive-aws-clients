// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class NotificationConfigurationBuilderOps(val self: NotificationConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def topicArnAsScala(value: Option[String]): NotificationConfiguration.Builder = {
    value.fold(self) { v => self.topicArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def topicStatusAsScala(value: Option[String]): NotificationConfiguration.Builder = {
    value.fold(self) { v => self.topicStatus(v) }
  }

}

final class NotificationConfigurationOps(val self: NotificationConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def topicArnAsScala: Option[String] = Option(self.topicArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def topicStatusAsScala: Option[String] = Option(self.topicStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNotificationConfigurationOps {

  implicit def toNotificationConfigurationBuilderOps(
      v: NotificationConfiguration.Builder
  ): NotificationConfigurationBuilderOps = new NotificationConfigurationBuilderOps(v)

  implicit def toNotificationConfigurationOps(v: NotificationConfiguration): NotificationConfigurationOps =
    new NotificationConfigurationOps(v)

}
