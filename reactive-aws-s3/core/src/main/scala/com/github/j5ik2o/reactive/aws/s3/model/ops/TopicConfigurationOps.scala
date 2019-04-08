// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class TopicConfigurationBuilderOps(val self: TopicConfiguration.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): TopicConfiguration.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def topicArnAsScala(value: Option[String]): TopicConfiguration.Builder = {
    value.fold(self) { v =>
      self.topicArn(v)
    }
  }

  final def eventsAsScala(value: Option[Seq[Event]]): TopicConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.events(v.asJava)
    }
  }

  final def filterAsScala(value: Option[NotificationConfigurationFilter]): TopicConfiguration.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  }

}

final class TopicConfigurationOps(val self: TopicConfiguration) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id)

  final def topicArnAsScala: Option[String] = Option(self.topicArn)

  final def eventsAsScala: Option[Seq[Event]] = Option(self.events).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def filterAsScala: Option[NotificationConfigurationFilter] = Option(self.filter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTopicConfigurationOps {

  implicit def toTopicConfigurationBuilderOps(v: TopicConfiguration.Builder): TopicConfigurationBuilderOps =
    new TopicConfigurationBuilderOps(v)

  implicit def toTopicConfigurationOps(v: TopicConfiguration): TopicConfigurationOps = new TopicConfigurationOps(v)

}
