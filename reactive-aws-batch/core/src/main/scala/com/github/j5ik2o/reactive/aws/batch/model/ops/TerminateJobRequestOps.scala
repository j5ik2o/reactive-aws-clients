// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class TerminateJobRequestBuilderOps(val self: TerminateJobRequest.Builder) extends AnyVal {

  final def jobIdAsScala(value: Option[String]): TerminateJobRequest.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  }

  final def reasonAsScala(value: Option[String]): TerminateJobRequest.Builder = {
    value.fold(self) { v =>
      self.reason(v)
    }
  }

}

final class TerminateJobRequestOps(val self: TerminateJobRequest) extends AnyVal {

  final def jobIdAsScala: Option[String] = Option(self.jobId)

  final def reasonAsScala: Option[String] = Option(self.reason)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTerminateJobRequestOps {

  implicit def toTerminateJobRequestBuilderOps(v: TerminateJobRequest.Builder): TerminateJobRequestBuilderOps =
    new TerminateJobRequestBuilderOps(v)

  implicit def toTerminateJobRequestOps(v: TerminateJobRequest): TerminateJobRequestOps = new TerminateJobRequestOps(v)

}
