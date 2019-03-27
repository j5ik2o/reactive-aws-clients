// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GlobalTable => ScalaGlobalTable, _ }
import com.amazonaws.services.dynamodbv2.model.{ GlobalTable => JavaGlobalTable }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GlobalTableOps {

  implicit class ScalaGlobalTableOps(val self: ScalaGlobalTable) extends AnyVal {

    def toJava: JavaGlobalTable = {
      val result = new JavaGlobalTable()
      self.globalTableName.filter(_.nonEmpty).foreach(v => result.withGlobalTableName(v)) // String
      self.replicationGroup.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ReplicaOps._; result.withReplicationGroup(v.map(_.toJava).asJava)
      } // Seq[Replica]

      result
    }

  }

  implicit class JavaGlobalTableOps(val self: JavaGlobalTable) extends AnyVal {

    def toScala: ScalaGlobalTable = {
      ScalaGlobalTable()
        .withGlobalTableName(Option(self.getGlobalTableName)) // String
        .withReplicationGroup(Option(self.getReplicationGroup).map { v =>
          import scala.collection.JavaConverters._, ReplicaOps._; v.asScala.map(_.toScala)
        }) // Seq[Replica]
    }

  }

}
