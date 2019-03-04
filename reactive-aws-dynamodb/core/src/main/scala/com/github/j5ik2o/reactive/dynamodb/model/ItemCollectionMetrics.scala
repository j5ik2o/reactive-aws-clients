package com.github.j5ik2o.reactive.dynamodb.model

final case class ItemCollectionMetrics(itemCollectionKey: Option[Map[String, AttributeValue]] = None,
                                       sizeEstimateRangeGB: Option[Seq[Double]] = None) {
  def withItemCollectionKey(value: Option[Map[String, AttributeValue]]): ItemCollectionMetrics =
    copy(itemCollectionKey = value)
  def withSizeEstimateRangeGB(value: Option[Seq[Double]]): ItemCollectionMetrics = copy(sizeEstimateRangeGB = value)
}
