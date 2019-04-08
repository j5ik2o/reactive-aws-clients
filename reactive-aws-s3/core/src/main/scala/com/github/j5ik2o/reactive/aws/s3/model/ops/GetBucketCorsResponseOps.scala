// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketCorsResponseBuilderOps(val self: GetBucketCorsResponse.Builder) extends AnyVal {

  final def corsRulesAsScala(value: Option[Seq[CORSRule]]): GetBucketCorsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.corsRules(v.asJava)
    }
  }

}

final class GetBucketCorsResponseOps(val self: GetBucketCorsResponse) extends AnyVal {

  final def corsRulesAsScala: Option[Seq[CORSRule]] = Option(self.corsRules).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketCorsResponseOps {

  implicit def toGetBucketCorsResponseBuilderOps(v: GetBucketCorsResponse.Builder): GetBucketCorsResponseBuilderOps =
    new GetBucketCorsResponseBuilderOps(v)

  implicit def toGetBucketCorsResponseOps(v: GetBucketCorsResponse): GetBucketCorsResponseOps =
    new GetBucketCorsResponseOps(v)

}
