// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ContributorInsightsSummaryBuilderOps(val self: ContributorInsightsSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): ContributorInsightsSummary.Builder = {
    value.fold(self) { v => self.tableName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): ContributorInsightsSummary.Builder = {
    value.fold(self) { v => self.indexName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contributorInsightsStatusAsScala(
      value: Option[ContributorInsightsStatus]
  ): ContributorInsightsSummary.Builder = {
    value.fold(self) { v => self.contributorInsightsStatus(v) }
  }

}

final class ContributorInsightsSummaryOps(val self: ContributorInsightsSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contributorInsightsStatusAsScala: Option[ContributorInsightsStatus] = Option(self.contributorInsightsStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContributorInsightsSummaryOps {

  implicit def toContributorInsightsSummaryBuilderOps(
      v: ContributorInsightsSummary.Builder
  ): ContributorInsightsSummaryBuilderOps = new ContributorInsightsSummaryBuilderOps(v)

  implicit def toContributorInsightsSummaryOps(v: ContributorInsightsSummary): ContributorInsightsSummaryOps =
    new ContributorInsightsSummaryOps(v)

}
