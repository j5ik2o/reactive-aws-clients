package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateGlobalTableRequest => ScalaCreateGlobalTableRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ CreateGlobalTableRequest => JavaCreateGlobalTableRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateGlobalTableRequestOps {

  implicit class ScalaCreateGlobalTableRequestOps(val self: ScalaCreateGlobalTableRequest) extends AnyVal {

    def toJava: JavaCreateGlobalTableRequest = {
      val result = JavaCreateGlobalTableRequest.builder()
      self.globalTableName.filter(_.nonEmpty).foreach(v => result.globalTableName(v)) // String, case String
      self.replicationGroup.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ReplicaOps._; result.replicationGroup(v.map(_.toJava).asJava)
      } // Seq[Replica]

      result.build()
    }

  }

}
