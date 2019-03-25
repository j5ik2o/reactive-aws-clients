package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BillingModeSummary => ScalaBillingModeSummary, _ }
import software.amazon.awssdk.services.dynamodb.model.{ BillingModeSummary => JavaBillingModeSummary }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BillingModeSummaryOps {

  implicit class ScalaBillingModeSummaryOps(val self: ScalaBillingModeSummary) extends AnyVal {

    def toJava: JavaBillingModeSummary = {
      val result = JavaBillingModeSummary.builder()
                                      self.billingMode.foreach{ v => import BillingModeOps._; result.billingMode(v.toJava) } // String, case Other
                      self.lastUpdateToPayPerRequestDateTime.foreach(v => result.lastUpdateToPayPerRequestDateTime(v)) // Instant, case java.time.Instant

      result.build()
    }

  }

  implicit class JavaBillingModeSummaryOps(val self: JavaBillingModeSummary) extends AnyVal {

     def toScala: ScalaBillingModeSummary = {
       ScalaBillingModeSummary()
            .withBillingMode(Option(self.billingMode).map{ v => import BillingModeOps._; v.toScala}) // String, Map-12
            .withLastUpdateToPayPerRequestDateTime(Option(self.lastUpdateToPayPerRequestDateTime)) // Instant, Map-11
     }

   }

}