// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class AddTagsResponseBuilderOps(val self: AddTagsResponse.Builder) extends AnyVal {}

final class AddTagsResponseOps(val self: AddTagsResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddTagsResponseOps {

  implicit def toAddTagsResponseBuilderOps(v: AddTagsResponse.Builder): AddTagsResponseBuilderOps =
    new AddTagsResponseBuilderOps(v)

  implicit def toAddTagsResponseOps(v: AddTagsResponse): AddTagsResponseOps = new AddTagsResponseOps(v)

}
