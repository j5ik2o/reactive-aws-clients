package com.github.j5ik2o.reactive.aws.s3.model

final case class LambdaFunctionConfiguration(
    id: Option[String] = None,
    lambdaFunctionArn: Option[String] = None,
    events: Option[Seq[Event]] = None,
    filter: Option[NotificationConfigurationFilter] = None
) {
  def withId(value: Option[String]): LambdaFunctionConfiguration =
    copy(id = value)
  def withLambdaFunctionArn(value: Option[String]): LambdaFunctionConfiguration =
    copy(lambdaFunctionArn = value)
  def withEvents(value: Option[Seq[Event]]): LambdaFunctionConfiguration =
    copy(events = value)
  def withFilter(value: Option[NotificationConfigurationFilter]): LambdaFunctionConfiguration =
    copy(filter = value)
}
