// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs

import software.amazon.awssdk.services.sqs.model._
import software.amazon.awssdk.services.sqs.{ SqsClient => JavaSQSSyncClient }

object SQSSyncClient {

  def apply(underlying: JavaSQSSyncClient): SQSSyncClient = new SQSSyncClientImpl(underlying)

}

trait SQSSyncClient extends SQSClient[Either[Throwable, ?]] /*with SQSSyncClientSupport*/ {
  val underlying: JavaSQSSyncClient

  protected def toEither[A](f: => A): Either[Throwable, A] = {
    try {
      Right(f)
    } catch {
      case t: Throwable =>
        Left(t)
    }
  }

  override def addPermission(addPermissionRequest: AddPermissionRequest): Either[Throwable, AddPermissionResponse] = {
    toEither(underlying.addPermission(addPermissionRequest))
  }

  override def changeMessageVisibility(
      changeMessageVisibilityRequest: ChangeMessageVisibilityRequest
  ): Either[Throwable, ChangeMessageVisibilityResponse] = {
    toEither(underlying.changeMessageVisibility(changeMessageVisibilityRequest))
  }

  override def changeMessageVisibilityBatch(
      changeMessageVisibilityBatchRequest: ChangeMessageVisibilityBatchRequest
  ): Either[Throwable, ChangeMessageVisibilityBatchResponse] = {
    toEither(underlying.changeMessageVisibilityBatch(changeMessageVisibilityBatchRequest))
  }

  override def createQueue(createQueueRequest: CreateQueueRequest): Either[Throwable, CreateQueueResponse] = {
    toEither(underlying.createQueue(createQueueRequest))
  }

  override def deleteMessage(deleteMessageRequest: DeleteMessageRequest): Either[Throwable, DeleteMessageResponse] = {
    toEither(underlying.deleteMessage(deleteMessageRequest))
  }

  override def deleteMessageBatch(
      deleteMessageBatchRequest: DeleteMessageBatchRequest
  ): Either[Throwable, DeleteMessageBatchResponse] = {
    toEither(underlying.deleteMessageBatch(deleteMessageBatchRequest))
  }

  override def deleteQueue(deleteQueueRequest: DeleteQueueRequest): Either[Throwable, DeleteQueueResponse] = {
    toEither(underlying.deleteQueue(deleteQueueRequest))
  }

  override def getQueueAttributes(
      getQueueAttributesRequest: GetQueueAttributesRequest
  ): Either[Throwable, GetQueueAttributesResponse] = {
    toEither(underlying.getQueueAttributes(getQueueAttributesRequest))
  }

  override def getQueueUrl(getQueueUrlRequest: GetQueueUrlRequest): Either[Throwable, GetQueueUrlResponse] = {
    toEither(underlying.getQueueUrl(getQueueUrlRequest))
  }

  override def listDeadLetterSourceQueues(
      listDeadLetterSourceQueuesRequest: ListDeadLetterSourceQueuesRequest
  ): Either[Throwable, ListDeadLetterSourceQueuesResponse] = {
    toEither(underlying.listDeadLetterSourceQueues(listDeadLetterSourceQueuesRequest))
  }

  override def listQueueTags(listQueueTagsRequest: ListQueueTagsRequest): Either[Throwable, ListQueueTagsResponse] = {
    toEither(underlying.listQueueTags(listQueueTagsRequest))
  }

  override def listQueues(): Either[Throwable, ListQueuesResponse] = {
    toEither(underlying.listQueues())
  }

  override def listQueues(listQueuesRequest: ListQueuesRequest): Either[Throwable, ListQueuesResponse] = {
    toEither(underlying.listQueues(listQueuesRequest))
  }

  override def purgeQueue(purgeQueueRequest: PurgeQueueRequest): Either[Throwable, PurgeQueueResponse] = {
    toEither(underlying.purgeQueue(purgeQueueRequest))
  }

  override def receiveMessage(
      receiveMessageRequest: ReceiveMessageRequest
  ): Either[Throwable, ReceiveMessageResponse] = {
    toEither(underlying.receiveMessage(receiveMessageRequest))
  }

  override def removePermission(
      removePermissionRequest: RemovePermissionRequest
  ): Either[Throwable, RemovePermissionResponse] = {
    toEither(underlying.removePermission(removePermissionRequest))
  }

  override def sendMessage(sendMessageRequest: SendMessageRequest): Either[Throwable, SendMessageResponse] = {
    toEither(underlying.sendMessage(sendMessageRequest))
  }

  override def sendMessageBatch(
      sendMessageBatchRequest: SendMessageBatchRequest
  ): Either[Throwable, SendMessageBatchResponse] = {
    toEither(underlying.sendMessageBatch(sendMessageBatchRequest))
  }

  override def setQueueAttributes(
      setQueueAttributesRequest: SetQueueAttributesRequest
  ): Either[Throwable, SetQueueAttributesResponse] = {
    toEither(underlying.setQueueAttributes(setQueueAttributesRequest))
  }

  override def tagQueue(tagQueueRequest: TagQueueRequest): Either[Throwable, TagQueueResponse] = {
    toEither(underlying.tagQueue(tagQueueRequest))
  }

  override def untagQueue(untagQueueRequest: UntagQueueRequest): Either[Throwable, UntagQueueResponse] = {
    toEither(underlying.untagQueue(untagQueueRequest))
  }

}
