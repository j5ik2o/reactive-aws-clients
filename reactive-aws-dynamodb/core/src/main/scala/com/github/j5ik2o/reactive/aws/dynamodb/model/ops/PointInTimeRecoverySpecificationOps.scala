// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class PointInTimeRecoverySpecificationBuilderOps(val self: PointInTimeRecoverySpecification.Builder)
    extends AnyVal {

  final def withPointInTimeRecoveryEnabledAsScala(value: Option[Boolean]): PointInTimeRecoverySpecification.Builder = {
    value.fold(self) { v =>
      self.pointInTimeRecoveryEnabled(v)
    }
  } // Boolean

}

final class PointInTimeRecoverySpecificationOps(val self: PointInTimeRecoverySpecification) extends AnyVal {

  final def pointInTimeRecoveryEnabledAsScala: Option[Boolean] = Option(self.pointInTimeRecoveryEnabled) // Boolean

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
