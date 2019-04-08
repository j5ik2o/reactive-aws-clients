// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class GetUpgradeHistoryResponseBuilderOps(val self: GetUpgradeHistoryResponse.Builder) extends AnyVal {

  final def upgradeHistoriesAsScala(value: Option[Seq[UpgradeHistory]]): GetUpgradeHistoryResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.upgradeHistories(v.asJava)
    } // Seq[UpgradeHistory]
  }

  final def nextTokenAsScala(value: Option[String]): GetUpgradeHistoryResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class GetUpgradeHistoryResponseOps(val self: GetUpgradeHistoryResponse) extends AnyVal {

  final def upgradeHistoriesAsScala: Option[Seq[UpgradeHistory]] = Option(self.upgradeHistories).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[UpgradeHistory]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetUpgradeHistoryResponseOps {

  implicit def toGetUpgradeHistoryResponseBuilderOps(
      v: GetUpgradeHistoryResponse.Builder
  ): GetUpgradeHistoryResponseBuilderOps = new GetUpgradeHistoryResponseBuilderOps(v)

  implicit def toGetUpgradeHistoryResponseOps(v: GetUpgradeHistoryResponse): GetUpgradeHistoryResponseOps =
    new GetUpgradeHistoryResponseOps(v)

}
