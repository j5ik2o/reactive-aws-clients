// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class UpdateJobQueueRequestBuilderOps(val self: UpdateJobQueueRequest.Builder) extends AnyVal {

  final def jobQueueAsScala(value: Option[String]): UpdateJobQueueRequest.Builder = {
    value.fold(self) { v =>
      self.jobQueue(v)
    }
  } // String

  final def stateAsScala(value: Option[JQState]): UpdateJobQueueRequest.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  } // String

  final def priorityAsScala(value: Option[Int]): UpdateJobQueueRequest.Builder = {
    value.fold(self) { v =>
      self.priority(v)
    }
  } // Int

  final def computeEnvironmentOrderAsScala(
      value: Option[Seq[ComputeEnvironmentOrder]]
  ): UpdateJobQueueRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.computeEnvironmentOrder(v.asJava)
    } // Seq[ComputeEnvironmentOrder]
  }

}

final class UpdateJobQueueRequestOps(val self: UpdateJobQueueRequest) extends AnyVal {

  final def jobQueueAsScala: Option[String] = Option(self.jobQueue) // String

  final def stateAsScala: Option[JQState] = Option(self.state) // String

  final def priorityAsScala: Option[Int] = Option(self.priority) // Int

  final def computeEnvironmentOrderAsScala: Option[Seq[ComputeEnvironmentOrder]] =
    Option(self.computeEnvironmentOrder).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[ComputeEnvironmentOrder]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateJobQueueRequestOps {

  implicit def toUpdateJobQueueRequestBuilderOps(v: UpdateJobQueueRequest.Builder): UpdateJobQueueRequestBuilderOps =
    new UpdateJobQueueRequestBuilderOps(v)

  implicit def toUpdateJobQueueRequestOps(v: UpdateJobQueueRequest): UpdateJobQueueRequestOps =
    new UpdateJobQueueRequestOps(v)

}
