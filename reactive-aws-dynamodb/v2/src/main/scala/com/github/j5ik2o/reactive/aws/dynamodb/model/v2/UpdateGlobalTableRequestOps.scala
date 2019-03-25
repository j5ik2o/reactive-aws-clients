package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateGlobalTableRequest => ScalaUpdateGlobalTableRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ UpdateGlobalTableRequest => JavaUpdateGlobalTableRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateGlobalTableRequestOps {

  implicit class ScalaUpdateGlobalTableRequestOps(val self: ScalaUpdateGlobalTableRequest) extends AnyVal {

    def toJava: JavaUpdateGlobalTableRequest = {
      val result = JavaUpdateGlobalTableRequest.builder()
      self.globalTableName.filter(_.nonEmpty).foreach(v => result.globalTableName(v)) // String, case String
      self.replicaUpdates.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.replicaUpdates(v.map(_.toJava).asJava)
      } // Seq[ReplicaUpdate], case Seq[_], UserDefined

      result.build()
    }

  }

}
