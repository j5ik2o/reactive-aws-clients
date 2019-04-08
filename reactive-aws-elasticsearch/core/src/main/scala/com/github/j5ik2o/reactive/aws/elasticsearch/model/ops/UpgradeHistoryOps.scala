// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class UpgradeHistoryBuilderOps(val self: UpgradeHistory.Builder) extends AnyVal {

  final def upgradeNameAsScala(value: Option[String]): UpgradeHistory.Builder = {
    value.fold(self) { v =>
      self.upgradeName(v)
    }
  }

  final def startTimestampAsScala(value: Option[java.time.Instant]): UpgradeHistory.Builder = {
    value.fold(self) { v =>
      self.startTimestamp(v)
    }
  }

  final def upgradeStatusAsScala(value: Option[UpgradeStatus]): UpgradeHistory.Builder = {
    value.fold(self) { v =>
      self.upgradeStatus(v)
    }
  }

  final def stepsListAsScala(value: Option[Seq[UpgradeStepItem]]): UpgradeHistory.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.stepsList(v.asJava)
    }
  }

}

final class UpgradeHistoryOps(val self: UpgradeHistory) extends AnyVal {

  final def upgradeNameAsScala: Option[String] = Option(self.upgradeName)

  final def startTimestampAsScala: Option[java.time.Instant] = Option(self.startTimestamp)

  final def upgradeStatusAsScala: Option[UpgradeStatus] = Option(self.upgradeStatus)

  final def stepsListAsScala: Option[Seq[UpgradeStepItem]] = Option(self.stepsList).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpgradeHistoryOps {

  implicit def toUpgradeHistoryBuilderOps(v: UpgradeHistory.Builder): UpgradeHistoryBuilderOps =
    new UpgradeHistoryBuilderOps(v)

  implicit def toUpgradeHistoryOps(v: UpgradeHistory): UpgradeHistoryOps = new UpgradeHistoryOps(v)

}
