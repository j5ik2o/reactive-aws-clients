package com.github.j5ik2o.reactive.dynamodb.model

final case class ItemResponse(item: Option[Map[String, AttributeValue]] = None) {

  def withItem(value: Option[Map[String, AttributeValue]]): ItemResponse = copy(item = value)

}
