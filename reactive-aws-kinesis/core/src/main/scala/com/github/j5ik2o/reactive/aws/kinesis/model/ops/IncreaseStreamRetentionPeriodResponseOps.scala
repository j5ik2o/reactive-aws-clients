// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class IncreaseStreamRetentionPeriodResponseBuilderOps(val self: IncreaseStreamRetentionPeriodResponse.Builder)
    extends AnyVal {}

final class IncreaseStreamRetentionPeriodResponseOps(val self: IncreaseStreamRetentionPeriodResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIncreaseStreamRetentionPeriodResponseOps {

  implicit def toIncreaseStreamRetentionPeriodResponseBuilderOps(
      v: IncreaseStreamRetentionPeriodResponse.Builder
  ): IncreaseStreamRetentionPeriodResponseBuilderOps = new IncreaseStreamRetentionPeriodResponseBuilderOps(v)

  implicit def toIncreaseStreamRetentionPeriodResponseOps(
      v: IncreaseStreamRetentionPeriodResponse
  ): IncreaseStreamRetentionPeriodResponseOps = new IncreaseStreamRetentionPeriodResponseOps(v)

}
