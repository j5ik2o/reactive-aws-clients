package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class ExpectedAttributeValue(value: Option[AttributeValue] = None,
                                        exists: Option[Boolean] = Some(false),
                                        comparisonOperator: Option[ComparisonOperator] = None,
                                        attributeValueList: Option[Seq[AttributeValue]] = None) {
  def withValue(value: Option[AttributeValue]): ExpectedAttributeValue = copy(value = value)
  def withExists(value: Option[Boolean]): ExpectedAttributeValue       = copy(exists = value)
  def withComparisonOperator(value: Option[ComparisonOperator]): ExpectedAttributeValue =
    copy(comparisonOperator = value)
  def withAttributeValueList(value: Option[Seq[AttributeValue]]): ExpectedAttributeValue =
    copy(attributeValueList = value)
}
