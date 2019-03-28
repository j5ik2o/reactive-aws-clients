// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateGlobalTableRequest => ScalaCreateGlobalTableRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ CreateGlobalTableRequest => JavaCreateGlobalTableRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateGlobalTableRequestOps {

  implicit class ScalaCreateGlobalTableRequestOps(val self: ScalaCreateGlobalTableRequest) extends AnyVal {

    def toJava: JavaCreateGlobalTableRequest = {
      val result = new JavaCreateGlobalTableRequest()
      self.globalTableName.filter(_.nonEmpty).foreach(v => result.withGlobalTableName(v)) // String
      self.replicationGroup.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ReplicaOps._; result.withReplicationGroup(v.map(_.toJava).asJava)
      } // Seq[Replica]

      result
    }

  }

}
