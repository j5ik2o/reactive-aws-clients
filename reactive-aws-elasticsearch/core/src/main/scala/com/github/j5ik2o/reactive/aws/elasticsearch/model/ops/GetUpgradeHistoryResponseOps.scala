// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class GetUpgradeHistoryResponseBuilderOps(val self: GetUpgradeHistoryResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def upgradeHistoriesAsScala(value: Option[Seq[UpgradeHistory]]): GetUpgradeHistoryResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.upgradeHistories(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetUpgradeHistoryResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class GetUpgradeHistoryResponseOps(val self: GetUpgradeHistoryResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def upgradeHistoriesAsScala: Option[Seq[UpgradeHistory]] = Option(self.upgradeHistories).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetUpgradeHistoryResponseOps {

  implicit def toGetUpgradeHistoryResponseBuilderOps(
      v: GetUpgradeHistoryResponse.Builder
  ): GetUpgradeHistoryResponseBuilderOps = new GetUpgradeHistoryResponseBuilderOps(v)

  implicit def toGetUpgradeHistoryResponseOps(v: GetUpgradeHistoryResponse): GetUpgradeHistoryResponseOps =
    new GetUpgradeHistoryResponseOps(v)

}
