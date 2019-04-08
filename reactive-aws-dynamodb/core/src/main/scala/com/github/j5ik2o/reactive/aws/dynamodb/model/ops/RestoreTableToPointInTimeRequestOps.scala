// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class RestoreTableToPointInTimeRequestBuilderOps(val self: RestoreTableToPointInTimeRequest.Builder)
    extends AnyVal {

  final def sourceTableNameAsScala(value: Option[String]): RestoreTableToPointInTimeRequest.Builder = {
    value.fold(self) { v =>
      self.sourceTableName(v)
    }
  } // String

  final def targetTableNameAsScala(value: Option[String]): RestoreTableToPointInTimeRequest.Builder = {
    value.fold(self) { v =>
      self.targetTableName(v)
    }
  } // String

  final def useLatestRestorableTimeAsScala(value: Option[Boolean]): RestoreTableToPointInTimeRequest.Builder = {
    value.fold(self) { v =>
      self.useLatestRestorableTime(v)
    }
  } // Boolean

  final def restoreDateTimeAsScala(value: Option[java.time.Instant]): RestoreTableToPointInTimeRequest.Builder = {
    value.fold(self) { v =>
      self.restoreDateTime(v)
    }
  } // java.time.Instant

}

final class RestoreTableToPointInTimeRequestOps(val self: RestoreTableToPointInTimeRequest) extends AnyVal {

  final def sourceTableNameAsScala: Option[String] = Option(self.sourceTableName) // String

  final def targetTableNameAsScala: Option[String] = Option(self.targetTableName) // String

  final def useLatestRestorableTimeAsScala: Option[Boolean] = Option(self.useLatestRestorableTime) // Boolean

  final def restoreDateTimeAsScala: Option[java.time.Instant] = Option(self.restoreDateTime) // java.time.Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestoreTableToPointInTimeRequestOps {

  implicit def toRestoreTableToPointInTimeRequestBuilderOps(
      v: RestoreTableToPointInTimeRequest.Builder
  ): RestoreTableToPointInTimeRequestBuilderOps = new RestoreTableToPointInTimeRequestBuilderOps(v)

  implicit def toRestoreTableToPointInTimeRequestOps(
      v: RestoreTableToPointInTimeRequest
  ): RestoreTableToPointInTimeRequestOps = new RestoreTableToPointInTimeRequestOps(v)

}
