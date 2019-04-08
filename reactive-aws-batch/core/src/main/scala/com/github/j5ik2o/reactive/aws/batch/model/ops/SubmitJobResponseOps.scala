// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class SubmitJobResponseBuilderOps(val self: SubmitJobResponse.Builder) extends AnyVal {

  final def jobNameAsScala(value: Option[String]): SubmitJobResponse.Builder = {
    value.fold(self) { v =>
      self.jobName(v)
    }
  }

  final def jobIdAsScala(value: Option[String]): SubmitJobResponse.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  }

}

final class SubmitJobResponseOps(val self: SubmitJobResponse) extends AnyVal {

  final def jobNameAsScala: Option[String] = Option(self.jobName)

  final def jobIdAsScala: Option[String] = Option(self.jobId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubmitJobResponseOps {

  implicit def toSubmitJobResponseBuilderOps(v: SubmitJobResponse.Builder): SubmitJobResponseBuilderOps =
    new SubmitJobResponseBuilderOps(v)

  implicit def toSubmitJobResponseOps(v: SubmitJobResponse): SubmitJobResponseOps = new SubmitJobResponseOps(v)

}
