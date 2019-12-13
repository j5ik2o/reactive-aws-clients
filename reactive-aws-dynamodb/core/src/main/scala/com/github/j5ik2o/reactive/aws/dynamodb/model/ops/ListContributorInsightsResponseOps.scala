// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ListContributorInsightsResponseBuilderOps(val self: ListContributorInsightsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contributorInsightsSummariesAsScala(
      value: Option[Seq[ContributorInsightsSummary]]
  ): ListContributorInsightsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.contributorInsightsSummaries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListContributorInsightsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListContributorInsightsResponseOps(val self: ListContributorInsightsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contributorInsightsSummariesAsScala: Option[Seq[ContributorInsightsSummary]] =
    Option(self.contributorInsightsSummaries).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListContributorInsightsResponseOps {

  implicit def toListContributorInsightsResponseBuilderOps(
      v: ListContributorInsightsResponse.Builder
  ): ListContributorInsightsResponseBuilderOps = new ListContributorInsightsResponseBuilderOps(v)

  implicit def toListContributorInsightsResponseOps(
      v: ListContributorInsightsResponse
  ): ListContributorInsightsResponseOps = new ListContributorInsightsResponseOps(v)

}
