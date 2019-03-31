// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ScalingType => ScalaScalingType, _ }
import com.amazonaws.services.kinesis.model.{ ScalingType => JavaScalingType }

object ScalingTypeOps {

  implicit class ScalaScalingTypeOps(val self: ScalaScalingType) extends AnyVal {

    def toJava: JavaScalingType = {
      JavaScalingType.valueOf(self.entryName)
    }

  }

  implicit class JavaScalingTypeOps(val self: String) extends AnyVal {

    def toScala: ScalaScalingType = {
      ScalaScalingType.withName(self)
    }

  }

}