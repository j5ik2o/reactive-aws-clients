// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class GetUpgradeStatusResponseBuilderOps(val self: GetUpgradeStatusResponse.Builder) extends AnyVal {

  final def upgradeStepAsScala(value: Option[UpgradeStep]): GetUpgradeStatusResponse.Builder = {
    value.fold(self) { v =>
      self.upgradeStep(v)
    }
  }

  final def stepStatusAsScala(value: Option[UpgradeStatus]): GetUpgradeStatusResponse.Builder = {
    value.fold(self) { v =>
      self.stepStatus(v)
    }
  }

  final def upgradeNameAsScala(value: Option[String]): GetUpgradeStatusResponse.Builder = {
    value.fold(self) { v =>
      self.upgradeName(v)
    }
  }

}

final class GetUpgradeStatusResponseOps(val self: GetUpgradeStatusResponse) extends AnyVal {

  final def upgradeStepAsScala: Option[UpgradeStep] = Option(self.upgradeStep)

  final def stepStatusAsScala: Option[UpgradeStatus] = Option(self.stepStatus)

  final def upgradeNameAsScala: Option[String] = Option(self.upgradeName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetUpgradeStatusResponseOps {

  implicit def toGetUpgradeStatusResponseBuilderOps(
      v: GetUpgradeStatusResponse.Builder
  ): GetUpgradeStatusResponseBuilderOps = new GetUpgradeStatusResponseBuilderOps(v)

  implicit def toGetUpgradeStatusResponseOps(v: GetUpgradeStatusResponse): GetUpgradeStatusResponseOps =
    new GetUpgradeStatusResponseOps(v)

}
