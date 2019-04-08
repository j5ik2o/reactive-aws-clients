// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class JobTimeoutBuilderOps(val self: JobTimeout.Builder) extends AnyVal {

  final def attemptDurationSecondsAsScala(value: Option[Int]): JobTimeout.Builder = {
    value.fold(self) { v =>
      self.attemptDurationSeconds(v)
    }
  }

}

final class JobTimeoutOps(val self: JobTimeout) extends AnyVal {

  final def attemptDurationSecondsAsScala: Option[Int] = Option(self.attemptDurationSeconds)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToJobTimeoutOps {

  implicit def toJobTimeoutBuilderOps(v: JobTimeout.Builder): JobTimeoutBuilderOps = new JobTimeoutBuilderOps(v)

  implicit def toJobTimeoutOps(v: JobTimeout): JobTimeoutOps = new JobTimeoutOps(v)

}
