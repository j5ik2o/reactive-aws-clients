// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketNotificationConfigurationResponseBuilderOps(
    val self: GetBucketNotificationConfigurationResponse.Builder
) extends AnyVal {

  final def withTopicConfigurationsAsScala(
      value: Option[Seq[TopicConfiguration]]
  ): GetBucketNotificationConfigurationResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.topicConfigurations(v.asJava)
    } // Seq[TopicConfiguration]
  }

  final def withQueueConfigurationsAsScala(
      value: Option[Seq[QueueConfiguration]]
  ): GetBucketNotificationConfigurationResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.queueConfigurations(v.asJava)
    } // Seq[QueueConfiguration]
  }

  final def withLambdaFunctionConfigurationsAsScala(
      value: Option[Seq[LambdaFunctionConfiguration]]
  ): GetBucketNotificationConfigurationResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.lambdaFunctionConfigurations(v.asJava)
    } // Seq[LambdaFunctionConfiguration]
  }

}

final class GetBucketNotificationConfigurationResponseOps(val self: GetBucketNotificationConfigurationResponse)
    extends AnyVal {

  final def topicConfigurationsAsScala: Option[Seq[TopicConfiguration]] = Option(self.topicConfigurations).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[TopicConfiguration]

  final def queueConfigurationsAsScala: Option[Seq[QueueConfiguration]] = Option(self.queueConfigurations).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[QueueConfiguration]

  final def lambdaFunctionConfigurationsAsScala: Option[Seq[LambdaFunctionConfiguration]] =
    Option(self.lambdaFunctionConfigurations).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[LambdaFunctionConfiguration]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketNotificationConfigurationResponseOps {

  implicit def toGetBucketNotificationConfigurationResponseBuilderOps(
      v: GetBucketNotificationConfigurationResponse.Builder
  ): GetBucketNotificationConfigurationResponseBuilderOps = new GetBucketNotificationConfigurationResponseBuilderOps(v)

  implicit def toGetBucketNotificationConfigurationResponseOps(
      v: GetBucketNotificationConfigurationResponse
  ): GetBucketNotificationConfigurationResponseOps = new GetBucketNotificationConfigurationResponseOps(v)

}
