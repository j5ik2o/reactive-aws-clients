// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateContinuousBackupsRequestBuilderOps(val self: UpdateContinuousBackupsRequest.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): UpdateContinuousBackupsRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  final def pointInTimeRecoverySpecificationAsScala(
      value: Option[PointInTimeRecoverySpecification]
  ): UpdateContinuousBackupsRequest.Builder = {
    value.fold(self) { v =>
      self.pointInTimeRecoverySpecification(v)
    }
  }

}

final class UpdateContinuousBackupsRequestOps(val self: UpdateContinuousBackupsRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName)

  final def pointInTimeRecoverySpecificationAsScala: Option[PointInTimeRecoverySpecification] =
    Option(self.pointInTimeRecoverySpecification)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateContinuousBackupsRequestOps {

  implicit def toUpdateContinuousBackupsRequestBuilderOps(
      v: UpdateContinuousBackupsRequest.Builder
  ): UpdateContinuousBackupsRequestBuilderOps = new UpdateContinuousBackupsRequestBuilderOps(v)

  implicit def toUpdateContinuousBackupsRequestOps(
      v: UpdateContinuousBackupsRequest
  ): UpdateContinuousBackupsRequestOps = new UpdateContinuousBackupsRequestOps(v)

}
