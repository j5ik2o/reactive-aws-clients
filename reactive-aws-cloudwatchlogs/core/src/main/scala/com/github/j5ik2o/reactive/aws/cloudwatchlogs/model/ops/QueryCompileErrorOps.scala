// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class QueryCompileErrorBuilderOps(val self: QueryCompileError.Builder) extends AnyVal {

  final def locationAsScala(value: Option[QueryCompileErrorLocation]): QueryCompileError.Builder = {
    value.fold(self) { v =>
      self.location(v)
    }
  } // QueryCompileErrorLocation

  final def messageAsScala(value: Option[String]): QueryCompileError.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  } // String

}

final class QueryCompileErrorOps(val self: QueryCompileError) extends AnyVal {

  final def locationAsScala: Option[QueryCompileErrorLocation] = Option(self.location) // QueryCompileErrorLocation

  final def messageAsScala: Option[String] = Option(self.message) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToQueryCompileErrorOps {

  implicit def toQueryCompileErrorBuilderOps(v: QueryCompileError.Builder): QueryCompileErrorBuilderOps =
    new QueryCompileErrorBuilderOps(v)

  implicit def toQueryCompileErrorOps(v: QueryCompileError): QueryCompileErrorOps = new QueryCompileErrorOps(v)

}
