// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class UpdateJobQueueRequestBuilderOps(val self: UpdateJobQueueRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueAsScala(value: Option[String]): UpdateJobQueueRequest.Builder = {
    value.fold(self) { v =>
      self.jobQueue(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[JQState]): UpdateJobQueueRequest.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priorityAsScala(value: Option[Int]): UpdateJobQueueRequest.Builder = {
    value.fold(self) { v =>
      self.priority(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentOrderAsScala(
      value: Option[Seq[ComputeEnvironmentOrder]]
  ): UpdateJobQueueRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.computeEnvironmentOrder(v.asJava)
    }
  }

}

final class UpdateJobQueueRequestOps(val self: UpdateJobQueueRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueAsScala: Option[String] = Option(self.jobQueue)

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
trait ToUpdateJobQueueRequestOps {

  implicit def toUpdateJobQueueRequestBuilderOps(v: UpdateJobQueueRequest.Builder): UpdateJobQueueRequestBuilderOps =
    new UpdateJobQueueRequestBuilderOps(v)

  implicit def toUpdateJobQueueRequestOps(v: UpdateJobQueueRequest): UpdateJobQueueRequestOps =
    new UpdateJobQueueRequestOps(v)

}
