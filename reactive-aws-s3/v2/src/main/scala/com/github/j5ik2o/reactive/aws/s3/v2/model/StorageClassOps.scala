// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ StorageClass => ScalaStorageClass, _ }
import software.amazon.awssdk.services.s3.model.{ StorageClass => JavaStorageClass }

object StorageClassOps {

  implicit class ScalaStorageClassOps(val self: ScalaStorageClass) extends AnyVal {

    def toJava: JavaStorageClass = {
      JavaStorageClass.valueOf(self.entryName)
    }

  }

  implicit class JavaStorageClassOps(val self: JavaStorageClass) extends AnyVal {

    def toScala: ScalaStorageClass = {
      ScalaStorageClass.withName(self.toString)
    }

  }

}
