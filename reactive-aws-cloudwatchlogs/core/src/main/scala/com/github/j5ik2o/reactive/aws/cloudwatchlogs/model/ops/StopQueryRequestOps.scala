// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class StopQueryRequestBuilderOps(val self: StopQueryRequest.Builder) extends AnyVal {

  final def queryIdAsScala(value: Option[String]): StopQueryRequest.Builder = {
    value.fold(self) { v =>
      self.queryId(v)
    }
  } // String

}

final class StopQueryRequestOps(val self: StopQueryRequest) extends AnyVal {

  final def queryIdAsScala: Option[String] = Option(self.queryId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStopQueryRequestOps {

  implicit def toStopQueryRequestBuilderOps(v: StopQueryRequest.Builder): StopQueryRequestBuilderOps =
    new StopQueryRequestBuilderOps(v)

  implicit def toStopQueryRequestOps(v: StopQueryRequest): StopQueryRequestOps = new StopQueryRequestOps(v)

}
