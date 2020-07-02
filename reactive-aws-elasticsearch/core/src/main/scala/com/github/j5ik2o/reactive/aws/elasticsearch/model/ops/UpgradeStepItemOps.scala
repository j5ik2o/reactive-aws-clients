// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class UpgradeStepItemBuilderOps(val self: UpgradeStepItem.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def upgradeStepAsScala(value: Option[UpgradeStep]): UpgradeStepItem.Builder = {
    value.fold(self) { v => self.upgradeStep(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def upgradeStepStatusAsScala(value: Option[UpgradeStatus]): UpgradeStepItem.Builder = {
    value.fold(self) { v => self.upgradeStepStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def issuesAsScala(value: Option[Seq[String]]): UpgradeStepItem.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.issues(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def progressPercentAsScala(value: Option[Double]): UpgradeStepItem.Builder = {
    value.fold(self) { v => self.progressPercent(v) }
  }

}

final class UpgradeStepItemOps(val self: UpgradeStepItem) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def upgradeStepAsScala: Option[UpgradeStep] = Option(self.upgradeStep)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def upgradeStepStatusAsScala: Option[UpgradeStatus] = Option(self.upgradeStepStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def issuesAsScala: Option[Seq[String]] =
    Option(self.issues).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def progressPercentAsScala: Option[Double] = Option(self.progressPercent)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpgradeStepItemOps {

  implicit def toUpgradeStepItemBuilderOps(v: UpgradeStepItem.Builder): UpgradeStepItemBuilderOps =
    new UpgradeStepItemBuilderOps(v)

  implicit def toUpgradeStepItemOps(v: UpgradeStepItem): UpgradeStepItemOps = new UpgradeStepItemOps(v)

}
