// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class RemoveTagsResponseBuilderOps(val self: RemoveTagsResponse.Builder) extends AnyVal {}

final class RemoveTagsResponseOps(val self: RemoveTagsResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRemoveTagsResponseOps {

  implicit def toRemoveTagsResponseBuilderOps(v: RemoveTagsResponse.Builder): RemoveTagsResponseBuilderOps =
    new RemoveTagsResponseBuilderOps(v)

  implicit def toRemoveTagsResponseOps(v: RemoveTagsResponse): RemoveTagsResponseOps = new RemoveTagsResponseOps(v)

}
