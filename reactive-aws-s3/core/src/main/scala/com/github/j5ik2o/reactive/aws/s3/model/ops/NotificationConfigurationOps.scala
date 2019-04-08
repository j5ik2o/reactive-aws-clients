// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class NotificationConfigurationBuilderOps(val self: NotificationConfiguration.Builder) extends AnyVal {

  final def topicConfigurationsAsScala(value: Option[Seq[TopicConfiguration]]): NotificationConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.topicConfigurations(v.asJava)
    }
  }

  final def queueConfigurationsAsScala(value: Option[Seq[QueueConfiguration]]): NotificationConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.queueConfigurations(v.asJava)
    }
  }

  final def lambdaFunctionConfigurationsAsScala(
      value: Option[Seq[LambdaFunctionConfiguration]]
  ): NotificationConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.lambdaFunctionConfigurations(v.asJava)
    }
  }

}

final class NotificationConfigurationOps(val self: NotificationConfiguration) extends AnyVal {

  final def topicConfigurationsAsScala: Option[Seq[TopicConfiguration]] = Option(self.topicConfigurations).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def queueConfigurationsAsScala: Option[Seq[QueueConfiguration]] = Option(self.queueConfigurations).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def lambdaFunctionConfigurationsAsScala: Option[Seq[LambdaFunctionConfiguration]] =
    Option(self.lambdaFunctionConfigurations).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNotificationConfigurationOps {

  implicit def toNotificationConfigurationBuilderOps(
      v: NotificationConfiguration.Builder
  ): NotificationConfigurationBuilderOps = new NotificationConfigurationBuilderOps(v)

  implicit def toNotificationConfigurationOps(v: NotificationConfiguration): NotificationConfigurationOps =
    new NotificationConfigurationOps(v)

}
