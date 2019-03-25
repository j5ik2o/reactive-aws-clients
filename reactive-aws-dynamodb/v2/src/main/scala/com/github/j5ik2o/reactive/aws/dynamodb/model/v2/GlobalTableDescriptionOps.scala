package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GlobalTableDescription => ScalaGlobalTableDescription, _ }
import software.amazon.awssdk.services.dynamodb.model.{ GlobalTableDescription => JavaGlobalTableDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GlobalTableDescriptionOps {

  implicit class ScalaGlobalTableDescriptionOps(val self: ScalaGlobalTableDescription) extends AnyVal {

    def toJava: JavaGlobalTableDescription = {
      val result = JavaGlobalTableDescription.builder()
      self.replicationGroup.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ReplicaDescriptionOps._;
        result.replicationGroup(v.map(_.toJava).asJava)
      } // Seq[ReplicaDescription]
      self.globalTableArn.filter(_.nonEmpty).foreach(v => result.globalTableArn(v)) // String, case String
      self.creationDateTime.foreach(v => result.creationDateTime(v))                // Instant
      self.globalTableStatus.foreach { v =>
        import GlobalTableStatusOps._; result.globalTableStatus(v.toJava)
      } // String
      self.globalTableName.filter(_.nonEmpty).foreach(v => result.globalTableName(v)) // String, case String

      result.build()
    }

  }

  implicit class JavaGlobalTableDescriptionOps(val self: JavaGlobalTableDescription) extends AnyVal {

    def toScala: ScalaGlobalTableDescription = {
      ScalaGlobalTableDescription()
        .withReplicationGroup(Option(self.replicationGroup).map { v =>
          import scala.collection.JavaConverters._, ReplicaDescriptionOps._; v.asScala.map(_.toScala)
        }) // Seq[ReplicaDescription]
        .withGlobalTableArn(Option(self.globalTableArn)) // String
        .withCreationDateTime(Option(self.creationDateTime)) // Instant
        .withGlobalTableStatus(Option(self.globalTableStatus).map { v =>
          import GlobalTableStatusOps._; v.toScala
        }) // String
        .withGlobalTableName(Option(self.globalTableName)) // String
    }

  }

}
