// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ MFADeleteStatus => ScalaMFADeleteStatus, _ }
import software.amazon.awssdk.services.s3.model.{ MFADeleteStatus => JavaMFADeleteStatus }

object MFADeleteStatusOps {

  implicit class ScalaMFADeleteStatusOps(val self: ScalaMFADeleteStatus) extends AnyVal {

    def toJava: JavaMFADeleteStatus = {
      JavaMFADeleteStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaMFADeleteStatusOps(val self: JavaMFADeleteStatus) extends AnyVal {

    def toScala: ScalaMFADeleteStatus = {
      ScalaMFADeleteStatus.withName(self.toString)
    }

  }

}
