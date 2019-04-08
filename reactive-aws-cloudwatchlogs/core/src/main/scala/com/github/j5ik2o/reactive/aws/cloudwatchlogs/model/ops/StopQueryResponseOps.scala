// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class StopQueryResponseBuilderOps(val self: StopQueryResponse.Builder) extends AnyVal {

  final def successAsScala(value: Option[Boolean]): StopQueryResponse.Builder = {
    value.fold(self) { v =>
      self.success(v)
    }
  } // Boolean

}

final class StopQueryResponseOps(val self: StopQueryResponse) extends AnyVal {

  final def successAsScala: Option[Boolean] = Option(self.success) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStopQueryResponseOps {

  implicit def toStopQueryResponseBuilderOps(v: StopQueryResponse.Builder): StopQueryResponseBuilderOps =
    new StopQueryResponseBuilderOps(v)

  implicit def toStopQueryResponseOps(v: StopQueryResponse): StopQueryResponseOps = new StopQueryResponseOps(v)

}
