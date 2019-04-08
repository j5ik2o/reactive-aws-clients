// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class OptionStatusBuilderOps(val self: OptionStatus.Builder) extends AnyVal {

  final def creationDateAsScala(value: Option[java.time.Instant]): OptionStatus.Builder = {
    value.fold(self) { v =>
      self.creationDate(v)
    }
  } // java.time.Instant

  final def updateDateAsScala(value: Option[java.time.Instant]): OptionStatus.Builder = {
    value.fold(self) { v =>
      self.updateDate(v)
    }
  } // java.time.Instant

  final def updateVersionAsScala(value: Option[Int]): OptionStatus.Builder = {
    value.fold(self) { v =>
      self.updateVersion(v)
    }
  } // Int

  final def stateAsScala(value: Option[OptionState]): OptionStatus.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  } // OptionState

  final def pendingDeletionAsScala(value: Option[Boolean]): OptionStatus.Builder = {
    value.fold(self) { v =>
      self.pendingDeletion(v)
    }
  } // Boolean

}

final class OptionStatusOps(val self: OptionStatus) extends AnyVal {

  final def creationDateAsScala: Option[java.time.Instant] = Option(self.creationDate) // java.time.Instant

  final def updateDateAsScala: Option[java.time.Instant] = Option(self.updateDate) // java.time.Instant

  final def updateVersionAsScala: Option[Int] = Option(self.updateVersion) // Int

  final def stateAsScala: Option[OptionState] = Option(self.state) // OptionState

  final def pendingDeletionAsScala: Option[Boolean] = Option(self.pendingDeletion) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOptionStatusOps {

  implicit def toOptionStatusBuilderOps(v: OptionStatus.Builder): OptionStatusBuilderOps = new OptionStatusBuilderOps(v)

  implicit def toOptionStatusOps(v: OptionStatus): OptionStatusOps = new OptionStatusOps(v)

}
