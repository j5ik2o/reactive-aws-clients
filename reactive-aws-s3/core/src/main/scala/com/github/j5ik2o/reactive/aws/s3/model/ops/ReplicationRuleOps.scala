// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ReplicationRule => ScalaReplicationRule, _ }
import software.amazon.awssdk.services.s3.model.{ ReplicationRule => JavaReplicationRule }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicationRuleOps {

  implicit class ScalaReplicationRuleOps(val self: ScalaReplicationRule) extends AnyVal {

    def toJava: JavaReplicationRule = {
      val result = JavaReplicationRule.builder()
      self.id.filter(_.nonEmpty).foreach(v => result.id(v))          // String
      self.priority.map(_.intValue).foreach(v => result.priority(v)) // Int
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v))  // String
      self.filter.foreach { v =>
        import ReplicationRuleFilterOps._; result.filter(v.toJava)
      } // ReplicationRuleFilter
      self.status.foreach { v =>
        import ReplicationRuleStatusOps._; result.status(v.toJava)
      } // String
      self.sourceSelectionCriteria.foreach { v =>
        import SourceSelectionCriteriaOps._; result.sourceSelectionCriteria(v.toJava)
      } // SourceSelectionCriteria
      self.destination.foreach { v =>
        import DestinationOps._; result.destination(v.toJava)
      } // Destination
      self.deleteMarkerReplication.foreach { v =>
        import DeleteMarkerReplicationOps._; result.deleteMarkerReplication(v.toJava)
      } // DeleteMarkerReplication

      result.build()
    }

  }

  implicit class JavaReplicationRuleOps(val self: JavaReplicationRule) extends AnyVal {

    def toScala: ScalaReplicationRule = {
      ScalaReplicationRule()
        .withId(Option(self.id)) // String
        .withPriority(Option(self.priority).map(_.intValue)) // Int
        .withPrefix(Option(self.prefix)) // String
        .withFilter(Option(self.filter).map { v =>
          import ReplicationRuleFilterOps._; v.toScala
        }) // ReplicationRuleFilter
        .withStatus(Option(self.status).map { v =>
          import ReplicationRuleStatusOps._; v.toScala
        }) // String
        .withSourceSelectionCriteria(Option(self.sourceSelectionCriteria).map { v =>
          import SourceSelectionCriteriaOps._; v.toScala
        }) // SourceSelectionCriteria
        .withDestination(Option(self.destination).map { v =>
          import DestinationOps._; v.toScala
        }) // Destination
        .withDeleteMarkerReplication(Option(self.deleteMarkerReplication).map { v =>
          import DeleteMarkerReplicationOps._; v.toScala
        }) // DeleteMarkerReplication
    }

  }

}
