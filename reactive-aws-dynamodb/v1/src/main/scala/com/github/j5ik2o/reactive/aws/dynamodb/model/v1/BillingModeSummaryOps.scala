// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BillingModeSummary => ScalaBillingModeSummary, _ }
import com.amazonaws.services.dynamodbv2.model.{ BillingModeSummary => JavaBillingModeSummary }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BillingModeSummaryOps {

  implicit class ScalaBillingModeSummaryOps(val self: ScalaBillingModeSummary) extends AnyVal {

    def toJava: JavaBillingModeSummary = {
      val result = new JavaBillingModeSummary()
      self.billingMode.foreach { v =>
        import BillingModeOps._; result.withBillingMode(v.toJava)
      } // String
      self.lastUpdateToPayPerRequestDateTime
        .map(java.util.Date.from).foreach(v => result.withLastUpdateToPayPerRequestDateTime(v)) // Instant

      result
    }

  }

  implicit class JavaBillingModeSummaryOps(val self: JavaBillingModeSummary) extends AnyVal {

    def toScala: ScalaBillingModeSummary = {
      ScalaBillingModeSummary()
        .withBillingMode(Option(self.getBillingMode).map { v =>
          import BillingModeOps._; v.toScala
        }) // String
        .withLastUpdateToPayPerRequestDateTime(Option(self.getLastUpdateToPayPerRequestDateTime).map(_.toInstant)) // Instant
    }

  }

}
