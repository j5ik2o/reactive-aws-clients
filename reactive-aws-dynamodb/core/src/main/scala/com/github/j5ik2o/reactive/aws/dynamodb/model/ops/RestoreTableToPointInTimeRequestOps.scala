// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class RestoreTableToPointInTimeRequestBuilderOps(val self: RestoreTableToPointInTimeRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceTableArnAsScala(value: Option[String]): RestoreTableToPointInTimeRequest.Builder = {
    value.fold(self) { v => self.sourceTableArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceTableNameAsScala(value: Option[String]): RestoreTableToPointInTimeRequest.Builder = {
    value.fold(self) { v => self.sourceTableName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetTableNameAsScala(value: Option[String]): RestoreTableToPointInTimeRequest.Builder = {
    value.fold(self) { v => self.targetTableName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def useLatestRestorableTimeAsScala(value: Option[Boolean]): RestoreTableToPointInTimeRequest.Builder = {
    value.fold(self) { v => self.useLatestRestorableTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def restoreDateTimeAsScala(value: Option[java.time.Instant]): RestoreTableToPointInTimeRequest.Builder = {
    value.fold(self) { v => self.restoreDateTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def billingModeOverrideAsScala(value: Option[BillingMode]): RestoreTableToPointInTimeRequest.Builder = {
    value.fold(self) { v => self.billingModeOverride(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalSecondaryIndexOverrideAsScala(
      value: Option[Seq[GlobalSecondaryIndex]]
  ): RestoreTableToPointInTimeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.globalSecondaryIndexOverride(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localSecondaryIndexOverrideAsScala(
      value: Option[Seq[LocalSecondaryIndex]]
  ): RestoreTableToPointInTimeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.localSecondaryIndexOverride(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedThroughputOverrideAsScala(
      value: Option[ProvisionedThroughput]
  ): RestoreTableToPointInTimeRequest.Builder = {
    value.fold(self) { v => self.provisionedThroughputOverride(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseSpecificationOverrideAsScala(
      value: Option[SSESpecification]
  ): RestoreTableToPointInTimeRequest.Builder = {
    value.fold(self) { v => self.sseSpecificationOverride(v) }
  }

}

final class RestoreTableToPointInTimeRequestOps(val self: RestoreTableToPointInTimeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceTableArnAsScala: Option[String] = Option(self.sourceTableArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceTableNameAsScala: Option[String] = Option(self.sourceTableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetTableNameAsScala: Option[String] = Option(self.targetTableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def useLatestRestorableTimeAsScala: Option[Boolean] = Option(self.useLatestRestorableTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def restoreDateTimeAsScala: Option[java.time.Instant] = Option(self.restoreDateTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def billingModeOverrideAsScala: Option[BillingMode] = Option(self.billingModeOverride)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalSecondaryIndexOverrideAsScala: Option[Seq[GlobalSecondaryIndex]] =
    Option(self.globalSecondaryIndexOverride).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localSecondaryIndexOverrideAsScala: Option[Seq[LocalSecondaryIndex]] =
    Option(self.localSecondaryIndexOverride).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedThroughputOverrideAsScala: Option[ProvisionedThroughput] =
    Option(self.provisionedThroughputOverride)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseSpecificationOverrideAsScala: Option[SSESpecification] = Option(self.sseSpecificationOverride)

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
