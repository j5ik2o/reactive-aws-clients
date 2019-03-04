package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class GlobalSecondaryIndexUpdate(update: Option[UpdateGlobalSecondaryIndexAction] = None,
                                            create: Option[CreateGlobalSecondaryIndexAction] = None,
                                            delete: Option[DeleteGlobalSecondaryIndexAction] = None) {
  def withUpdate(value: Option[UpdateGlobalSecondaryIndexAction]): GlobalSecondaryIndexUpdate = copy(update = value)
  def withCreate(value: Option[CreateGlobalSecondaryIndexAction]): GlobalSecondaryIndexUpdate = copy(create = value)
  def withDelete(value: Option[DeleteGlobalSecondaryIndexAction]): GlobalSecondaryIndexUpdate = copy(delete = value)

}
