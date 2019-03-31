// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ NotificationConfiguration => ScalaNotificationConfiguration, _ }
import software.amazon.awssdk.services.s3.model.{ NotificationConfiguration => JavaNotificationConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object NotificationConfigurationOps {

  implicit class ScalaNotificationConfigurationOps(val self: ScalaNotificationConfiguration) extends AnyVal {

    def toJava: JavaNotificationConfiguration = {
      val result = JavaNotificationConfiguration.builder()
      self.topicConfigurations.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, TopicConfigurationOps._;
        result.topicConfigurations(v.map(_.toJava).asJava)
      } // Seq[TopicConfiguration]
      self.queueConfigurations.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, QueueConfigurationOps._;
        result.queueConfigurations(v.map(_.toJava).asJava)
      } // Seq[QueueConfiguration]
      self.lambdaFunctionConfigurations.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, LambdaFunctionConfigurationOps._;
        result.lambdaFunctionConfigurations(v.map(_.toJava).asJava)
      } // Seq[LambdaFunctionConfiguration]

      result.build()
    }

  }

  implicit class JavaNotificationConfigurationOps(val self: JavaNotificationConfiguration) extends AnyVal {

    def toScala: ScalaNotificationConfiguration = {
      ScalaNotificationConfiguration()
        .withTopicConfigurations(Option(self.topicConfigurations).map { v =>
          import scala.collection.JavaConverters._, TopicConfigurationOps._; v.asScala.map(_.toScala)
        }) // Seq[TopicConfiguration]
        .withQueueConfigurations(Option(self.queueConfigurations).map { v =>
          import scala.collection.JavaConverters._, QueueConfigurationOps._; v.asScala.map(_.toScala)
        }) // Seq[QueueConfiguration]
        .withLambdaFunctionConfigurations(Option(self.lambdaFunctionConfigurations).map { v =>
          import scala.collection.JavaConverters._, LambdaFunctionConfigurationOps._; v.asScala.map(_.toScala)
        }) // Seq[LambdaFunctionConfiguration]
    }

  }

}
