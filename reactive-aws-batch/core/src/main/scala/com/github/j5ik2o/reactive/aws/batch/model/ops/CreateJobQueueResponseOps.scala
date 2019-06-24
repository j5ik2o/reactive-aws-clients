// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class CreateJobQueueResponseBuilderOps(val self: CreateJobQueueResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueNameAsScala(value: Option[String]): CreateJobQueueResponse.Builder = {
    value.fold(self) { v =>
      self.jobQueueName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueArnAsScala(value: Option[String]): CreateJobQueueResponse.Builder = {
    value.fold(self) { v =>
      self.jobQueueArn(v)
    }
  }

}

final class CreateJobQueueResponseOps(val self: CreateJobQueueResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueNameAsScala: Option[String] = Option(self.jobQueueName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueArnAsScala: Option[String] = Option(self.jobQueueArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateJobQueueResponseOps {

  implicit def toCreateJobQueueResponseBuilderOps(v: CreateJobQueueResponse.Builder): CreateJobQueueResponseBuilderOps =
    new CreateJobQueueResponseBuilderOps(v)

  implicit def toCreateJobQueueResponseOps(v: CreateJobQueueResponse): CreateJobQueueResponseOps =
    new CreateJobQueueResponseOps(v)

}
