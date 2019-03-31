// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ OwnerOverride => ScalaOwnerOverride, _ }
import software.amazon.awssdk.services.s3.model.{ OwnerOverride => JavaOwnerOverride }

object OwnerOverrideOps {

  implicit class ScalaOwnerOverrideOps(val self: ScalaOwnerOverride) extends AnyVal {

    def toJava: JavaOwnerOverride = {
      JavaOwnerOverride.valueOf(self.entryName)
    }

  }

  implicit class JavaOwnerOverrideOps(val self: JavaOwnerOverride) extends AnyVal {

    def toScala: ScalaOwnerOverride = {
      ScalaOwnerOverride.withName(self.toString)
    }

  }

}
