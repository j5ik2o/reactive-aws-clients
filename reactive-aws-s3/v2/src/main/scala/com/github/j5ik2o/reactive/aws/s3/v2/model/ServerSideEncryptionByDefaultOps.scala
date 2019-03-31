// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  ServerSideEncryptionByDefault => ScalaServerSideEncryptionByDefault,
  _
}
import software.amazon.awssdk.services.s3.model.{ ServerSideEncryptionByDefault => JavaServerSideEncryptionByDefault }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ServerSideEncryptionByDefaultOps {

  implicit class ScalaServerSideEncryptionByDefaultOps(val self: ScalaServerSideEncryptionByDefault) extends AnyVal {

    def toJava: JavaServerSideEncryptionByDefault = {
      val result = JavaServerSideEncryptionByDefault.builder()
      self.sseAlgorithm.foreach { v =>
        import ServerSideEncryptionOps._; result.sseAlgorithm(v.toJava)
      } // String
      self.kmsMasterKeyID.filter(_.nonEmpty).foreach(v => result.kmsMasterKeyID(v)) // String

      result.build()
    }

  }

  implicit class JavaServerSideEncryptionByDefaultOps(val self: JavaServerSideEncryptionByDefault) extends AnyVal {

    def toScala: ScalaServerSideEncryptionByDefault = {
      ScalaServerSideEncryptionByDefault()
        .withSseAlgorithm(Option(self.sseAlgorithm).map { v =>
          import ServerSideEncryptionOps._; v.toScala
        }) // String
        .withKmsMasterKeyID(Option(self.kmsMasterKeyID)) // String
    }

  }

}
