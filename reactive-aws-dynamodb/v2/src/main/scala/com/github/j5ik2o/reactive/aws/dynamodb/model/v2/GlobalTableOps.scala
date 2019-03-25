package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GlobalTable => ScalaGlobalTable, _ }
import software.amazon.awssdk.services.dynamodb.model.{ GlobalTable => JavaGlobalTable }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GlobalTableOps {

  implicit class ScalaGlobalTableOps(val self: ScalaGlobalTable) extends AnyVal {

    def toJava: JavaGlobalTable = {
      val result = JavaGlobalTable.builder()
      self.globalTableName.filter(_.nonEmpty).foreach(v => result.globalTableName(v)) // String
      self.replicationGroup.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ReplicaOps._; result.replicationGroup(v.map(_.toJava).asJava)
      } // Seq[Replica]

      result.build()
    }

  }

  implicit class JavaGlobalTableOps(val self: JavaGlobalTable) extends AnyVal {

    def toScala: ScalaGlobalTable = {
      ScalaGlobalTable()
        .withGlobalTableName(Option(self.globalTableName)) // String
        .withReplicationGroup(Option(self.replicationGroup).map { v =>
          import scala.collection.JavaConverters._, ReplicaOps._; v.asScala.map(_.toScala)
        }) // Seq[Replica]
    }

  }

}
