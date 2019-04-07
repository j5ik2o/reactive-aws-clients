// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class UpgradeHistoryBuilderOps(val self: UpgradeHistory.Builder) extends AnyVal {

  final def withUpgradeNameAsScala(value: Option[String]): UpgradeHistory.Builder = {
    value.fold(self) { v =>
      self.upgradeName(v)
    }
  } // String

  final def withStartTimestampAsScala(value: Option[java.time.Instant]): UpgradeHistory.Builder = {
    value.fold(self) { v =>
      self.startTimestamp(v)
    }
  } // Instant

  final def withUpgradeStatusAsScala(value: Option[UpgradeStatus]): UpgradeHistory.Builder = {
    value.fold(self) { v =>
      self.upgradeStatus(v)
    }
  } // String

  final def withStepsListAsScala(value: Option[Seq[UpgradeStepItem]]): UpgradeHistory.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.stepsList(v.asJava)
    } // Seq[UpgradeStepItem]
  }

}

final class UpgradeHistoryOps(val self: UpgradeHistory) extends AnyVal {

  final def upgradeNameAsScala: Option[String] = Option(self.upgradeName) // String

  final def startTimestampAsScala: Option[java.time.Instant] = Option(self.startTimestamp) // Instant

  final def upgradeStatusAsScala: Option[UpgradeStatus] = Option(self.upgradeStatus) // String

  final def stepsListAsScala: Option[Seq[UpgradeStepItem]] = Option(self.stepsList).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[UpgradeStepItem]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpgradeHistoryOps {

  implicit def toUpgradeHistoryBuilderOps(v: UpgradeHistory.Builder): UpgradeHistoryBuilderOps =
    new UpgradeHistoryBuilderOps(v)

  implicit def toUpgradeHistoryOps(v: UpgradeHistory): UpgradeHistoryOps = new UpgradeHistoryOps(v)

}
