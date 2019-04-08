// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class CreateJobQueueRequestBuilderOps(val self: CreateJobQueueRequest.Builder) extends AnyVal {

  final def jobQueueNameAsScala(value: Option[String]): CreateJobQueueRequest.Builder = {
    value.fold(self) { v =>
      self.jobQueueName(v)
    }
  } // String

  final def stateAsScala(value: Option[JQState]): CreateJobQueueRequest.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  } // String

  final def priorityAsScala(value: Option[Int]): CreateJobQueueRequest.Builder = {
    value.fold(self) { v =>
      self.priority(v)
    }
  } // Int

  final def computeEnvironmentOrderAsScala(
      value: Option[Seq[ComputeEnvironmentOrder]]
  ): CreateJobQueueRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.computeEnvironmentOrder(v.asJava)
    } // Seq[ComputeEnvironmentOrder]
  }

}

final class CreateJobQueueRequestOps(val self: CreateJobQueueRequest) extends AnyVal {

  final def jobQueueNameAsScala: Option[String] = Option(self.jobQueueName) // String

  final def stateAsScala: Option[JQState] = Option(self.state) // String

  final def priorityAsScala: Option[Int] = Option(self.priority) // Int

  final def computeEnvironmentOrderAsScala: Option[Seq[ComputeEnvironmentOrder]] =
    Option(self.computeEnvironmentOrder).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[ComputeEnvironmentOrder]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateJobQueueRequestOps {

  implicit def toCreateJobQueueRequestBuilderOps(v: CreateJobQueueRequest.Builder): CreateJobQueueRequestBuilderOps =
    new CreateJobQueueRequestBuilderOps(v)

  implicit def toCreateJobQueueRequestOps(v: CreateJobQueueRequest): CreateJobQueueRequestOps =
    new CreateJobQueueRequestOps(v)

}
