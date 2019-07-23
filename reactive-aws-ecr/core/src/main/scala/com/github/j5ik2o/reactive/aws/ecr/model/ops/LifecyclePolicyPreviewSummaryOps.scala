// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class LifecyclePolicyPreviewSummaryBuilderOps(val self: LifecyclePolicyPreviewSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expiringImageTotalCountAsScala(value: Option[Int]): LifecyclePolicyPreviewSummary.Builder = {
    value.fold(self) { v =>
      self.expiringImageTotalCount(v)
    }
  }

}

final class LifecyclePolicyPreviewSummaryOps(val self: LifecyclePolicyPreviewSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expiringImageTotalCountAsScala: Option[Int] = Option(self.expiringImageTotalCount)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLifecyclePolicyPreviewSummaryOps {

  implicit def toLifecyclePolicyPreviewSummaryBuilderOps(
      v: LifecyclePolicyPreviewSummary.Builder
  ): LifecyclePolicyPreviewSummaryBuilderOps = new LifecyclePolicyPreviewSummaryBuilderOps(v)

  implicit def toLifecyclePolicyPreviewSummaryOps(v: LifecyclePolicyPreviewSummary): LifecyclePolicyPreviewSummaryOps =
    new LifecyclePolicyPreviewSummaryOps(v)

}
