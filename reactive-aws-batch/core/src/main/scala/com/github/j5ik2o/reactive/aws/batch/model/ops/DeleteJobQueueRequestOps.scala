// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DeleteJobQueueRequestBuilderOps(val self: DeleteJobQueueRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueAsScala(value: Option[String]): DeleteJobQueueRequest.Builder = {
    value.fold(self) { v => self.jobQueue(v) }
  }

}

final class DeleteJobQueueRequestOps(val self: DeleteJobQueueRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueAsScala: Option[String] = Option(self.jobQueue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteJobQueueRequestOps {

  implicit def toDeleteJobQueueRequestBuilderOps(v: DeleteJobQueueRequest.Builder): DeleteJobQueueRequestBuilderOps =
    new DeleteJobQueueRequestBuilderOps(v)

  implicit def toDeleteJobQueueRequestOps(v: DeleteJobQueueRequest): DeleteJobQueueRequestOps =
    new DeleteJobQueueRequestOps(v)

}
