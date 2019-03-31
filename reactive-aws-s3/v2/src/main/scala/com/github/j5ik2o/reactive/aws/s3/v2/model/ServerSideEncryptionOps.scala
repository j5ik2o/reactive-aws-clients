// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ ServerSideEncryption => ScalaServerSideEncryption, _ }
import software.amazon.awssdk.services.s3.model.{ ServerSideEncryption => JavaServerSideEncryption }

object ServerSideEncryptionOps {

  implicit class ScalaServerSideEncryptionOps(val self: ScalaServerSideEncryption) extends AnyVal {

    def toJava: JavaServerSideEncryption = {
      JavaServerSideEncryption.valueOf(self.entryName)
    }

  }

  implicit class JavaServerSideEncryptionOps(val self: JavaServerSideEncryption) extends AnyVal {

    def toScala: ScalaServerSideEncryption = {
      ScalaServerSideEncryption.withName(self.toString)
    }

  }

}
