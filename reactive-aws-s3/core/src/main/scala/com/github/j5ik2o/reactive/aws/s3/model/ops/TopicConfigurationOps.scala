// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ TopicConfiguration => ScalaTopicConfiguration, _ }
import software.amazon.awssdk.services.s3.model.{ TopicConfiguration => JavaTopicConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TopicConfigurationOps {

  implicit class ScalaTopicConfigurationOps(val self: ScalaTopicConfiguration) extends AnyVal {

    def toJava: JavaTopicConfiguration = {
      val result = JavaTopicConfiguration.builder()
      self.id.filter(_.nonEmpty).foreach(v => result.id(v))             // String
      self.topicArn.filter(_.nonEmpty).foreach(v => result.topicArn(v)) // String
      self.events.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, EventOps._; result.events(v.map(_.toJava).asJava)
      } // Seq[String]
      self.filter.foreach { v =>
        import NotificationConfigurationFilterOps._; result.filter(v.toJava)
      } // NotificationConfigurationFilter

      result.build()
    }

  }

  implicit class JavaTopicConfigurationOps(val self: JavaTopicConfiguration) extends AnyVal {

    def toScala: ScalaTopicConfiguration = {
      ScalaTopicConfiguration()
        .withId(Option(self.id)) // String
        .withTopicArn(Option(self.topicArn)) // String
        .withEvents(Option(self.events).map { v =>
          import scala.collection.JavaConverters._, EventOps._; v.asScala.map(_.toScala)
        }) // Seq[String]
        .withFilter(Option(self.filter).map { v =>
          import NotificationConfigurationFilterOps._; v.toScala
        }) // NotificationConfigurationFilter
    }

  }

}
