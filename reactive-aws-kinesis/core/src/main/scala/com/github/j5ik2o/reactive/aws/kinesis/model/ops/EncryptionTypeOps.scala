// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ EncryptionType => ScalaEncryptionType, _ }
import software.amazon.awssdk.services.kinesis.model.{ EncryptionType => JavaEncryptionType }

object EncryptionTypeOps {

  implicit class ScalaEncryptionTypeOps(val self: ScalaEncryptionType) extends AnyVal {

    def toJava: JavaEncryptionType = {
      JavaEncryptionType.valueOf(self.entryName)
    }

  }

  implicit class JavaEncryptionTypeOps(val self: JavaEncryptionType) extends AnyVal {

    def toScala: ScalaEncryptionType = {
      ScalaEncryptionType.withName(self.toString)
    }

  }

}
