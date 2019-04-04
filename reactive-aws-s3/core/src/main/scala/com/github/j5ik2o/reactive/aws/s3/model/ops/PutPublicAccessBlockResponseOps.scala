// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutPublicAccessBlockResponseBuilderOps(val self: PutPublicAccessBlockResponse.Builder) extends AnyVal {}

final class PutPublicAccessBlockResponseOps(val self: PutPublicAccessBlockResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutPublicAccessBlockResponseOps {

  implicit def toPutPublicAccessBlockResponseBuilderOps(
      v: PutPublicAccessBlockResponse.Builder
  ): PutPublicAccessBlockResponseBuilderOps = new PutPublicAccessBlockResponseBuilderOps(v)

  implicit def toPutPublicAccessBlockResponseOps(v: PutPublicAccessBlockResponse): PutPublicAccessBlockResponseOps =
    new PutPublicAccessBlockResponseOps(v)

}
