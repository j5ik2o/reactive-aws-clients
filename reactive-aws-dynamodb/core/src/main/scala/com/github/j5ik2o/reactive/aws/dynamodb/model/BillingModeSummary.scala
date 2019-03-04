package com.github.j5ik2o.reactive.aws.dynamodb.model
import java.time.Instant

final case class BillingModeSummary(billingMode: Option[BillingMode] = None,
                                    lastUpdateToPayPerRequestDateTime: Option[Instant] = None) {
  def withBillingMode(value: Option[BillingMode]): BillingModeSummary = copy(billingMode = value)
  def withLastUpdateToPayPerRequestDateTime(value: Option[Instant]): BillingModeSummary =
    copy(lastUpdateToPayPerRequestDateTime = value)
}
