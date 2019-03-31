// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ MFADelete => ScalaMFADelete, _ }
import software.amazon.awssdk.services.s3.model.{ MFADelete => JavaMFADelete }

object MFADeleteOps {

  implicit class ScalaMFADeleteOps(val self: ScalaMFADelete) extends AnyVal {

    def toJava: JavaMFADelete = {
      JavaMFADelete.valueOf(self.entryName)
    }

  }

  implicit class JavaMFADeleteOps(val self: JavaMFADelete) extends AnyVal {

    def toScala: ScalaMFADelete = {
      ScalaMFADelete.withName(self.toString)
    }

  }

}
