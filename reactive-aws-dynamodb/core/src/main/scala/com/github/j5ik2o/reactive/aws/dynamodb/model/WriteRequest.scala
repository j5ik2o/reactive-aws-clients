package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class WriteRequest(putRequest: Option[PutRequest] = None, deleteRequest: Option[DeleteRequest] = None) {
  def withPutRequest(value: Option[PutRequest]): WriteRequest       = copy(putRequest = value)
  def withDeleteRequest(value: Option[DeleteRequest]): WriteRequest = copy(deleteRequest = value)
}
