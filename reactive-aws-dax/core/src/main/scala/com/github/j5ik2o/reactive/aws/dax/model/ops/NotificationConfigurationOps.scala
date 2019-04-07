// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class NotificationConfigurationBuilderOps(val self: NotificationConfiguration.Builder) extends AnyVal {

  final def withTopicArnAsScala(value: Option[String]): NotificationConfiguration.Builder = {
    value.fold(self) { v =>
      self.topicArn(v)
    }
  } // String

  final def withTopicStatusAsScala(value: Option[String]): NotificationConfiguration.Builder = {
    value.fold(self) { v =>
      self.topicStatus(v)
    }
  } // String

}

final class NotificationConfigurationOps(val self: NotificationConfiguration) extends AnyVal {

  final def topicArnAsScala: Option[String] = Option(self.topicArn) // String

  final def topicStatusAsScala: Option[String] = Option(self.topicStatus) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNotificationConfigurationOps {

  implicit def toNotificationConfigurationBuilderOps(
      v: NotificationConfiguration.Builder
  ): NotificationConfigurationBuilderOps = new NotificationConfigurationBuilderOps(v)

  implicit def toNotificationConfigurationOps(v: NotificationConfiguration): NotificationConfigurationOps =
    new NotificationConfigurationOps(v)

}
