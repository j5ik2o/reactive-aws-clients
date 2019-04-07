// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class UpgradeStepItemBuilderOps(val self: UpgradeStepItem.Builder) extends AnyVal {

  final def withUpgradeStepAsScala(value: Option[UpgradeStep]): UpgradeStepItem.Builder = {
    value.fold(self) { v =>
      self.upgradeStep(v)
    }
  } // String

  final def withUpgradeStepStatusAsScala(value: Option[UpgradeStatus]): UpgradeStepItem.Builder = {
    value.fold(self) { v =>
      self.upgradeStepStatus(v)
    }
  } // String

  final def withIssuesAsScala(value: Option[Seq[String]]): UpgradeStepItem.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.issues(v.asJava)
    } // Seq[String]
  }

  final def withProgressPercentAsScala(value: Option[Double]): UpgradeStepItem.Builder = {
    value.fold(self) { v =>
      self.progressPercent(v)
    }
  } // Double

}

final class UpgradeStepItemOps(val self: UpgradeStepItem) extends AnyVal {

  final def upgradeStepAsScala: Option[UpgradeStep] = Option(self.upgradeStep) // String

  final def upgradeStepStatusAsScala: Option[UpgradeStatus] = Option(self.upgradeStepStatus) // String

  final def issuesAsScala: Option[Seq[String]] = Option(self.issues).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def progressPercentAsScala: Option[Double] = Option(self.progressPercent) // Double

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpgradeStepItemOps {

  implicit def toUpgradeStepItemBuilderOps(v: UpgradeStepItem.Builder): UpgradeStepItemBuilderOps =
    new UpgradeStepItemBuilderOps(v)

  implicit def toUpgradeStepItemOps(v: UpgradeStepItem): UpgradeStepItemOps = new UpgradeStepItemOps(v)

}
