// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DeleteApplicationVersionResponseBuilderOps(val self: DeleteApplicationVersionResponse.Builder)
    extends AnyVal {}

final class DeleteApplicationVersionResponseOps(val self: DeleteApplicationVersionResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteApplicationVersionResponseOps {

  implicit def toDeleteApplicationVersionResponseBuilderOps(
      v: DeleteApplicationVersionResponse.Builder
  ): DeleteApplicationVersionResponseBuilderOps = new DeleteApplicationVersionResponseBuilderOps(v)

  implicit def toDeleteApplicationVersionResponseOps(
      v: DeleteApplicationVersionResponse
  ): DeleteApplicationVersionResponseOps = new DeleteApplicationVersionResponseOps(v)

}
