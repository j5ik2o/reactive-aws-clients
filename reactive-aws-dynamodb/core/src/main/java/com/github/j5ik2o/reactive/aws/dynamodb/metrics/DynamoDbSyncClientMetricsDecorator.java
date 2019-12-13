package com.github.j5ik2o.reactive.aws.dynamodb.metrics;

import com.github.j5ik2o.reactive.aws.metrics.MetricsReporter;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.util.function.Consumer;
import java.util.function.Function;

public final class DynamoDbSyncClientMetricsDecorator implements DynamoDbClient {

    private final DynamoDbClient underlying;
    private final MetricsReporter metricsReporter;

    public DynamoDbSyncClientMetricsDecorator(DynamoDbClient underlying, MetricsReporter metricsReporter) {
        this.underlying = underlying;
        this.metricsReporter = metricsReporter;
    }

    protected long currentTime() {
        return System.nanoTime();
    }

    protected <A,B> B collect(String name, A request, Function<A,B> f) {
        long start = currentTime();
        try {
            return f.apply(request);
        } finally {
            metricsReporter.record(name, currentTime() - start);
            metricsReporter.increment(name);
        }
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
    public BatchGetItemResponse batchGetItem(BatchGetItemRequest batchGetItemRequest) {
        return collect("batchGetItem", batchGetItemRequest, underlying::batchGetItem);
    }

    @Override
    public BatchGetItemResponse batchGetItem(Consumer<BatchGetItemRequest.Builder> batchGetItemRequest) {
        return collect("batchGetItem", batchGetItemRequest, underlying::batchGetItem);
    }

    @Override
    public BatchWriteItemResponse batchWriteItem(BatchWriteItemRequest batchWriteItemRequest) {
        return collect("batchWriteItem", batchWriteItemRequest, underlying::batchWriteItem);
    }

    @Override
    public BatchWriteItemResponse batchWriteItem(Consumer<BatchWriteItemRequest.Builder> batchWriteItemRequest) {
        return collect("batchWriteItem", batchWriteItemRequest, underlying::batchWriteItem);
    }

    @Override
    public CreateBackupResponse createBackup(CreateBackupRequest createBackupRequest) {
        return collect("createBackup", createBackupRequest, underlying::createBackup);
    }

    @Override
    public CreateBackupResponse createBackup(Consumer<CreateBackupRequest.Builder> createBackupRequest) {
        return collect("createBackup", createBackupRequest, underlying::createBackup);
    }

    @Override
    public CreateGlobalTableResponse createGlobalTable(CreateGlobalTableRequest createGlobalTableRequest) {
        return collect("createGlobalTable", createGlobalTableRequest, underlying::createGlobalTable);
    }

    @Override
    public CreateGlobalTableResponse createGlobalTable(Consumer<CreateGlobalTableRequest.Builder> createGlobalTableRequest) {
        return collect("createGlobalTable", createGlobalTableRequest, underlying::createGlobalTable);
    }

    @Override
    public CreateTableResponse createTable(CreateTableRequest createTableRequest) {
        return collect("createTable", createTableRequest, underlying::createTable);
    }

    @Override
    public CreateTableResponse createTable(Consumer<CreateTableRequest.Builder> createTableRequest) {
        return collect("createTable", createTableRequest, underlying::createTable);
    }

    @Override
    public DeleteBackupResponse deleteBackup(DeleteBackupRequest deleteBackupRequest) {
        return collect("deleteBackup", deleteBackupRequest, underlying::deleteBackup);
    }

    @Override
    public DeleteBackupResponse deleteBackup(Consumer<DeleteBackupRequest.Builder> deleteBackupRequest) {
        return collect("deleteBackup", deleteBackupRequest, underlying::deleteBackup);
    }

    @Override
    public DeleteItemResponse deleteItem(DeleteItemRequest deleteItemRequest) {
        return collect("deleteItem", deleteItemRequest, underlying::deleteItem);
    }

    @Override
    public DeleteItemResponse deleteItem(Consumer<DeleteItemRequest.Builder> deleteItemRequest) {
        return collect("deleteItem", deleteItemRequest, underlying::deleteItem);
    }

    @Override
    public DeleteTableResponse deleteTable(DeleteTableRequest deleteTableRequest) {
        return collect("deleteTable", deleteTableRequest, underlying::deleteTable);
    }

    @Override
    public DeleteTableResponse deleteTable(Consumer<DeleteTableRequest.Builder> deleteTableRequest) {
        return collect("deleteTable", deleteTableRequest, underlying::deleteTable);
    }

    @Override
    public DescribeBackupResponse describeBackup(DescribeBackupRequest describeBackupRequest) {
        return collect("describeBackup", describeBackupRequest, underlying::describeBackup);
    }

    @Override
    public DescribeBackupResponse describeBackup(Consumer<DescribeBackupRequest.Builder> describeBackupRequest) {
        return collect("describeBackup", describeBackupRequest, underlying::describeBackup);
    }

    @Override
    public DescribeContinuousBackupsResponse describeContinuousBackups(DescribeContinuousBackupsRequest describeContinuousBackupsRequest) {
        return collect("describeContinuousBackups", describeContinuousBackupsRequest, underlying::describeContinuousBackups);
    }

    @Override
    public DescribeContinuousBackupsResponse describeContinuousBackups(Consumer<DescribeContinuousBackupsRequest.Builder> describeContinuousBackupsRequest) {
        return collect("describeContinuousBackups", describeContinuousBackupsRequest, underlying::describeContinuousBackups);
    }

    @Override
    public DescribeContributorInsightsResponse describeContributorInsights(DescribeContributorInsightsRequest describeContributorInsightsRequest) {
        return collect("describeContributorInsights", describeContributorInsightsRequest, underlying::describeContributorInsights);
    }

    @Override
    public DescribeContributorInsightsResponse describeContributorInsights(Consumer<DescribeContributorInsightsRequest.Builder> describeContributorInsightsRequest) {
        return collect("describeContributorInsights", describeContributorInsightsRequest, underlying::describeContributorInsights);
    }

    @Override
    public DescribeEndpointsResponse describeEndpoints(DescribeEndpointsRequest describeEndpointsRequest) {
        return collect("describeEndpoints", describeEndpointsRequest, underlying::describeEndpoints);
    }

    @Override
    public DescribeEndpointsResponse describeEndpoints(Consumer<DescribeEndpointsRequest.Builder> describeEndpointsRequest) {
        return collect("describeEndpoints", describeEndpointsRequest, underlying::describeEndpoints);
    }

    @Override
    public DescribeEndpointsResponse describeEndpoints() {
        return describeEndpoints(DescribeEndpointsRequest.builder().build());
    }

    @Override
    public DescribeGlobalTableResponse describeGlobalTable(DescribeGlobalTableRequest describeGlobalTableRequest) {
        return collect("describeGlobalTable", describeGlobalTableRequest, underlying::describeGlobalTable);
    }

    @Override
    public DescribeGlobalTableResponse describeGlobalTable(Consumer<DescribeGlobalTableRequest.Builder> describeGlobalTableRequest) {
        return collect("describeGlobalTable", describeGlobalTableRequest, underlying::describeGlobalTable);
    }

    @Override
    public DescribeGlobalTableSettingsResponse describeGlobalTableSettings(DescribeGlobalTableSettingsRequest describeGlobalTableSettingsRequest) {
        return collect("describeGlobalTableSettings", describeGlobalTableSettingsRequest, underlying::describeGlobalTableSettings);
    }

    @Override
    public DescribeGlobalTableSettingsResponse describeGlobalTableSettings(Consumer<DescribeGlobalTableSettingsRequest.Builder> describeGlobalTableSettingsRequest) {
        return collect("describeGlobalTableSettings", describeGlobalTableSettingsRequest, underlying::describeGlobalTableSettings);
    }

    @Override
    public DescribeLimitsResponse describeLimits(DescribeLimitsRequest describeLimitsRequest) {
        return collect("describeLimits", describeLimitsRequest, underlying::describeLimits);
    }

    @Override
    public DescribeLimitsResponse describeLimits(Consumer<DescribeLimitsRequest.Builder> describeLimitsRequest) {
        return collect("describeLimits", describeLimitsRequest, underlying::describeLimits);
    }

    @Override
    public DescribeLimitsResponse describeLimits() {
        return describeLimits(DescribeLimitsRequest.builder().build());
    }

    @Override
    public DescribeTableResponse describeTable(DescribeTableRequest describeTableRequest) {
        return collect("describeTable", describeTableRequest, underlying::describeTable);
    }

    @Override
    public DescribeTableResponse describeTable(Consumer<DescribeTableRequest.Builder> describeTableRequest) {
        return collect("describeTable", describeTableRequest, underlying::describeTable);
    }

    @Override
    public DescribeTableReplicaAutoScalingResponse describeTableReplicaAutoScaling(DescribeTableReplicaAutoScalingRequest describeTableReplicaAutoScalingRequest) {
        return collect("describeTableReplicaAutoScaling", describeTableReplicaAutoScalingRequest, underlying::describeTableReplicaAutoScaling);
    }

    @Override
    public DescribeTableReplicaAutoScalingResponse describeTableReplicaAutoScaling(Consumer<DescribeTableReplicaAutoScalingRequest.Builder> describeTableReplicaAutoScalingRequest) {
        return collect("describeTableReplicaAutoScaling", describeTableReplicaAutoScalingRequest, underlying::describeTableReplicaAutoScaling);
    }

    @Override
    public DescribeTimeToLiveResponse describeTimeToLive(DescribeTimeToLiveRequest describeTimeToLiveRequest) {
        return collect("describeTimeToLive", describeTimeToLiveRequest, underlying::describeTimeToLive);
    }

    @Override
    public DescribeTimeToLiveResponse describeTimeToLive(Consumer<DescribeTimeToLiveRequest.Builder> describeTimeToLiveRequest) {
        return collect("describeTimeToLive", describeTimeToLiveRequest, underlying::describeTimeToLive);
    }

    @Override
    public GetItemResponse getItem(GetItemRequest getItemRequest) {
        return collect("getItemRequest", getItemRequest, underlying::getItem);
    }

    @Override
    public GetItemResponse getItem(Consumer<GetItemRequest.Builder> getItemRequest) {
        return collect("getItemRequest", getItemRequest, underlying::getItem);
    }

    @Override
    public ListBackupsResponse listBackups(ListBackupsRequest listBackupsRequest) {
        return collect("listBackups", listBackupsRequest, underlying::listBackups);
    }

    @Override
    public ListBackupsResponse listBackups(Consumer<ListBackupsRequest.Builder> listBackupsRequest) {
        return collect("listBackups", listBackupsRequest, underlying::listBackups);
    }

    @Override
    public ListBackupsResponse listBackups() {
        return listBackups(ListBackupsRequest.builder().build());
    }

    @Override
    public ListContributorInsightsResponse listContributorInsights(ListContributorInsightsRequest listContributorInsightsRequest) {
        return collect("listContributorInsights", listContributorInsightsRequest, underlying::listContributorInsights);
    }

    @Override
    public ListContributorInsightsResponse listContributorInsights(Consumer<ListContributorInsightsRequest.Builder> listContributorInsightsRequest) {
        return collect("listContributorInsights", listContributorInsightsRequest, underlying::listContributorInsights);
    }

    @Override
    public ListGlobalTablesResponse listGlobalTables(ListGlobalTablesRequest listGlobalTablesRequest) {
        return collect("listGlobalTables", listGlobalTablesRequest, underlying::listGlobalTables);
    }

    @Override
    public ListGlobalTablesResponse listGlobalTables(Consumer<ListGlobalTablesRequest.Builder> listGlobalTablesRequest) {
        return collect("listGlobalTables", listGlobalTablesRequest, underlying::listGlobalTables);
    }

    @Override
    public ListGlobalTablesResponse listGlobalTables() {
        return listGlobalTables(ListGlobalTablesRequest.builder().build());
    }

    @Override
    public ListTablesResponse listTables(ListTablesRequest listTablesRequest) {
        return collect("listTables", listTablesRequest, underlying::listTables);
    }

    @Override
    public ListTablesResponse listTables(Consumer<ListTablesRequest.Builder> listTablesRequest) {
        return collect("listTables", listTablesRequest, underlying::listTables);
    }

    @Override
    public ListTablesResponse listTables() {
        return listTables(ListTablesRequest.builder().build());
    }

    @Override
    public ListTagsOfResourceResponse listTagsOfResource(ListTagsOfResourceRequest listTagsOfResourceRequest) {
        return collect("listTagsOfResource", listTagsOfResourceRequest, underlying::listTagsOfResource);
    }

    @Override
    public ListTagsOfResourceResponse listTagsOfResource(Consumer<ListTagsOfResourceRequest.Builder> listTagsOfResourceRequest) {
        return collect("listTagsOfResource", listTagsOfResourceRequest, underlying::listTagsOfResource);
    }

    @Override
    public PutItemResponse putItem(PutItemRequest putItemRequest) {
        return collect("putItem", putItemRequest, underlying::putItem);
    }

    @Override
    public PutItemResponse putItem(Consumer<PutItemRequest.Builder> putItemRequest) {
        return collect("putItem", putItemRequest, underlying::putItem);
    }

    @Override
    public QueryResponse query(QueryRequest queryRequest) {
        return collect("query", queryRequest, underlying::query);
    }

    @Override
    public QueryResponse query(Consumer<QueryRequest.Builder> queryRequest) {
        return collect("query", queryRequest, underlying::query);
    }

    @Override
    public RestoreTableFromBackupResponse restoreTableFromBackup(RestoreTableFromBackupRequest restoreTableFromBackupRequest) {
        return collect("restoreTableFromBackup", restoreTableFromBackupRequest, underlying::restoreTableFromBackup);
    }

    @Override
    public RestoreTableFromBackupResponse restoreTableFromBackup(Consumer<RestoreTableFromBackupRequest.Builder> restoreTableFromBackupRequest) {
        return collect("restoreTableFromBackup", restoreTableFromBackupRequest, underlying::restoreTableFromBackup);
    }

    @Override
    public RestoreTableToPointInTimeResponse restoreTableToPointInTime(RestoreTableToPointInTimeRequest restoreTableToPointInTimeRequest) {
        return collect("restoreTableToPointInTime", restoreTableToPointInTimeRequest, underlying::restoreTableToPointInTime);
    }

    @Override
    public RestoreTableToPointInTimeResponse restoreTableToPointInTime(Consumer<RestoreTableToPointInTimeRequest.Builder> restoreTableToPointInTimeRequest) {
        return collect("restoreTableToPointInTime", restoreTableToPointInTimeRequest, underlying::restoreTableToPointInTime);
    }

    @Override
    public ScanResponse scan(ScanRequest scanRequest) {
        return collect("scan", scanRequest, underlying::scan);
    }

    @Override
    public ScanResponse scan(Consumer<ScanRequest.Builder> scanRequest) {
        return collect("scan", scanRequest, underlying::scan);
    }

    @Override
    public TagResourceResponse tagResource(TagResourceRequest tagResourceRequest) {
        return collect("tagResource", tagResourceRequest, underlying::tagResource);
    }

    @Override
    public TagResourceResponse tagResource(Consumer<TagResourceRequest.Builder> tagResourceRequest) {
        return collect("tagResource", tagResourceRequest, underlying::tagResource);
    }

    @Override
    public TransactGetItemsResponse transactGetItems(TransactGetItemsRequest transactGetItemsRequest) {
        return collect("transactGetItems", transactGetItemsRequest, underlying::transactGetItems);
    }

    @Override
    public TransactGetItemsResponse transactGetItems(Consumer<TransactGetItemsRequest.Builder> transactGetItemsRequest) {
        return collect("transactGetItems", transactGetItemsRequest, underlying::transactGetItems);
    }

    @Override
    public TransactWriteItemsResponse transactWriteItems(TransactWriteItemsRequest transactWriteItemsRequest) {
        return collect("transactWriteItems", transactWriteItemsRequest, underlying::transactWriteItems);
    }

    @Override
    public TransactWriteItemsResponse transactWriteItems(Consumer<TransactWriteItemsRequest.Builder> transactWriteItemsRequest) {
        return collect("transactWriteItems", transactWriteItemsRequest, underlying::transactWriteItems);
    }

    @Override
    public UntagResourceResponse untagResource(UntagResourceRequest untagResourceRequest) {
        return collect("untagResource", untagResourceRequest, underlying::untagResource);
    }

    @Override
    public UntagResourceResponse untagResource(Consumer<UntagResourceRequest.Builder> untagResourceRequest) {
        return collect("untagResource", untagResourceRequest, underlying::untagResource);
    }

    @Override
    public UpdateContinuousBackupsResponse updateContinuousBackups(UpdateContinuousBackupsRequest updateContinuousBackupsRequest) {
        return collect("updateContinuousBackups", updateContinuousBackupsRequest, underlying::updateContinuousBackups);
    }

    @Override
    public UpdateContinuousBackupsResponse updateContinuousBackups(Consumer<UpdateContinuousBackupsRequest.Builder> updateContinuousBackupsRequest) {
        return collect("updateContinuousBackups", updateContinuousBackupsRequest, underlying::updateContinuousBackups);
    }

    @Override
    public UpdateContributorInsightsResponse updateContributorInsights(UpdateContributorInsightsRequest updateContributorInsightsRequest) {
        return collect("updateContributorInsights", updateContributorInsightsRequest, underlying::updateContributorInsights);
    }

    @Override
    public UpdateContributorInsightsResponse updateContributorInsights(Consumer<UpdateContributorInsightsRequest.Builder> updateContributorInsightsRequest) {
        return collect("updateContributorInsights", updateContributorInsightsRequest, underlying::updateContributorInsights);
    }

    @Override
    public UpdateGlobalTableResponse updateGlobalTable(UpdateGlobalTableRequest updateGlobalTableRequest) {
        return collect("updateGlobalTable", updateGlobalTableRequest, underlying::updateGlobalTable);
    }

    @Override
    public UpdateGlobalTableResponse updateGlobalTable(Consumer<UpdateGlobalTableRequest.Builder> updateGlobalTableRequest) {
        return collect("updateGlobalTable", updateGlobalTableRequest, underlying::updateGlobalTable);
    }

    @Override
    public UpdateGlobalTableSettingsResponse updateGlobalTableSettings(UpdateGlobalTableSettingsRequest updateGlobalTableSettingsRequest) {
        return collect("updateGlobalTableSettings", updateGlobalTableSettingsRequest, underlying::updateGlobalTableSettings);
    }

    @Override
    public UpdateGlobalTableSettingsResponse updateGlobalTableSettings(Consumer<UpdateGlobalTableSettingsRequest.Builder> updateGlobalTableSettingsRequest) {
        return collect("updateGlobalTableSettings", updateGlobalTableSettingsRequest, underlying::updateGlobalTableSettings);
    }

    @Override
    public UpdateItemResponse updateItem(UpdateItemRequest updateItemRequest) {
        return collect("updateItem", updateItemRequest, underlying::updateItem);
    }

    @Override
    public UpdateItemResponse updateItem(Consumer<UpdateItemRequest.Builder> updateItemRequest) {
        return collect("updateItem", updateItemRequest, underlying::updateItem);
    }

    @Override
    public UpdateTableResponse updateTable(UpdateTableRequest updateTableRequest) {
        return collect("updateTable", updateTableRequest, underlying::updateTable);
    }

    @Override
    public UpdateTableResponse updateTable(Consumer<UpdateTableRequest.Builder> updateTableRequest) {
        return collect("updateTable", updateTableRequest, underlying::updateTable);
    }

    @Override
    public UpdateTableReplicaAutoScalingResponse updateTableReplicaAutoScaling(UpdateTableReplicaAutoScalingRequest updateTableReplicaAutoScalingRequest) {
        return collect("updateTableReplicaAutoScaling", updateTableReplicaAutoScalingRequest, underlying::updateTableReplicaAutoScaling);
    }

    @Override
    public UpdateTableReplicaAutoScalingResponse updateTableReplicaAutoScaling(Consumer<UpdateTableReplicaAutoScalingRequest.Builder> updateTableReplicaAutoScalingRequest) {
        return collect("updateTableReplicaAutoScaling", updateTableReplicaAutoScalingRequest, underlying::updateTableReplicaAutoScaling);
    }

    @Override
    public UpdateTimeToLiveResponse updateTimeToLive(UpdateTimeToLiveRequest updateTimeToLiveRequest) {
        return collect("updateTimeToLive", updateTimeToLiveRequest, underlying::updateTimeToLive);
    }

    @Override
    public UpdateTimeToLiveResponse updateTimeToLive(Consumer<UpdateTimeToLiveRequest.Builder> updateTimeToLiveRequest) {
        return collect("updateTimeToLive", updateTimeToLiveRequest, underlying::updateTimeToLive);
    }
}
