// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ReplicationConfiguration => ScalaReplicationConfiguration, _ }
import software.amazon.awssdk.services.s3.model.{ ReplicationConfiguration => JavaReplicationConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ReplicationConfigurationOps {

  implicit class ScalaReplicationConfigurationOps(val self: ScalaReplicationConfiguration) extends AnyVal {

    def toJava: JavaReplicationConfiguration = {
      val result = JavaReplicationConfiguration.builder()
      self.role.filter(_.nonEmpty).foreach(v => result.role(v)) // String
      self.rules.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ReplicationRuleOps._; result.rules(v.map(_.toJava).asJava)
      } // Seq[ReplicationRule]

      result.build()
    }

  }

  implicit class JavaReplicationConfigurationOps(val self: JavaReplicationConfiguration) extends AnyVal {

    def toScala: ScalaReplicationConfiguration = {
      ScalaReplicationConfiguration()
        .withRole(Option(self.role)) // String
        .withRules(Option(self.rules).map { v =>
          import scala.collection.JavaConverters._, ReplicationRuleOps._; v.asScala.map(_.toScala)
        }) // Seq[ReplicationRule]
    }

  }

}
