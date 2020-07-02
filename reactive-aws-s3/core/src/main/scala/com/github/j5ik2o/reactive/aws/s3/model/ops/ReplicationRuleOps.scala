// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ReplicationRuleBuilderOps(val self: ReplicationRule.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): ReplicationRule.Builder = {
    value.fold(self) { v => self.id(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priorityAsScala(value: Option[Int]): ReplicationRule.Builder = {
    value.fold(self) { v => self.priority(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala(value: Option[String]): ReplicationRule.Builder = {
    value.fold(self) { v => self.prefix(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterAsScala(value: Option[ReplicationRuleFilter]): ReplicationRule.Builder = {
    value.fold(self) { v => self.filter(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ReplicationRuleStatus]): ReplicationRule.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceSelectionCriteriaAsScala(value: Option[SourceSelectionCriteria]): ReplicationRule.Builder = {
    value.fold(self) { v => self.sourceSelectionCriteria(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def existingObjectReplicationAsScala(value: Option[ExistingObjectReplication]): ReplicationRule.Builder = {
    value.fold(self) { v => self.existingObjectReplication(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationAsScala(value: Option[Destination]): ReplicationRule.Builder = {
    value.fold(self) { v => self.destination(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteMarkerReplicationAsScala(value: Option[DeleteMarkerReplication]): ReplicationRule.Builder = {
    value.fold(self) { v => self.deleteMarkerReplication(v) }
  }

}

final class ReplicationRuleOps(val self: ReplicationRule) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priorityAsScala: Option[Int] = Option(self.priority)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala: Option[String] = Option(self.prefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterAsScala: Option[ReplicationRuleFilter] = Option(self.filter)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ReplicationRuleStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceSelectionCriteriaAsScala: Option[SourceSelectionCriteria] = Option(self.sourceSelectionCriteria)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def existingObjectReplicationAsScala: Option[ExistingObjectReplication] = Option(self.existingObjectReplication)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationAsScala: Option[Destination] = Option(self.destination)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteMarkerReplicationAsScala: Option[DeleteMarkerReplication] = Option(self.deleteMarkerReplication)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicationRuleOps {

  implicit def toReplicationRuleBuilderOps(v: ReplicationRule.Builder): ReplicationRuleBuilderOps =
    new ReplicationRuleBuilderOps(v)

  implicit def toReplicationRuleOps(v: ReplicationRule): ReplicationRuleOps = new ReplicationRuleOps(v)

}
