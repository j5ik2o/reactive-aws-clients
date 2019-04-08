// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class UpdateJobQueueResponseBuilderOps(val self: UpdateJobQueueResponse.Builder) extends AnyVal {

  final def jobQueueNameAsScala(value: Option[String]): UpdateJobQueueResponse.Builder = {
    value.fold(self) { v =>
      self.jobQueueName(v)
    }
  } // String

  final def jobQueueArnAsScala(value: Option[String]): UpdateJobQueueResponse.Builder = {
    value.fold(self) { v =>
      self.jobQueueArn(v)
    }
  } // String

}

final class UpdateJobQueueResponseOps(val self: UpdateJobQueueResponse) extends AnyVal {

  final def jobQueueNameAsScala: Option[String] = Option(self.jobQueueName) // String

  final def jobQueueArnAsScala: Option[String] = Option(self.jobQueueArn) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateJobQueueResponseOps {

  implicit def toUpdateJobQueueResponseBuilderOps(v: UpdateJobQueueResponse.Builder): UpdateJobQueueResponseBuilderOps =
    new UpdateJobQueueResponseBuilderOps(v)

  implicit def toUpdateJobQueueResponseOps(v: UpdateJobQueueResponse): UpdateJobQueueResponseOps =
    new UpdateJobQueueResponseOps(v)

}
