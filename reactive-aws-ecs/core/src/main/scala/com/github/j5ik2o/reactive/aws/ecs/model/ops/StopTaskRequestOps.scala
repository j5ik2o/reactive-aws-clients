// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class StopTaskRequestBuilderOps(val self: StopTaskRequest.Builder) extends AnyVal {

  final def clusterAsScala(value: Option[String]): StopTaskRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  final def taskAsScala(value: Option[String]): StopTaskRequest.Builder = {
    value.fold(self) { v =>
      self.task(v)
    }
  }

  final def reasonAsScala(value: Option[String]): StopTaskRequest.Builder = {
    value.fold(self) { v =>
      self.reason(v)
    }
  }

}

final class StopTaskRequestOps(val self: StopTaskRequest) extends AnyVal {

  final def clusterAsScala: Option[String] = Option(self.cluster)

  final def taskAsScala: Option[String] = Option(self.task)

  final def reasonAsScala: Option[String] = Option(self.reason)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStopTaskRequestOps {

  implicit def toStopTaskRequestBuilderOps(v: StopTaskRequest.Builder): StopTaskRequestBuilderOps =
    new StopTaskRequestBuilderOps(v)

  implicit def toStopTaskRequestOps(v: StopTaskRequest): StopTaskRequestOps = new StopTaskRequestOps(v)

}
