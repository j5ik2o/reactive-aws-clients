// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class OptionStatusBuilderOps(val self: OptionStatus.Builder) extends AnyVal {

  final def withCreationDateAsScala(value: Option[java.time.Instant]): OptionStatus.Builder = {
    value.fold(self) { v =>
      self.creationDate(v)
    }
  } // Instant

  final def withUpdateDateAsScala(value: Option[java.time.Instant]): OptionStatus.Builder = {
    value.fold(self) { v =>
      self.updateDate(v)
    }
  } // Instant

  final def withUpdateVersionAsScala(value: Option[Int]): OptionStatus.Builder = {
    value.fold(self) { v =>
      self.updateVersion(v)
    }
  } // Int

  final def withStateAsScala(value: Option[OptionState]): OptionStatus.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  } // String

  final def withPendingDeletionAsScala(value: Option[Boolean]): OptionStatus.Builder = {
    value.fold(self) { v =>
      self.pendingDeletion(v)
    }
  } // Boolean

}

final class OptionStatusOps(val self: OptionStatus) extends AnyVal {

  final def creationDateAsScala: Option[java.time.Instant] = Option(self.creationDate) // Instant

  final def updateDateAsScala: Option[java.time.Instant] = Option(self.updateDate) // Instant

  final def updateVersionAsScala: Option[Int] = Option(self.updateVersion) // Int

  final def stateAsScala: Option[OptionState] = Option(self.state) // String

  final def pendingDeletionAsScala: Option[Boolean] = Option(self.pendingDeletion) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOptionStatusOps {

  implicit def toOptionStatusBuilderOps(v: OptionStatus.Builder): OptionStatusBuilderOps = new OptionStatusBuilderOps(v)

  implicit def toOptionStatusOps(v: OptionStatus): OptionStatusOps = new OptionStatusOps(v)

}
