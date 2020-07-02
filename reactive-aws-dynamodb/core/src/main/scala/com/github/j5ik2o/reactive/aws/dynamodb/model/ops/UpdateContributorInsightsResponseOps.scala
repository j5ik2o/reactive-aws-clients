// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateContributorInsightsResponseBuilderOps(val self: UpdateContributorInsightsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): UpdateContributorInsightsResponse.Builder = {
    value.fold(self) { v => self.tableName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): UpdateContributorInsightsResponse.Builder = {
    value.fold(self) { v => self.indexName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contributorInsightsStatusAsScala(
      value: Option[ContributorInsightsStatus]
  ): UpdateContributorInsightsResponse.Builder = {
    value.fold(self) { v => self.contributorInsightsStatus(v) }
  }

}

final class UpdateContributorInsightsResponseOps(val self: UpdateContributorInsightsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contributorInsightsStatusAsScala: Option[ContributorInsightsStatus] = Option(self.contributorInsightsStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateContributorInsightsResponseOps {

  implicit def toUpdateContributorInsightsResponseBuilderOps(
      v: UpdateContributorInsightsResponse.Builder
  ): UpdateContributorInsightsResponseBuilderOps = new UpdateContributorInsightsResponseBuilderOps(v)

  implicit def toUpdateContributorInsightsResponseOps(
      v: UpdateContributorInsightsResponse
  ): UpdateContributorInsightsResponseOps = new UpdateContributorInsightsResponseOps(v)

}
