// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class TerminateJobResponseBuilderOps(val self: TerminateJobResponse.Builder) extends AnyVal {}

final class TerminateJobResponseOps(val self: TerminateJobResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTerminateJobResponseOps {

  implicit def toTerminateJobResponseBuilderOps(v: TerminateJobResponse.Builder): TerminateJobResponseBuilderOps =
    new TerminateJobResponseBuilderOps(v)

  implicit def toTerminateJobResponseOps(v: TerminateJobResponse): TerminateJobResponseOps =
    new TerminateJobResponseOps(v)

}
