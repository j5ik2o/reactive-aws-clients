// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GlobalTableDescription => ScalaGlobalTableDescription, _ }
import com.amazonaws.services.dynamodbv2.model.{ GlobalTableDescription => JavaGlobalTableDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GlobalTableDescriptionOps {

  implicit class ScalaGlobalTableDescriptionOps(val self: ScalaGlobalTableDescription) extends AnyVal {

    def toJava: JavaGlobalTableDescription = {
      val result = new JavaGlobalTableDescription()
      self.replicationGroup.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ReplicaDescriptionOps._;
        result.withReplicationGroup(v.map(_.toJava).asJava)
      } // Seq[ReplicaDescription]
      self.globalTableArn.filter(_.nonEmpty).foreach(v => result.withGlobalTableArn(v))           // String
      self.creationDateTime.map(java.util.Date.from).foreach(v => result.withCreationDateTime(v)) // Instant
      self.globalTableStatus.foreach { v =>
        import GlobalTableStatusOps._; result.withGlobalTableStatus(v.toJava)
      } // String
      self.globalTableName.filter(_.nonEmpty).foreach(v => result.withGlobalTableName(v)) // String

      result
    }

  }

  implicit class JavaGlobalTableDescriptionOps(val self: JavaGlobalTableDescription) extends AnyVal {

    def toScala: ScalaGlobalTableDescription = {
      ScalaGlobalTableDescription()
        .withReplicationGroup(Option(self.getReplicationGroup).map { v =>
          import scala.collection.JavaConverters._, ReplicaDescriptionOps._; v.asScala.map(_.toScala)
        }) // Seq[ReplicaDescription]
        .withGlobalTableArn(Option(self.getGlobalTableArn)) // String
        .withCreationDateTime(Option(self.getCreationDateTime).map(_.toInstant)) // Instant
        .withGlobalTableStatus(Option(self.getGlobalTableStatus).map { v =>
          import GlobalTableStatusOps._; v.toScala
        }) // String
        .withGlobalTableName(Option(self.getGlobalTableName)) // String
    }

  }

}
