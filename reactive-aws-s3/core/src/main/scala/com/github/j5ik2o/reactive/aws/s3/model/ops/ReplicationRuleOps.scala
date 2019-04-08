// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ReplicationRuleBuilderOps(val self: ReplicationRule.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): ReplicationRule.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def priorityAsScala(value: Option[Int]): ReplicationRule.Builder = {
    value.fold(self) { v =>
      self.priority(v)
    }
  }

  final def prefixAsScala(value: Option[String]): ReplicationRule.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  final def filterAsScala(value: Option[ReplicationRuleFilter]): ReplicationRule.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  }

  final def statusAsScala(value: Option[ReplicationRuleStatus]): ReplicationRule.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def sourceSelectionCriteriaAsScala(value: Option[SourceSelectionCriteria]): ReplicationRule.Builder = {
    value.fold(self) { v =>
      self.sourceSelectionCriteria(v)
    }
  }

  final def destinationAsScala(value: Option[Destination]): ReplicationRule.Builder = {
    value.fold(self) { v =>
      self.destination(v)
    }
  }

  final def deleteMarkerReplicationAsScala(value: Option[DeleteMarkerReplication]): ReplicationRule.Builder = {
    value.fold(self) { v =>
      self.deleteMarkerReplication(v)
    }
  }

}

final class ReplicationRuleOps(val self: ReplicationRule) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id)

  final def priorityAsScala: Option[Int] = Option(self.priority)

  final def prefixAsScala: Option[String] = Option(self.prefix)

  final def filterAsScala: Option[ReplicationRuleFilter] = Option(self.filter)

  final def statusAsScala: Option[ReplicationRuleStatus] = Option(self.status)

  final def sourceSelectionCriteriaAsScala: Option[SourceSelectionCriteria] = Option(self.sourceSelectionCriteria)

  final def destinationAsScala: Option[Destination] = Option(self.destination)

  final def deleteMarkerReplicationAsScala: Option[DeleteMarkerReplication] = Option(self.deleteMarkerReplication)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicationRuleOps {

  implicit def toReplicationRuleBuilderOps(v: ReplicationRule.Builder): ReplicationRuleBuilderOps =
    new ReplicationRuleBuilderOps(v)

  implicit def toReplicationRuleOps(v: ReplicationRule): ReplicationRuleOps = new ReplicationRuleOps(v)

}
