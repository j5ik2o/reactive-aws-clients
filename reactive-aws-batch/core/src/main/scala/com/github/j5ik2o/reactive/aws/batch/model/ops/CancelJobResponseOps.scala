// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class CancelJobResponseBuilderOps(val self: CancelJobResponse.Builder) extends AnyVal {}

final class CancelJobResponseOps(val self: CancelJobResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelJobResponseOps {

  implicit def toCancelJobResponseBuilderOps(v: CancelJobResponse.Builder): CancelJobResponseBuilderOps =
    new CancelJobResponseBuilderOps(v)

  implicit def toCancelJobResponseOps(v: CancelJobResponse): CancelJobResponseOps = new CancelJobResponseOps(v)

}
