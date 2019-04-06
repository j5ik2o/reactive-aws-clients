// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.sqs.SQSAsyncClient
import software.amazon.awssdk.services.sqs.model._

object SQSStreamClient {

  def apply(underlying: SQSAsyncClient): SQSStreamClient = new SQSStreamClientImpl(underlying)

  val DefaultParallelism: Int = 1

}

trait SQSStreamClient extends SQSStreamClientSupport {

  import SQSStreamClient._

  val underlying: SQSAsyncClient

  def addPermissionSource(addPermissionRequest: AddPermissionRequest,
                          parallelism: Int = DefaultParallelism): Source[AddPermissionResponse, NotUsed] =
    Source.single(addPermissionRequest).via(addPermissionFlow(parallelism))

  def addPermissionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AddPermissionRequest, AddPermissionResponse, NotUsed] =
    Flow[AddPermissionRequest].mapAsync(parallelism) { addPermissionRequest =>
      underlying.addPermission(addPermissionRequest)
    }

  def changeMessageVisibilitySource(
      changeMessageVisibilityRequest: ChangeMessageVisibilityRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ChangeMessageVisibilityResponse, NotUsed] =
    Source.single(changeMessageVisibilityRequest).via(changeMessageVisibilityFlow(parallelism))

  def changeMessageVisibilityFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ChangeMessageVisibilityRequest, ChangeMessageVisibilityResponse, NotUsed] =
    Flow[ChangeMessageVisibilityRequest].mapAsync(parallelism) { changeMessageVisibilityRequest =>
      underlying.changeMessageVisibility(changeMessageVisibilityRequest)
    }

  def changeMessageVisibilityBatchSource(
      changeMessageVisibilityBatchRequest: ChangeMessageVisibilityBatchRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ChangeMessageVisibilityBatchResponse, NotUsed] =
    Source.single(changeMessageVisibilityBatchRequest).via(changeMessageVisibilityBatchFlow(parallelism))

  def changeMessageVisibilityBatchFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ChangeMessageVisibilityBatchRequest, ChangeMessageVisibilityBatchResponse, NotUsed] =
    Flow[ChangeMessageVisibilityBatchRequest].mapAsync(parallelism) { changeMessageVisibilityBatchRequest =>
      underlying.changeMessageVisibilityBatch(changeMessageVisibilityBatchRequest)
    }

  def createQueueSource(createQueueRequest: CreateQueueRequest,
                        parallelism: Int = DefaultParallelism): Source[CreateQueueResponse, NotUsed] =
    Source.single(createQueueRequest).via(createQueueFlow(parallelism))

  def createQueueFlow(parallelism: Int = DefaultParallelism): Flow[CreateQueueRequest, CreateQueueResponse, NotUsed] =
    Flow[CreateQueueRequest].mapAsync(parallelism) { createQueueRequest =>
      underlying.createQueue(createQueueRequest)
    }

  def deleteMessageSource(deleteMessageRequest: DeleteMessageRequest,
                          parallelism: Int = DefaultParallelism): Source[DeleteMessageResponse, NotUsed] =
    Source.single(deleteMessageRequest).via(deleteMessageFlow(parallelism))

  def deleteMessageFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteMessageRequest, DeleteMessageResponse, NotUsed] =
    Flow[DeleteMessageRequest].mapAsync(parallelism) { deleteMessageRequest =>
      underlying.deleteMessage(deleteMessageRequest)
    }

  def deleteMessageBatchSource(deleteMessageBatchRequest: DeleteMessageBatchRequest,
                               parallelism: Int = DefaultParallelism): Source[DeleteMessageBatchResponse, NotUsed] =
    Source.single(deleteMessageBatchRequest).via(deleteMessageBatchFlow(parallelism))

  def deleteMessageBatchFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteMessageBatchRequest, DeleteMessageBatchResponse, NotUsed] =
    Flow[DeleteMessageBatchRequest].mapAsync(parallelism) { deleteMessageBatchRequest =>
      underlying.deleteMessageBatch(deleteMessageBatchRequest)
    }

  def deleteQueueSource(deleteQueueRequest: DeleteQueueRequest,
                        parallelism: Int = DefaultParallelism): Source[DeleteQueueResponse, NotUsed] =
    Source.single(deleteQueueRequest).via(deleteQueueFlow(parallelism))

  def deleteQueueFlow(parallelism: Int = DefaultParallelism): Flow[DeleteQueueRequest, DeleteQueueResponse, NotUsed] =
    Flow[DeleteQueueRequest].mapAsync(parallelism) { deleteQueueRequest =>
      underlying.deleteQueue(deleteQueueRequest)
    }

  def getQueueAttributesSource(getQueueAttributesRequest: GetQueueAttributesRequest,
                               parallelism: Int = DefaultParallelism): Source[GetQueueAttributesResponse, NotUsed] =
    Source.single(getQueueAttributesRequest).via(getQueueAttributesFlow(parallelism))

  def getQueueAttributesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetQueueAttributesRequest, GetQueueAttributesResponse, NotUsed] =
    Flow[GetQueueAttributesRequest].mapAsync(parallelism) { getQueueAttributesRequest =>
      underlying.getQueueAttributes(getQueueAttributesRequest)
    }

  def getQueueUrlSource(getQueueUrlRequest: GetQueueUrlRequest,
                        parallelism: Int = DefaultParallelism): Source[GetQueueUrlResponse, NotUsed] =
    Source.single(getQueueUrlRequest).via(getQueueUrlFlow(parallelism))

  def getQueueUrlFlow(parallelism: Int = DefaultParallelism): Flow[GetQueueUrlRequest, GetQueueUrlResponse, NotUsed] =
    Flow[GetQueueUrlRequest].mapAsync(parallelism) { getQueueUrlRequest =>
      underlying.getQueueUrl(getQueueUrlRequest)
    }

  def listDeadLetterSourceQueuesSource(
      listDeadLetterSourceQueuesRequest: ListDeadLetterSourceQueuesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListDeadLetterSourceQueuesResponse, NotUsed] =
    Source.single(listDeadLetterSourceQueuesRequest).via(listDeadLetterSourceQueuesFlow(parallelism))

  def listDeadLetterSourceQueuesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListDeadLetterSourceQueuesRequest, ListDeadLetterSourceQueuesResponse, NotUsed] =
    Flow[ListDeadLetterSourceQueuesRequest].mapAsync(parallelism) { listDeadLetterSourceQueuesRequest =>
      underlying.listDeadLetterSourceQueues(listDeadLetterSourceQueuesRequest)
    }

  def listQueueTagsSource(listQueueTagsRequest: ListQueueTagsRequest,
                          parallelism: Int = DefaultParallelism): Source[ListQueueTagsResponse, NotUsed] =
    Source.single(listQueueTagsRequest).via(listQueueTagsFlow(parallelism))

  def listQueueTagsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListQueueTagsRequest, ListQueueTagsResponse, NotUsed] =
    Flow[ListQueueTagsRequest].mapAsync(parallelism) { listQueueTagsRequest =>
      underlying.listQueueTags(listQueueTagsRequest)
    }

  def listQueuesSource(listQueuesRequest: ListQueuesRequest,
                       parallelism: Int = DefaultParallelism): Source[ListQueuesResponse, NotUsed] =
    Source.single(listQueuesRequest).via(listQueuesFlow(parallelism))

  def listQueuesFlow(parallelism: Int = DefaultParallelism): Flow[ListQueuesRequest, ListQueuesResponse, NotUsed] =
    Flow[ListQueuesRequest].mapAsync(parallelism) { listQueuesRequest =>
      underlying.listQueues(listQueuesRequest)
    }

  def listQueuesSource(): Source[ListQueuesResponse, NotUsed] =
    Source.fromFuture(underlying.listQueues())

  def purgeQueueSource(purgeQueueRequest: PurgeQueueRequest,
                       parallelism: Int = DefaultParallelism): Source[PurgeQueueResponse, NotUsed] =
    Source.single(purgeQueueRequest).via(purgeQueueFlow(parallelism))

  def purgeQueueFlow(parallelism: Int = DefaultParallelism): Flow[PurgeQueueRequest, PurgeQueueResponse, NotUsed] =
    Flow[PurgeQueueRequest].mapAsync(parallelism) { purgeQueueRequest =>
      underlying.purgeQueue(purgeQueueRequest)
    }

  def receiveMessageSource(receiveMessageRequest: ReceiveMessageRequest,
                           parallelism: Int = DefaultParallelism): Source[ReceiveMessageResponse, NotUsed] =
    Source.single(receiveMessageRequest).via(receiveMessageFlow(parallelism))

  def receiveMessageFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ReceiveMessageRequest, ReceiveMessageResponse, NotUsed] =
    Flow[ReceiveMessageRequest].mapAsync(parallelism) { receiveMessageRequest =>
      underlying.receiveMessage(receiveMessageRequest)
    }

  def removePermissionSource(removePermissionRequest: RemovePermissionRequest,
                             parallelism: Int = DefaultParallelism): Source[RemovePermissionResponse, NotUsed] =
    Source.single(removePermissionRequest).via(removePermissionFlow(parallelism))

  def removePermissionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RemovePermissionRequest, RemovePermissionResponse, NotUsed] =
    Flow[RemovePermissionRequest].mapAsync(parallelism) { removePermissionRequest =>
      underlying.removePermission(removePermissionRequest)
    }

  def sendMessageSource(sendMessageRequest: SendMessageRequest,
                        parallelism: Int = DefaultParallelism): Source[SendMessageResponse, NotUsed] =
    Source.single(sendMessageRequest).via(sendMessageFlow(parallelism))

  def sendMessageFlow(parallelism: Int = DefaultParallelism): Flow[SendMessageRequest, SendMessageResponse, NotUsed] =
    Flow[SendMessageRequest].mapAsync(parallelism) { sendMessageRequest =>
      underlying.sendMessage(sendMessageRequest)
    }

  def sendMessageBatchSource(sendMessageBatchRequest: SendMessageBatchRequest,
                             parallelism: Int = DefaultParallelism): Source[SendMessageBatchResponse, NotUsed] =
    Source.single(sendMessageBatchRequest).via(sendMessageBatchFlow(parallelism))

  def sendMessageBatchFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[SendMessageBatchRequest, SendMessageBatchResponse, NotUsed] =
    Flow[SendMessageBatchRequest].mapAsync(parallelism) { sendMessageBatchRequest =>
      underlying.sendMessageBatch(sendMessageBatchRequest)
    }

  def setQueueAttributesSource(setQueueAttributesRequest: SetQueueAttributesRequest,
                               parallelism: Int = DefaultParallelism): Source[SetQueueAttributesResponse, NotUsed] =
    Source.single(setQueueAttributesRequest).via(setQueueAttributesFlow(parallelism))

  def setQueueAttributesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[SetQueueAttributesRequest, SetQueueAttributesResponse, NotUsed] =
    Flow[SetQueueAttributesRequest].mapAsync(parallelism) { setQueueAttributesRequest =>
      underlying.setQueueAttributes(setQueueAttributesRequest)
    }

  def tagQueueSource(tagQueueRequest: TagQueueRequest,
                     parallelism: Int = DefaultParallelism): Source[TagQueueResponse, NotUsed] =
    Source.single(tagQueueRequest).via(tagQueueFlow(parallelism))

  def tagQueueFlow(parallelism: Int = DefaultParallelism): Flow[TagQueueRequest, TagQueueResponse, NotUsed] =
    Flow[TagQueueRequest].mapAsync(parallelism) { tagQueueRequest =>
      underlying.tagQueue(tagQueueRequest)
    }

  def untagQueueSource(untagQueueRequest: UntagQueueRequest,
                       parallelism: Int = DefaultParallelism): Source[UntagQueueResponse, NotUsed] =
    Source.single(untagQueueRequest).via(untagQueueFlow(parallelism))

  def untagQueueFlow(parallelism: Int = DefaultParallelism): Flow[UntagQueueRequest, UntagQueueResponse, NotUsed] =
    Flow[UntagQueueRequest].mapAsync(parallelism) { untagQueueRequest =>
      underlying.untagQueue(untagQueueRequest)
    }

}
