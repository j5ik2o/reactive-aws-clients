// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class StartQueryResponseBuilderOps(val self: StartQueryResponse.Builder) extends AnyVal {

  final def queryIdAsScala(value: Option[String]): StartQueryResponse.Builder = {
    value.fold(self) { v =>
      self.queryId(v)
    }
  } // String

}

final class StartQueryResponseOps(val self: StartQueryResponse) extends AnyVal {

  final def queryIdAsScala: Option[String] = Option(self.queryId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartQueryResponseOps {

  implicit def toStartQueryResponseBuilderOps(v: StartQueryResponse.Builder): StartQueryResponseBuilderOps =
    new StartQueryResponseBuilderOps(v)

  implicit def toStartQueryResponseOps(v: StartQueryResponse): StartQueryResponseOps = new StartQueryResponseOps(v)

}
