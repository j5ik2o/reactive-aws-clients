package com.github.j5ik2o.reactive.aws.s3.model

final case class RoutingRule(
    condition: Option[Condition] = None,
    redirect: Option[Redirect] = None
) {
  def withCondition(value: Option[Condition]): RoutingRule =
    copy(condition = value)
  def withRedirect(value: Option[Redirect]): RoutingRule =
    copy(redirect = value)
}
