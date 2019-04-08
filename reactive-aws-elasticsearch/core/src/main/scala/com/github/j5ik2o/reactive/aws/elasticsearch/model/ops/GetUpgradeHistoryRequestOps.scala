// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class GetUpgradeHistoryRequestBuilderOps(val self: GetUpgradeHistoryRequest.Builder) extends AnyVal {

  final def domainNameAsScala(value: Option[String]): GetUpgradeHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): GetUpgradeHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): GetUpgradeHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class GetUpgradeHistoryRequestOps(val self: GetUpgradeHistoryRequest) extends AnyVal {

  final def domainNameAsScala: Option[String] = Option(self.domainName)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetUpgradeHistoryRequestOps {

  implicit def toGetUpgradeHistoryRequestBuilderOps(
      v: GetUpgradeHistoryRequest.Builder
  ): GetUpgradeHistoryRequestBuilderOps = new GetUpgradeHistoryRequestBuilderOps(v)

  implicit def toGetUpgradeHistoryRequestOps(v: GetUpgradeHistoryRequest): GetUpgradeHistoryRequestOps =
    new GetUpgradeHistoryRequestOps(v)

}
