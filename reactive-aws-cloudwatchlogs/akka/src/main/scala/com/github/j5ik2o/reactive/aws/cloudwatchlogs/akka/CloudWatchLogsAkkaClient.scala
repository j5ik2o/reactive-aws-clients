// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.cloudwatchlogs.CloudWatchLogsAsyncClient
import software.amazon.awssdk.services.cloudwatchlogs.model._

object CloudWatchLogsAkkaClient {

  def apply(asyncClient: CloudWatchLogsAsyncClient): CloudWatchLogsAkkaClient = new CloudWatchLogsAkkaClient {
    override val underlying: CloudWatchLogsAsyncClient = asyncClient
  }

  val DefaultParallelism: Int = 1

}

trait CloudWatchLogsAkkaClient {

  import CloudWatchLogsAkkaClient._

  val underlying: CloudWatchLogsAsyncClient

  def associateKmsKeySource(associateKmsKeyRequest: AssociateKmsKeyRequest,
                            parallelism: Int = DefaultParallelism): Source[AssociateKmsKeyResponse, NotUsed] =
    Source.single(associateKmsKeyRequest).via(associateKmsKeyFlow(parallelism))

  def associateKmsKeyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AssociateKmsKeyRequest, AssociateKmsKeyResponse, NotUsed] =
    Flow[AssociateKmsKeyRequest].mapAsync(parallelism) { associateKmsKeyRequest =>
      underlying.associateKmsKey(associateKmsKeyRequest)
    }

  def cancelExportTaskSource(cancelExportTaskRequest: CancelExportTaskRequest,
                             parallelism: Int = DefaultParallelism): Source[CancelExportTaskResponse, NotUsed] =
    Source.single(cancelExportTaskRequest).via(cancelExportTaskFlow(parallelism))

  def cancelExportTaskFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CancelExportTaskRequest, CancelExportTaskResponse, NotUsed] =
    Flow[CancelExportTaskRequest].mapAsync(parallelism) { cancelExportTaskRequest =>
      underlying.cancelExportTask(cancelExportTaskRequest)
    }

  def createExportTaskSource(createExportTaskRequest: CreateExportTaskRequest,
                             parallelism: Int = DefaultParallelism): Source[CreateExportTaskResponse, NotUsed] =
    Source.single(createExportTaskRequest).via(createExportTaskFlow(parallelism))

  def createExportTaskFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateExportTaskRequest, CreateExportTaskResponse, NotUsed] =
    Flow[CreateExportTaskRequest].mapAsync(parallelism) { createExportTaskRequest =>
      underlying.createExportTask(createExportTaskRequest)
    }

  def createLogGroupSource(createLogGroupRequest: CreateLogGroupRequest,
                           parallelism: Int = DefaultParallelism): Source[CreateLogGroupResponse, NotUsed] =
    Source.single(createLogGroupRequest).via(createLogGroupFlow(parallelism))

  def createLogGroupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateLogGroupRequest, CreateLogGroupResponse, NotUsed] =
    Flow[CreateLogGroupRequest].mapAsync(parallelism) { createLogGroupRequest =>
      underlying.createLogGroup(createLogGroupRequest)
    }

  def createLogStreamSource(createLogStreamRequest: CreateLogStreamRequest,
                            parallelism: Int = DefaultParallelism): Source[CreateLogStreamResponse, NotUsed] =
    Source.single(createLogStreamRequest).via(createLogStreamFlow(parallelism))

  def createLogStreamFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateLogStreamRequest, CreateLogStreamResponse, NotUsed] =
    Flow[CreateLogStreamRequest].mapAsync(parallelism) { createLogStreamRequest =>
      underlying.createLogStream(createLogStreamRequest)
    }

  def deleteDestinationSource(deleteDestinationRequest: DeleteDestinationRequest,
                              parallelism: Int = DefaultParallelism): Source[DeleteDestinationResponse, NotUsed] =
    Source.single(deleteDestinationRequest).via(deleteDestinationFlow(parallelism))

  def deleteDestinationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteDestinationRequest, DeleteDestinationResponse, NotUsed] =
    Flow[DeleteDestinationRequest].mapAsync(parallelism) { deleteDestinationRequest =>
      underlying.deleteDestination(deleteDestinationRequest)
    }

  def deleteLogGroupSource(deleteLogGroupRequest: DeleteLogGroupRequest,
                           parallelism: Int = DefaultParallelism): Source[DeleteLogGroupResponse, NotUsed] =
    Source.single(deleteLogGroupRequest).via(deleteLogGroupFlow(parallelism))

  def deleteLogGroupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteLogGroupRequest, DeleteLogGroupResponse, NotUsed] =
    Flow[DeleteLogGroupRequest].mapAsync(parallelism) { deleteLogGroupRequest =>
      underlying.deleteLogGroup(deleteLogGroupRequest)
    }

  def deleteLogStreamSource(deleteLogStreamRequest: DeleteLogStreamRequest,
                            parallelism: Int = DefaultParallelism): Source[DeleteLogStreamResponse, NotUsed] =
    Source.single(deleteLogStreamRequest).via(deleteLogStreamFlow(parallelism))

  def deleteLogStreamFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteLogStreamRequest, DeleteLogStreamResponse, NotUsed] =
    Flow[DeleteLogStreamRequest].mapAsync(parallelism) { deleteLogStreamRequest =>
      underlying.deleteLogStream(deleteLogStreamRequest)
    }

  def deleteMetricFilterSource(deleteMetricFilterRequest: DeleteMetricFilterRequest,
                               parallelism: Int = DefaultParallelism): Source[DeleteMetricFilterResponse, NotUsed] =
    Source.single(deleteMetricFilterRequest).via(deleteMetricFilterFlow(parallelism))

  def deleteMetricFilterFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteMetricFilterRequest, DeleteMetricFilterResponse, NotUsed] =
    Flow[DeleteMetricFilterRequest].mapAsync(parallelism) { deleteMetricFilterRequest =>
      underlying.deleteMetricFilter(deleteMetricFilterRequest)
    }

  def deleteResourcePolicySource(deleteResourcePolicyRequest: DeleteResourcePolicyRequest,
                                 parallelism: Int = DefaultParallelism): Source[DeleteResourcePolicyResponse, NotUsed] =
    Source.single(deleteResourcePolicyRequest).via(deleteResourcePolicyFlow(parallelism))

  def deleteResourcePolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteResourcePolicyRequest, DeleteResourcePolicyResponse, NotUsed] =
    Flow[DeleteResourcePolicyRequest].mapAsync(parallelism) { deleteResourcePolicyRequest =>
      underlying.deleteResourcePolicy(deleteResourcePolicyRequest)
    }

  def deleteRetentionPolicySource(
      deleteRetentionPolicyRequest: DeleteRetentionPolicyRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteRetentionPolicyResponse, NotUsed] =
    Source.single(deleteRetentionPolicyRequest).via(deleteRetentionPolicyFlow(parallelism))

  def deleteRetentionPolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteRetentionPolicyRequest, DeleteRetentionPolicyResponse, NotUsed] =
    Flow[DeleteRetentionPolicyRequest].mapAsync(parallelism) { deleteRetentionPolicyRequest =>
      underlying.deleteRetentionPolicy(deleteRetentionPolicyRequest)
    }

  def deleteSubscriptionFilterSource(
      deleteSubscriptionFilterRequest: DeleteSubscriptionFilterRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteSubscriptionFilterResponse, NotUsed] =
    Source.single(deleteSubscriptionFilterRequest).via(deleteSubscriptionFilterFlow(parallelism))

  def deleteSubscriptionFilterFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteSubscriptionFilterRequest, DeleteSubscriptionFilterResponse, NotUsed] =
    Flow[DeleteSubscriptionFilterRequest].mapAsync(parallelism) { deleteSubscriptionFilterRequest =>
      underlying.deleteSubscriptionFilter(deleteSubscriptionFilterRequest)
    }

  def describeDestinationsSource(describeDestinationsRequest: DescribeDestinationsRequest,
                                 parallelism: Int = DefaultParallelism): Source[DescribeDestinationsResponse, NotUsed] =
    Source.single(describeDestinationsRequest).via(describeDestinationsFlow(parallelism))

  def describeDestinationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeDestinationsRequest, DescribeDestinationsResponse, NotUsed] =
    Flow[DescribeDestinationsRequest].mapAsync(parallelism) { describeDestinationsRequest =>
      underlying.describeDestinations(describeDestinationsRequest)
    }

  def describeDestinationsSource(): Source[DescribeDestinationsResponse, NotUsed] =
    Source.fromFuture(underlying.describeDestinations())

  def describeDestinationsPaginatorSource: Source[DescribeDestinationsResponse, NotUsed] =
    Source.fromPublisher(underlying.describeDestinationsPaginator())

  def describeDestinationsPaginatorFlow: Flow[DescribeDestinationsRequest, DescribeDestinationsResponse, NotUsed] =
    Flow[DescribeDestinationsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeDestinationsPaginator(request))
    }

  def describeExportTasksSource(describeExportTasksRequest: DescribeExportTasksRequest,
                                parallelism: Int = DefaultParallelism): Source[DescribeExportTasksResponse, NotUsed] =
    Source.single(describeExportTasksRequest).via(describeExportTasksFlow(parallelism))

  def describeExportTasksFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeExportTasksRequest, DescribeExportTasksResponse, NotUsed] =
    Flow[DescribeExportTasksRequest].mapAsync(parallelism) { describeExportTasksRequest =>
      underlying.describeExportTasks(describeExportTasksRequest)
    }

  def describeExportTasksSource(): Source[DescribeExportTasksResponse, NotUsed] =
    Source.fromFuture(underlying.describeExportTasks())

  def describeLogGroupsSource(describeLogGroupsRequest: DescribeLogGroupsRequest,
                              parallelism: Int = DefaultParallelism): Source[DescribeLogGroupsResponse, NotUsed] =
    Source.single(describeLogGroupsRequest).via(describeLogGroupsFlow(parallelism))

  def describeLogGroupsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeLogGroupsRequest, DescribeLogGroupsResponse, NotUsed] =
    Flow[DescribeLogGroupsRequest].mapAsync(parallelism) { describeLogGroupsRequest =>
      underlying.describeLogGroups(describeLogGroupsRequest)
    }

  def describeLogGroupsSource(): Source[DescribeLogGroupsResponse, NotUsed] =
    Source.fromFuture(underlying.describeLogGroups())

  def describeLogGroupsPaginatorSource: Source[DescribeLogGroupsResponse, NotUsed] =
    Source.fromPublisher(underlying.describeLogGroupsPaginator())

  def describeLogGroupsPaginatorFlow: Flow[DescribeLogGroupsRequest, DescribeLogGroupsResponse, NotUsed] =
    Flow[DescribeLogGroupsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeLogGroupsPaginator(request))
    }

  def describeLogStreamsSource(describeLogStreamsRequest: DescribeLogStreamsRequest,
                               parallelism: Int = DefaultParallelism): Source[DescribeLogStreamsResponse, NotUsed] =
    Source.single(describeLogStreamsRequest).via(describeLogStreamsFlow(parallelism))

  def describeLogStreamsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeLogStreamsRequest, DescribeLogStreamsResponse, NotUsed] =
    Flow[DescribeLogStreamsRequest].mapAsync(parallelism) { describeLogStreamsRequest =>
      underlying.describeLogStreams(describeLogStreamsRequest)
    }

  def describeLogStreamsPaginatorFlow: Flow[DescribeLogStreamsRequest, DescribeLogStreamsResponse, NotUsed] =
    Flow[DescribeLogStreamsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeLogStreamsPaginator(request))
    }

  def describeMetricFiltersSource(
      describeMetricFiltersRequest: DescribeMetricFiltersRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeMetricFiltersResponse, NotUsed] =
    Source.single(describeMetricFiltersRequest).via(describeMetricFiltersFlow(parallelism))

  def describeMetricFiltersFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeMetricFiltersRequest, DescribeMetricFiltersResponse, NotUsed] =
    Flow[DescribeMetricFiltersRequest].mapAsync(parallelism) { describeMetricFiltersRequest =>
      underlying.describeMetricFilters(describeMetricFiltersRequest)
    }

  def describeMetricFiltersSource(): Source[DescribeMetricFiltersResponse, NotUsed] =
    Source.fromFuture(underlying.describeMetricFilters())

  def describeMetricFiltersPaginatorSource: Source[DescribeMetricFiltersResponse, NotUsed] =
    Source.fromPublisher(underlying.describeMetricFiltersPaginator())

  def describeMetricFiltersPaginatorFlow: Flow[DescribeMetricFiltersRequest, DescribeMetricFiltersResponse, NotUsed] =
    Flow[DescribeMetricFiltersRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeMetricFiltersPaginator(request))
    }

  def describeQueriesSource(describeQueriesRequest: DescribeQueriesRequest,
                            parallelism: Int = DefaultParallelism): Source[DescribeQueriesResponse, NotUsed] =
    Source.single(describeQueriesRequest).via(describeQueriesFlow(parallelism))

  def describeQueriesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeQueriesRequest, DescribeQueriesResponse, NotUsed] =
    Flow[DescribeQueriesRequest].mapAsync(parallelism) { describeQueriesRequest =>
      underlying.describeQueries(describeQueriesRequest)
    }

  def describeQueriesSource(): Source[DescribeQueriesResponse, NotUsed] =
    Source.fromFuture(underlying.describeQueries())

  def describeResourcePoliciesSource(
      describeResourcePoliciesRequest: DescribeResourcePoliciesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeResourcePoliciesResponse, NotUsed] =
    Source.single(describeResourcePoliciesRequest).via(describeResourcePoliciesFlow(parallelism))

  def describeResourcePoliciesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeResourcePoliciesRequest, DescribeResourcePoliciesResponse, NotUsed] =
    Flow[DescribeResourcePoliciesRequest].mapAsync(parallelism) { describeResourcePoliciesRequest =>
      underlying.describeResourcePolicies(describeResourcePoliciesRequest)
    }

  def describeResourcePoliciesSource(): Source[DescribeResourcePoliciesResponse, NotUsed] =
    Source.fromFuture(underlying.describeResourcePolicies())

  def describeSubscriptionFiltersSource(
      describeSubscriptionFiltersRequest: DescribeSubscriptionFiltersRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeSubscriptionFiltersResponse, NotUsed] =
    Source.single(describeSubscriptionFiltersRequest).via(describeSubscriptionFiltersFlow(parallelism))

  def describeSubscriptionFiltersFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeSubscriptionFiltersRequest, DescribeSubscriptionFiltersResponse, NotUsed] =
    Flow[DescribeSubscriptionFiltersRequest].mapAsync(parallelism) { describeSubscriptionFiltersRequest =>
      underlying.describeSubscriptionFilters(describeSubscriptionFiltersRequest)
    }

  def describeSubscriptionFiltersPaginatorFlow
    : Flow[DescribeSubscriptionFiltersRequest, DescribeSubscriptionFiltersResponse, NotUsed] =
    Flow[DescribeSubscriptionFiltersRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeSubscriptionFiltersPaginator(request))
    }

  def disassociateKmsKeySource(disassociateKmsKeyRequest: DisassociateKmsKeyRequest,
                               parallelism: Int = DefaultParallelism): Source[DisassociateKmsKeyResponse, NotUsed] =
    Source.single(disassociateKmsKeyRequest).via(disassociateKmsKeyFlow(parallelism))

  def disassociateKmsKeyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DisassociateKmsKeyRequest, DisassociateKmsKeyResponse, NotUsed] =
    Flow[DisassociateKmsKeyRequest].mapAsync(parallelism) { disassociateKmsKeyRequest =>
      underlying.disassociateKmsKey(disassociateKmsKeyRequest)
    }

  def filterLogEventsSource(filterLogEventsRequest: FilterLogEventsRequest,
                            parallelism: Int = DefaultParallelism): Source[FilterLogEventsResponse, NotUsed] =
    Source.single(filterLogEventsRequest).via(filterLogEventsFlow(parallelism))

  def filterLogEventsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[FilterLogEventsRequest, FilterLogEventsResponse, NotUsed] =
    Flow[FilterLogEventsRequest].mapAsync(parallelism) { filterLogEventsRequest =>
      underlying.filterLogEvents(filterLogEventsRequest)
    }

  def filterLogEventsPaginatorFlow: Flow[FilterLogEventsRequest, FilterLogEventsResponse, NotUsed] =
    Flow[FilterLogEventsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.filterLogEventsPaginator(request))
    }

  def getLogEventsSource(getLogEventsRequest: GetLogEventsRequest,
                         parallelism: Int = DefaultParallelism): Source[GetLogEventsResponse, NotUsed] =
    Source.single(getLogEventsRequest).via(getLogEventsFlow(parallelism))

  def getLogEventsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetLogEventsRequest, GetLogEventsResponse, NotUsed] =
    Flow[GetLogEventsRequest].mapAsync(parallelism) { getLogEventsRequest =>
      underlying.getLogEvents(getLogEventsRequest)
    }

  def getLogEventsPaginatorFlow: Flow[GetLogEventsRequest, GetLogEventsResponse, NotUsed] =
    Flow[GetLogEventsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.getLogEventsPaginator(request))
    }

  def getLogGroupFieldsSource(getLogGroupFieldsRequest: GetLogGroupFieldsRequest,
                              parallelism: Int = DefaultParallelism): Source[GetLogGroupFieldsResponse, NotUsed] =
    Source.single(getLogGroupFieldsRequest).via(getLogGroupFieldsFlow(parallelism))

  def getLogGroupFieldsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetLogGroupFieldsRequest, GetLogGroupFieldsResponse, NotUsed] =
    Flow[GetLogGroupFieldsRequest].mapAsync(parallelism) { getLogGroupFieldsRequest =>
      underlying.getLogGroupFields(getLogGroupFieldsRequest)
    }

  def getLogRecordSource(getLogRecordRequest: GetLogRecordRequest,
                         parallelism: Int = DefaultParallelism): Source[GetLogRecordResponse, NotUsed] =
    Source.single(getLogRecordRequest).via(getLogRecordFlow(parallelism))

  def getLogRecordFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetLogRecordRequest, GetLogRecordResponse, NotUsed] =
    Flow[GetLogRecordRequest].mapAsync(parallelism) { getLogRecordRequest =>
      underlying.getLogRecord(getLogRecordRequest)
    }

  def getQueryResultsSource(getQueryResultsRequest: GetQueryResultsRequest,
                            parallelism: Int = DefaultParallelism): Source[GetQueryResultsResponse, NotUsed] =
    Source.single(getQueryResultsRequest).via(getQueryResultsFlow(parallelism))

  def getQueryResultsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetQueryResultsRequest, GetQueryResultsResponse, NotUsed] =
    Flow[GetQueryResultsRequest].mapAsync(parallelism) { getQueryResultsRequest =>
      underlying.getQueryResults(getQueryResultsRequest)
    }

  def listTagsLogGroupSource(listTagsLogGroupRequest: ListTagsLogGroupRequest,
                             parallelism: Int = DefaultParallelism): Source[ListTagsLogGroupResponse, NotUsed] =
    Source.single(listTagsLogGroupRequest).via(listTagsLogGroupFlow(parallelism))

  def listTagsLogGroupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListTagsLogGroupRequest, ListTagsLogGroupResponse, NotUsed] =
    Flow[ListTagsLogGroupRequest].mapAsync(parallelism) { listTagsLogGroupRequest =>
      underlying.listTagsLogGroup(listTagsLogGroupRequest)
    }

  def putDestinationSource(putDestinationRequest: PutDestinationRequest,
                           parallelism: Int = DefaultParallelism): Source[PutDestinationResponse, NotUsed] =
    Source.single(putDestinationRequest).via(putDestinationFlow(parallelism))

  def putDestinationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutDestinationRequest, PutDestinationResponse, NotUsed] =
    Flow[PutDestinationRequest].mapAsync(parallelism) { putDestinationRequest =>
      underlying.putDestination(putDestinationRequest)
    }

  def putDestinationPolicySource(putDestinationPolicyRequest: PutDestinationPolicyRequest,
                                 parallelism: Int = DefaultParallelism): Source[PutDestinationPolicyResponse, NotUsed] =
    Source.single(putDestinationPolicyRequest).via(putDestinationPolicyFlow(parallelism))

  def putDestinationPolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutDestinationPolicyRequest, PutDestinationPolicyResponse, NotUsed] =
    Flow[PutDestinationPolicyRequest].mapAsync(parallelism) { putDestinationPolicyRequest =>
      underlying.putDestinationPolicy(putDestinationPolicyRequest)
    }

  def putLogEventsSource(putLogEventsRequest: PutLogEventsRequest,
                         parallelism: Int = DefaultParallelism): Source[PutLogEventsResponse, NotUsed] =
    Source.single(putLogEventsRequest).via(putLogEventsFlow(parallelism))

  def putLogEventsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutLogEventsRequest, PutLogEventsResponse, NotUsed] =
    Flow[PutLogEventsRequest].mapAsync(parallelism) { putLogEventsRequest =>
      underlying.putLogEvents(putLogEventsRequest)
    }

  def putMetricFilterSource(putMetricFilterRequest: PutMetricFilterRequest,
                            parallelism: Int = DefaultParallelism): Source[PutMetricFilterResponse, NotUsed] =
    Source.single(putMetricFilterRequest).via(putMetricFilterFlow(parallelism))

  def putMetricFilterFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutMetricFilterRequest, PutMetricFilterResponse, NotUsed] =
    Flow[PutMetricFilterRequest].mapAsync(parallelism) { putMetricFilterRequest =>
      underlying.putMetricFilter(putMetricFilterRequest)
    }

  def putResourcePolicySource(putResourcePolicyRequest: PutResourcePolicyRequest,
                              parallelism: Int = DefaultParallelism): Source[PutResourcePolicyResponse, NotUsed] =
    Source.single(putResourcePolicyRequest).via(putResourcePolicyFlow(parallelism))

  def putResourcePolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutResourcePolicyRequest, PutResourcePolicyResponse, NotUsed] =
    Flow[PutResourcePolicyRequest].mapAsync(parallelism) { putResourcePolicyRequest =>
      underlying.putResourcePolicy(putResourcePolicyRequest)
    }

  def putRetentionPolicySource(putRetentionPolicyRequest: PutRetentionPolicyRequest,
                               parallelism: Int = DefaultParallelism): Source[PutRetentionPolicyResponse, NotUsed] =
    Source.single(putRetentionPolicyRequest).via(putRetentionPolicyFlow(parallelism))

  def putRetentionPolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutRetentionPolicyRequest, PutRetentionPolicyResponse, NotUsed] =
    Flow[PutRetentionPolicyRequest].mapAsync(parallelism) { putRetentionPolicyRequest =>
      underlying.putRetentionPolicy(putRetentionPolicyRequest)
    }

  def putSubscriptionFilterSource(
      putSubscriptionFilterRequest: PutSubscriptionFilterRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutSubscriptionFilterResponse, NotUsed] =
    Source.single(putSubscriptionFilterRequest).via(putSubscriptionFilterFlow(parallelism))

  def putSubscriptionFilterFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutSubscriptionFilterRequest, PutSubscriptionFilterResponse, NotUsed] =
    Flow[PutSubscriptionFilterRequest].mapAsync(parallelism) { putSubscriptionFilterRequest =>
      underlying.putSubscriptionFilter(putSubscriptionFilterRequest)
    }

  def startQuerySource(startQueryRequest: StartQueryRequest,
                       parallelism: Int = DefaultParallelism): Source[StartQueryResponse, NotUsed] =
    Source.single(startQueryRequest).via(startQueryFlow(parallelism))

  def startQueryFlow(parallelism: Int = DefaultParallelism): Flow[StartQueryRequest, StartQueryResponse, NotUsed] =
    Flow[StartQueryRequest].mapAsync(parallelism) { startQueryRequest =>
      underlying.startQuery(startQueryRequest)
    }

  def stopQuerySource(stopQueryRequest: StopQueryRequest,
                      parallelism: Int = DefaultParallelism): Source[StopQueryResponse, NotUsed] =
    Source.single(stopQueryRequest).via(stopQueryFlow(parallelism))

  def stopQueryFlow(parallelism: Int = DefaultParallelism): Flow[StopQueryRequest, StopQueryResponse, NotUsed] =
    Flow[StopQueryRequest].mapAsync(parallelism) { stopQueryRequest =>
      underlying.stopQuery(stopQueryRequest)
    }

  def tagLogGroupSource(tagLogGroupRequest: TagLogGroupRequest,
                        parallelism: Int = DefaultParallelism): Source[TagLogGroupResponse, NotUsed] =
    Source.single(tagLogGroupRequest).via(tagLogGroupFlow(parallelism))

  def tagLogGroupFlow(parallelism: Int = DefaultParallelism): Flow[TagLogGroupRequest, TagLogGroupResponse, NotUsed] =
    Flow[TagLogGroupRequest].mapAsync(parallelism) { tagLogGroupRequest =>
      underlying.tagLogGroup(tagLogGroupRequest)
    }

  def testMetricFilterSource(testMetricFilterRequest: TestMetricFilterRequest,
                             parallelism: Int = DefaultParallelism): Source[TestMetricFilterResponse, NotUsed] =
    Source.single(testMetricFilterRequest).via(testMetricFilterFlow(parallelism))

  def testMetricFilterFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[TestMetricFilterRequest, TestMetricFilterResponse, NotUsed] =
    Flow[TestMetricFilterRequest].mapAsync(parallelism) { testMetricFilterRequest =>
      underlying.testMetricFilter(testMetricFilterRequest)
    }

  def untagLogGroupSource(untagLogGroupRequest: UntagLogGroupRequest,
                          parallelism: Int = DefaultParallelism): Source[UntagLogGroupResponse, NotUsed] =
    Source.single(untagLogGroupRequest).via(untagLogGroupFlow(parallelism))

  def untagLogGroupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UntagLogGroupRequest, UntagLogGroupResponse, NotUsed] =
    Flow[UntagLogGroupRequest].mapAsync(parallelism) { untagLogGroupRequest =>
      underlying.untagLogGroup(untagLogGroupRequest)
    }

}
