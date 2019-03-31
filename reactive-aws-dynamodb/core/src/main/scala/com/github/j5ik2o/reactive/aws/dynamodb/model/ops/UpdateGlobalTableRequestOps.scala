// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateGlobalTableRequest => ScalaUpdateGlobalTableRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ UpdateGlobalTableRequest => JavaUpdateGlobalTableRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateGlobalTableRequestOps {

  implicit class ScalaUpdateGlobalTableRequestOps(val self: ScalaUpdateGlobalTableRequest) extends AnyVal {

    def toJava: JavaUpdateGlobalTableRequest = {
      val result = JavaUpdateGlobalTableRequest.builder()
      self.globalTableName.filter(_.nonEmpty).foreach(v => result.globalTableName(v)) // String
      self.replicaUpdates.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ReplicaUpdateOps._; result.replicaUpdates(v.map(_.toJava).asJava)
      } // Seq[ReplicaUpdate]

      result.build()
    }

  }

}
