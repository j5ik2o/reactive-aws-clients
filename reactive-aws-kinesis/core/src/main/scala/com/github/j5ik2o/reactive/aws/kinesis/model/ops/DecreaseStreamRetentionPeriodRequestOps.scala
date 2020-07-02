// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DecreaseStreamRetentionPeriodRequestBuilderOps(val self: DecreaseStreamRetentionPeriodRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamNameAsScala(value: Option[String]): DecreaseStreamRetentionPeriodRequest.Builder = {
    value.fold(self) { v => self.streamName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retentionPeriodHoursAsScala(value: Option[Int]): DecreaseStreamRetentionPeriodRequest.Builder = {
    value.fold(self) { v => self.retentionPeriodHours(v) }
  }

}

final class DecreaseStreamRetentionPeriodRequestOps(val self: DecreaseStreamRetentionPeriodRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamNameAsScala: Option[String] = Option(self.streamName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retentionPeriodHoursAsScala: Option[Int] = Option(self.retentionPeriodHours)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDecreaseStreamRetentionPeriodRequestOps {

  implicit def toDecreaseStreamRetentionPeriodRequestBuilderOps(
      v: DecreaseStreamRetentionPeriodRequest.Builder
  ): DecreaseStreamRetentionPeriodRequestBuilderOps = new DecreaseStreamRetentionPeriodRequestBuilderOps(v)

  implicit def toDecreaseStreamRetentionPeriodRequestOps(
      v: DecreaseStreamRetentionPeriodRequest
  ): DecreaseStreamRetentionPeriodRequestOps = new DecreaseStreamRetentionPeriodRequestOps(v)

}
