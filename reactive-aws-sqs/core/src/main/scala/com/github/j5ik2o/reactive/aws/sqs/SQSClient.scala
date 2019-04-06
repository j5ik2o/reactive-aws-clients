package com.github.j5ik2o.reactive.aws.sqs

import software.amazon.awssdk.services.sqs.model._

trait SQSClient[M[_]] {

  def addPermission(addPermissionRequest: AddPermissionRequest): M[AddPermissionResponse]

  def changeMessageVisibility(
      changeMessageVisibilityRequest: ChangeMessageVisibilityRequest
  ): M[ChangeMessageVisibilityResponse]

  def changeMessageVisibilityBatch(
      changeMessageVisibilityBatchRequest: ChangeMessageVisibilityBatchRequest
  ): M[ChangeMessageVisibilityBatchResponse]

  def createQueue(createQueueRequest: CreateQueueRequest): M[CreateQueueResponse]

  def deleteMessage(deleteMessageRequest: DeleteMessageRequest): M[DeleteMessageResponse]

  def deleteMessageBatch(deleteMessageBatchRequest: DeleteMessageBatchRequest): M[DeleteMessageBatchResponse]

  def deleteQueue(deleteQueueRequest: DeleteQueueRequest): M[DeleteQueueResponse]

  def getQueueAttributes(getQueueAttributesRequest: GetQueueAttributesRequest): M[GetQueueAttributesResponse]

  def getQueueUrl(getQueueUrlRequest: GetQueueUrlRequest): M[GetQueueUrlResponse]

  def listDeadLetterSourceQueues(
      listDeadLetterSourceQueuesRequest: ListDeadLetterSourceQueuesRequest
  ): M[ListDeadLetterSourceQueuesResponse]

  def listQueueTags(listQueueTagsRequest: ListQueueTagsRequest): M[ListQueueTagsResponse]

  def listQueues(listQueuesRequest: ListQueuesRequest): M[ListQueuesResponse]

  def listQueues(): M[ListQueuesResponse]

  def purgeQueue(purgeQueueRequest: PurgeQueueRequest): M[PurgeQueueResponse]

  def receiveMessage(receiveMessageRequest: ReceiveMessageRequest): M[ReceiveMessageResponse]

  def removePermission(removePermissionRequest: RemovePermissionRequest): M[RemovePermissionResponse]

  def sendMessage(sendMessageRequest: SendMessageRequest): M[SendMessageResponse]

  def sendMessageBatch(sendMessageBatchRequest: SendMessageBatchRequest): M[SendMessageBatchResponse]

  def setQueueAttributes(setQueueAttributesRequest: SetQueueAttributesRequest): M[SetQueueAttributesResponse]

  def tagQueue(tagQueueRequest: TagQueueRequest): M[TagQueueResponse]

  def untagQueue(untagQueueRequest: UntagQueueRequest): M[UntagQueueResponse]

}
