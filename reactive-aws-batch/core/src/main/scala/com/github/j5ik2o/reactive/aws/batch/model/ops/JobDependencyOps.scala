// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class JobDependencyBuilderOps(val self: JobDependency.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala(value: Option[String]): JobDependency.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[ArrayJobDependency]): JobDependency.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

}

final class JobDependencyOps(val self: JobDependency) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala: Option[String] = Option(self.jobId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[ArrayJobDependency] = Option(self.`type`)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToJobDependencyOps {

  implicit def toJobDependencyBuilderOps(v: JobDependency.Builder): JobDependencyBuilderOps =
    new JobDependencyBuilderOps(v)

  implicit def toJobDependencyOps(v: JobDependency): JobDependencyOps = new JobDependencyOps(v)

}
