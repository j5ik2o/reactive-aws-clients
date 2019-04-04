// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketLifecycleConfigurationResponseBuilderOps(val self: GetBucketLifecycleConfigurationResponse.Builder)
    extends AnyVal {

  final def withRulesAsScala(value: Option[Seq[LifecycleRule]]): GetBucketLifecycleConfigurationResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.rules(v.asJava)
    } // Seq[LifecycleRule]
  }

}

final class GetBucketLifecycleConfigurationResponseOps(val self: GetBucketLifecycleConfigurationResponse)
    extends AnyVal {

  final def rulesAsScala: Option[Seq[LifecycleRule]] = Option(self.rules).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[LifecycleRule]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketLifecycleConfigurationResponseOps {

  implicit def toGetBucketLifecycleConfigurationResponseBuilderOps(
      v: GetBucketLifecycleConfigurationResponse.Builder
  ): GetBucketLifecycleConfigurationResponseBuilderOps = new GetBucketLifecycleConfigurationResponseBuilderOps(v)

  implicit def toGetBucketLifecycleConfigurationResponseOps(
      v: GetBucketLifecycleConfigurationResponse
  ): GetBucketLifecycleConfigurationResponseOps = new GetBucketLifecycleConfigurationResponseOps(v)

}
