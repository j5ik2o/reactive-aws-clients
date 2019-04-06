// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs

import software.amazon.awssdk.services.sqs.model._
import software.amazon.awssdk.services.sqs.{ SqsAsyncClient => JavaSqsAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object SqsAsyncClient {

  def apply(underlying: JavaSqsAsyncClient): SqsAsyncClient =
    new SqsAsyncClientImpl(underlying)

}

trait SqsAsyncClient extends SqsClient[Future] {
  val underlying: JavaSqsAsyncClient

  override def addPermission(addPermissionRequest: AddPermissionRequest): Future[AddPermissionResponse] =
    underlying.addPermission(addPermissionRequest).toScala

  override def changeMessageVisibility(
      changeMessageVisibilityRequest: ChangeMessageVisibilityRequest
  ): Future[ChangeMessageVisibilityResponse] =
    underlying.changeMessageVisibility(changeMessageVisibilityRequest).toScala

  override def changeMessageVisibilityBatch(
      changeMessageVisibilityBatchRequest: ChangeMessageVisibilityBatchRequest
  ): Future[ChangeMessageVisibilityBatchResponse] =
    underlying.changeMessageVisibilityBatch(changeMessageVisibilityBatchRequest).toScala

  override def createQueue(createQueueRequest: CreateQueueRequest): Future[CreateQueueResponse] =
    underlying.createQueue(createQueueRequest).toScala

  override def deleteMessage(deleteMessageRequest: DeleteMessageRequest): Future[DeleteMessageResponse] =
    underlying.deleteMessage(deleteMessageRequest).toScala

  override def deleteMessageBatch(
      deleteMessageBatchRequest: DeleteMessageBatchRequest
  ): Future[DeleteMessageBatchResponse] =
    underlying.deleteMessageBatch(deleteMessageBatchRequest).toScala

  override def deleteQueue(deleteQueueRequest: DeleteQueueRequest): Future[DeleteQueueResponse] =
    underlying.deleteQueue(deleteQueueRequest).toScala

  override def getQueueAttributes(
      getQueueAttributesRequest: GetQueueAttributesRequest
  ): Future[GetQueueAttributesResponse] =
    underlying.getQueueAttributes(getQueueAttributesRequest).toScala

  override def getQueueUrl(getQueueUrlRequest: GetQueueUrlRequest): Future[GetQueueUrlResponse] =
    underlying.getQueueUrl(getQueueUrlRequest).toScala

  override def listDeadLetterSourceQueues(
      listDeadLetterSourceQueuesRequest: ListDeadLetterSourceQueuesRequest
  ): Future[ListDeadLetterSourceQueuesResponse] =
    underlying.listDeadLetterSourceQueues(listDeadLetterSourceQueuesRequest).toScala

  override def listQueueTags(listQueueTagsRequest: ListQueueTagsRequest): Future[ListQueueTagsResponse] =
    underlying.listQueueTags(listQueueTagsRequest).toScala

  override def listQueues(listQueuesRequest: ListQueuesRequest): Future[ListQueuesResponse] =
    underlying.listQueues(listQueuesRequest).toScala

  override def listQueues(): Future[ListQueuesResponse] =
    underlying.listQueues().toScala

  override def purgeQueue(purgeQueueRequest: PurgeQueueRequest): Future[PurgeQueueResponse] =
    underlying.purgeQueue(purgeQueueRequest).toScala

  override def receiveMessage(receiveMessageRequest: ReceiveMessageRequest): Future[ReceiveMessageResponse] =
    underlying.receiveMessage(receiveMessageRequest).toScala

  override def removePermission(removePermissionRequest: RemovePermissionRequest): Future[RemovePermissionResponse] =
    underlying.removePermission(removePermissionRequest).toScala

  override def sendMessage(sendMessageRequest: SendMessageRequest): Future[SendMessageResponse] =
    underlying.sendMessage(sendMessageRequest).toScala

  override def sendMessageBatch(sendMessageBatchRequest: SendMessageBatchRequest): Future[SendMessageBatchResponse] =
    underlying.sendMessageBatch(sendMessageBatchRequest).toScala

  override def setQueueAttributes(
      setQueueAttributesRequest: SetQueueAttributesRequest
  ): Future[SetQueueAttributesResponse] =
    underlying.setQueueAttributes(setQueueAttributesRequest).toScala

  override def tagQueue(tagQueueRequest: TagQueueRequest): Future[TagQueueResponse] =
    underlying.tagQueue(tagQueueRequest).toScala

  override def untagQueue(untagQueueRequest: UntagQueueRequest): Future[UntagQueueResponse] =
    underlying.untagQueue(untagQueueRequest).toScala

}
