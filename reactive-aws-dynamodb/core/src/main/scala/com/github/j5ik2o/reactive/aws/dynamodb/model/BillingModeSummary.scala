package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class BillingModeSummary(
    billingMode: Option[BillingMode] = None,
    lastUpdateToPayPerRequestDateTime: Option[java.time.Instant] = None
) {
  def withBillingMode(value: Option[BillingMode]): BillingModeSummary =
    copy(billingMode = value)
  def withLastUpdateToPayPerRequestDateTime(value: Option[java.time.Instant]): BillingModeSummary =
    copy(lastUpdateToPayPerRequestDateTime = value)
}
