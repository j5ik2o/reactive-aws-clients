// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ObjectVersionStorageClass => ScalaObjectVersionStorageClass, _ }
import software.amazon.awssdk.services.s3.model.{ ObjectVersionStorageClass => JavaObjectVersionStorageClass }

object ObjectVersionStorageClassOps {

  implicit class ScalaObjectVersionStorageClassOps(val self: ScalaObjectVersionStorageClass) extends AnyVal {

    def toJava: JavaObjectVersionStorageClass = {
      JavaObjectVersionStorageClass.valueOf(self.entryName)
    }

  }

  implicit class JavaObjectVersionStorageClassOps(val self: JavaObjectVersionStorageClass) extends AnyVal {

    def toScala: ScalaObjectVersionStorageClass = {
      ScalaObjectVersionStorageClass.withName(self.toString)
    }

  }

}
