package com.github.j5ik2o.reactive.dynamodb.model

final case class DeleteRequest(key: Option[Map[String, AttributeValue]] = None) {

  def withKey(value: Option[Map[String, AttributeValue]]): DeleteRequest = copy(key = value)

  def addItemEntry(_key: String, value: AttributeValue): DeleteRequest =
    copy(
      key = key
        .map { v =>
          v + (_key -> value)
        }.orElse(Some(Map(_key -> value)))
    )
}
