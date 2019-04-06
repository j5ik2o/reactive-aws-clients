// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.cats

import cats.effect.IO
import com.github.j5ik2o.reactive.aws.sqs.{ SQSAsyncClient, SQSClient }
import software.amazon.awssdk.services.sqs.model._

object SQSCatsIOClient {

  def apply(underlying: SQSAsyncClient): SQSCatsIOClient =
    new SQSCatsIOClientImpl(underlying)

}

trait SQSCatsIOClient extends SQSClient[IO] {

  val underlying: SQSAsyncClient

  override def addPermission(
      addPermissionRequest: AddPermissionRequest
  ): IO[AddPermissionResponse] =
    IO.fromFuture {
      IO(underlying.addPermission(addPermissionRequest))
    }

  override def changeMessageVisibility(
      changeMessageVisibilityRequest: ChangeMessageVisibilityRequest
  ): IO[ChangeMessageVisibilityResponse] =
    IO.fromFuture {
      IO(underlying.changeMessageVisibility(changeMessageVisibilityRequest))
    }

  override def changeMessageVisibilityBatch(
      changeMessageVisibilityBatchRequest: ChangeMessageVisibilityBatchRequest
  ): IO[ChangeMessageVisibilityBatchResponse] =
    IO.fromFuture {
      IO(underlying.changeMessageVisibilityBatch(changeMessageVisibilityBatchRequest))
    }

  override def createQueue(
      createQueueRequest: CreateQueueRequest
  ): IO[CreateQueueResponse] =
    IO.fromFuture {
      IO(underlying.createQueue(createQueueRequest))
    }

  override def deleteMessage(
      deleteMessageRequest: DeleteMessageRequest
  ): IO[DeleteMessageResponse] =
    IO.fromFuture {
      IO(underlying.deleteMessage(deleteMessageRequest))
    }

  override def deleteMessageBatch(
      deleteMessageBatchRequest: DeleteMessageBatchRequest
  ): IO[DeleteMessageBatchResponse] =
    IO.fromFuture {
      IO(underlying.deleteMessageBatch(deleteMessageBatchRequest))
    }

  override def deleteQueue(
      deleteQueueRequest: DeleteQueueRequest
  ): IO[DeleteQueueResponse] =
    IO.fromFuture {
      IO(underlying.deleteQueue(deleteQueueRequest))
    }

  override def getQueueAttributes(
      getQueueAttributesRequest: GetQueueAttributesRequest
  ): IO[GetQueueAttributesResponse] =
    IO.fromFuture {
      IO(underlying.getQueueAttributes(getQueueAttributesRequest))
    }

  override def getQueueUrl(
      getQueueUrlRequest: GetQueueUrlRequest
  ): IO[GetQueueUrlResponse] =
    IO.fromFuture {
      IO(underlying.getQueueUrl(getQueueUrlRequest))
    }

  override def listDeadLetterSourceQueues(
      listDeadLetterSourceQueuesRequest: ListDeadLetterSourceQueuesRequest
  ): IO[ListDeadLetterSourceQueuesResponse] =
    IO.fromFuture {
      IO(underlying.listDeadLetterSourceQueues(listDeadLetterSourceQueuesRequest))
    }

  override def listQueueTags(
      listQueueTagsRequest: ListQueueTagsRequest
  ): IO[ListQueueTagsResponse] =
    IO.fromFuture {
      IO(underlying.listQueueTags(listQueueTagsRequest))
    }

  override def listQueues(
      listQueuesRequest: ListQueuesRequest
  ): IO[ListQueuesResponse] =
    IO.fromFuture {
      IO(underlying.listQueues(listQueuesRequest))
    }

  override def listQueues(
      ): IO[ListQueuesResponse] =
    IO.fromFuture {
      IO(underlying.listQueues())
    }

  override def purgeQueue(
      purgeQueueRequest: PurgeQueueRequest
  ): IO[PurgeQueueResponse] =
    IO.fromFuture {
      IO(underlying.purgeQueue(purgeQueueRequest))
    }

  override def receiveMessage(
      receiveMessageRequest: ReceiveMessageRequest
  ): IO[ReceiveMessageResponse] =
    IO.fromFuture {
      IO(underlying.receiveMessage(receiveMessageRequest))
    }

  override def removePermission(
      removePermissionRequest: RemovePermissionRequest
  ): IO[RemovePermissionResponse] =
    IO.fromFuture {
      IO(underlying.removePermission(removePermissionRequest))
    }

  override def sendMessage(
      sendMessageRequest: SendMessageRequest
  ): IO[SendMessageResponse] =
    IO.fromFuture {
      IO(underlying.sendMessage(sendMessageRequest))
    }

  override def sendMessageBatch(
      sendMessageBatchRequest: SendMessageBatchRequest
  ): IO[SendMessageBatchResponse] =
    IO.fromFuture {
      IO(underlying.sendMessageBatch(sendMessageBatchRequest))
    }

  override def setQueueAttributes(
      setQueueAttributesRequest: SetQueueAttributesRequest
  ): IO[SetQueueAttributesResponse] =
    IO.fromFuture {
      IO(underlying.setQueueAttributes(setQueueAttributesRequest))
    }

  override def tagQueue(
      tagQueueRequest: TagQueueRequest
  ): IO[TagQueueResponse] =
    IO.fromFuture {
      IO(underlying.tagQueue(tagQueueRequest))
    }

  override def untagQueue(
      untagQueueRequest: UntagQueueRequest
  ): IO[UntagQueueResponse] =
    IO.fromFuture {
      IO(underlying.untagQueue(untagQueueRequest))
    }

}
