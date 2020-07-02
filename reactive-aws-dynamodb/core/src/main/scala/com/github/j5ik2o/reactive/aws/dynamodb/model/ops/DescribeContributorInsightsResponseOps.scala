// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeContributorInsightsResponseBuilderOps(val self: DescribeContributorInsightsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): DescribeContributorInsightsResponse.Builder = {
    value.fold(self) { v => self.tableName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): DescribeContributorInsightsResponse.Builder = {
    value.fold(self) { v => self.indexName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contributorInsightsRuleListAsScala(
      value: Option[Seq[String]]
  ): DescribeContributorInsightsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.contributorInsightsRuleList(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contributorInsightsStatusAsScala(
      value: Option[ContributorInsightsStatus]
  ): DescribeContributorInsightsResponse.Builder = {
    value.fold(self) { v => self.contributorInsightsStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdateDateTimeAsScala(value: Option[java.time.Instant]): DescribeContributorInsightsResponse.Builder = {
    value.fold(self) { v => self.lastUpdateDateTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureExceptionAsScala(value: Option[FailureException]): DescribeContributorInsightsResponse.Builder = {
    value.fold(self) { v => self.failureException(v) }
  }

}

final class DescribeContributorInsightsResponseOps(val self: DescribeContributorInsightsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contributorInsightsRuleListAsScala: Option[Seq[String]] =
    Option(self.contributorInsightsRuleList).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contributorInsightsStatusAsScala: Option[ContributorInsightsStatus] = Option(self.contributorInsightsStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdateDateTimeAsScala: Option[java.time.Instant] = Option(self.lastUpdateDateTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureExceptionAsScala: Option[FailureException] = Option(self.failureException)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeContributorInsightsResponseOps {

  implicit def toDescribeContributorInsightsResponseBuilderOps(
      v: DescribeContributorInsightsResponse.Builder
  ): DescribeContributorInsightsResponseBuilderOps = new DescribeContributorInsightsResponseBuilderOps(v)

  implicit def toDescribeContributorInsightsResponseOps(
      v: DescribeContributorInsightsResponse
  ): DescribeContributorInsightsResponseOps = new DescribeContributorInsightsResponseOps(v)

}
