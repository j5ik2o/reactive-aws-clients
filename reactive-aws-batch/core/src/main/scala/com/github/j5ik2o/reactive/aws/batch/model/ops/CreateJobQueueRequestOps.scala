// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class CreateJobQueueRequestBuilderOps(val self: CreateJobQueueRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueNameAsScala(value: Option[String]): CreateJobQueueRequest.Builder = {
    value.fold(self) { v => self.jobQueueName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[JQState]): CreateJobQueueRequest.Builder = {
    value.fold(self) { v => self.state(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priorityAsScala(value: Option[Int]): CreateJobQueueRequest.Builder = {
    value.fold(self) { v => self.priority(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentOrderAsScala(
      value: Option[Seq[ComputeEnvironmentOrder]]
  ): CreateJobQueueRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.computeEnvironmentOrder(v.asJava)
    }
  }

}

final class CreateJobQueueRequestOps(val self: CreateJobQueueRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueNameAsScala: Option[String] = Option(self.jobQueueName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[JQState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priorityAsScala: Option[Int] = Option(self.priority)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentOrderAsScala: Option[Seq[ComputeEnvironmentOrder]] =
    Option(self.computeEnvironmentOrder).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateJobQueueRequestOps {

  implicit def toCreateJobQueueRequestBuilderOps(v: CreateJobQueueRequest.Builder): CreateJobQueueRequestBuilderOps =
    new CreateJobQueueRequestBuilderOps(v)

  implicit def toCreateJobQueueRequestOps(v: CreateJobQueueRequest): CreateJobQueueRequestOps =
    new CreateJobQueueRequestOps(v)

}
