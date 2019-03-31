// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ObjectStorageClass => ScalaObjectStorageClass, _ }
import software.amazon.awssdk.services.s3.model.{ ObjectStorageClass => JavaObjectStorageClass }

object ObjectStorageClassOps {

  implicit class ScalaObjectStorageClassOps(val self: ScalaObjectStorageClass) extends AnyVal {

    def toJava: JavaObjectStorageClass = {
      JavaObjectStorageClass.valueOf(self.entryName)
    }

  }

  implicit class JavaObjectStorageClassOps(val self: JavaObjectStorageClass) extends AnyVal {

    def toScala: ScalaObjectStorageClass = {
      ScalaObjectStorageClass.withName(self.toString)
    }

  }

}
