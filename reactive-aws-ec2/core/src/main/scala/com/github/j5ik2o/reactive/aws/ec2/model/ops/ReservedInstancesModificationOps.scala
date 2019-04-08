// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReservedInstancesModificationBuilderOps(val self: ReservedInstancesModification.Builder) extends AnyVal {

  final def clientTokenAsScala(value: Option[String]): ReservedInstancesModification.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def createDateAsScala(value: Option[java.time.Instant]): ReservedInstancesModification.Builder = {
    value.fold(self) { v =>
      self.createDate(v)
    }
  }

  final def effectiveDateAsScala(value: Option[java.time.Instant]): ReservedInstancesModification.Builder = {
    value.fold(self) { v =>
      self.effectiveDate(v)
    }
  }

  final def modificationResultsAsScala(
      value: Option[Seq[ReservedInstancesModificationResult]]
  ): ReservedInstancesModification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.modificationResults(v.asJava)
    }
  }

  final def reservedInstancesIdsAsScala(
      value: Option[Seq[ReservedInstancesId]]
  ): ReservedInstancesModification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.reservedInstancesIds(v.asJava)
    }
  }

  final def reservedInstancesModificationIdAsScala(value: Option[String]): ReservedInstancesModification.Builder = {
    value.fold(self) { v =>
      self.reservedInstancesModificationId(v)
    }
  }

  final def statusAsScala(value: Option[String]): ReservedInstancesModification.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def statusMessageAsScala(value: Option[String]): ReservedInstancesModification.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  final def updateDateAsScala(value: Option[java.time.Instant]): ReservedInstancesModification.Builder = {
    value.fold(self) { v =>
      self.updateDate(v)
    }
  }

}

final class ReservedInstancesModificationOps(val self: ReservedInstancesModification) extends AnyVal {

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def createDateAsScala: Option[java.time.Instant] = Option(self.createDate)

  final def effectiveDateAsScala: Option[java.time.Instant] = Option(self.effectiveDate)

  final def modificationResultsAsScala: Option[Seq[ReservedInstancesModificationResult]] =
    Option(self.modificationResults).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def reservedInstancesIdsAsScala: Option[Seq[ReservedInstancesId]] = Option(self.reservedInstancesIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def reservedInstancesModificationIdAsScala: Option[String] = Option(self.reservedInstancesModificationId)

  final def statusAsScala: Option[String] = Option(self.status)

  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  final def updateDateAsScala: Option[java.time.Instant] = Option(self.updateDate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReservedInstancesModificationOps {

  implicit def toReservedInstancesModificationBuilderOps(
      v: ReservedInstancesModification.Builder
  ): ReservedInstancesModificationBuilderOps = new ReservedInstancesModificationBuilderOps(v)

  implicit def toReservedInstancesModificationOps(v: ReservedInstancesModification): ReservedInstancesModificationOps =
    new ReservedInstancesModificationOps(v)

}
