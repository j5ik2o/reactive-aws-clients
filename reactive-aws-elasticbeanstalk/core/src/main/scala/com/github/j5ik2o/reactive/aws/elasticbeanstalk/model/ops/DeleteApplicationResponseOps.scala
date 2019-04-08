// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DeleteApplicationResponseBuilderOps(val self: DeleteApplicationResponse.Builder) extends AnyVal {}

final class DeleteApplicationResponseOps(val self: DeleteApplicationResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteApplicationResponseOps {

  implicit def toDeleteApplicationResponseBuilderOps(
      v: DeleteApplicationResponse.Builder
  ): DeleteApplicationResponseBuilderOps = new DeleteApplicationResponseBuilderOps(v)

  implicit def toDeleteApplicationResponseOps(v: DeleteApplicationResponse): DeleteApplicationResponseOps =
    new DeleteApplicationResponseOps(v)

}
