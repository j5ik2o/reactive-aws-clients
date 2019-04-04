// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class QueueConfigurationBuilderOps(val self: QueueConfiguration.Builder) extends AnyVal {

  final def withIdAsScala(value: Option[String]): QueueConfiguration.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

  final def withQueueArnAsScala(value: Option[String]): QueueConfiguration.Builder = {
    value.fold(self) { v =>
      self.queueArn(v)
    }
  } // String

  final def withEventsAsScala(value: Option[Seq[Event]]): QueueConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.events(v.asJava)
    } // Seq[String]
  }

  final def withFilterAsScala(value: Option[NotificationConfigurationFilter]): QueueConfiguration.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  } // NotificationConfigurationFilter

}

final class QueueConfigurationOps(val self: QueueConfiguration) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id) // String

  final def queueArnAsScala: Option[String] = Option(self.queueArn) // String

  final def eventsAsScala: Option[Seq[Event]] = Option(self.events).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def filterAsScala: Option[NotificationConfigurationFilter] =
    Option(self.filter) // NotificationConfigurationFilter

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToQueueConfigurationOps {

  implicit def toQueueConfigurationBuilderOps(v: QueueConfiguration.Builder): QueueConfigurationBuilderOps =
    new QueueConfigurationBuilderOps(v)

  implicit def toQueueConfigurationOps(v: QueueConfiguration): QueueConfigurationOps = new QueueConfigurationOps(v)

}
