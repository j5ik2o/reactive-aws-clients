package com.github.j5ik2o.reactive.dynamodb.model

final case class PutRequest(item: Option[Map[String, AttributeValue]] = None) {

  def withItem(value: Option[Map[String, AttributeValue]]): PutRequest = copy(item = value)

  def addItemEntry(key: String, value: AttributeValue): PutRequest =
    copy(
      item = item
        .map { v =>
          v + (key -> value)
        }.orElse(Some(Map(key -> value)))
    )

}
