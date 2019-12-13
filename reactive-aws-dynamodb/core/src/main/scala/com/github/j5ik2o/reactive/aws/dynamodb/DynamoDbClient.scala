// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb

import software.amazon.awssdk.services.dynamodb.model._

trait DynamoDbClient[M[_]] extends DynamoDbClientSupport[M] {

  def batchGetItem(batchGetItemRequest: BatchGetItemRequest): M[BatchGetItemResponse]

  def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): M[BatchWriteItemResponse]

  def createBackup(createBackupRequest: CreateBackupRequest): M[CreateBackupResponse]

  def createGlobalTable(createGlobalTableRequest: CreateGlobalTableRequest): M[CreateGlobalTableResponse]

  def createTable(createTableRequest: CreateTableRequest): M[CreateTableResponse]

  def deleteBackup(deleteBackupRequest: DeleteBackupRequest): M[DeleteBackupResponse]

  def deleteItem(deleteItemRequest: DeleteItemRequest): M[DeleteItemResponse]

  def deleteTable(deleteTableRequest: DeleteTableRequest): M[DeleteTableResponse]

  def describeBackup(describeBackupRequest: DescribeBackupRequest): M[DescribeBackupResponse]

  def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): M[DescribeContinuousBackupsResponse]

  def describeContributorInsights(
      describeContributorInsightsRequest: DescribeContributorInsightsRequest
  ): M[DescribeContributorInsightsResponse]

  def describeEndpoints(describeEndpointsRequest: DescribeEndpointsRequest): M[DescribeEndpointsResponse]

  def describeEndpoints(): M[DescribeEndpointsResponse]

  def describeGlobalTable(describeGlobalTableRequest: DescribeGlobalTableRequest): M[DescribeGlobalTableResponse]

  def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): M[DescribeGlobalTableSettingsResponse]

  def describeLimits(describeLimitsRequest: DescribeLimitsRequest): M[DescribeLimitsResponse]

  def describeLimits(): M[DescribeLimitsResponse]

  def describeTable(describeTableRequest: DescribeTableRequest): M[DescribeTableResponse]

  def describeTableReplicaAutoScaling(
      describeTableReplicaAutoScalingRequest: DescribeTableReplicaAutoScalingRequest
  ): M[DescribeTableReplicaAutoScalingResponse]

  def describeTimeToLive(describeTimeToLiveRequest: DescribeTimeToLiveRequest): M[DescribeTimeToLiveResponse]

  def getItem(getItemRequest: GetItemRequest): M[GetItemResponse]

  def listBackups(listBackupsRequest: ListBackupsRequest): M[ListBackupsResponse]

  def listBackups(): M[ListBackupsResponse]

  def listContributorInsights(
      listContributorInsightsRequest: ListContributorInsightsRequest
  ): M[ListContributorInsightsResponse]

  def listGlobalTables(listGlobalTablesRequest: ListGlobalTablesRequest): M[ListGlobalTablesResponse]

  def listGlobalTables(): M[ListGlobalTablesResponse]

  def listTables(listTablesRequest: ListTablesRequest): M[ListTablesResponse]

  def listTables(): M[ListTablesResponse]

  def listTagsOfResource(listTagsOfResourceRequest: ListTagsOfResourceRequest): M[ListTagsOfResourceResponse]

  def putItem(putItemRequest: PutItemRequest): M[PutItemResponse]

  def query(queryRequest: QueryRequest): M[QueryResponse]

  def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): M[RestoreTableFromBackupResponse]

  def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): M[RestoreTableToPointInTimeResponse]

  def scan(scanRequest: ScanRequest): M[ScanResponse]

  def tagResource(tagResourceRequest: TagResourceRequest): M[TagResourceResponse]

  def transactGetItems(transactGetItemsRequest: TransactGetItemsRequest): M[TransactGetItemsResponse]

  def transactWriteItems(transactWriteItemsRequest: TransactWriteItemsRequest): M[TransactWriteItemsResponse]

  def untagResource(untagResourceRequest: UntagResourceRequest): M[UntagResourceResponse]

  def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): M[UpdateContinuousBackupsResponse]

  def updateContributorInsights(
      updateContributorInsightsRequest: UpdateContributorInsightsRequest
  ): M[UpdateContributorInsightsResponse]

  def updateGlobalTable(updateGlobalTableRequest: UpdateGlobalTableRequest): M[UpdateGlobalTableResponse]

  def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): M[UpdateGlobalTableSettingsResponse]

  def updateItem(updateItemRequest: UpdateItemRequest): M[UpdateItemResponse]

  def updateTable(updateTableRequest: UpdateTableRequest): M[UpdateTableResponse]

  def updateTableReplicaAutoScaling(
      updateTableReplicaAutoScalingRequest: UpdateTableReplicaAutoScalingRequest
  ): M[UpdateTableReplicaAutoScalingResponse]

  def updateTimeToLive(updateTimeToLiveRequest: UpdateTimeToLiveRequest): M[UpdateTimeToLiveResponse]

}
