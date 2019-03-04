package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BillingMode, BillingModeSummary => ScalaBillingModeSummary }
import software.amazon.awssdk.services.dynamodb.model.{ BillingModeSummary => JavaBillingModeSummary }

object BillingModeSummaryOps {

  implicit class ScalaBillingModeSummaryOps(val self: ScalaBillingModeSummary) extends AnyVal {

    def toJava: JavaBillingModeSummary = {
      val result = JavaBillingModeSummary.builder()
      self.billingMode.map(_.entryName).foreach(result.billingMode)
      self.lastUpdateToPayPerRequestDateTime
        .foreach(result.lastUpdateToPayPerRequestDateTime)
      result.build()
    }

  }

  implicit class JavaBillingModeSummaryOps(val self: JavaBillingModeSummary) extends AnyVal {

    def toScala: ScalaBillingModeSummary = {
      ScalaBillingModeSummary()
        .withBillingMode(Option(self.billingMode).map(_.toString).map(BillingMode.withName))
        .withLastUpdateToPayPerRequestDateTime(Option(self.lastUpdateToPayPerRequestDateTime))
    }

  }
}
