// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.monix

import software.amazon.awssdk.services.cloudwatchlogs.model._
import com.github.j5ik2o.reactive.aws.cloudwatchlogs.{ CloudWatchLogsAsyncClient, CloudWatchLogsClient }
import monix.eval.Task
import monix.reactive.Observable

object CloudWatchLogsMonixClient {

  def apply(asyncClient: CloudWatchLogsAsyncClient): CloudWatchLogsMonixClient =
    new CloudWatchLogsMonixClient {
      override val underlying: CloudWatchLogsAsyncClient = asyncClient
    }

}

trait CloudWatchLogsMonixClient extends CloudWatchLogsClient[Task] {

  val underlying: CloudWatchLogsAsyncClient

  override def associateKmsKey(associateKmsKeyRequest: AssociateKmsKeyRequest): Task[AssociateKmsKeyResponse] =
    Task.deferFuture {
      underlying.associateKmsKey(associateKmsKeyRequest)
    }

  override def cancelExportTask(cancelExportTaskRequest: CancelExportTaskRequest): Task[CancelExportTaskResponse] =
    Task.deferFuture {
      underlying.cancelExportTask(cancelExportTaskRequest)
    }

  override def createExportTask(createExportTaskRequest: CreateExportTaskRequest): Task[CreateExportTaskResponse] =
    Task.deferFuture {
      underlying.createExportTask(createExportTaskRequest)
    }

  override def createLogGroup(createLogGroupRequest: CreateLogGroupRequest): Task[CreateLogGroupResponse] =
    Task.deferFuture {
      underlying.createLogGroup(createLogGroupRequest)
    }

  override def createLogStream(createLogStreamRequest: CreateLogStreamRequest): Task[CreateLogStreamResponse] =
    Task.deferFuture {
      underlying.createLogStream(createLogStreamRequest)
    }

  override def deleteDestination(deleteDestinationRequest: DeleteDestinationRequest): Task[DeleteDestinationResponse] =
    Task.deferFuture {
      underlying.deleteDestination(deleteDestinationRequest)
    }

  override def deleteLogGroup(deleteLogGroupRequest: DeleteLogGroupRequest): Task[DeleteLogGroupResponse] =
    Task.deferFuture {
      underlying.deleteLogGroup(deleteLogGroupRequest)
    }

  override def deleteLogStream(deleteLogStreamRequest: DeleteLogStreamRequest): Task[DeleteLogStreamResponse] =
    Task.deferFuture {
      underlying.deleteLogStream(deleteLogStreamRequest)
    }

  override def deleteMetricFilter(
      deleteMetricFilterRequest: DeleteMetricFilterRequest
  ): Task[DeleteMetricFilterResponse] =
    Task.deferFuture {
      underlying.deleteMetricFilter(deleteMetricFilterRequest)
    }

  override def deleteResourcePolicy(
      deleteResourcePolicyRequest: DeleteResourcePolicyRequest
  ): Task[DeleteResourcePolicyResponse] =
    Task.deferFuture {
      underlying.deleteResourcePolicy(deleteResourcePolicyRequest)
    }

  override def deleteRetentionPolicy(
      deleteRetentionPolicyRequest: DeleteRetentionPolicyRequest
  ): Task[DeleteRetentionPolicyResponse] =
    Task.deferFuture {
      underlying.deleteRetentionPolicy(deleteRetentionPolicyRequest)
    }

  override def deleteSubscriptionFilter(
      deleteSubscriptionFilterRequest: DeleteSubscriptionFilterRequest
  ): Task[DeleteSubscriptionFilterResponse] =
    Task.deferFuture {
      underlying.deleteSubscriptionFilter(deleteSubscriptionFilterRequest)
    }

  override def describeDestinations(
      describeDestinationsRequest: DescribeDestinationsRequest
  ): Task[DescribeDestinationsResponse] =
    Task.deferFuture {
      underlying.describeDestinations(describeDestinationsRequest)
    }

  override def describeDestinations(): Task[DescribeDestinationsResponse] =
    Task.deferFuture {
      underlying.describeDestinations()
    }

  def describeDestinationsPaginator(): Observable[DescribeDestinationsResponse] =
    Observable.fromReactivePublisher(underlying.describeDestinationsPaginator())

  def describeDestinationsPaginator(
      describeDestinationsRequest: DescribeDestinationsRequest
  ): Observable[DescribeDestinationsResponse] =
    Observable.fromReactivePublisher(underlying.describeDestinationsPaginator(describeDestinationsRequest))

  override def describeExportTasks(
      describeExportTasksRequest: DescribeExportTasksRequest
  ): Task[DescribeExportTasksResponse] =
    Task.deferFuture {
      underlying.describeExportTasks(describeExportTasksRequest)
    }

  override def describeExportTasks(): Task[DescribeExportTasksResponse] =
    Task.deferFuture {
      underlying.describeExportTasks()
    }

  override def describeLogGroups(describeLogGroupsRequest: DescribeLogGroupsRequest): Task[DescribeLogGroupsResponse] =
    Task.deferFuture {
      underlying.describeLogGroups(describeLogGroupsRequest)
    }

  override def describeLogGroups(): Task[DescribeLogGroupsResponse] =
    Task.deferFuture {
      underlying.describeLogGroups()
    }

  def describeLogGroupsPaginator(): Observable[DescribeLogGroupsResponse] =
    Observable.fromReactivePublisher(underlying.describeLogGroupsPaginator())

  def describeLogGroupsPaginator(
      describeLogGroupsRequest: DescribeLogGroupsRequest
  ): Observable[DescribeLogGroupsResponse] =
    Observable.fromReactivePublisher(underlying.describeLogGroupsPaginator(describeLogGroupsRequest))

  override def describeLogStreams(
      describeLogStreamsRequest: DescribeLogStreamsRequest
  ): Task[DescribeLogStreamsResponse] =
    Task.deferFuture {
      underlying.describeLogStreams(describeLogStreamsRequest)
    }

  def describeLogStreamsPaginator(
      describeLogStreamsRequest: DescribeLogStreamsRequest
  ): Observable[DescribeLogStreamsResponse] =
    Observable.fromReactivePublisher(underlying.describeLogStreamsPaginator(describeLogStreamsRequest))

  override def describeMetricFilters(
      describeMetricFiltersRequest: DescribeMetricFiltersRequest
  ): Task[DescribeMetricFiltersResponse] =
    Task.deferFuture {
      underlying.describeMetricFilters(describeMetricFiltersRequest)
    }

  override def describeMetricFilters(): Task[DescribeMetricFiltersResponse] =
    Task.deferFuture {
      underlying.describeMetricFilters()
    }

  def describeMetricFiltersPaginator(): Observable[DescribeMetricFiltersResponse] =
    Observable.fromReactivePublisher(underlying.describeMetricFiltersPaginator())

  def describeMetricFiltersPaginator(
      describeMetricFiltersRequest: DescribeMetricFiltersRequest
  ): Observable[DescribeMetricFiltersResponse] =
    Observable.fromReactivePublisher(underlying.describeMetricFiltersPaginator(describeMetricFiltersRequest))

  override def describeQueries(describeQueriesRequest: DescribeQueriesRequest): Task[DescribeQueriesResponse] =
    Task.deferFuture {
      underlying.describeQueries(describeQueriesRequest)
    }

  override def describeQueries(): Task[DescribeQueriesResponse] =
    Task.deferFuture {
      underlying.describeQueries()
    }

  override def describeResourcePolicies(
      describeResourcePoliciesRequest: DescribeResourcePoliciesRequest
  ): Task[DescribeResourcePoliciesResponse] =
    Task.deferFuture {
      underlying.describeResourcePolicies(describeResourcePoliciesRequest)
    }

  override def describeResourcePolicies(): Task[DescribeResourcePoliciesResponse] =
    Task.deferFuture {
      underlying.describeResourcePolicies()
    }

  override def describeSubscriptionFilters(
      describeSubscriptionFiltersRequest: DescribeSubscriptionFiltersRequest
  ): Task[DescribeSubscriptionFiltersResponse] =
    Task.deferFuture {
      underlying.describeSubscriptionFilters(describeSubscriptionFiltersRequest)
    }

  def describeSubscriptionFiltersPaginator(
      describeSubscriptionFiltersRequest: DescribeSubscriptionFiltersRequest
  ): Observable[DescribeSubscriptionFiltersResponse] =
    Observable.fromReactivePublisher(
      underlying.describeSubscriptionFiltersPaginator(describeSubscriptionFiltersRequest)
    )

  override def disassociateKmsKey(
      disassociateKmsKeyRequest: DisassociateKmsKeyRequest
  ): Task[DisassociateKmsKeyResponse] =
    Task.deferFuture {
      underlying.disassociateKmsKey(disassociateKmsKeyRequest)
    }

  override def filterLogEvents(filterLogEventsRequest: FilterLogEventsRequest): Task[FilterLogEventsResponse] =
    Task.deferFuture {
      underlying.filterLogEvents(filterLogEventsRequest)
    }

  def filterLogEventsPaginator(filterLogEventsRequest: FilterLogEventsRequest): Observable[FilterLogEventsResponse] =
    Observable.fromReactivePublisher(underlying.filterLogEventsPaginator(filterLogEventsRequest))

  override def getLogEvents(getLogEventsRequest: GetLogEventsRequest): Task[GetLogEventsResponse] =
    Task.deferFuture {
      underlying.getLogEvents(getLogEventsRequest)
    }

  def getLogEventsPaginator(getLogEventsRequest: GetLogEventsRequest): Observable[GetLogEventsResponse] =
    Observable.fromReactivePublisher(underlying.getLogEventsPaginator(getLogEventsRequest))

  override def getLogGroupFields(getLogGroupFieldsRequest: GetLogGroupFieldsRequest): Task[GetLogGroupFieldsResponse] =
    Task.deferFuture {
      underlying.getLogGroupFields(getLogGroupFieldsRequest)
    }

  override def getLogRecord(getLogRecordRequest: GetLogRecordRequest): Task[GetLogRecordResponse] =
    Task.deferFuture {
      underlying.getLogRecord(getLogRecordRequest)
    }

  override def getQueryResults(getQueryResultsRequest: GetQueryResultsRequest): Task[GetQueryResultsResponse] =
    Task.deferFuture {
      underlying.getQueryResults(getQueryResultsRequest)
    }

  override def listTagsLogGroup(listTagsLogGroupRequest: ListTagsLogGroupRequest): Task[ListTagsLogGroupResponse] =
    Task.deferFuture {
      underlying.listTagsLogGroup(listTagsLogGroupRequest)
    }

  override def putDestination(putDestinationRequest: PutDestinationRequest): Task[PutDestinationResponse] =
    Task.deferFuture {
      underlying.putDestination(putDestinationRequest)
    }

  override def putDestinationPolicy(
      putDestinationPolicyRequest: PutDestinationPolicyRequest
  ): Task[PutDestinationPolicyResponse] =
    Task.deferFuture {
      underlying.putDestinationPolicy(putDestinationPolicyRequest)
    }

  override def putLogEvents(putLogEventsRequest: PutLogEventsRequest): Task[PutLogEventsResponse] =
    Task.deferFuture {
      underlying.putLogEvents(putLogEventsRequest)
    }

  override def putMetricFilter(putMetricFilterRequest: PutMetricFilterRequest): Task[PutMetricFilterResponse] =
    Task.deferFuture {
      underlying.putMetricFilter(putMetricFilterRequest)
    }

  override def putResourcePolicy(putResourcePolicyRequest: PutResourcePolicyRequest): Task[PutResourcePolicyResponse] =
    Task.deferFuture {
      underlying.putResourcePolicy(putResourcePolicyRequest)
    }

  override def putRetentionPolicy(
      putRetentionPolicyRequest: PutRetentionPolicyRequest
  ): Task[PutRetentionPolicyResponse] =
    Task.deferFuture {
      underlying.putRetentionPolicy(putRetentionPolicyRequest)
    }

  override def putSubscriptionFilter(
      putSubscriptionFilterRequest: PutSubscriptionFilterRequest
  ): Task[PutSubscriptionFilterResponse] =
    Task.deferFuture {
      underlying.putSubscriptionFilter(putSubscriptionFilterRequest)
    }

  override def startQuery(startQueryRequest: StartQueryRequest): Task[StartQueryResponse] =
    Task.deferFuture {
      underlying.startQuery(startQueryRequest)
    }

  override def stopQuery(stopQueryRequest: StopQueryRequest): Task[StopQueryResponse] =
    Task.deferFuture {
      underlying.stopQuery(stopQueryRequest)
    }

  override def tagLogGroup(tagLogGroupRequest: TagLogGroupRequest): Task[TagLogGroupResponse] =
    Task.deferFuture {
      underlying.tagLogGroup(tagLogGroupRequest)
    }

  override def testMetricFilter(testMetricFilterRequest: TestMetricFilterRequest): Task[TestMetricFilterResponse] =
    Task.deferFuture {
      underlying.testMetricFilter(testMetricFilterRequest)
    }

  override def untagLogGroup(untagLogGroupRequest: UntagLogGroupRequest): Task[UntagLogGroupResponse] =
    Task.deferFuture {
      underlying.untagLogGroup(untagLogGroupRequest)
    }

}
