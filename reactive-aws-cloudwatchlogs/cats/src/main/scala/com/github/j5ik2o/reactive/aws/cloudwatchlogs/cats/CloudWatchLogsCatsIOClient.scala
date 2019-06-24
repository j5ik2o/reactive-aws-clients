// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.cats

import cats.effect.{ ContextShift, IO }
import com.github.j5ik2o.reactive.aws.cloudwatchlogs.{ CloudWatchLogsAsyncClient, CloudWatchLogsClient }
import software.amazon.awssdk.services.cloudwatchlogs.model._
import software.amazon.awssdk.services.cloudwatchlogs.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object CloudWatchLogsCatsIOClient {

  def apply(asyncClient: CloudWatchLogsAsyncClient)(implicit ec: ExecutionContext): CloudWatchLogsCatsIOClient =
    new CloudWatchLogsCatsIOClient {
      override val executionContext: ExecutionContext    = ec
      override val underlying: CloudWatchLogsAsyncClient = asyncClient
    }

}

trait CloudWatchLogsCatsIOClient extends CloudWatchLogsClient[IO] {

  val underlying: CloudWatchLogsAsyncClient

  def executionContext: ExecutionContext
  implicit def cs: ContextShift[IO] = IO.contextShift(executionContext)

  override def associateKmsKey(associateKmsKeyRequest: AssociateKmsKeyRequest): IO[AssociateKmsKeyResponse] =
    IO.fromFuture {
      IO(underlying.associateKmsKey(associateKmsKeyRequest))
    }

  override def cancelExportTask(cancelExportTaskRequest: CancelExportTaskRequest): IO[CancelExportTaskResponse] =
    IO.fromFuture {
      IO(underlying.cancelExportTask(cancelExportTaskRequest))
    }

  override def createExportTask(createExportTaskRequest: CreateExportTaskRequest): IO[CreateExportTaskResponse] =
    IO.fromFuture {
      IO(underlying.createExportTask(createExportTaskRequest))
    }

  override def createLogGroup(createLogGroupRequest: CreateLogGroupRequest): IO[CreateLogGroupResponse] =
    IO.fromFuture {
      IO(underlying.createLogGroup(createLogGroupRequest))
    }

  override def createLogStream(createLogStreamRequest: CreateLogStreamRequest): IO[CreateLogStreamResponse] =
    IO.fromFuture {
      IO(underlying.createLogStream(createLogStreamRequest))
    }

  override def deleteDestination(deleteDestinationRequest: DeleteDestinationRequest): IO[DeleteDestinationResponse] =
    IO.fromFuture {
      IO(underlying.deleteDestination(deleteDestinationRequest))
    }

  override def deleteLogGroup(deleteLogGroupRequest: DeleteLogGroupRequest): IO[DeleteLogGroupResponse] =
    IO.fromFuture {
      IO(underlying.deleteLogGroup(deleteLogGroupRequest))
    }

  override def deleteLogStream(deleteLogStreamRequest: DeleteLogStreamRequest): IO[DeleteLogStreamResponse] =
    IO.fromFuture {
      IO(underlying.deleteLogStream(deleteLogStreamRequest))
    }

  override def deleteMetricFilter(
      deleteMetricFilterRequest: DeleteMetricFilterRequest
  ): IO[DeleteMetricFilterResponse] =
    IO.fromFuture {
      IO(underlying.deleteMetricFilter(deleteMetricFilterRequest))
    }

  override def deleteResourcePolicy(
      deleteResourcePolicyRequest: DeleteResourcePolicyRequest
  ): IO[DeleteResourcePolicyResponse] =
    IO.fromFuture {
      IO(underlying.deleteResourcePolicy(deleteResourcePolicyRequest))
    }

  override def deleteRetentionPolicy(
      deleteRetentionPolicyRequest: DeleteRetentionPolicyRequest
  ): IO[DeleteRetentionPolicyResponse] =
    IO.fromFuture {
      IO(underlying.deleteRetentionPolicy(deleteRetentionPolicyRequest))
    }

  override def deleteSubscriptionFilter(
      deleteSubscriptionFilterRequest: DeleteSubscriptionFilterRequest
  ): IO[DeleteSubscriptionFilterResponse] =
    IO.fromFuture {
      IO(underlying.deleteSubscriptionFilter(deleteSubscriptionFilterRequest))
    }

  override def describeDestinations(
      describeDestinationsRequest: DescribeDestinationsRequest
  ): IO[DescribeDestinationsResponse] =
    IO.fromFuture {
      IO(underlying.describeDestinations(describeDestinationsRequest))
    }

  override def describeDestinations(): IO[DescribeDestinationsResponse] =
    IO.fromFuture {
      IO(underlying.describeDestinations())
    }

  def describeDestinationsPaginator(): DescribeDestinationsPublisher =
    underlying.describeDestinationsPaginator()

  def describeDestinationsPaginator(
      describeDestinationsRequest: DescribeDestinationsRequest
  ): DescribeDestinationsPublisher =
    underlying.describeDestinationsPaginator(describeDestinationsRequest)

  override def describeExportTasks(
      describeExportTasksRequest: DescribeExportTasksRequest
  ): IO[DescribeExportTasksResponse] =
    IO.fromFuture {
      IO(underlying.describeExportTasks(describeExportTasksRequest))
    }

  override def describeExportTasks(): IO[DescribeExportTasksResponse] =
    IO.fromFuture {
      IO(underlying.describeExportTasks())
    }

  override def describeLogGroups(describeLogGroupsRequest: DescribeLogGroupsRequest): IO[DescribeLogGroupsResponse] =
    IO.fromFuture {
      IO(underlying.describeLogGroups(describeLogGroupsRequest))
    }

  override def describeLogGroups(): IO[DescribeLogGroupsResponse] =
    IO.fromFuture {
      IO(underlying.describeLogGroups())
    }

  def describeLogGroupsPaginator(): DescribeLogGroupsPublisher =
    underlying.describeLogGroupsPaginator()

  def describeLogGroupsPaginator(describeLogGroupsRequest: DescribeLogGroupsRequest): DescribeLogGroupsPublisher =
    underlying.describeLogGroupsPaginator(describeLogGroupsRequest)

  override def describeLogStreams(
      describeLogStreamsRequest: DescribeLogStreamsRequest
  ): IO[DescribeLogStreamsResponse] =
    IO.fromFuture {
      IO(underlying.describeLogStreams(describeLogStreamsRequest))
    }

  def describeLogStreamsPaginator(describeLogStreamsRequest: DescribeLogStreamsRequest): DescribeLogStreamsPublisher =
    underlying.describeLogStreamsPaginator(describeLogStreamsRequest)

  override def describeMetricFilters(
      describeMetricFiltersRequest: DescribeMetricFiltersRequest
  ): IO[DescribeMetricFiltersResponse] =
    IO.fromFuture {
      IO(underlying.describeMetricFilters(describeMetricFiltersRequest))
    }

  override def describeMetricFilters(): IO[DescribeMetricFiltersResponse] =
    IO.fromFuture {
      IO(underlying.describeMetricFilters())
    }

  def describeMetricFiltersPaginator(): DescribeMetricFiltersPublisher =
    underlying.describeMetricFiltersPaginator()

  def describeMetricFiltersPaginator(
      describeMetricFiltersRequest: DescribeMetricFiltersRequest
  ): DescribeMetricFiltersPublisher =
    underlying.describeMetricFiltersPaginator(describeMetricFiltersRequest)

  override def describeQueries(describeQueriesRequest: DescribeQueriesRequest): IO[DescribeQueriesResponse] =
    IO.fromFuture {
      IO(underlying.describeQueries(describeQueriesRequest))
    }

  override def describeQueries(): IO[DescribeQueriesResponse] =
    IO.fromFuture {
      IO(underlying.describeQueries())
    }

  override def describeResourcePolicies(
      describeResourcePoliciesRequest: DescribeResourcePoliciesRequest
  ): IO[DescribeResourcePoliciesResponse] =
    IO.fromFuture {
      IO(underlying.describeResourcePolicies(describeResourcePoliciesRequest))
    }

  override def describeResourcePolicies(): IO[DescribeResourcePoliciesResponse] =
    IO.fromFuture {
      IO(underlying.describeResourcePolicies())
    }

  override def describeSubscriptionFilters(
      describeSubscriptionFiltersRequest: DescribeSubscriptionFiltersRequest
  ): IO[DescribeSubscriptionFiltersResponse] =
    IO.fromFuture {
      IO(underlying.describeSubscriptionFilters(describeSubscriptionFiltersRequest))
    }

  def describeSubscriptionFiltersPaginator(
      describeSubscriptionFiltersRequest: DescribeSubscriptionFiltersRequest
  ): DescribeSubscriptionFiltersPublisher =
    underlying.describeSubscriptionFiltersPaginator(describeSubscriptionFiltersRequest)

  override def disassociateKmsKey(
      disassociateKmsKeyRequest: DisassociateKmsKeyRequest
  ): IO[DisassociateKmsKeyResponse] =
    IO.fromFuture {
      IO(underlying.disassociateKmsKey(disassociateKmsKeyRequest))
    }

  override def filterLogEvents(filterLogEventsRequest: FilterLogEventsRequest): IO[FilterLogEventsResponse] =
    IO.fromFuture {
      IO(underlying.filterLogEvents(filterLogEventsRequest))
    }

  def filterLogEventsPaginator(filterLogEventsRequest: FilterLogEventsRequest): FilterLogEventsPublisher =
    underlying.filterLogEventsPaginator(filterLogEventsRequest)

  override def getLogEvents(getLogEventsRequest: GetLogEventsRequest): IO[GetLogEventsResponse] =
    IO.fromFuture {
      IO(underlying.getLogEvents(getLogEventsRequest))
    }

  def getLogEventsPaginator(getLogEventsRequest: GetLogEventsRequest): GetLogEventsPublisher =
    underlying.getLogEventsPaginator(getLogEventsRequest)

  override def getLogGroupFields(getLogGroupFieldsRequest: GetLogGroupFieldsRequest): IO[GetLogGroupFieldsResponse] =
    IO.fromFuture {
      IO(underlying.getLogGroupFields(getLogGroupFieldsRequest))
    }

  override def getLogRecord(getLogRecordRequest: GetLogRecordRequest): IO[GetLogRecordResponse] =
    IO.fromFuture {
      IO(underlying.getLogRecord(getLogRecordRequest))
    }

  override def getQueryResults(getQueryResultsRequest: GetQueryResultsRequest): IO[GetQueryResultsResponse] =
    IO.fromFuture {
      IO(underlying.getQueryResults(getQueryResultsRequest))
    }

  override def listTagsLogGroup(listTagsLogGroupRequest: ListTagsLogGroupRequest): IO[ListTagsLogGroupResponse] =
    IO.fromFuture {
      IO(underlying.listTagsLogGroup(listTagsLogGroupRequest))
    }

  override def putDestination(putDestinationRequest: PutDestinationRequest): IO[PutDestinationResponse] =
    IO.fromFuture {
      IO(underlying.putDestination(putDestinationRequest))
    }

  override def putDestinationPolicy(
      putDestinationPolicyRequest: PutDestinationPolicyRequest
  ): IO[PutDestinationPolicyResponse] =
    IO.fromFuture {
      IO(underlying.putDestinationPolicy(putDestinationPolicyRequest))
    }

  override def putLogEvents(putLogEventsRequest: PutLogEventsRequest): IO[PutLogEventsResponse] =
    IO.fromFuture {
      IO(underlying.putLogEvents(putLogEventsRequest))
    }

  override def putMetricFilter(putMetricFilterRequest: PutMetricFilterRequest): IO[PutMetricFilterResponse] =
    IO.fromFuture {
      IO(underlying.putMetricFilter(putMetricFilterRequest))
    }

  override def putResourcePolicy(putResourcePolicyRequest: PutResourcePolicyRequest): IO[PutResourcePolicyResponse] =
    IO.fromFuture {
      IO(underlying.putResourcePolicy(putResourcePolicyRequest))
    }

  override def putRetentionPolicy(
      putRetentionPolicyRequest: PutRetentionPolicyRequest
  ): IO[PutRetentionPolicyResponse] =
    IO.fromFuture {
      IO(underlying.putRetentionPolicy(putRetentionPolicyRequest))
    }

  override def putSubscriptionFilter(
      putSubscriptionFilterRequest: PutSubscriptionFilterRequest
  ): IO[PutSubscriptionFilterResponse] =
    IO.fromFuture {
      IO(underlying.putSubscriptionFilter(putSubscriptionFilterRequest))
    }

  override def startQuery(startQueryRequest: StartQueryRequest): IO[StartQueryResponse] =
    IO.fromFuture {
      IO(underlying.startQuery(startQueryRequest))
    }

  override def stopQuery(stopQueryRequest: StopQueryRequest): IO[StopQueryResponse] =
    IO.fromFuture {
      IO(underlying.stopQuery(stopQueryRequest))
    }

  override def tagLogGroup(tagLogGroupRequest: TagLogGroupRequest): IO[TagLogGroupResponse] =
    IO.fromFuture {
      IO(underlying.tagLogGroup(tagLogGroupRequest))
    }

  override def testMetricFilter(testMetricFilterRequest: TestMetricFilterRequest): IO[TestMetricFilterResponse] =
    IO.fromFuture {
      IO(underlying.testMetricFilter(testMetricFilterRequest))
    }

  override def untagLogGroup(untagLogGroupRequest: UntagLogGroupRequest): IO[UntagLogGroupResponse] =
    IO.fromFuture {
      IO(underlying.untagLogGroup(untagLogGroupRequest))
    }

}
