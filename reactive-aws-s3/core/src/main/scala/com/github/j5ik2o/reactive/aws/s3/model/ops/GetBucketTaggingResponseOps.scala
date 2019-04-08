// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketTaggingResponseBuilderOps(val self: GetBucketTaggingResponse.Builder) extends AnyVal {

  final def tagSetAsScala(value: Option[Seq[Tag]]): GetBucketTaggingResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagSet(v.asJava)
    } // Seq[Tag]
  }

}

final class GetBucketTaggingResponseOps(val self: GetBucketTaggingResponse) extends AnyVal {

  final def tagSetAsScala: Option[Seq[Tag]] = Option(self.tagSet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketTaggingResponseOps {

  implicit def toGetBucketTaggingResponseBuilderOps(
      v: GetBucketTaggingResponse.Builder
  ): GetBucketTaggingResponseBuilderOps = new GetBucketTaggingResponseBuilderOps(v)

  implicit def toGetBucketTaggingResponseOps(v: GetBucketTaggingResponse): GetBucketTaggingResponseOps =
    new GetBucketTaggingResponseOps(v)

}
