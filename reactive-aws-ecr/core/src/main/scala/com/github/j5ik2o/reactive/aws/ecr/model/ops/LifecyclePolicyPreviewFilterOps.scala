// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class LifecyclePolicyPreviewFilterBuilderOps(val self: LifecyclePolicyPreviewFilter.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagStatusAsScala(value: Option[TagStatus]): LifecyclePolicyPreviewFilter.Builder = {
    value.fold(self) { v => self.tagStatus(v) }
  }

}

final class LifecyclePolicyPreviewFilterOps(val self: LifecyclePolicyPreviewFilter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagStatusAsScala: Option[TagStatus] = Option(self.tagStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLifecyclePolicyPreviewFilterOps {

  implicit def toLifecyclePolicyPreviewFilterBuilderOps(
      v: LifecyclePolicyPreviewFilter.Builder
  ): LifecyclePolicyPreviewFilterBuilderOps = new LifecyclePolicyPreviewFilterBuilderOps(v)

  implicit def toLifecyclePolicyPreviewFilterOps(v: LifecyclePolicyPreviewFilter): LifecyclePolicyPreviewFilterOps =
    new LifecyclePolicyPreviewFilterOps(v)

}
