// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteMetricFilterRequestBuilderOps(val self: DeleteMetricFilterRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): DeleteMetricFilterRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterNameAsScala(value: Option[String]): DeleteMetricFilterRequest.Builder = {
    value.fold(self) { v =>
      self.filterName(v)
    }
  }

}

final class DeleteMetricFilterRequestOps(val self: DeleteMetricFilterRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterNameAsScala: Option[String] = Option(self.filterName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteMetricFilterRequestOps {

  implicit def toDeleteMetricFilterRequestBuilderOps(
      v: DeleteMetricFilterRequest.Builder
  ): DeleteMetricFilterRequestBuilderOps = new DeleteMetricFilterRequestBuilderOps(v)

  implicit def toDeleteMetricFilterRequestOps(v: DeleteMetricFilterRequest): DeleteMetricFilterRequestOps =
    new DeleteMetricFilterRequestOps(v)

}
