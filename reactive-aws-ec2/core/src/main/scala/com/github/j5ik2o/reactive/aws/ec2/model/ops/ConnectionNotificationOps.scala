// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ConnectionNotificationBuilderOps(val self: ConnectionNotification.Builder) extends AnyVal {

  final def connectionNotificationIdAsScala(value: Option[String]): ConnectionNotification.Builder = {
    value.fold(self) { v =>
      self.connectionNotificationId(v)
    }
  }

  final def serviceIdAsScala(value: Option[String]): ConnectionNotification.Builder = {
    value.fold(self) { v =>
      self.serviceId(v)
    }
  }

  final def vpcEndpointIdAsScala(value: Option[String]): ConnectionNotification.Builder = {
    value.fold(self) { v =>
      self.vpcEndpointId(v)
    }
  }

  final def connectionNotificationTypeAsScala(
      value: Option[ConnectionNotificationType]
  ): ConnectionNotification.Builder = {
    value.fold(self) { v =>
      self.connectionNotificationType(v)
    }
  }

  final def connectionNotificationArnAsScala(value: Option[String]): ConnectionNotification.Builder = {
    value.fold(self) { v =>
      self.connectionNotificationArn(v)
    }
  }

  final def connectionEventsAsScala(value: Option[Seq[String]]): ConnectionNotification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.connectionEvents(v.asJava)
    }
  }

  final def connectionNotificationStateAsScala(
      value: Option[ConnectionNotificationState]
  ): ConnectionNotification.Builder = {
    value.fold(self) { v =>
      self.connectionNotificationState(v)
    }
  }

}

final class ConnectionNotificationOps(val self: ConnectionNotification) extends AnyVal {

  final def connectionNotificationIdAsScala: Option[String] = Option(self.connectionNotificationId)

  final def serviceIdAsScala: Option[String] = Option(self.serviceId)

  final def vpcEndpointIdAsScala: Option[String] = Option(self.vpcEndpointId)

  final def connectionNotificationTypeAsScala: Option[ConnectionNotificationType] =
    Option(self.connectionNotificationType)

  final def connectionNotificationArnAsScala: Option[String] = Option(self.connectionNotificationArn)

  final def connectionEventsAsScala: Option[Seq[String]] = Option(self.connectionEvents).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def connectionNotificationStateAsScala: Option[ConnectionNotificationState] =
    Option(self.connectionNotificationState)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConnectionNotificationOps {

  implicit def toConnectionNotificationBuilderOps(v: ConnectionNotification.Builder): ConnectionNotificationBuilderOps =
    new ConnectionNotificationBuilderOps(v)

  implicit def toConnectionNotificationOps(v: ConnectionNotification): ConnectionNotificationOps =
    new ConnectionNotificationOps(v)

}
