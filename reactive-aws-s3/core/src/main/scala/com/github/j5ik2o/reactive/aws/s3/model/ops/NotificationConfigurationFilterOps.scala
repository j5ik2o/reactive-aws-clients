// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class NotificationConfigurationFilterBuilderOps(val self: NotificationConfigurationFilter.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[S3KeyFilter]): NotificationConfigurationFilter.Builder = {
    value.fold(self) { v => self.key(v) }
  }

}

final class NotificationConfigurationFilterOps(val self: NotificationConfigurationFilter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[S3KeyFilter] = Option(self.key)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNotificationConfigurationFilterOps {

  implicit def toNotificationConfigurationFilterBuilderOps(
      v: NotificationConfigurationFilter.Builder
  ): NotificationConfigurationFilterBuilderOps = new NotificationConfigurationFilterBuilderOps(v)

  implicit def toNotificationConfigurationFilterOps(
      v: NotificationConfigurationFilter
  ): NotificationConfigurationFilterOps = new NotificationConfigurationFilterOps(v)

}
