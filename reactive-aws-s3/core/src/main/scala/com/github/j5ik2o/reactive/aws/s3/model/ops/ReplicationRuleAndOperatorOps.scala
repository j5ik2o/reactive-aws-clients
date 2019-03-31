// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ReplicationRuleAndOperator => ScalaReplicationRuleAndOperator, _ }
import software.amazon.awssdk.services.s3.model.{ ReplicationRuleAndOperator => JavaReplicationRuleAndOperator }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicationRuleAndOperatorOps {

  implicit class ScalaReplicationRuleAndOperatorOps(val self: ScalaReplicationRuleAndOperator) extends AnyVal {

    def toJava: JavaReplicationRuleAndOperator = {
      val result = JavaReplicationRuleAndOperator.builder()
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v)) // String
      self.tags.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, TagOps._; result.tags(v.map(_.toJava).asJava)
      } // Seq[Tag]

      result.build()
    }

  }

  implicit class JavaReplicationRuleAndOperatorOps(val self: JavaReplicationRuleAndOperator) extends AnyVal {

    def toScala: ScalaReplicationRuleAndOperator = {
      ScalaReplicationRuleAndOperator()
        .withPrefix(Option(self.prefix)) // String
        .withTags(Option(self.tags).map { v =>
          import scala.collection.JavaConverters._, TagOps._; v.asScala.map(_.toScala)
        }) // Seq[Tag]
    }

  }

}
