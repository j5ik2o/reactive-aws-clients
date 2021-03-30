// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.cloudwatchlogs.model._
import software.amazon.awssdk.services.cloudwatchlogs.paginators._
import software.amazon.awssdk.services.cloudwatchlogs.{ CloudWatchLogsClient => JavaCloudWatchLogsSyncClient }

object CloudWatchLogsSyncClient extends ToEitherSupport {

  def apply(javaClient: JavaCloudWatchLogsSyncClient): CloudWatchLogsSyncClient =
    new CloudWatchLogsSyncClient {
      override val underlying: JavaCloudWatchLogsSyncClient = javaClient
    }
}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/cloudwatchlogs/CloudWatchLogsClient.html
  */
trait CloudWatchLogsSyncClient extends CloudWatchLogsClient[Either[Throwable, ?]] {
  val underlying: JavaCloudWatchLogsSyncClient

  import CloudWatchLogsSyncClient._

  override def associateKmsKey(
      associateKmsKeyRequest: AssociateKmsKeyRequest
  ): Either[Throwable, AssociateKmsKeyResponse] =
    underlying.associateKmsKey(associateKmsKeyRequest).toEither

  override def cancelExportTask(
      cancelExportTaskRequest: CancelExportTaskRequest
  ): Either[Throwable, CancelExportTaskResponse] =
    underlying.cancelExportTask(cancelExportTaskRequest).toEither

  override def createExportTask(
      createExportTaskRequest: CreateExportTaskRequest
  ): Either[Throwable, CreateExportTaskResponse] =
    underlying.createExportTask(createExportTaskRequest).toEither

  override def createLogGroup(createLogGroupRequest: CreateLogGroupRequest): Either[Throwable, CreateLogGroupResponse] =
    underlying.createLogGroup(createLogGroupRequest).toEither

  override def createLogStream(
      createLogStreamRequest: CreateLogStreamRequest
  ): Either[Throwable, CreateLogStreamResponse] =
    underlying.createLogStream(createLogStreamRequest).toEither

  override def deleteDestination(
      deleteDestinationRequest: DeleteDestinationRequest
  ): Either[Throwable, DeleteDestinationResponse] =
    underlying.deleteDestination(deleteDestinationRequest).toEither

  override def deleteLogGroup(deleteLogGroupRequest: DeleteLogGroupRequest): Either[Throwable, DeleteLogGroupResponse] =
    underlying.deleteLogGroup(deleteLogGroupRequest).toEither

  override def deleteLogStream(
      deleteLogStreamRequest: DeleteLogStreamRequest
  ): Either[Throwable, DeleteLogStreamResponse] =
    underlying.deleteLogStream(deleteLogStreamRequest).toEither

  override def deleteMetricFilter(
      deleteMetricFilterRequest: DeleteMetricFilterRequest
  ): Either[Throwable, DeleteMetricFilterResponse] =
    underlying.deleteMetricFilter(deleteMetricFilterRequest).toEither

  override def deleteQueryDefinition(
      deleteQueryDefinitionRequest: DeleteQueryDefinitionRequest
  ): Either[Throwable, DeleteQueryDefinitionResponse] =
    underlying.deleteQueryDefinition(deleteQueryDefinitionRequest).toEither

  override def deleteResourcePolicy(
      deleteResourcePolicyRequest: DeleteResourcePolicyRequest
  ): Either[Throwable, DeleteResourcePolicyResponse] =
    underlying.deleteResourcePolicy(deleteResourcePolicyRequest).toEither

  override def deleteRetentionPolicy(
      deleteRetentionPolicyRequest: DeleteRetentionPolicyRequest
  ): Either[Throwable, DeleteRetentionPolicyResponse] =
    underlying.deleteRetentionPolicy(deleteRetentionPolicyRequest).toEither

  override def deleteSubscriptionFilter(
      deleteSubscriptionFilterRequest: DeleteSubscriptionFilterRequest
  ): Either[Throwable, DeleteSubscriptionFilterResponse] =
    underlying.deleteSubscriptionFilter(deleteSubscriptionFilterRequest).toEither

  override def describeDestinations(): Either[Throwable, DescribeDestinationsResponse] =
    underlying.describeDestinations().toEither

  override def describeDestinations(
      describeDestinationsRequest: DescribeDestinationsRequest
  ): Either[Throwable, DescribeDestinationsResponse] =
    underlying.describeDestinations(describeDestinationsRequest).toEither

  def describeDestinationsPaginator(): DescribeDestinationsIterable =
    underlying.describeDestinationsPaginator()

  def describeDestinationsPaginator(
      describeDestinationsRequest: DescribeDestinationsRequest
  ): DescribeDestinationsIterable =
    underlying.describeDestinationsPaginator(describeDestinationsRequest)

  override def describeExportTasks(): Either[Throwable, DescribeExportTasksResponse] =
    underlying.describeExportTasks().toEither

  override def describeExportTasks(
      describeExportTasksRequest: DescribeExportTasksRequest
  ): Either[Throwable, DescribeExportTasksResponse] =
    underlying.describeExportTasks(describeExportTasksRequest).toEither

  override def describeLogGroups(): Either[Throwable, DescribeLogGroupsResponse] =
    underlying.describeLogGroups().toEither

  override def describeLogGroups(
      describeLogGroupsRequest: DescribeLogGroupsRequest
  ): Either[Throwable, DescribeLogGroupsResponse] =
    underlying.describeLogGroups(describeLogGroupsRequest).toEither

  def describeLogGroupsPaginator(): DescribeLogGroupsIterable =
    underlying.describeLogGroupsPaginator()

  def describeLogGroupsPaginator(describeLogGroupsRequest: DescribeLogGroupsRequest): DescribeLogGroupsIterable =
    underlying.describeLogGroupsPaginator(describeLogGroupsRequest)

  override def describeLogStreams(
      describeLogStreamsRequest: DescribeLogStreamsRequest
  ): Either[Throwable, DescribeLogStreamsResponse] =
    underlying.describeLogStreams(describeLogStreamsRequest).toEither

  def describeLogStreamsPaginator(describeLogStreamsRequest: DescribeLogStreamsRequest): DescribeLogStreamsIterable =
    underlying.describeLogStreamsPaginator(describeLogStreamsRequest)

  override def describeMetricFilters(): Either[Throwable, DescribeMetricFiltersResponse] =
    underlying.describeMetricFilters().toEither

  override def describeMetricFilters(
      describeMetricFiltersRequest: DescribeMetricFiltersRequest
  ): Either[Throwable, DescribeMetricFiltersResponse] =
    underlying.describeMetricFilters(describeMetricFiltersRequest).toEither

  def describeMetricFiltersPaginator(): DescribeMetricFiltersIterable =
    underlying.describeMetricFiltersPaginator()

  def describeMetricFiltersPaginator(
      describeMetricFiltersRequest: DescribeMetricFiltersRequest
  ): DescribeMetricFiltersIterable =
    underlying.describeMetricFiltersPaginator(describeMetricFiltersRequest)

  override def describeQueries(): Either[Throwable, DescribeQueriesResponse] =
    underlying.describeQueries().toEither

  override def describeQueries(
      describeQueriesRequest: DescribeQueriesRequest
  ): Either[Throwable, DescribeQueriesResponse] =
    underlying.describeQueries(describeQueriesRequest).toEither

  override def describeQueryDefinitions(
      describeQueryDefinitionsRequest: DescribeQueryDefinitionsRequest
  ): Either[Throwable, DescribeQueryDefinitionsResponse] =
    underlying.describeQueryDefinitions(describeQueryDefinitionsRequest).toEither

  override def describeResourcePolicies(): Either[Throwable, DescribeResourcePoliciesResponse] =
    underlying.describeResourcePolicies().toEither

  override def describeResourcePolicies(
      describeResourcePoliciesRequest: DescribeResourcePoliciesRequest
  ): Either[Throwable, DescribeResourcePoliciesResponse] =
    underlying.describeResourcePolicies(describeResourcePoliciesRequest).toEither

  override def describeSubscriptionFilters(
      describeSubscriptionFiltersRequest: DescribeSubscriptionFiltersRequest
  ): Either[Throwable, DescribeSubscriptionFiltersResponse] =
    underlying.describeSubscriptionFilters(describeSubscriptionFiltersRequest).toEither

  def describeSubscriptionFiltersPaginator(
      describeSubscriptionFiltersRequest: DescribeSubscriptionFiltersRequest
  ): DescribeSubscriptionFiltersIterable =
    underlying.describeSubscriptionFiltersPaginator(describeSubscriptionFiltersRequest)

  override def disassociateKmsKey(
      disassociateKmsKeyRequest: DisassociateKmsKeyRequest
  ): Either[Throwable, DisassociateKmsKeyResponse] =
    underlying.disassociateKmsKey(disassociateKmsKeyRequest).toEither

  override def filterLogEvents(
      filterLogEventsRequest: FilterLogEventsRequest
  ): Either[Throwable, FilterLogEventsResponse] =
    underlying.filterLogEvents(filterLogEventsRequest).toEither

  def filterLogEventsPaginator(filterLogEventsRequest: FilterLogEventsRequest): FilterLogEventsIterable =
    underlying.filterLogEventsPaginator(filterLogEventsRequest)

  override def getLogEvents(getLogEventsRequest: GetLogEventsRequest): Either[Throwable, GetLogEventsResponse] =
    underlying.getLogEvents(getLogEventsRequest).toEither

  def getLogEventsPaginator(getLogEventsRequest: GetLogEventsRequest): GetLogEventsIterable =
    underlying.getLogEventsPaginator(getLogEventsRequest)

  override def getLogGroupFields(
      getLogGroupFieldsRequest: GetLogGroupFieldsRequest
  ): Either[Throwable, GetLogGroupFieldsResponse] =
    underlying.getLogGroupFields(getLogGroupFieldsRequest).toEither

  override def getLogRecord(getLogRecordRequest: GetLogRecordRequest): Either[Throwable, GetLogRecordResponse] =
    underlying.getLogRecord(getLogRecordRequest).toEither

  override def getQueryResults(
      getQueryResultsRequest: GetQueryResultsRequest
  ): Either[Throwable, GetQueryResultsResponse] =
    underlying.getQueryResults(getQueryResultsRequest).toEither

  override def listTagsLogGroup(
      listTagsLogGroupRequest: ListTagsLogGroupRequest
  ): Either[Throwable, ListTagsLogGroupResponse] =
    underlying.listTagsLogGroup(listTagsLogGroupRequest).toEither

  override def putDestination(putDestinationRequest: PutDestinationRequest): Either[Throwable, PutDestinationResponse] =
    underlying.putDestination(putDestinationRequest).toEither

  override def putDestinationPolicy(
      putDestinationPolicyRequest: PutDestinationPolicyRequest
  ): Either[Throwable, PutDestinationPolicyResponse] =
    underlying.putDestinationPolicy(putDestinationPolicyRequest).toEither

  override def putLogEvents(putLogEventsRequest: PutLogEventsRequest): Either[Throwable, PutLogEventsResponse] =
    underlying.putLogEvents(putLogEventsRequest).toEither

  override def putMetricFilter(
      putMetricFilterRequest: PutMetricFilterRequest
  ): Either[Throwable, PutMetricFilterResponse] =
    underlying.putMetricFilter(putMetricFilterRequest).toEither

  override def putQueryDefinition(
      putQueryDefinitionRequest: PutQueryDefinitionRequest
  ): Either[Throwable, PutQueryDefinitionResponse] =
    underlying.putQueryDefinition(putQueryDefinitionRequest).toEither

  override def putResourcePolicy(
      putResourcePolicyRequest: PutResourcePolicyRequest
  ): Either[Throwable, PutResourcePolicyResponse] =
    underlying.putResourcePolicy(putResourcePolicyRequest).toEither

  override def putRetentionPolicy(
      putRetentionPolicyRequest: PutRetentionPolicyRequest
  ): Either[Throwable, PutRetentionPolicyResponse] =
    underlying.putRetentionPolicy(putRetentionPolicyRequest).toEither

  override def putSubscriptionFilter(
      putSubscriptionFilterRequest: PutSubscriptionFilterRequest
  ): Either[Throwable, PutSubscriptionFilterResponse] =
    underlying.putSubscriptionFilter(putSubscriptionFilterRequest).toEither

  override def startQuery(startQueryRequest: StartQueryRequest): Either[Throwable, StartQueryResponse] =
    underlying.startQuery(startQueryRequest).toEither

  override def stopQuery(stopQueryRequest: StopQueryRequest): Either[Throwable, StopQueryResponse] =
    underlying.stopQuery(stopQueryRequest).toEither

  override def tagLogGroup(tagLogGroupRequest: TagLogGroupRequest): Either[Throwable, TagLogGroupResponse] =
    underlying.tagLogGroup(tagLogGroupRequest).toEither

  override def testMetricFilter(
      testMetricFilterRequest: TestMetricFilterRequest
  ): Either[Throwable, TestMetricFilterResponse] =
    underlying.testMetricFilter(testMetricFilterRequest).toEither

  override def untagLogGroup(untagLogGroupRequest: UntagLogGroupRequest): Either[Throwable, UntagLogGroupResponse] =
    underlying.untagLogGroup(untagLogGroupRequest).toEither

}
