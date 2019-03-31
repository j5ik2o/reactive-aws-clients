// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ReplicationRuleFilter => ScalaReplicationRuleFilter, _ }
import software.amazon.awssdk.services.s3.model.{ ReplicationRuleFilter => JavaReplicationRuleFilter }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicationRuleFilterOps {

  implicit class ScalaReplicationRuleFilterOps(val self: ScalaReplicationRuleFilter) extends AnyVal {

    def toJava: JavaReplicationRuleFilter = {
      val result = JavaReplicationRuleFilter.builder()
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v)) // String
      self.tag.foreach { v =>
        import TagOps._; result.tag(v.toJava)
      } // Tag
      self.and.foreach { v =>
        import ReplicationRuleAndOperatorOps._; result.and(v.toJava)
      } // ReplicationRuleAndOperator

      result.build()
    }

  }

  implicit class JavaReplicationRuleFilterOps(val self: JavaReplicationRuleFilter) extends AnyVal {

    def toScala: ScalaReplicationRuleFilter = {
      ScalaReplicationRuleFilter()
        .withPrefix(Option(self.prefix)) // String
        .withTag(Option(self.tag).map { v =>
          import TagOps._; v.toScala
        }) // Tag
        .withAnd(Option(self.and).map { v =>
          import ReplicationRuleAndOperatorOps._; v.toScala
        }) // ReplicationRuleAndOperator
    }

  }

}
