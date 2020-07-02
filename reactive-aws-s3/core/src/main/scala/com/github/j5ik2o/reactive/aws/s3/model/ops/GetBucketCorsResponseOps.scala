// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketCorsResponseBuilderOps(val self: GetBucketCorsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def corsRulesAsScala(value: Option[Seq[CORSRule]]): GetBucketCorsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.corsRules(v.asJava)
    }
  }

}

final class GetBucketCorsResponseOps(val self: GetBucketCorsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def corsRulesAsScala: Option[Seq[CORSRule]] =
    Option(self.corsRules).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketCorsResponseOps {

  implicit def toGetBucketCorsResponseBuilderOps(v: GetBucketCorsResponse.Builder): GetBucketCorsResponseBuilderOps =
    new GetBucketCorsResponseBuilderOps(v)

  implicit def toGetBucketCorsResponseOps(v: GetBucketCorsResponse): GetBucketCorsResponseOps =
    new GetBucketCorsResponseOps(v)

}
