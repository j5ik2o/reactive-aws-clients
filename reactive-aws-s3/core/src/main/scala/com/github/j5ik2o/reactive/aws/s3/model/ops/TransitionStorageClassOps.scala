// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ TransitionStorageClass => ScalaTransitionStorageClass, _ }
import software.amazon.awssdk.services.s3.model.{ TransitionStorageClass => JavaTransitionStorageClass }

object TransitionStorageClassOps {

  implicit class ScalaTransitionStorageClassOps(val self: ScalaTransitionStorageClass) extends AnyVal {

    def toJava: JavaTransitionStorageClass = {
      JavaTransitionStorageClass.valueOf(self.entryName)
    }

  }

  implicit class JavaTransitionStorageClassOps(val self: JavaTransitionStorageClass) extends AnyVal {

    def toScala: ScalaTransitionStorageClass = {
      ScalaTransitionStorageClass.withName(self.toString)
    }

  }

}
