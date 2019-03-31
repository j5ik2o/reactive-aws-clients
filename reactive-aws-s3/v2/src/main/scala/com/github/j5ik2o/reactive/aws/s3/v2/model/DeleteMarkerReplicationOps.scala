// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ DeleteMarkerReplication => ScalaDeleteMarkerReplication, _ }
import software.amazon.awssdk.services.s3.model.{ DeleteMarkerReplication => JavaDeleteMarkerReplication }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteMarkerReplicationOps {

  implicit class ScalaDeleteMarkerReplicationOps(val self: ScalaDeleteMarkerReplication) extends AnyVal {

    def toJava: JavaDeleteMarkerReplication = {
      val result = JavaDeleteMarkerReplication.builder()
      self.status.foreach { v =>
        import DeleteMarkerReplicationStatusOps._; result.status(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaDeleteMarkerReplicationOps(val self: JavaDeleteMarkerReplication) extends AnyVal {

    def toScala: ScalaDeleteMarkerReplication = {
      ScalaDeleteMarkerReplication()
        .withStatus(Option(self.status).map { v =>
          import DeleteMarkerReplicationStatusOps._; v.toScala
        }) // String
    }

  }

}
