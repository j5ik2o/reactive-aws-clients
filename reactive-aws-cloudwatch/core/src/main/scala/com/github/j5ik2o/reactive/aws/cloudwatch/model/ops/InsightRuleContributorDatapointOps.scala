// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class InsightRuleContributorDatapointBuilderOps(val self: InsightRuleContributorDatapoint.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala(value: Option[java.time.Instant]): InsightRuleContributorDatapoint.Builder = {
    value.fold(self) { v => self.timestamp(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def approximateValueAsScala(value: Option[Double]): InsightRuleContributorDatapoint.Builder = {
    value.fold(self) { v => self.approximateValue(v) }
  }

}

final class InsightRuleContributorDatapointOps(val self: InsightRuleContributorDatapoint) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def approximateValueAsScala: Option[Double] = Option(self.approximateValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInsightRuleContributorDatapointOps {

  implicit def toInsightRuleContributorDatapointBuilderOps(
      v: InsightRuleContributorDatapoint.Builder
  ): InsightRuleContributorDatapointBuilderOps = new InsightRuleContributorDatapointBuilderOps(v)

  implicit def toInsightRuleContributorDatapointOps(
      v: InsightRuleContributorDatapoint
  ): InsightRuleContributorDatapointOps = new InsightRuleContributorDatapointOps(v)

}
