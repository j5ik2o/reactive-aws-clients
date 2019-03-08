package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class Condition(
    attributeValueList: Option[Seq[AttributeValue]] = None,
    comparisonOperator: Option[ComparisonOperator] = None
) {
  def withAttributeValueList(value: Option[Seq[AttributeValue]]): Condition =
    copy(attributeValueList = value)
  def withComparisonOperator(value: Option[ComparisonOperator]): Condition =
    copy(comparisonOperator = value)
}
