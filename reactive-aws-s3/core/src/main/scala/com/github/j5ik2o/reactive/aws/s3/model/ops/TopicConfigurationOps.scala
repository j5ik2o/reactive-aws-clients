// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class TopicConfigurationBuilderOps(val self: TopicConfiguration.Builder) extends AnyVal {

  final def withIdAsScala(value: Option[String]): TopicConfiguration.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

  final def withTopicArnAsScala(value: Option[String]): TopicConfiguration.Builder = {
    value.fold(self) { v =>
      self.topicArn(v)
    }
  } // String

  final def withEventsAsScala(value: Option[Seq[Event]]): TopicConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.events(v.asJava)
    } // Seq[String]
  }

  final def withFilterAsScala(value: Option[NotificationConfigurationFilter]): TopicConfiguration.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  } // NotificationConfigurationFilter

}

final class TopicConfigurationOps(val self: TopicConfiguration) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id) // String

  final def topicArnAsScala: Option[String] = Option(self.topicArn) // String

  final def eventsAsScala: Option[Seq[Event]] = Option(self.events).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def filterAsScala: Option[NotificationConfigurationFilter] =
    Option(self.filter) // NotificationConfigurationFilter

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTopicConfigurationOps {

  implicit def toTopicConfigurationBuilderOps(v: TopicConfiguration.Builder): TopicConfigurationBuilderOps =
    new TopicConfigurationBuilderOps(v)

  implicit def toTopicConfigurationOps(v: TopicConfiguration): TopicConfigurationOps = new TopicConfigurationOps(v)

}
