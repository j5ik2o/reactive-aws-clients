// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EnableFastSnapshotRestoreSuccessItemBuilderOps(val self: EnableFastSnapshotRestoreSuccessItem.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala(value: Option[String]): EnableFastSnapshotRestoreSuccessItem.Builder = {
    value.fold(self) { v =>
      self.snapshotId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): EnableFastSnapshotRestoreSuccessItem.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[FastSnapshotRestoreStateCode]): EnableFastSnapshotRestoreSuccessItem.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateTransitionReasonAsScala(value: Option[String]): EnableFastSnapshotRestoreSuccessItem.Builder = {
    value.fold(self) { v =>
      self.stateTransitionReason(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): EnableFastSnapshotRestoreSuccessItem.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAliasAsScala(value: Option[String]): EnableFastSnapshotRestoreSuccessItem.Builder = {
    value.fold(self) { v =>
      self.ownerAlias(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enablingTimeAsScala(value: Option[java.time.Instant]): EnableFastSnapshotRestoreSuccessItem.Builder = {
    value.fold(self) { v =>
      self.enablingTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optimizingTimeAsScala(value: Option[java.time.Instant]): EnableFastSnapshotRestoreSuccessItem.Builder = {
    value.fold(self) { v =>
      self.optimizingTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledTimeAsScala(value: Option[java.time.Instant]): EnableFastSnapshotRestoreSuccessItem.Builder = {
    value.fold(self) { v =>
      self.enabledTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disablingTimeAsScala(value: Option[java.time.Instant]): EnableFastSnapshotRestoreSuccessItem.Builder = {
    value.fold(self) { v =>
      self.disablingTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disabledTimeAsScala(value: Option[java.time.Instant]): EnableFastSnapshotRestoreSuccessItem.Builder = {
    value.fold(self) { v =>
      self.disabledTime(v)
    }
  }

}

final class EnableFastSnapshotRestoreSuccessItemOps(val self: EnableFastSnapshotRestoreSuccessItem) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[FastSnapshotRestoreStateCode] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateTransitionReasonAsScala: Option[String] = Option(self.stateTransitionReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAliasAsScala: Option[String] = Option(self.ownerAlias)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enablingTimeAsScala: Option[java.time.Instant] = Option(self.enablingTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optimizingTimeAsScala: Option[java.time.Instant] = Option(self.optimizingTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledTimeAsScala: Option[java.time.Instant] = Option(self.enabledTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disablingTimeAsScala: Option[java.time.Instant] = Option(self.disablingTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disabledTimeAsScala: Option[java.time.Instant] = Option(self.disabledTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableFastSnapshotRestoreSuccessItemOps {

  implicit def toEnableFastSnapshotRestoreSuccessItemBuilderOps(
      v: EnableFastSnapshotRestoreSuccessItem.Builder
  ): EnableFastSnapshotRestoreSuccessItemBuilderOps = new EnableFastSnapshotRestoreSuccessItemBuilderOps(v)

  implicit def toEnableFastSnapshotRestoreSuccessItemOps(
      v: EnableFastSnapshotRestoreSuccessItem
  ): EnableFastSnapshotRestoreSuccessItemOps = new EnableFastSnapshotRestoreSuccessItemOps(v)

}
