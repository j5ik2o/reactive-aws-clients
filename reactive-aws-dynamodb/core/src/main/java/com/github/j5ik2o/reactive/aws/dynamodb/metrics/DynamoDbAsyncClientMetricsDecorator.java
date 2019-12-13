package com.github.j5ik2o.reactive.aws.dynamodb.metrics;

import com.github.j5ik2o.reactive.aws.metrics.MetricsReporter;
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient;
import software.amazon.awssdk.services.dynamodb.model.*;
import software.amazon.awssdk.services.dynamodb.paginators.*;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;

public final class DynamoDbAsyncClientMetricsDecorator implements DynamoDbAsyncClient {

    private final DynamoDbAsyncClient underlying;
    private final MetricsReporter metricsReporter;

    DynamoDbAsyncClientMetricsDecorator(DynamoDbAsyncClient underlying, MetricsReporter metricsReporter) {
        this.underlying = underlying;
        this.metricsReporter = metricsReporter;
    }

    protected long currentTime() {
        return System.nanoTime();
    }

    protected <A, B> CompletableFuture<B> collect(String name, A request,
                                                  Function<A, CompletableFuture<B>> f) {
        long start = currentTime();
        return f.apply(request).whenComplete((result, error) -> {
                    metricsReporter.record(name, currentTime() - start);
                    metricsReporter.increment(name);
                }
        );
    }


    @Override
    public String serviceName() {
        return underlying.serviceName();
    }

    @Override
    public void close() {
        underlying.close();
    }

    @Override
    public CompletableFuture<BatchGetItemResponse> batchGetItem(BatchGetItemRequest batchGetItemRequest) {
        return collect("batchGetItem", batchGetItemRequest, underlying::batchGetItem);
    }

    @Override
    public CompletableFuture<BatchGetItemResponse> batchGetItem(Consumer<BatchGetItemRequest.Builder> batchGetItemRequest) {
        return collect("batchGetItem", batchGetItemRequest, underlying::batchGetItem);
    }

    @Override
    public BatchGetItemPublisher batchGetItemPaginator(BatchGetItemRequest batchGetItemRequest) {
        return underlying.batchGetItemPaginator(batchGetItemRequest);
    }

    @Override
    public BatchGetItemPublisher batchGetItemPaginator(Consumer<BatchGetItemRequest.Builder> batchGetItemRequest) {
        return underlying.batchGetItemPaginator(batchGetItemRequest);
    }

    @Override
    public CompletableFuture<BatchWriteItemResponse> batchWriteItem(BatchWriteItemRequest batchWriteItemRequest) {
        return collect("batchWriteItem", batchWriteItemRequest, underlying::batchWriteItem);
    }

    @Override
    public CompletableFuture<BatchWriteItemResponse> batchWriteItem(Consumer<BatchWriteItemRequest.Builder> batchWriteItemRequest) {
        return collect("batchWriteItem", batchWriteItemRequest, underlying::batchWriteItem);
    }

    @Override
    public CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest createBackupRequest) {
        return collect("createBackup", createBackupRequest, underlying::createBackup);
    }

    @Override
    public CompletableFuture<CreateBackupResponse> createBackup(Consumer<CreateBackupRequest.Builder> createBackupRequest) {
        return collect("createBackup", createBackupRequest, underlying::createBackup);
    }

    @Override
    public CompletableFuture<CreateGlobalTableResponse> createGlobalTable(CreateGlobalTableRequest createGlobalTableRequest) {
        return collect("createGlobalTable", createGlobalTableRequest, underlying::createGlobalTable);
    }

    @Override
    public CompletableFuture<CreateGlobalTableResponse> createGlobalTable(Consumer<CreateGlobalTableRequest.Builder> createGlobalTableRequest) {
        return collect("createGlobalTable", createGlobalTableRequest, underlying::createGlobalTable);
    }

    @Override
    public CompletableFuture<CreateTableResponse> createTable(CreateTableRequest createTableRequest) {
        return collect("createTable", createTableRequest, underlying::createTable);
    }

    @Override
    public CompletableFuture<CreateTableResponse> createTable(Consumer<CreateTableRequest.Builder> createTableRequest) {
        return collect("createTable", createTableRequest, underlying::createTable);
    }

    @Override
    public CompletableFuture<DeleteBackupResponse> deleteBackup(DeleteBackupRequest deleteBackupRequest) {
        return collect("deleteBackup", deleteBackupRequest, underlying::deleteBackup);
    }

    @Override
    public CompletableFuture<DeleteBackupResponse> deleteBackup(Consumer<DeleteBackupRequest.Builder> deleteBackupRequest) {
        return collect("deleteBackup", deleteBackupRequest, underlying::deleteBackup);
    }

    @Override
    public CompletableFuture<DeleteItemResponse> deleteItem(DeleteItemRequest deleteItemRequest) {
        return collect("deleteItem", deleteItemRequest, underlying::deleteItem);
    }

    @Override
    public CompletableFuture<DeleteItemResponse> deleteItem(Consumer<DeleteItemRequest.Builder> deleteItemRequest) {
        return collect("deleteItem", deleteItemRequest, underlying::deleteItem);
    }

    @Override
    public CompletableFuture<DeleteTableResponse> deleteTable(DeleteTableRequest deleteTableRequest) {
        return collect("deleteTable", deleteTableRequest, underlying::deleteTable);
    }

    @Override
    public CompletableFuture<DeleteTableResponse> deleteTable(Consumer<DeleteTableRequest.Builder> deleteTableRequest) {
        return collect("deleteTable", deleteTableRequest, underlying::deleteTable);
    }

    @Override
    public CompletableFuture<DescribeBackupResponse> describeBackup(DescribeBackupRequest describeBackupRequest) {
        return collect("describeBackup", describeBackupRequest, underlying::describeBackup);
    }

    @Override
    public CompletableFuture<DescribeBackupResponse> describeBackup(Consumer<DescribeBackupRequest.Builder> describeBackupRequest) {
        return collect("describeBackup", describeBackupRequest, underlying::describeBackup);
    }

    @Override
    public CompletableFuture<DescribeContinuousBackupsResponse> describeContinuousBackups(DescribeContinuousBackupsRequest describeContinuousBackupsRequest) {
        return collect("describeContinuousBackups", describeContinuousBackupsRequest, underlying::describeContinuousBackups);
    }

    @Override
    public CompletableFuture<DescribeContinuousBackupsResponse> describeContinuousBackups(Consumer<DescribeContinuousBackupsRequest.Builder> describeContinuousBackupsRequest) {
        return collect("describeContinuousBackups", describeContinuousBackupsRequest, underlying::describeContinuousBackups);
    }

    @Override
    public CompletableFuture<DescribeContributorInsightsResponse> describeContributorInsights(DescribeContributorInsightsRequest describeContributorInsightsRequest) {
        return collect("describeContributorInsights", describeContributorInsightsRequest, underlying::describeContributorInsights);
    }

    @Override
    public CompletableFuture<DescribeContributorInsightsResponse> describeContributorInsights(Consumer<DescribeContributorInsightsRequest.Builder> describeContributorInsightsRequest) {
        return collect("describeContributorInsights", describeContributorInsightsRequest, underlying::describeContributorInsights);
    }

    @Override
    public CompletableFuture<DescribeEndpointsResponse> describeEndpoints(DescribeEndpointsRequest describeEndpointsRequest) {
        return collect("describeEndpoints", describeEndpointsRequest, underlying::describeEndpoints);
    }

    @Override
    public CompletableFuture<DescribeEndpointsResponse> describeEndpoints(Consumer<DescribeEndpointsRequest.Builder> describeEndpointsRequest) {
        return collect("describeEndpoints", describeEndpointsRequest, underlying::describeEndpoints);
    }

    @Override
    public CompletableFuture<DescribeEndpointsResponse> describeEndpoints() {
        return describeEndpoints(DescribeEndpointsRequest.builder().build());
    }

    @Override
    public CompletableFuture<DescribeGlobalTableResponse> describeGlobalTable(DescribeGlobalTableRequest describeGlobalTableRequest) {
        return collect("describeGlobalTable", describeGlobalTableRequest, underlying::describeGlobalTable);
    }

    @Override
    public CompletableFuture<DescribeGlobalTableResponse> describeGlobalTable(Consumer<DescribeGlobalTableRequest.Builder> describeGlobalTableRequest) {
        return collect("describeGlobalTable", describeGlobalTableRequest, underlying::describeGlobalTable);
    }

    @Override
    public CompletableFuture<DescribeGlobalTableSettingsResponse> describeGlobalTableSettings(DescribeGlobalTableSettingsRequest describeGlobalTableSettingsRequest) {
        return collect("describeGlobalTableSettings", describeGlobalTableSettingsRequest, underlying::describeGlobalTableSettings);
    }

    @Override
    public CompletableFuture<DescribeGlobalTableSettingsResponse> describeGlobalTableSettings(Consumer<DescribeGlobalTableSettingsRequest.Builder> describeGlobalTableSettingsRequest) {
        return collect("describeGlobalTableSettings", describeGlobalTableSettingsRequest, underlying::describeGlobalTableSettings);
    }

    @Override
    public CompletableFuture<DescribeLimitsResponse> describeLimits(DescribeLimitsRequest describeLimitsRequest) {
        return collect("describeLimits", describeLimitsRequest, underlying::describeLimits);
    }

    @Override
    public CompletableFuture<DescribeLimitsResponse> describeLimits(Consumer<DescribeLimitsRequest.Builder> describeLimitsRequest) {
        return collect("describeLimits", describeLimitsRequest, underlying::describeLimits);
    }

    @Override
    public CompletableFuture<DescribeLimitsResponse> describeLimits() {
        return describeLimits(DescribeLimitsRequest.builder().build());
    }

    @Override
    public CompletableFuture<DescribeTableResponse> describeTable(DescribeTableRequest describeTableRequest) {
        return collect("describeTable", describeTableRequest, underlying::describeTable);
    }

    @Override
    public CompletableFuture<DescribeTableResponse> describeTable(Consumer<DescribeTableRequest.Builder> describeTableRequest) {
        return collect("describeTable", describeTableRequest, underlying::describeTable);
    }

    @Override
    public CompletableFuture<DescribeTableReplicaAutoScalingResponse> describeTableReplicaAutoScaling(DescribeTableReplicaAutoScalingRequest describeTableReplicaAutoScalingRequest) {
        return collect("describeTableReplicaAutoScaling", describeTableReplicaAutoScalingRequest, underlying::describeTableReplicaAutoScaling);
    }

    @Override
    public CompletableFuture<DescribeTableReplicaAutoScalingResponse> describeTableReplicaAutoScaling(Consumer<DescribeTableReplicaAutoScalingRequest.Builder> describeTableReplicaAutoScalingRequest) {
        return collect("describeTableReplicaAutoScaling", describeTableReplicaAutoScalingRequest, underlying::describeTableReplicaAutoScaling);
    }

    @Override
    public CompletableFuture<DescribeTimeToLiveResponse> describeTimeToLive(DescribeTimeToLiveRequest describeTimeToLiveRequest) {
        return collect("describeTimeToLive", describeTimeToLiveRequest, underlying::describeTimeToLive);
    }

    @Override
    public CompletableFuture<DescribeTimeToLiveResponse> describeTimeToLive(Consumer<DescribeTimeToLiveRequest.Builder> describeTimeToLiveRequest) {
        return collect("describeTimeToLive", describeTimeToLiveRequest, underlying::describeTimeToLive);
    }

    @Override
    public CompletableFuture<GetItemResponse> getItem(GetItemRequest getItemRequest) {
        return collect("getItemRequest", getItemRequest, underlying::getItem);
    }

    @Override
    public CompletableFuture<GetItemResponse> getItem(Consumer<GetItemRequest.Builder> getItemRequest) {
        return collect("getItemRequest", getItemRequest, underlying::getItem);
    }

    @Override
    public CompletableFuture<ListBackupsResponse> listBackups(ListBackupsRequest listBackupsRequest) {
        return collect("listBackups", listBackupsRequest, underlying::listBackups);
    }

    @Override
    public CompletableFuture<ListBackupsResponse> listBackups(Consumer<ListBackupsRequest.Builder> listBackupsRequest) {
        return collect("listBackups", listBackupsRequest, underlying::listBackups);
    }

    @Override
    public CompletableFuture<ListBackupsResponse> listBackups() {
        return listBackups(ListBackupsRequest.builder().build());
    }

    @Override
    public CompletableFuture<ListContributorInsightsResponse> listContributorInsights(ListContributorInsightsRequest listContributorInsightsRequest) {
        return collect("listContributorInsights", listContributorInsightsRequest, underlying::listContributorInsights);
    }

    @Override
    public CompletableFuture<ListContributorInsightsResponse> listContributorInsights(Consumer<ListContributorInsightsRequest.Builder> listContributorInsightsRequest) {
        return collect("listContributorInsights", listContributorInsightsRequest, underlying::listContributorInsights);
    }

    @Override
    public ListContributorInsightsPublisher listContributorInsightsPaginator(ListContributorInsightsRequest listContributorInsightsRequest) {
        return underlying.listContributorInsightsPaginator(listContributorInsightsRequest);
    }

    @Override
    public ListContributorInsightsPublisher listContributorInsightsPaginator(Consumer<ListContributorInsightsRequest.Builder> listContributorInsightsRequest) {
        return underlying.listContributorInsightsPaginator(listContributorInsightsRequest);
    }

    @Override
    public CompletableFuture<ListGlobalTablesResponse> listGlobalTables(ListGlobalTablesRequest listGlobalTablesRequest) {
        return collect("listGlobalTables", listGlobalTablesRequest, underlying::listGlobalTables);
    }

    @Override
    public CompletableFuture<ListGlobalTablesResponse> listGlobalTables(Consumer<ListGlobalTablesRequest.Builder> listGlobalTablesRequest) {
        return collect("listGlobalTables", listGlobalTablesRequest, underlying::listGlobalTables);
    }

    @Override
    public CompletableFuture<ListGlobalTablesResponse> listGlobalTables() {
        return listGlobalTables(ListGlobalTablesRequest.builder().build());
    }

    @Override
    public CompletableFuture<ListTablesResponse> listTables(ListTablesRequest listTablesRequest) {
        return collect("listTables", listTablesRequest, underlying::listTables);
    }

    @Override
    public CompletableFuture<ListTablesResponse> listTables(Consumer<ListTablesRequest.Builder> listTablesRequest) {
        return collect("listTables", listTablesRequest, underlying::listTables);
    }

    @Override
    public CompletableFuture<ListTablesResponse> listTables() {
        return listTables(ListTablesRequest.builder().build());
    }

    @Override
    public ListTablesPublisher listTablesPaginator() {
        return underlying.listTablesPaginator();
    }

    @Override
    public ListTablesPublisher listTablesPaginator(ListTablesRequest listTablesRequest) {
        return underlying.listTablesPaginator(listTablesRequest);
    }

    @Override
    public ListTablesPublisher listTablesPaginator(Consumer<ListTablesRequest.Builder> listTablesRequest) {
        return underlying.listTablesPaginator(listTablesRequest);
    }

    @Override
    public CompletableFuture<ListTagsOfResourceResponse> listTagsOfResource(ListTagsOfResourceRequest listTagsOfResourceRequest) {
        return collect("listTagsOfResource", listTagsOfResourceRequest, underlying::listTagsOfResource);
    }

    @Override
    public CompletableFuture<ListTagsOfResourceResponse> listTagsOfResource(Consumer<ListTagsOfResourceRequest.Builder> listTagsOfResourceRequest) {
        return collect("listTagsOfResource", listTagsOfResourceRequest, underlying::listTagsOfResource);
    }

    @Override
    public CompletableFuture<PutItemResponse> putItem(PutItemRequest putItemRequest) {
        return collect("putItem", putItemRequest, underlying::putItem);
    }

    @Override
    public CompletableFuture<PutItemResponse> putItem(Consumer<PutItemRequest.Builder> putItemRequest) {
        return collect("putItem", putItemRequest, underlying::putItem);
    }

    @Override
    public CompletableFuture<QueryResponse> query(QueryRequest queryRequest) {
        return collect("query", queryRequest, underlying::query);
    }

    @Override
    public CompletableFuture<QueryResponse> query(Consumer<QueryRequest.Builder> queryRequest) {
        return collect("query", queryRequest, underlying::query);
    }

    @Override
    public QueryPublisher queryPaginator(QueryRequest queryRequest) {
        return underlying.queryPaginator(queryRequest);
    }

    @Override
    public QueryPublisher queryPaginator(Consumer<QueryRequest.Builder> queryRequest) {
        return underlying.queryPaginator(queryRequest);
    }

    @Override
    public CompletableFuture<RestoreTableFromBackupResponse> restoreTableFromBackup(RestoreTableFromBackupRequest restoreTableFromBackupRequest) {
        return collect("restoreTableFromBackup", restoreTableFromBackupRequest, underlying::restoreTableFromBackup);
    }

    @Override
    public CompletableFuture<RestoreTableFromBackupResponse> restoreTableFromBackup(Consumer<RestoreTableFromBackupRequest.Builder> restoreTableFromBackupRequest) {
        return collect("restoreTableFromBackup", restoreTableFromBackupRequest, underlying::restoreTableFromBackup);
    }

    @Override
    public CompletableFuture<RestoreTableToPointInTimeResponse> restoreTableToPointInTime(RestoreTableToPointInTimeRequest restoreTableToPointInTimeRequest) {
        return collect("restoreTableToPointInTime", restoreTableToPointInTimeRequest, underlying::restoreTableToPointInTime);
    }

    @Override
    public CompletableFuture<RestoreTableToPointInTimeResponse> restoreTableToPointInTime(Consumer<RestoreTableToPointInTimeRequest.Builder> restoreTableToPointInTimeRequest) {
        return collect("restoreTableToPointInTime", restoreTableToPointInTimeRequest, underlying::restoreTableToPointInTime);
    }

    @Override
    public CompletableFuture<ScanResponse> scan(ScanRequest scanRequest) {
        return collect("scan", scanRequest, underlying::scan);
    }

    @Override
    public CompletableFuture<ScanResponse> scan(Consumer<ScanRequest.Builder> scanRequest) {
        return collect("scan", scanRequest, underlying::scan);
    }

    @Override
    public ScanPublisher scanPaginator(ScanRequest scanRequest) {
        return underlying.scanPaginator(scanRequest);
    }

    @Override
    public ScanPublisher scanPaginator(Consumer<ScanRequest.Builder> scanRequest) {
        return underlying.scanPaginator(scanRequest);
    }

    @Override
    public CompletableFuture<TagResourceResponse> tagResource(TagResourceRequest tagResourceRequest) {
        return collect("tagResource", tagResourceRequest, underlying::tagResource);
    }

    @Override
    public CompletableFuture<TagResourceResponse> tagResource(Consumer<TagResourceRequest.Builder> tagResourceRequest) {
        return collect("tagResource", tagResourceRequest, underlying::tagResource);
    }

    @Override
    public CompletableFuture<TransactGetItemsResponse> transactGetItems(TransactGetItemsRequest transactGetItemsRequest) {
        return collect("transactGetItems", transactGetItemsRequest, underlying::transactGetItems);
    }

    @Override
    public CompletableFuture<TransactGetItemsResponse> transactGetItems(Consumer<TransactGetItemsRequest.Builder> transactGetItemsRequest) {
        return collect("transactGetItems", transactGetItemsRequest, underlying::transactGetItems);
    }

    @Override
    public CompletableFuture<TransactWriteItemsResponse> transactWriteItems(TransactWriteItemsRequest transactWriteItemsRequest) {
        return collect("transactWriteItems", transactWriteItemsRequest, underlying::transactWriteItems);
    }

    @Override
    public CompletableFuture<TransactWriteItemsResponse> transactWriteItems(Consumer<TransactWriteItemsRequest.Builder> transactWriteItemsRequest) {
        return collect("transactWriteItems", transactWriteItemsRequest, underlying::transactWriteItems);
    }

    @Override
    public CompletableFuture<UntagResourceResponse> untagResource(UntagResourceRequest untagResourceRequest) {
        return collect("untagResource", untagResourceRequest, underlying::untagResource);
    }

    @Override
    public CompletableFuture<UntagResourceResponse> untagResource(Consumer<UntagResourceRequest.Builder> untagResourceRequest) {
        return collect("untagResource", untagResourceRequest, underlying::untagResource);
    }

    @Override
    public CompletableFuture<UpdateContinuousBackupsResponse> updateContinuousBackups(UpdateContinuousBackupsRequest updateContinuousBackupsRequest) {
        return collect("updateContinuousBackups", updateContinuousBackupsRequest, underlying::updateContinuousBackups);
    }

    @Override
    public CompletableFuture<UpdateContinuousBackupsResponse> updateContinuousBackups(Consumer<UpdateContinuousBackupsRequest.Builder> updateContinuousBackupsRequest) {
        return collect("updateContinuousBackups", updateContinuousBackupsRequest, underlying::updateContinuousBackups);
    }

    @Override
    public CompletableFuture<UpdateContributorInsightsResponse> updateContributorInsights(UpdateContributorInsightsRequest updateContributorInsightsRequest) {
        return collect("updateContributorInsights", updateContributorInsightsRequest, underlying::updateContributorInsights);
    }

    @Override
    public CompletableFuture<UpdateContributorInsightsResponse> updateContributorInsights(Consumer<UpdateContributorInsightsRequest.Builder> updateContributorInsightsRequest) {
        return collect("updateContributorInsights", updateContributorInsightsRequest, underlying::updateContributorInsights);
    }

    @Override
    public CompletableFuture<UpdateGlobalTableResponse> updateGlobalTable(UpdateGlobalTableRequest updateGlobalTableRequest) {
        return collect("updateGlobalTable", updateGlobalTableRequest, underlying::updateGlobalTable);
    }

    @Override
    public CompletableFuture<UpdateGlobalTableResponse> updateGlobalTable(Consumer<UpdateGlobalTableRequest.Builder> updateGlobalTableRequest) {
        return collect("updateGlobalTable", updateGlobalTableRequest, underlying::updateGlobalTable);
    }

    @Override
    public CompletableFuture<UpdateGlobalTableSettingsResponse> updateGlobalTableSettings(UpdateGlobalTableSettingsRequest updateGlobalTableSettingsRequest) {
        return collect("updateGlobalTableSettings", updateGlobalTableSettingsRequest, underlying::updateGlobalTableSettings);
    }

    @Override
    public CompletableFuture<UpdateGlobalTableSettingsResponse> updateGlobalTableSettings(Consumer<UpdateGlobalTableSettingsRequest.Builder> updateGlobalTableSettingsRequest) {
        return collect("updateGlobalTableSettings", updateGlobalTableSettingsRequest, underlying::updateGlobalTableSettings);
    }

    @Override
    public CompletableFuture<UpdateItemResponse> updateItem(UpdateItemRequest updateItemRequest) {
        return collect("updateItem", updateItemRequest, underlying::updateItem);
    }

    @Override
    public CompletableFuture<UpdateItemResponse> updateItem(Consumer<UpdateItemRequest.Builder> updateItemRequest) {
        return collect("updateItem", updateItemRequest, underlying::updateItem);
    }

    @Override
    public CompletableFuture<UpdateTableResponse> updateTable(UpdateTableRequest updateTableRequest) {
        return collect("updateTable", updateTableRequest, underlying::updateTable);
    }

    @Override
    public CompletableFuture<UpdateTableResponse> updateTable(Consumer<UpdateTableRequest.Builder> updateTableRequest) {
        return collect("updateTable", updateTableRequest, underlying::updateTable);
    }

    @Override
    public CompletableFuture<UpdateTableReplicaAutoScalingResponse> updateTableReplicaAutoScaling(UpdateTableReplicaAutoScalingRequest updateTableReplicaAutoScalingRequest) {
        return collect("updateTableReplicaAutoScaling", updateTableReplicaAutoScalingRequest, underlying::updateTableReplicaAutoScaling);
    }

    @Override
    public CompletableFuture<UpdateTableReplicaAutoScalingResponse> updateTableReplicaAutoScaling(Consumer<UpdateTableReplicaAutoScalingRequest.Builder> updateTableReplicaAutoScalingRequest) {
        return collect("updateTableReplicaAutoScaling", updateTableReplicaAutoScalingRequest, underlying::updateTableReplicaAutoScaling);
    }

    @Override
    public CompletableFuture<UpdateTimeToLiveResponse> updateTimeToLive(UpdateTimeToLiveRequest updateTimeToLiveRequest) {
        return collect("updateTimeToLive", updateTimeToLiveRequest, underlying::updateTimeToLive);
    }

    @Override
    public CompletableFuture<UpdateTimeToLiveResponse> updateTimeToLive(Consumer<UpdateTimeToLiveRequest.Builder> updateTimeToLiveRequest) {
        return collect("updateTimeToLive", updateTimeToLiveRequest, underlying::updateTimeToLive);
    }
}
