// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class QueueConfigurationBuilderOps(val self: QueueConfiguration.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): QueueConfiguration.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def queueArnAsScala(value: Option[String]): QueueConfiguration.Builder = {
    value.fold(self) { v =>
      self.queueArn(v)
    }
  }

  final def eventsAsScala(value: Option[Seq[Event]]): QueueConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.events(v.asJava)
    }
  }

  final def filterAsScala(value: Option[NotificationConfigurationFilter]): QueueConfiguration.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  }

}

final class QueueConfigurationOps(val self: QueueConfiguration) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id)

  final def queueArnAsScala: Option[String] = Option(self.queueArn)

  final def eventsAsScala: Option[Seq[Event]] = Option(self.events).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def filterAsScala: Option[NotificationConfigurationFilter] = Option(self.filter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToQueueConfigurationOps {

  implicit def toQueueConfigurationBuilderOps(v: QueueConfiguration.Builder): QueueConfigurationBuilderOps =
    new QueueConfigurationBuilderOps(v)

  implicit def toQueueConfigurationOps(v: QueueConfiguration): QueueConfigurationOps = new QueueConfigurationOps(v)

}
