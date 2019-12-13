// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class GetInsightRuleReportResponseBuilderOps(val self: GetInsightRuleReportResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyLabelsAsScala(value: Option[Seq[String]]): GetInsightRuleReportResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.keyLabels(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def aggregationStatisticAsScala(value: Option[String]): GetInsightRuleReportResponse.Builder = {
    value.fold(self) { v =>
      self.aggregationStatistic(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def aggregateValueAsScala(value: Option[Double]): GetInsightRuleReportResponse.Builder = {
    value.fold(self) { v =>
      self.aggregateValue(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def approximateUniqueCountAsScala(value: Option[Long]): GetInsightRuleReportResponse.Builder = {
    value.fold(self) { v =>
      self.approximateUniqueCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contributorsAsScala(value: Option[Seq[InsightRuleContributor]]): GetInsightRuleReportResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.contributors(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricDatapointsAsScala(
      value: Option[Seq[InsightRuleMetricDatapoint]]
  ): GetInsightRuleReportResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.metricDatapoints(v.asJava)
    }
  }

}

final class GetInsightRuleReportResponseOps(val self: GetInsightRuleReportResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyLabelsAsScala: Option[Seq[String]] = Option(self.keyLabels).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def aggregationStatisticAsScala: Option[String] = Option(self.aggregationStatistic)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def aggregateValueAsScala: Option[Double] = Option(self.aggregateValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def approximateUniqueCountAsScala: Option[Long] = Option(self.approximateUniqueCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contributorsAsScala: Option[Seq[InsightRuleContributor]] = Option(self.contributors).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricDatapointsAsScala: Option[Seq[InsightRuleMetricDatapoint]] = Option(self.metricDatapoints).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetInsightRuleReportResponseOps {

  implicit def toGetInsightRuleReportResponseBuilderOps(
      v: GetInsightRuleReportResponse.Builder
  ): GetInsightRuleReportResponseBuilderOps = new GetInsightRuleReportResponseBuilderOps(v)

  implicit def toGetInsightRuleReportResponseOps(v: GetInsightRuleReportResponse): GetInsightRuleReportResponseOps =
    new GetInsightRuleReportResponseOps(v)

}
