// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class OptionStatusBuilderOps(val self: OptionStatus.Builder) extends AnyVal {

  final def creationDateAsScala(value: Option[java.time.Instant]): OptionStatus.Builder = {
    value.fold(self) { v =>
      self.creationDate(v)
    }
  }

  final def updateDateAsScala(value: Option[java.time.Instant]): OptionStatus.Builder = {
    value.fold(self) { v =>
      self.updateDate(v)
    }
  }

  final def updateVersionAsScala(value: Option[Int]): OptionStatus.Builder = {
    value.fold(self) { v =>
      self.updateVersion(v)
    }
  }

  final def stateAsScala(value: Option[OptionState]): OptionStatus.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def pendingDeletionAsScala(value: Option[Boolean]): OptionStatus.Builder = {
    value.fold(self) { v =>
      self.pendingDeletion(v)
    }
  }

}

final class OptionStatusOps(val self: OptionStatus) extends AnyVal {

  final def creationDateAsScala: Option[java.time.Instant] = Option(self.creationDate)

  final def updateDateAsScala: Option[java.time.Instant] = Option(self.updateDate)

  final def updateVersionAsScala: Option[Int] = Option(self.updateVersion)

  final def stateAsScala: Option[OptionState] = Option(self.state)

  final def pendingDeletionAsScala: Option[Boolean] = Option(self.pendingDeletion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOptionStatusOps {

  implicit def toOptionStatusBuilderOps(v: OptionStatus.Builder): OptionStatusBuilderOps = new OptionStatusBuilderOps(v)

  implicit def toOptionStatusOps(v: OptionStatus): OptionStatusOps = new OptionStatusOps(v)

}
