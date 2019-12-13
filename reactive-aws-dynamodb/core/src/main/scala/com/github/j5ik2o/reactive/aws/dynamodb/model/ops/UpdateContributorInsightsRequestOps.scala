// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateContributorInsightsRequestBuilderOps(val self: UpdateContributorInsightsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): UpdateContributorInsightsRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): UpdateContributorInsightsRequest.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contributorInsightsActionAsScala(
      value: Option[ContributorInsightsAction]
  ): UpdateContributorInsightsRequest.Builder = {
    value.fold(self) { v =>
      self.contributorInsightsAction(v)
    }
  }

}

final class UpdateContributorInsightsRequestOps(val self: UpdateContributorInsightsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contributorInsightsActionAsScala: Option[ContributorInsightsAction] = Option(self.contributorInsightsAction)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateContributorInsightsRequestOps {

  implicit def toUpdateContributorInsightsRequestBuilderOps(
      v: UpdateContributorInsightsRequest.Builder
  ): UpdateContributorInsightsRequestBuilderOps = new UpdateContributorInsightsRequestBuilderOps(v)

  implicit def toUpdateContributorInsightsRequestOps(
      v: UpdateContributorInsightsRequest
  ): UpdateContributorInsightsRequestOps = new UpdateContributorInsightsRequestOps(v)

}
