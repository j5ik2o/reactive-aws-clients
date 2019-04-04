// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DecreaseStreamRetentionPeriodRequestBuilderOps(val self: DecreaseStreamRetentionPeriodRequest.Builder)
    extends AnyVal {

  final def withStreamNameAsScala(value: Option[String]): DecreaseStreamRetentionPeriodRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

  final def withRetentionPeriodHoursAsScala(value: Option[Int]): DecreaseStreamRetentionPeriodRequest.Builder = {
    value.fold(self) { v =>
      self.retentionPeriodHours(v)
    }
  } // Int

}

final class DecreaseStreamRetentionPeriodRequestOps(val self: DecreaseStreamRetentionPeriodRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

  final def retentionPeriodHoursAsScala: Option[Int] = Option(self.retentionPeriodHours) // Int

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
