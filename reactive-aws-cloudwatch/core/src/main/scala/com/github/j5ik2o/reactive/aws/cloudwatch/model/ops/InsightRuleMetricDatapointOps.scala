// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class InsightRuleMetricDatapointBuilderOps(val self: InsightRuleMetricDatapoint.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala(value: Option[java.time.Instant]): InsightRuleMetricDatapoint.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uniqueContributorsAsScala(value: Option[Double]): InsightRuleMetricDatapoint.Builder = {
    value.fold(self) { v =>
      self.uniqueContributors(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxContributorValueAsScala(value: Option[Double]): InsightRuleMetricDatapoint.Builder = {
    value.fold(self) { v =>
      self.maxContributorValue(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sampleCountAsScala(value: Option[Double]): InsightRuleMetricDatapoint.Builder = {
    value.fold(self) { v =>
      self.sampleCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def averageAsScala(value: Option[Double]): InsightRuleMetricDatapoint.Builder = {
    value.fold(self) { v =>
      self.average(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sumAsScala(value: Option[Double]): InsightRuleMetricDatapoint.Builder = {
    value.fold(self) { v =>
      self.sum(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minimumAsScala(value: Option[Double]): InsightRuleMetricDatapoint.Builder = {
    value.fold(self) { v =>
      self.minimum(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumAsScala(value: Option[Double]): InsightRuleMetricDatapoint.Builder = {
    value.fold(self) { v =>
      self.maximum(v)
    }
  }

}

final class InsightRuleMetricDatapointOps(val self: InsightRuleMetricDatapoint) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uniqueContributorsAsScala: Option[Double] = Option(self.uniqueContributors)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxContributorValueAsScala: Option[Double] = Option(self.maxContributorValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sampleCountAsScala: Option[Double] = Option(self.sampleCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def averageAsScala: Option[Double] = Option(self.average)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sumAsScala: Option[Double] = Option(self.sum)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minimumAsScala: Option[Double] = Option(self.minimum)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumAsScala: Option[Double] = Option(self.maximum)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInsightRuleMetricDatapointOps {

  implicit def toInsightRuleMetricDatapointBuilderOps(
      v: InsightRuleMetricDatapoint.Builder
  ): InsightRuleMetricDatapointBuilderOps = new InsightRuleMetricDatapointBuilderOps(v)

  implicit def toInsightRuleMetricDatapointOps(v: InsightRuleMetricDatapoint): InsightRuleMetricDatapointOps =
    new InsightRuleMetricDatapointOps(v)

}
