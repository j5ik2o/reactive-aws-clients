// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class QueryCompileErrorBuilderOps(val self: QueryCompileError.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def locationAsScala(value: Option[QueryCompileErrorLocation]): QueryCompileError.Builder = {
    value.fold(self) { v => self.location(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): QueryCompileError.Builder = {
    value.fold(self) { v => self.message(v) }
  }

}

final class QueryCompileErrorOps(val self: QueryCompileError) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def locationAsScala: Option[QueryCompileErrorLocation] = Option(self.location)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToQueryCompileErrorOps {

  implicit def toQueryCompileErrorBuilderOps(v: QueryCompileError.Builder): QueryCompileErrorBuilderOps =
    new QueryCompileErrorBuilderOps(v)

  implicit def toQueryCompileErrorOps(v: QueryCompileError): QueryCompileErrorOps = new QueryCompileErrorOps(v)

}
