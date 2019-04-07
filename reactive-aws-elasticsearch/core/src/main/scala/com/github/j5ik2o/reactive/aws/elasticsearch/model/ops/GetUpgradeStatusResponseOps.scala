// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class GetUpgradeStatusResponseBuilderOps(val self: GetUpgradeStatusResponse.Builder) extends AnyVal {

  final def withUpgradeStepAsScala(value: Option[UpgradeStep]): GetUpgradeStatusResponse.Builder = {
    value.fold(self) { v =>
      self.upgradeStep(v)
    }
  } // String

  final def withStepStatusAsScala(value: Option[UpgradeStatus]): GetUpgradeStatusResponse.Builder = {
    value.fold(self) { v =>
      self.stepStatus(v)
    }
  } // String

  final def withUpgradeNameAsScala(value: Option[String]): GetUpgradeStatusResponse.Builder = {
    value.fold(self) { v =>
      self.upgradeName(v)
    }
  } // String

}

final class GetUpgradeStatusResponseOps(val self: GetUpgradeStatusResponse) extends AnyVal {

  final def upgradeStepAsScala: Option[UpgradeStep] = Option(self.upgradeStep) // String

  final def stepStatusAsScala: Option[UpgradeStatus] = Option(self.stepStatus) // String

  final def upgradeNameAsScala: Option[String] = Option(self.upgradeName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetUpgradeStatusResponseOps {

  implicit def toGetUpgradeStatusResponseBuilderOps(
      v: GetUpgradeStatusResponse.Builder
  ): GetUpgradeStatusResponseBuilderOps = new GetUpgradeStatusResponseBuilderOps(v)

  implicit def toGetUpgradeStatusResponseOps(v: GetUpgradeStatusResponse): GetUpgradeStatusResponseOps =
    new GetUpgradeStatusResponseOps(v)

}
