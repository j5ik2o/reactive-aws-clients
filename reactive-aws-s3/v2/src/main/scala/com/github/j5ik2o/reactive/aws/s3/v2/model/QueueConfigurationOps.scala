// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ QueueConfiguration => ScalaQueueConfiguration, _ }
import software.amazon.awssdk.services.s3.model.{ QueueConfiguration => JavaQueueConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object QueueConfigurationOps {

  implicit class ScalaQueueConfigurationOps(val self: ScalaQueueConfiguration) extends AnyVal {

    def toJava: JavaQueueConfiguration = {
      val result = JavaQueueConfiguration.builder()
      self.id.filter(_.nonEmpty).foreach(v => result.id(v))             // String
      self.queueArn.filter(_.nonEmpty).foreach(v => result.queueArn(v)) // String
      self.events.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, EventOps._; result.events(v.map(_.toJava).asJava)
      } // Seq[String]
      self.filter.foreach { v =>
        import NotificationConfigurationFilterOps._; result.filter(v.toJava)
      } // NotificationConfigurationFilter

      result.build()
    }

  }

  implicit class JavaQueueConfigurationOps(val self: JavaQueueConfiguration) extends AnyVal {

    def toScala: ScalaQueueConfiguration = {
      ScalaQueueConfiguration()
        .withId(Option(self.id)) // String
        .withQueueArn(Option(self.queueArn)) // String
        .withEvents(Option(self.events).map { v =>
          import scala.collection.JavaConverters._, EventOps._; v.asScala.map(_.toScala)
        }) // Seq[String]
        .withFilter(Option(self.filter).map { v =>
          import NotificationConfigurationFilterOps._; v.toScala
        }) // NotificationConfigurationFilter
    }

  }

}
