// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BillingMode => ScalaBillingMode, _ }
import software.amazon.awssdk.services.dynamodb.model.{ BillingMode => JavaBillingMode }

object BillingModeOps {

  implicit class ScalaBillingModeOps(val self: ScalaBillingMode) extends AnyVal {

    def toJava: JavaBillingMode = {
      JavaBillingMode.valueOf(self.entryName)
    }

  }

  implicit class JavaBillingModeOps(val self: JavaBillingMode) extends AnyVal {

    def toScala: ScalaBillingMode = {
      ScalaBillingMode.withName(self.toString)
    }

  }

}
