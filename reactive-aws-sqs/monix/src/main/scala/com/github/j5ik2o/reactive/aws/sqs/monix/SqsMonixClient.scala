// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.monix

import software.amazon.awssdk.services.sqs.model._
import software.amazon.awssdk.services.sqs.paginators._
import com.github.j5ik2o.reactive.aws.sqs.{ SqsAsyncClient, SqsClient }
import monix.eval.Task
import monix.reactive.Observable

object SqsMonixClient {

  def apply(asyncClient: SqsAsyncClient): SqsMonixClient =
    new SqsMonixClient {
      override val underlying: SqsAsyncClient = asyncClient
    }

}

trait SqsMonixClient extends SqsClient[Task] {

  val underlying: SqsAsyncClient

  override def addPermission(addPermissionRequest: AddPermissionRequest): Task[AddPermissionResponse] =
    Task.deferFuture {
      underlying.addPermission(addPermissionRequest)
    }

  override def changeMessageVisibility(
      changeMessageVisibilityRequest: ChangeMessageVisibilityRequest
  ): Task[ChangeMessageVisibilityResponse] =
    Task.deferFuture {
      underlying.changeMessageVisibility(changeMessageVisibilityRequest)
    }

  override def changeMessageVisibilityBatch(
      changeMessageVisibilityBatchRequest: ChangeMessageVisibilityBatchRequest
  ): Task[ChangeMessageVisibilityBatchResponse] =
    Task.deferFuture {
      underlying.changeMessageVisibilityBatch(changeMessageVisibilityBatchRequest)
    }

  override def createQueue(createQueueRequest: CreateQueueRequest): Task[CreateQueueResponse] =
    Task.deferFuture {
      underlying.createQueue(createQueueRequest)
    }

  override def deleteMessage(deleteMessageRequest: DeleteMessageRequest): Task[DeleteMessageResponse] =
    Task.deferFuture {
      underlying.deleteMessage(deleteMessageRequest)
    }

  override def deleteMessageBatch(
      deleteMessageBatchRequest: DeleteMessageBatchRequest
  ): Task[DeleteMessageBatchResponse] =
    Task.deferFuture {
      underlying.deleteMessageBatch(deleteMessageBatchRequest)
    }

  override def deleteQueue(deleteQueueRequest: DeleteQueueRequest): Task[DeleteQueueResponse] =
    Task.deferFuture {
      underlying.deleteQueue(deleteQueueRequest)
    }

  override def getQueueAttributes(
      getQueueAttributesRequest: GetQueueAttributesRequest
  ): Task[GetQueueAttributesResponse] =
    Task.deferFuture {
      underlying.getQueueAttributes(getQueueAttributesRequest)
    }

  override def getQueueUrl(getQueueUrlRequest: GetQueueUrlRequest): Task[GetQueueUrlResponse] =
    Task.deferFuture {
      underlying.getQueueUrl(getQueueUrlRequest)
    }

  override def listDeadLetterSourceQueues(
      listDeadLetterSourceQueuesRequest: ListDeadLetterSourceQueuesRequest
  ): Task[ListDeadLetterSourceQueuesResponse] =
    Task.deferFuture {
      underlying.listDeadLetterSourceQueues(listDeadLetterSourceQueuesRequest)
    }

  def listDeadLetterSourceQueuesPaginator(
      listDeadLetterSourceQueuesRequest: ListDeadLetterSourceQueuesRequest
  ): Observable[ListDeadLetterSourceQueuesResponse] =
    Observable.fromReactivePublisher(underlying.listDeadLetterSourceQueuesPaginator(listDeadLetterSourceQueuesRequest))

  override def listQueueTags(listQueueTagsRequest: ListQueueTagsRequest): Task[ListQueueTagsResponse] =
    Task.deferFuture {
      underlying.listQueueTags(listQueueTagsRequest)
    }

  override def listQueues(listQueuesRequest: ListQueuesRequest): Task[ListQueuesResponse] =
    Task.deferFuture {
      underlying.listQueues(listQueuesRequest)
    }

  override def listQueues(): Task[ListQueuesResponse] =
    Task.deferFuture {
      underlying.listQueues()
    }

  def listQueuesPaginator(): Observable[ListQueuesResponse] =
    Observable.fromReactivePublisher(underlying.listQueuesPaginator())

  def listQueuesPaginator(listQueuesRequest: ListQueuesRequest): Observable[ListQueuesResponse] =
    Observable.fromReactivePublisher(underlying.listQueuesPaginator(listQueuesRequest))

  override def purgeQueue(purgeQueueRequest: PurgeQueueRequest): Task[PurgeQueueResponse] =
    Task.deferFuture {
      underlying.purgeQueue(purgeQueueRequest)
    }

  override def receiveMessage(receiveMessageRequest: ReceiveMessageRequest): Task[ReceiveMessageResponse] =
    Task.deferFuture {
      underlying.receiveMessage(receiveMessageRequest)
    }

  override def removePermission(removePermissionRequest: RemovePermissionRequest): Task[RemovePermissionResponse] =
    Task.deferFuture {
      underlying.removePermission(removePermissionRequest)
    }

  override def sendMessage(sendMessageRequest: SendMessageRequest): Task[SendMessageResponse] =
    Task.deferFuture {
      underlying.sendMessage(sendMessageRequest)
    }

  override def sendMessageBatch(sendMessageBatchRequest: SendMessageBatchRequest): Task[SendMessageBatchResponse] =
    Task.deferFuture {
      underlying.sendMessageBatch(sendMessageBatchRequest)
    }

  override def setQueueAttributes(
      setQueueAttributesRequest: SetQueueAttributesRequest
  ): Task[SetQueueAttributesResponse] =
    Task.deferFuture {
      underlying.setQueueAttributes(setQueueAttributesRequest)
    }

  override def tagQueue(tagQueueRequest: TagQueueRequest): Task[TagQueueResponse] =
    Task.deferFuture {
      underlying.tagQueue(tagQueueRequest)
    }

  override def untagQueue(untagQueueRequest: UntagQueueRequest): Task[UntagQueueResponse] =
    Task.deferFuture {
      underlying.untagQueue(untagQueueRequest)
    }

}
