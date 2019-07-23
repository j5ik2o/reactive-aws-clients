// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReservedInstancesModificationBuilderOps(val self: ReservedInstancesModification.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): ReservedInstancesModification.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createDateAsScala(value: Option[java.time.Instant]): ReservedInstancesModification.Builder = {
    value.fold(self) { v =>
      self.createDate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def effectiveDateAsScala(value: Option[java.time.Instant]): ReservedInstancesModification.Builder = {
    value.fold(self) { v =>
      self.effectiveDate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def modificationResultsAsScala(
      value: Option[Seq[ReservedInstancesModificationResult]]
  ): ReservedInstancesModification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.modificationResults(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdsAsScala(
      value: Option[Seq[ReservedInstancesId]]
  ): ReservedInstancesModification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.reservedInstancesIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesModificationIdAsScala(value: Option[String]): ReservedInstancesModification.Builder = {
    value.fold(self) { v =>
      self.reservedInstancesModificationId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[String]): ReservedInstancesModification.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): ReservedInstancesModification.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateDateAsScala(value: Option[java.time.Instant]): ReservedInstancesModification.Builder = {
    value.fold(self) { v =>
      self.updateDate(v)
    }
  }

}

final class ReservedInstancesModificationOps(val self: ReservedInstancesModification) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createDateAsScala: Option[java.time.Instant] = Option(self.createDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def effectiveDateAsScala: Option[java.time.Instant] = Option(self.effectiveDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def modificationResultsAsScala: Option[Seq[ReservedInstancesModificationResult]] =
    Option(self.modificationResults).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdsAsScala: Option[Seq[ReservedInstancesId]] = Option(self.reservedInstancesIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesModificationIdAsScala: Option[String] = Option(self.reservedInstancesModificationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[String] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
