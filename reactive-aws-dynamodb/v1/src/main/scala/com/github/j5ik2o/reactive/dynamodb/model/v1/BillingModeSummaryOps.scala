package com.github.j5ik2o.reactive.dynamodb.model.v1

import java.util.Date

import com.amazonaws.services.dynamodbv2.model.{ BillingModeSummary => JavaBillingModeSummary }
import com.github.j5ik2o.reactive.dynamodb.model.{ BillingMode, BillingModeSummary => ScalaBillingModeSummary }

object BillingModeSummaryOps {

  implicit class ScalaBillingModeSummaryOps(val self: ScalaBillingModeSummary) extends AnyVal {

    def toJava: JavaBillingModeSummary = {
      val result = new JavaBillingModeSummary()
      self.billingMode.map(_.entryName).foreach(result.setBillingMode)
      self.lastUpdateToPayPerRequestDateTime
        .map(Date.from).foreach(result.setLastUpdateToPayPerRequestDateTime)
      result
    }

  }

  implicit class JavaBillingModeSummaryOps(val self: JavaBillingModeSummary) extends AnyVal {

    def toScala: ScalaBillingModeSummary = {
      ScalaBillingModeSummary()
        .withBillingMode(Option(self.getBillingMode).map(BillingMode.withName))
        .withLastUpdateToPayPerRequestDateTime(Option(self.getLastUpdateToPayPerRequestDateTime).map(_.toInstant))
    }

  }

}
