// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TagResourceResponseBuilderOps(val self: TagResourceResponse.Builder) extends AnyVal {}

final class TagResourceResponseOps(val self: TagResourceResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTagResourceResponseOps {

  implicit def toTagResourceResponseBuilderOps(v: TagResourceResponse.Builder): TagResourceResponseBuilderOps =
    new TagResourceResponseBuilderOps(v)

  implicit def toTagResourceResponseOps(v: TagResourceResponse): TagResourceResponseOps = new TagResourceResponseOps(v)

}
