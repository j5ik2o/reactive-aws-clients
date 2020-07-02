// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class UpgradeHistoryBuilderOps(val self: UpgradeHistory.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def upgradeNameAsScala(value: Option[String]): UpgradeHistory.Builder = {
    value.fold(self) { v => self.upgradeName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimestampAsScala(value: Option[java.time.Instant]): UpgradeHistory.Builder = {
    value.fold(self) { v => self.startTimestamp(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def upgradeStatusAsScala(value: Option[UpgradeStatus]): UpgradeHistory.Builder = {
    value.fold(self) { v => self.upgradeStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stepsListAsScala(value: Option[Seq[UpgradeStepItem]]): UpgradeHistory.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.stepsList(v.asJava)
    }
  }

}

final class UpgradeHistoryOps(val self: UpgradeHistory) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def upgradeNameAsScala: Option[String] = Option(self.upgradeName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimestampAsScala: Option[java.time.Instant] = Option(self.startTimestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def upgradeStatusAsScala: Option[UpgradeStatus] = Option(self.upgradeStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stepsListAsScala: Option[Seq[UpgradeStepItem]] =
    Option(self.stepsList).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpgradeHistoryOps {

  implicit def toUpgradeHistoryBuilderOps(v: UpgradeHistory.Builder): UpgradeHistoryBuilderOps =
    new UpgradeHistoryBuilderOps(v)

  implicit def toUpgradeHistoryOps(v: UpgradeHistory): UpgradeHistoryOps = new UpgradeHistoryOps(v)

}
