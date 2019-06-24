// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class NotificationChannelBuilderOps(val self: NotificationChannel.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snsTopicArnAsScala(value: Option[String]): NotificationChannel.Builder = {
    value.fold(self) { v =>
      self.snsTopicArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala(value: Option[String]): NotificationChannel.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  }

}

final class NotificationChannelOps(val self: NotificationChannel) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snsTopicArnAsScala: Option[String] = Option(self.snsTopicArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala: Option[String] = Option(self.roleArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNotificationChannelOps {

  implicit def toNotificationChannelBuilderOps(v: NotificationChannel.Builder): NotificationChannelBuilderOps =
    new NotificationChannelBuilderOps(v)

  implicit def toNotificationChannelOps(v: NotificationChannel): NotificationChannelOps = new NotificationChannelOps(v)

}
