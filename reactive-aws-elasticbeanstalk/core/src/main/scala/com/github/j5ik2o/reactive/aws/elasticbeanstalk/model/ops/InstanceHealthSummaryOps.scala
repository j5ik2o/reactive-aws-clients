// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class InstanceHealthSummaryBuilderOps(val self: InstanceHealthSummary.Builder) extends AnyVal {

  final def noDataAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.noData(v)
    }
  } // Int

  final def unknownAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.unknown(v)
    }
  } // Int

  final def pendingAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.pending(v)
    }
  } // Int

  final def okAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.ok(v)
    }
  } // Int

  final def infoAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.info(v)
    }
  } // Int

  final def warningAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.warning(v)
    }
  } // Int

  final def degradedAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.degraded(v)
    }
  } // Int

  final def severeAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.severe(v)
    }
  } // Int

}

final class InstanceHealthSummaryOps(val self: InstanceHealthSummary) extends AnyVal {

  final def noDataAsScala: Option[Int] = Option(self.noData) // Int

  final def unknownAsScala: Option[Int] = Option(self.unknown) // Int

  final def pendingAsScala: Option[Int] = Option(self.pending) // Int

  final def okAsScala: Option[Int] = Option(self.ok) // Int

  final def infoAsScala: Option[Int] = Option(self.info) // Int

  final def warningAsScala: Option[Int] = Option(self.warning) // Int

  final def degradedAsScala: Option[Int] = Option(self.degraded) // Int

  final def severeAsScala: Option[Int] = Option(self.severe) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceHealthSummaryOps {

  implicit def toInstanceHealthSummaryBuilderOps(v: InstanceHealthSummary.Builder): InstanceHealthSummaryBuilderOps =
    new InstanceHealthSummaryBuilderOps(v)

  implicit def toInstanceHealthSummaryOps(v: InstanceHealthSummary): InstanceHealthSummaryOps =
    new InstanceHealthSummaryOps(v)

}
