// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ObjectCannedACL => ScalaObjectCannedACL, _ }
import software.amazon.awssdk.services.s3.model.{ ObjectCannedACL => JavaObjectCannedACL }

object ObjectCannedACLOps {

  implicit class ScalaObjectCannedACLOps(val self: ScalaObjectCannedACL) extends AnyVal {

    def toJava: JavaObjectCannedACL = {
      JavaObjectCannedACL.valueOf(self.entryName)
    }

  }

  implicit class JavaObjectCannedACLOps(val self: JavaObjectCannedACL) extends AnyVal {

    def toScala: ScalaObjectCannedACL = {
      ScalaObjectCannedACL.withName(self.toString)
    }

  }

}
