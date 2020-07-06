// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs

import software.amazon.awssdk.services.cloudwatchlogs.model._

trait CloudWatchLogsClient[M[_]] {

  def associateKmsKey(associateKmsKeyRequest: AssociateKmsKeyRequest): M[AssociateKmsKeyResponse]

  def cancelExportTask(cancelExportTaskRequest: CancelExportTaskRequest): M[CancelExportTaskResponse]

  def createExportTask(createExportTaskRequest: CreateExportTaskRequest): M[CreateExportTaskResponse]

  def createLogGroup(createLogGroupRequest: CreateLogGroupRequest): M[CreateLogGroupResponse]

  def createLogStream(createLogStreamRequest: CreateLogStreamRequest): M[CreateLogStreamResponse]

  def deleteDestination(deleteDestinationRequest: DeleteDestinationRequest): M[DeleteDestinationResponse]

  def deleteLogGroup(deleteLogGroupRequest: DeleteLogGroupRequest): M[DeleteLogGroupResponse]

  def deleteLogStream(deleteLogStreamRequest: DeleteLogStreamRequest): M[DeleteLogStreamResponse]

  def deleteMetricFilter(deleteMetricFilterRequest: DeleteMetricFilterRequest): M[DeleteMetricFilterResponse]

  def deleteQueryDefinition(
      deleteQueryDefinitionRequest: DeleteQueryDefinitionRequest
  ): M[DeleteQueryDefinitionResponse]

  def deleteResourcePolicy(deleteResourcePolicyRequest: DeleteResourcePolicyRequest): M[DeleteResourcePolicyResponse]

  def deleteRetentionPolicy(
      deleteRetentionPolicyRequest: DeleteRetentionPolicyRequest
  ): M[DeleteRetentionPolicyResponse]

  def deleteSubscriptionFilter(
      deleteSubscriptionFilterRequest: DeleteSubscriptionFilterRequest
  ): M[DeleteSubscriptionFilterResponse]

  def describeDestinations(describeDestinationsRequest: DescribeDestinationsRequest): M[DescribeDestinationsResponse]

  def describeDestinations(): M[DescribeDestinationsResponse]

  def describeExportTasks(describeExportTasksRequest: DescribeExportTasksRequest): M[DescribeExportTasksResponse]

  def describeExportTasks(): M[DescribeExportTasksResponse]

  def describeLogGroups(describeLogGroupsRequest: DescribeLogGroupsRequest): M[DescribeLogGroupsResponse]

  def describeLogGroups(): M[DescribeLogGroupsResponse]

  def describeLogStreams(describeLogStreamsRequest: DescribeLogStreamsRequest): M[DescribeLogStreamsResponse]

  def describeMetricFilters(
      describeMetricFiltersRequest: DescribeMetricFiltersRequest
  ): M[DescribeMetricFiltersResponse]

  def describeMetricFilters(): M[DescribeMetricFiltersResponse]

  def describeQueries(describeQueriesRequest: DescribeQueriesRequest): M[DescribeQueriesResponse]

  def describeQueries(): M[DescribeQueriesResponse]

  def describeQueryDefinitions(
      describeQueryDefinitionsRequest: DescribeQueryDefinitionsRequest
  ): M[DescribeQueryDefinitionsResponse]

  def describeResourcePolicies(
      describeResourcePoliciesRequest: DescribeResourcePoliciesRequest
  ): M[DescribeResourcePoliciesResponse]

  def describeResourcePolicies(): M[DescribeResourcePoliciesResponse]

  def describeSubscriptionFilters(
      describeSubscriptionFiltersRequest: DescribeSubscriptionFiltersRequest
  ): M[DescribeSubscriptionFiltersResponse]

  def disassociateKmsKey(disassociateKmsKeyRequest: DisassociateKmsKeyRequest): M[DisassociateKmsKeyResponse]

  def filterLogEvents(filterLogEventsRequest: FilterLogEventsRequest): M[FilterLogEventsResponse]

  def getLogEvents(getLogEventsRequest: GetLogEventsRequest): M[GetLogEventsResponse]

  def getLogGroupFields(getLogGroupFieldsRequest: GetLogGroupFieldsRequest): M[GetLogGroupFieldsResponse]

  def getLogRecord(getLogRecordRequest: GetLogRecordRequest): M[GetLogRecordResponse]

  def getQueryResults(getQueryResultsRequest: GetQueryResultsRequest): M[GetQueryResultsResponse]

  def listTagsLogGroup(listTagsLogGroupRequest: ListTagsLogGroupRequest): M[ListTagsLogGroupResponse]

  def putDestination(putDestinationRequest: PutDestinationRequest): M[PutDestinationResponse]

  def putDestinationPolicy(putDestinationPolicyRequest: PutDestinationPolicyRequest): M[PutDestinationPolicyResponse]

  def putLogEvents(putLogEventsRequest: PutLogEventsRequest): M[PutLogEventsResponse]

  def putMetricFilter(putMetricFilterRequest: PutMetricFilterRequest): M[PutMetricFilterResponse]

  def putQueryDefinition(putQueryDefinitionRequest: PutQueryDefinitionRequest): M[PutQueryDefinitionResponse]

  def putResourcePolicy(putResourcePolicyRequest: PutResourcePolicyRequest): M[PutResourcePolicyResponse]

  def putRetentionPolicy(putRetentionPolicyRequest: PutRetentionPolicyRequest): M[PutRetentionPolicyResponse]

  def putSubscriptionFilter(
      putSubscriptionFilterRequest: PutSubscriptionFilterRequest
  ): M[PutSubscriptionFilterResponse]

  def startQuery(startQueryRequest: StartQueryRequest): M[StartQueryResponse]

  def stopQuery(stopQueryRequest: StopQueryRequest): M[StopQueryResponse]

  def tagLogGroup(tagLogGroupRequest: TagLogGroupRequest): M[TagLogGroupResponse]

  def testMetricFilter(testMetricFilterRequest: TestMetricFilterRequest): M[TestMetricFilterResponse]

  def untagLogGroup(untagLogGroupRequest: UntagLogGroupRequest): M[UntagLogGroupResponse]

}
