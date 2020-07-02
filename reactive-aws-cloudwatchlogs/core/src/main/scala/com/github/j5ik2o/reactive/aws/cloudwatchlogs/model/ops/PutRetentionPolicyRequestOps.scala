// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutRetentionPolicyRequestBuilderOps(val self: PutRetentionPolicyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): PutRetentionPolicyRequest.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retentionInDaysAsScala(value: Option[Int]): PutRetentionPolicyRequest.Builder = {
    value.fold(self) { v => self.retentionInDays(v) }
  }

}

final class PutRetentionPolicyRequestOps(val self: PutRetentionPolicyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retentionInDaysAsScala: Option[Int] = Option(self.retentionInDays)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutRetentionPolicyRequestOps {

  implicit def toPutRetentionPolicyRequestBuilderOps(
      v: PutRetentionPolicyRequest.Builder
  ): PutRetentionPolicyRequestBuilderOps = new PutRetentionPolicyRequestBuilderOps(v)

  implicit def toPutRetentionPolicyRequestOps(v: PutRetentionPolicyRequest): PutRetentionPolicyRequestOps =
    new PutRetentionPolicyRequestOps(v)

}
