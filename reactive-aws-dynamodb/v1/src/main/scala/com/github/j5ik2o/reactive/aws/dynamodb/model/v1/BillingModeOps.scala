// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BillingMode => ScalaBillingMode, _ }
import com.amazonaws.services.dynamodbv2.model.{ BillingMode => JavaBillingMode }

object BillingModeOps {

  implicit class ScalaBillingModeOps(val self: ScalaBillingMode) extends AnyVal {

    def toJava: JavaBillingMode = {
      JavaBillingMode.valueOf(self.entryName)
    }

  }

  implicit class JavaBillingModeOps(val self: String) extends AnyVal {

    def toScala: ScalaBillingMode = {
      ScalaBillingMode.withName(self)
    }

  }

}
