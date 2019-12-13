// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class GetInsightRuleReportRequestBuilderOps(val self: GetInsightRuleReportRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNameAsScala(value: Option[String]): GetInsightRuleReportRequest.Builder = {
    value.fold(self) { v =>
      self.ruleName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala(value: Option[java.time.Instant]): GetInsightRuleReportRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimeAsScala(value: Option[java.time.Instant]): GetInsightRuleReportRequest.Builder = {
    value.fold(self) { v =>
      self.endTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def periodAsScala(value: Option[Int]): GetInsightRuleReportRequest.Builder = {
    value.fold(self) { v =>
      self.period(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxContributorCountAsScala(value: Option[Int]): GetInsightRuleReportRequest.Builder = {
    value.fold(self) { v =>
      self.maxContributorCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricsAsScala(value: Option[Seq[String]]): GetInsightRuleReportRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.metrics(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def orderByAsScala(value: Option[String]): GetInsightRuleReportRequest.Builder = {
    value.fold(self) { v =>
      self.orderBy(v)
    }
  }

}

final class GetInsightRuleReportRequestOps(val self: GetInsightRuleReportRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNameAsScala: Option[String] = Option(self.ruleName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimeAsScala: Option[java.time.Instant] = Option(self.endTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def periodAsScala: Option[Int] = Option(self.period)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxContributorCountAsScala: Option[Int] = Option(self.maxContributorCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricsAsScala: Option[Seq[String]] = Option(self.metrics).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def orderByAsScala: Option[String] = Option(self.orderBy)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetInsightRuleReportRequestOps {

  implicit def toGetInsightRuleReportRequestBuilderOps(
      v: GetInsightRuleReportRequest.Builder
  ): GetInsightRuleReportRequestBuilderOps = new GetInsightRuleReportRequestBuilderOps(v)

  implicit def toGetInsightRuleReportRequestOps(v: GetInsightRuleReportRequest): GetInsightRuleReportRequestOps =
    new GetInsightRuleReportRequestOps(v)

}
