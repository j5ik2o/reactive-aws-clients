// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class UpdateTagsForResourceResponseBuilderOps(val self: UpdateTagsForResourceResponse.Builder) extends AnyVal {}

final class UpdateTagsForResourceResponseOps(val self: UpdateTagsForResourceResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateTagsForResourceResponseOps {

  implicit def toUpdateTagsForResourceResponseBuilderOps(
      v: UpdateTagsForResourceResponse.Builder
  ): UpdateTagsForResourceResponseBuilderOps = new UpdateTagsForResourceResponseBuilderOps(v)

  implicit def toUpdateTagsForResourceResponseOps(v: UpdateTagsForResourceResponse): UpdateTagsForResourceResponseOps =
    new UpdateTagsForResourceResponseOps(v)

}
