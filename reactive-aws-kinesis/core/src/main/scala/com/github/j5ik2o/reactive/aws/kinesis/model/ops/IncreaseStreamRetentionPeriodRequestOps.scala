// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class IncreaseStreamRetentionPeriodRequestBuilderOps(val self: IncreaseStreamRetentionPeriodRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamNameAsScala(value: Option[String]): IncreaseStreamRetentionPeriodRequest.Builder = {
            value.fold(self){ v => self.streamName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def retentionPeriodHoursAsScala(value: Option[Int]): IncreaseStreamRetentionPeriodRequest.Builder = {
            value.fold(self){ v => self.retentionPeriodHours(v) }
            } 


}

final class IncreaseStreamRetentionPeriodRequestOps(val self: IncreaseStreamRetentionPeriodRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamNameAsScala: Option[String] = Option(self.streamName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def retentionPeriodHoursAsScala: Option[Int] = Option(self.retentionPeriodHours) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIncreaseStreamRetentionPeriodRequestOps {

implicit def toIncreaseStreamRetentionPeriodRequestBuilderOps(v: IncreaseStreamRetentionPeriodRequest.Builder): IncreaseStreamRetentionPeriodRequestBuilderOps = new IncreaseStreamRetentionPeriodRequestBuilderOps(v)

implicit def toIncreaseStreamRetentionPeriodRequestOps(v: IncreaseStreamRetentionPeriodRequest): IncreaseStreamRetentionPeriodRequestOps = new IncreaseStreamRetentionPeriodRequestOps(v)

}

