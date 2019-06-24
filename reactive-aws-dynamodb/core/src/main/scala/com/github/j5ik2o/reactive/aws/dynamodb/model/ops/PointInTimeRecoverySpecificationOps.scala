// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class PointInTimeRecoverySpecificationBuilderOps(val self: PointInTimeRecoverySpecification.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pointInTimeRecoveryEnabledAsScala(value: Option[Boolean]): PointInTimeRecoverySpecification.Builder = {
    value.fold(self) { v =>
      self.pointInTimeRecoveryEnabled(v)
    }
  }

}

final class PointInTimeRecoverySpecificationOps(val self: PointInTimeRecoverySpecification) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pointInTimeRecoveryEnabledAsScala: Option[Boolean] = Option(self.pointInTimeRecoveryEnabled)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPointInTimeRecoverySpecificationOps {

  implicit def toPointInTimeRecoverySpecificationBuilderOps(
      v: PointInTimeRecoverySpecification.Builder
  ): PointInTimeRecoverySpecificationBuilderOps = new PointInTimeRecoverySpecificationBuilderOps(v)

  implicit def toPointInTimeRecoverySpecificationOps(
      v: PointInTimeRecoverySpecification
  ): PointInTimeRecoverySpecificationOps = new PointInTimeRecoverySpecificationOps(v)

}
