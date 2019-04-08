// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.sqs.model._
import software.amazon.awssdk.services.sqs.{ SqsClient => JavaSqsSyncClient }

object SqsSyncClient extends ToEitherSupport {

  def apply(javaClient: JavaSqsSyncClient): SqsSyncClient = new SqsSyncClient {
    override val underlying: JavaSqsSyncClient = javaClient
  }

}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/sqs/SqsClient.html
  */
trait SqsSyncClient extends SqsClient[Either[Throwable, ?]] {
  val underlying: JavaSqsSyncClient

  import SqsSyncClient._

  override def addPermission(addPermissionRequest: AddPermissionRequest): Either[Throwable, AddPermissionResponse] =
    underlying.addPermission(addPermissionRequest).toEither

  override def changeMessageVisibility(
      changeMessageVisibilityRequest: ChangeMessageVisibilityRequest
  ): Either[Throwable, ChangeMessageVisibilityResponse] =
    underlying.changeMessageVisibility(changeMessageVisibilityRequest).toEither

  override def changeMessageVisibilityBatch(
      changeMessageVisibilityBatchRequest: ChangeMessageVisibilityBatchRequest
  ): Either[Throwable, ChangeMessageVisibilityBatchResponse] =
    underlying.changeMessageVisibilityBatch(changeMessageVisibilityBatchRequest).toEither

  override def createQueue(createQueueRequest: CreateQueueRequest): Either[Throwable, CreateQueueResponse] =
    underlying.createQueue(createQueueRequest).toEither

  override def deleteMessage(deleteMessageRequest: DeleteMessageRequest): Either[Throwable, DeleteMessageResponse] =
    underlying.deleteMessage(deleteMessageRequest).toEither

  override def deleteMessageBatch(
      deleteMessageBatchRequest: DeleteMessageBatchRequest
  ): Either[Throwable, DeleteMessageBatchResponse] =
    underlying.deleteMessageBatch(deleteMessageBatchRequest).toEither

  override def deleteQueue(deleteQueueRequest: DeleteQueueRequest): Either[Throwable, DeleteQueueResponse] =
    underlying.deleteQueue(deleteQueueRequest).toEither

  override def getQueueAttributes(
      getQueueAttributesRequest: GetQueueAttributesRequest
  ): Either[Throwable, GetQueueAttributesResponse] =
    underlying.getQueueAttributes(getQueueAttributesRequest).toEither

  override def getQueueUrl(getQueueUrlRequest: GetQueueUrlRequest): Either[Throwable, GetQueueUrlResponse] =
    underlying.getQueueUrl(getQueueUrlRequest).toEither

  override def listDeadLetterSourceQueues(
      listDeadLetterSourceQueuesRequest: ListDeadLetterSourceQueuesRequest
  ): Either[Throwable, ListDeadLetterSourceQueuesResponse] =
    underlying.listDeadLetterSourceQueues(listDeadLetterSourceQueuesRequest).toEither

  override def listQueueTags(listQueueTagsRequest: ListQueueTagsRequest): Either[Throwable, ListQueueTagsResponse] =
    underlying.listQueueTags(listQueueTagsRequest).toEither

  override def listQueues(): Either[Throwable, ListQueuesResponse] =
    underlying.listQueues().toEither

  override def listQueues(listQueuesRequest: ListQueuesRequest): Either[Throwable, ListQueuesResponse] =
    underlying.listQueues(listQueuesRequest).toEither

  override def purgeQueue(purgeQueueRequest: PurgeQueueRequest): Either[Throwable, PurgeQueueResponse] =
    underlying.purgeQueue(purgeQueueRequest).toEither

  override def receiveMessage(receiveMessageRequest: ReceiveMessageRequest): Either[Throwable, ReceiveMessageResponse] =
    underlying.receiveMessage(receiveMessageRequest).toEither

  override def removePermission(
      removePermissionRequest: RemovePermissionRequest
  ): Either[Throwable, RemovePermissionResponse] =
    underlying.removePermission(removePermissionRequest).toEither

  override def sendMessage(sendMessageRequest: SendMessageRequest): Either[Throwable, SendMessageResponse] =
    underlying.sendMessage(sendMessageRequest).toEither

  override def sendMessageBatch(
      sendMessageBatchRequest: SendMessageBatchRequest
  ): Either[Throwable, SendMessageBatchResponse] =
    underlying.sendMessageBatch(sendMessageBatchRequest).toEither

  override def setQueueAttributes(
      setQueueAttributesRequest: SetQueueAttributesRequest
  ): Either[Throwable, SetQueueAttributesResponse] =
    underlying.setQueueAttributes(setQueueAttributesRequest).toEither

  override def tagQueue(tagQueueRequest: TagQueueRequest): Either[Throwable, TagQueueResponse] =
    underlying.tagQueue(tagQueueRequest).toEither

  override def untagQueue(untagQueueRequest: UntagQueueRequest): Either[Throwable, UntagQueueResponse] =
    underlying.untagQueue(untagQueueRequest).toEither

}
