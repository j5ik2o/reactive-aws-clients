// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class QueryCompileErrorLocationBuilderOps(val self: QueryCompileErrorLocation.Builder) extends AnyVal {

  final def startCharOffsetAsScala(value: Option[Int]): QueryCompileErrorLocation.Builder = {
    value.fold(self) { v =>
      self.startCharOffset(v)
    }
  } // Int

  final def endCharOffsetAsScala(value: Option[Int]): QueryCompileErrorLocation.Builder = {
    value.fold(self) { v =>
      self.endCharOffset(v)
    }
  } // Int

}

final class QueryCompileErrorLocationOps(val self: QueryCompileErrorLocation) extends AnyVal {

  final def startCharOffsetAsScala: Option[Int] = Option(self.startCharOffset) // Int

  final def endCharOffsetAsScala: Option[Int] = Option(self.endCharOffset) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToQueryCompileErrorLocationOps {

  implicit def toQueryCompileErrorLocationBuilderOps(
      v: QueryCompileErrorLocation.Builder
  ): QueryCompileErrorLocationBuilderOps = new QueryCompileErrorLocationBuilderOps(v)

  implicit def toQueryCompileErrorLocationOps(v: QueryCompileErrorLocation): QueryCompileErrorLocationOps =
    new QueryCompileErrorLocationOps(v)

}
