// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ReplicationRuleBuilderOps(val self: ReplicationRule.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): ReplicationRule.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

  final def priorityAsScala(value: Option[Int]): ReplicationRule.Builder = {
    value.fold(self) { v =>
      self.priority(v)
    }
  } // Int

  final def prefixAsScala(value: Option[String]): ReplicationRule.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  } // String

  final def filterAsScala(value: Option[ReplicationRuleFilter]): ReplicationRule.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  } // ReplicationRuleFilter

  final def statusAsScala(value: Option[ReplicationRuleStatus]): ReplicationRule.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // String

  final def sourceSelectionCriteriaAsScala(value: Option[SourceSelectionCriteria]): ReplicationRule.Builder = {
    value.fold(self) { v =>
      self.sourceSelectionCriteria(v)
    }
  } // SourceSelectionCriteria

  final def destinationAsScala(value: Option[Destination]): ReplicationRule.Builder = {
    value.fold(self) { v =>
      self.destination(v)
    }
  } // Destination

  final def deleteMarkerReplicationAsScala(value: Option[DeleteMarkerReplication]): ReplicationRule.Builder = {
    value.fold(self) { v =>
      self.deleteMarkerReplication(v)
    }
  } // DeleteMarkerReplication

}

final class ReplicationRuleOps(val self: ReplicationRule) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id) // String

  final def priorityAsScala: Option[Int] = Option(self.priority) // Int

  final def prefixAsScala: Option[String] = Option(self.prefix) // String

  final def filterAsScala: Option[ReplicationRuleFilter] = Option(self.filter) // ReplicationRuleFilter

  final def statusAsScala: Option[ReplicationRuleStatus] = Option(self.status) // String

  final def sourceSelectionCriteriaAsScala: Option[SourceSelectionCriteria] =
    Option(self.sourceSelectionCriteria) // SourceSelectionCriteria

  final def destinationAsScala: Option[Destination] = Option(self.destination) // Destination

  final def deleteMarkerReplicationAsScala: Option[DeleteMarkerReplication] =
    Option(self.deleteMarkerReplication) // DeleteMarkerReplication

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicationRuleOps {

  implicit def toReplicationRuleBuilderOps(v: ReplicationRule.Builder): ReplicationRuleBuilderOps =
    new ReplicationRuleBuilderOps(v)

  implicit def toReplicationRuleOps(v: ReplicationRule): ReplicationRuleOps = new ReplicationRuleOps(v)

}
