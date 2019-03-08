package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DeleteGlobalSecondaryIndexAction(
    indexName: Option[String] = None
) {
  def withIndexName(value: Option[String]): DeleteGlobalSecondaryIndexAction =
    copy(indexName = value)
}
