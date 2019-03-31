// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  GetBucketNotificationConfigurationResponse => ScalaGetBucketNotificationConfigurationResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  GetBucketNotificationConfigurationResponse => JavaGetBucketNotificationConfigurationResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketNotificationConfigurationResponseOps {

  implicit class JavaGetBucketNotificationConfigurationResponseOps(
      val self: JavaGetBucketNotificationConfigurationResponse
  ) extends AnyVal {

    def toScala: ScalaGetBucketNotificationConfigurationResponse = {
      ScalaGetBucketNotificationConfigurationResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
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
