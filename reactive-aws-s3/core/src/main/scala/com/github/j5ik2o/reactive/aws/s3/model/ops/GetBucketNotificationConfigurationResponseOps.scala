// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketNotificationConfigurationResponseBuilderOps(
    val self: GetBucketNotificationConfigurationResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def topicConfigurationsAsScala(
      value: Option[Seq[TopicConfiguration]]
  ): GetBucketNotificationConfigurationResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.topicConfigurations(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueConfigurationsAsScala(
      value: Option[Seq[QueueConfiguration]]
  ): GetBucketNotificationConfigurationResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.queueConfigurations(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lambdaFunctionConfigurationsAsScala(
      value: Option[Seq[LambdaFunctionConfiguration]]
  ): GetBucketNotificationConfigurationResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.lambdaFunctionConfigurations(v.asJava)
    }
  }

}

final class GetBucketNotificationConfigurationResponseOps(val self: GetBucketNotificationConfigurationResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def topicConfigurationsAsScala: Option[Seq[TopicConfiguration]] = Option(self.topicConfigurations).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueConfigurationsAsScala: Option[Seq[QueueConfiguration]] = Option(self.queueConfigurations).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lambdaFunctionConfigurationsAsScala: Option[Seq[LambdaFunctionConfiguration]] =
    Option(self.lambdaFunctionConfigurations).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

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
