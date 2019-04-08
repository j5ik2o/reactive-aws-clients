// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class InstanceHealthSummaryBuilderOps(val self: InstanceHealthSummary.Builder) extends AnyVal {

  final def noDataAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.noData(v)
    }
  }

  final def unknownAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.unknown(v)
    }
  }

  final def pendingAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.pending(v)
    }
  }

  final def okAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.ok(v)
    }
  }

  final def infoAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.info(v)
    }
  }

  final def warningAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.warning(v)
    }
  }

  final def degradedAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.degraded(v)
    }
  }

  final def severeAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.severe(v)
    }
  }

}

final class InstanceHealthSummaryOps(val self: InstanceHealthSummary) extends AnyVal {

  final def noDataAsScala: Option[Int] = Option(self.noData)

  final def unknownAsScala: Option[Int] = Option(self.unknown)

  final def pendingAsScala: Option[Int] = Option(self.pending)

  final def okAsScala: Option[Int] = Option(self.ok)

  final def infoAsScala: Option[Int] = Option(self.info)

  final def warningAsScala: Option[Int] = Option(self.warning)

  final def degradedAsScala: Option[Int] = Option(self.degraded)

  final def severeAsScala: Option[Int] = Option(self.severe)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceHealthSummaryOps {

  implicit def toInstanceHealthSummaryBuilderOps(v: InstanceHealthSummary.Builder): InstanceHealthSummaryBuilderOps =
    new InstanceHealthSummaryBuilderOps(v)

  implicit def toInstanceHealthSummaryOps(v: InstanceHealthSummary): InstanceHealthSummaryOps =
    new InstanceHealthSummaryOps(v)

}
