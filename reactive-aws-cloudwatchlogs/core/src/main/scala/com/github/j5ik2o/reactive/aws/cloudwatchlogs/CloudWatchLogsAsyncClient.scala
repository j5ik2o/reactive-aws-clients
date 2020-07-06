// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs

import software.amazon.awssdk.services.cloudwatchlogs.model._
import software.amazon.awssdk.services.cloudwatchlogs.paginators._
import software.amazon.awssdk.services.cloudwatchlogs.{ CloudWatchLogsAsyncClient => JavaCloudWatchLogsAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object CloudWatchLogsAsyncClient {

  def apply(javaClient: JavaCloudWatchLogsAsyncClient): CloudWatchLogsAsyncClient =
    new CloudWatchLogsAsyncClient {
      override val underlying: JavaCloudWatchLogsAsyncClient = javaClient
    }

}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/cloudwatchlogs/CloudWatchLogsAsyncClient.html */
trait CloudWatchLogsAsyncClient extends CloudWatchLogsClient[Future] {
  val underlying: JavaCloudWatchLogsAsyncClient

  override def associateKmsKey(associateKmsKeyRequest: AssociateKmsKeyRequest): Future[AssociateKmsKeyResponse] =
    underlying.associateKmsKey(associateKmsKeyRequest).toScala

  override def cancelExportTask(cancelExportTaskRequest: CancelExportTaskRequest): Future[CancelExportTaskResponse] =
    underlying.cancelExportTask(cancelExportTaskRequest).toScala

  override def createExportTask(createExportTaskRequest: CreateExportTaskRequest): Future[CreateExportTaskResponse] =
    underlying.createExportTask(createExportTaskRequest).toScala

  override def createLogGroup(createLogGroupRequest: CreateLogGroupRequest): Future[CreateLogGroupResponse] =
    underlying.createLogGroup(createLogGroupRequest).toScala

  override def createLogStream(createLogStreamRequest: CreateLogStreamRequest): Future[CreateLogStreamResponse] =
    underlying.createLogStream(createLogStreamRequest).toScala

  override def deleteDestination(
      deleteDestinationRequest: DeleteDestinationRequest
  ): Future[DeleteDestinationResponse] =
    underlying.deleteDestination(deleteDestinationRequest).toScala

  override def deleteLogGroup(deleteLogGroupRequest: DeleteLogGroupRequest): Future[DeleteLogGroupResponse] =
    underlying.deleteLogGroup(deleteLogGroupRequest).toScala

  override def deleteLogStream(deleteLogStreamRequest: DeleteLogStreamRequest): Future[DeleteLogStreamResponse] =
    underlying.deleteLogStream(deleteLogStreamRequest).toScala

  override def deleteMetricFilter(
      deleteMetricFilterRequest: DeleteMetricFilterRequest
  ): Future[DeleteMetricFilterResponse] =
    underlying.deleteMetricFilter(deleteMetricFilterRequest).toScala

  override def deleteQueryDefinition(
      deleteQueryDefinitionRequest: DeleteQueryDefinitionRequest
  ): Future[DeleteQueryDefinitionResponse] =
    underlying.deleteQueryDefinition(deleteQueryDefinitionRequest).toScala

  override def deleteResourcePolicy(
      deleteResourcePolicyRequest: DeleteResourcePolicyRequest
  ): Future[DeleteResourcePolicyResponse] =
    underlying.deleteResourcePolicy(deleteResourcePolicyRequest).toScala

  override def deleteRetentionPolicy(
      deleteRetentionPolicyRequest: DeleteRetentionPolicyRequest
  ): Future[DeleteRetentionPolicyResponse] =
    underlying.deleteRetentionPolicy(deleteRetentionPolicyRequest).toScala

  override def deleteSubscriptionFilter(
      deleteSubscriptionFilterRequest: DeleteSubscriptionFilterRequest
  ): Future[DeleteSubscriptionFilterResponse] =
    underlying.deleteSubscriptionFilter(deleteSubscriptionFilterRequest).toScala

  override def describeDestinations(
      describeDestinationsRequest: DescribeDestinationsRequest
  ): Future[DescribeDestinationsResponse] =
    underlying.describeDestinations(describeDestinationsRequest).toScala

  override def describeDestinations(): Future[DescribeDestinationsResponse] =
    underlying.describeDestinations().toScala

  def describeDestinationsPaginator(): DescribeDestinationsPublisher =
    underlying.describeDestinationsPaginator()

  def describeDestinationsPaginator(
      describeDestinationsRequest: DescribeDestinationsRequest
  ): DescribeDestinationsPublisher =
    underlying.describeDestinationsPaginator(describeDestinationsRequest)

  override def describeExportTasks(
      describeExportTasksRequest: DescribeExportTasksRequest
  ): Future[DescribeExportTasksResponse] =
    underlying.describeExportTasks(describeExportTasksRequest).toScala

  override def describeExportTasks(): Future[DescribeExportTasksResponse] =
    underlying.describeExportTasks().toScala

  override def describeLogGroups(
      describeLogGroupsRequest: DescribeLogGroupsRequest
  ): Future[DescribeLogGroupsResponse] =
    underlying.describeLogGroups(describeLogGroupsRequest).toScala

  override def describeLogGroups(): Future[DescribeLogGroupsResponse] =
    underlying.describeLogGroups().toScala

  def describeLogGroupsPaginator(): DescribeLogGroupsPublisher =
    underlying.describeLogGroupsPaginator()

  def describeLogGroupsPaginator(describeLogGroupsRequest: DescribeLogGroupsRequest): DescribeLogGroupsPublisher =
    underlying.describeLogGroupsPaginator(describeLogGroupsRequest)

  override def describeLogStreams(
      describeLogStreamsRequest: DescribeLogStreamsRequest
  ): Future[DescribeLogStreamsResponse] =
    underlying.describeLogStreams(describeLogStreamsRequest).toScala

  def describeLogStreamsPaginator(describeLogStreamsRequest: DescribeLogStreamsRequest): DescribeLogStreamsPublisher =
    underlying.describeLogStreamsPaginator(describeLogStreamsRequest)

  override def describeMetricFilters(
      describeMetricFiltersRequest: DescribeMetricFiltersRequest
  ): Future[DescribeMetricFiltersResponse] =
    underlying.describeMetricFilters(describeMetricFiltersRequest).toScala

  override def describeMetricFilters(): Future[DescribeMetricFiltersResponse] =
    underlying.describeMetricFilters().toScala

  def describeMetricFiltersPaginator(): DescribeMetricFiltersPublisher =
    underlying.describeMetricFiltersPaginator()

  def describeMetricFiltersPaginator(
      describeMetricFiltersRequest: DescribeMetricFiltersRequest
  ): DescribeMetricFiltersPublisher =
    underlying.describeMetricFiltersPaginator(describeMetricFiltersRequest)

  override def describeQueries(describeQueriesRequest: DescribeQueriesRequest): Future[DescribeQueriesResponse] =
    underlying.describeQueries(describeQueriesRequest).toScala

  override def describeQueries(): Future[DescribeQueriesResponse] =
    underlying.describeQueries().toScala

  override def describeQueryDefinitions(
      describeQueryDefinitionsRequest: DescribeQueryDefinitionsRequest
  ): Future[DescribeQueryDefinitionsResponse] =
    underlying.describeQueryDefinitions(describeQueryDefinitionsRequest).toScala

  override def describeResourcePolicies(
      describeResourcePoliciesRequest: DescribeResourcePoliciesRequest
  ): Future[DescribeResourcePoliciesResponse] =
    underlying.describeResourcePolicies(describeResourcePoliciesRequest).toScala

  override def describeResourcePolicies(): Future[DescribeResourcePoliciesResponse] =
    underlying.describeResourcePolicies().toScala

  override def describeSubscriptionFilters(
      describeSubscriptionFiltersRequest: DescribeSubscriptionFiltersRequest
  ): Future[DescribeSubscriptionFiltersResponse] =
    underlying.describeSubscriptionFilters(describeSubscriptionFiltersRequest).toScala

  def describeSubscriptionFiltersPaginator(
      describeSubscriptionFiltersRequest: DescribeSubscriptionFiltersRequest
  ): DescribeSubscriptionFiltersPublisher =
    underlying.describeSubscriptionFiltersPaginator(describeSubscriptionFiltersRequest)

  override def disassociateKmsKey(
      disassociateKmsKeyRequest: DisassociateKmsKeyRequest
  ): Future[DisassociateKmsKeyResponse] =
    underlying.disassociateKmsKey(disassociateKmsKeyRequest).toScala

  override def filterLogEvents(filterLogEventsRequest: FilterLogEventsRequest): Future[FilterLogEventsResponse] =
    underlying.filterLogEvents(filterLogEventsRequest).toScala

  def filterLogEventsPaginator(filterLogEventsRequest: FilterLogEventsRequest): FilterLogEventsPublisher =
    underlying.filterLogEventsPaginator(filterLogEventsRequest)

  override def getLogEvents(getLogEventsRequest: GetLogEventsRequest): Future[GetLogEventsResponse] =
    underlying.getLogEvents(getLogEventsRequest).toScala

  def getLogEventsPaginator(getLogEventsRequest: GetLogEventsRequest): GetLogEventsPublisher =
    underlying.getLogEventsPaginator(getLogEventsRequest)

  override def getLogGroupFields(
      getLogGroupFieldsRequest: GetLogGroupFieldsRequest
  ): Future[GetLogGroupFieldsResponse] =
    underlying.getLogGroupFields(getLogGroupFieldsRequest).toScala

  override def getLogRecord(getLogRecordRequest: GetLogRecordRequest): Future[GetLogRecordResponse] =
    underlying.getLogRecord(getLogRecordRequest).toScala

  override def getQueryResults(getQueryResultsRequest: GetQueryResultsRequest): Future[GetQueryResultsResponse] =
    underlying.getQueryResults(getQueryResultsRequest).toScala

  override def listTagsLogGroup(listTagsLogGroupRequest: ListTagsLogGroupRequest): Future[ListTagsLogGroupResponse] =
    underlying.listTagsLogGroup(listTagsLogGroupRequest).toScala

  override def putDestination(putDestinationRequest: PutDestinationRequest): Future[PutDestinationResponse] =
    underlying.putDestination(putDestinationRequest).toScala

  override def putDestinationPolicy(
      putDestinationPolicyRequest: PutDestinationPolicyRequest
  ): Future[PutDestinationPolicyResponse] =
    underlying.putDestinationPolicy(putDestinationPolicyRequest).toScala

  override def putLogEvents(putLogEventsRequest: PutLogEventsRequest): Future[PutLogEventsResponse] =
    underlying.putLogEvents(putLogEventsRequest).toScala

  override def putMetricFilter(putMetricFilterRequest: PutMetricFilterRequest): Future[PutMetricFilterResponse] =
    underlying.putMetricFilter(putMetricFilterRequest).toScala

  override def putQueryDefinition(
      putQueryDefinitionRequest: PutQueryDefinitionRequest
  ): Future[PutQueryDefinitionResponse] =
    underlying.putQueryDefinition(putQueryDefinitionRequest).toScala

  override def putResourcePolicy(
      putResourcePolicyRequest: PutResourcePolicyRequest
  ): Future[PutResourcePolicyResponse] =
    underlying.putResourcePolicy(putResourcePolicyRequest).toScala

  override def putRetentionPolicy(
      putRetentionPolicyRequest: PutRetentionPolicyRequest
  ): Future[PutRetentionPolicyResponse] =
    underlying.putRetentionPolicy(putRetentionPolicyRequest).toScala

  override def putSubscriptionFilter(
      putSubscriptionFilterRequest: PutSubscriptionFilterRequest
  ): Future[PutSubscriptionFilterResponse] =
    underlying.putSubscriptionFilter(putSubscriptionFilterRequest).toScala

  override def startQuery(startQueryRequest: StartQueryRequest): Future[StartQueryResponse] =
    underlying.startQuery(startQueryRequest).toScala

  override def stopQuery(stopQueryRequest: StopQueryRequest): Future[StopQueryResponse] =
    underlying.stopQuery(stopQueryRequest).toScala

  override def tagLogGroup(tagLogGroupRequest: TagLogGroupRequest): Future[TagLogGroupResponse] =
    underlying.tagLogGroup(tagLogGroupRequest).toScala

  override def testMetricFilter(testMetricFilterRequest: TestMetricFilterRequest): Future[TestMetricFilterResponse] =
    underlying.testMetricFilter(testMetricFilterRequest).toScala

  override def untagLogGroup(untagLogGroupRequest: UntagLogGroupRequest): Future[UntagLogGroupResponse] =
    underlying.untagLogGroup(untagLogGroupRequest).toScala

}
