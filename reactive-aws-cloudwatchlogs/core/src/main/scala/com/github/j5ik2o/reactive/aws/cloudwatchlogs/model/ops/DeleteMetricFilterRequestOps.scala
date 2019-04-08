// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteMetricFilterRequestBuilderOps(val self: DeleteMetricFilterRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): DeleteMetricFilterRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

  final def filterNameAsScala(value: Option[String]): DeleteMetricFilterRequest.Builder = {
    value.fold(self) { v =>
      self.filterName(v)
    }
  } // String

}

final class DeleteMetricFilterRequestOps(val self: DeleteMetricFilterRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

  final def filterNameAsScala: Option[String] = Option(self.filterName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteMetricFilterRequestOps {

  implicit def toDeleteMetricFilterRequestBuilderOps(
      v: DeleteMetricFilterRequest.Builder
  ): DeleteMetricFilterRequestBuilderOps = new DeleteMetricFilterRequestBuilderOps(v)

  implicit def toDeleteMetricFilterRequestOps(v: DeleteMetricFilterRequest): DeleteMetricFilterRequestOps =
    new DeleteMetricFilterRequestOps(v)

}
