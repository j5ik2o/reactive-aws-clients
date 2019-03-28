// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateGlobalTableRequest => ScalaUpdateGlobalTableRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ UpdateGlobalTableRequest => JavaUpdateGlobalTableRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateGlobalTableRequestOps {

  implicit class ScalaUpdateGlobalTableRequestOps(val self: ScalaUpdateGlobalTableRequest) extends AnyVal {

    def toJava: JavaUpdateGlobalTableRequest = {
      val result = new JavaUpdateGlobalTableRequest()
      self.globalTableName.filter(_.nonEmpty).foreach(v => result.withGlobalTableName(v)) // String
      self.replicaUpdates.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ReplicaUpdateOps._; result.withReplicaUpdates(v.map(_.toJava).asJava)
      } // Seq[ReplicaUpdate]

      result
    }

  }

}
