// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class AddTagsToStreamResponseBuilderOps(val self: AddTagsToStreamResponse.Builder) extends AnyVal {}

final class AddTagsToStreamResponseOps(val self: AddTagsToStreamResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddTagsToStreamResponseOps {

  implicit def toAddTagsToStreamResponseBuilderOps(
      v: AddTagsToStreamResponse.Builder
  ): AddTagsToStreamResponseBuilderOps = new AddTagsToStreamResponseBuilderOps(v)

  implicit def toAddTagsToStreamResponseOps(v: AddTagsToStreamResponse): AddTagsToStreamResponseOps =
    new AddTagsToStreamResponseOps(v)

}
