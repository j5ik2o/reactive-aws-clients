// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch

import software.amazon.awssdk.services.cloudwatch.model._
import software.amazon.awssdk.services.cloudwatch.paginators._
import software.amazon.awssdk.services.cloudwatch.{ CloudWatchAsyncClient => JavaCloudWatchAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object CloudWatchAsyncClient {

  def apply(javaClient: JavaCloudWatchAsyncClient): CloudWatchAsyncClient =
    new CloudWatchAsyncClient {
      override val underlying: JavaCloudWatchAsyncClient = javaClient
    }

}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/cloudwatch/CloudWatchAsyncClient.html */
trait CloudWatchAsyncClient extends CloudWatchClient[Future] {
  val underlying: JavaCloudWatchAsyncClient

  override def deleteAlarms(deleteAlarmsRequest: DeleteAlarmsRequest): Future[DeleteAlarmsResponse] =
    underlying.deleteAlarms(deleteAlarmsRequest).toScala

  override def deleteAnomalyDetector(
      deleteAnomalyDetectorRequest: DeleteAnomalyDetectorRequest
  ): Future[DeleteAnomalyDetectorResponse] =
    underlying.deleteAnomalyDetector(deleteAnomalyDetectorRequest).toScala

  override def deleteDashboards(deleteDashboardsRequest: DeleteDashboardsRequest): Future[DeleteDashboardsResponse] =
    underlying.deleteDashboards(deleteDashboardsRequest).toScala

  override def deleteInsightRules(
      deleteInsightRulesRequest: DeleteInsightRulesRequest
  ): Future[DeleteInsightRulesResponse] =
    underlying.deleteInsightRules(deleteInsightRulesRequest).toScala

  override def describeAlarmHistory(
      describeAlarmHistoryRequest: DescribeAlarmHistoryRequest
  ): Future[DescribeAlarmHistoryResponse] =
    underlying.describeAlarmHistory(describeAlarmHistoryRequest).toScala

  override def describeAlarmHistory(): Future[DescribeAlarmHistoryResponse] =
    underlying.describeAlarmHistory().toScala

  def describeAlarmHistoryPaginator(): DescribeAlarmHistoryPublisher =
    underlying.describeAlarmHistoryPaginator()

  def describeAlarmHistoryPaginator(
      describeAlarmHistoryRequest: DescribeAlarmHistoryRequest
  ): DescribeAlarmHistoryPublisher =
    underlying.describeAlarmHistoryPaginator(describeAlarmHistoryRequest)

  override def describeAlarms(describeAlarmsRequest: DescribeAlarmsRequest): Future[DescribeAlarmsResponse] =
    underlying.describeAlarms(describeAlarmsRequest).toScala

  override def describeAlarms(): Future[DescribeAlarmsResponse] =
    underlying.describeAlarms().toScala

  override def describeAlarmsForMetric(
      describeAlarmsForMetricRequest: DescribeAlarmsForMetricRequest
  ): Future[DescribeAlarmsForMetricResponse] =
    underlying.describeAlarmsForMetric(describeAlarmsForMetricRequest).toScala

  def describeAlarmsPaginator(): DescribeAlarmsPublisher =
    underlying.describeAlarmsPaginator()

  def describeAlarmsPaginator(describeAlarmsRequest: DescribeAlarmsRequest): DescribeAlarmsPublisher =
    underlying.describeAlarmsPaginator(describeAlarmsRequest)

  override def describeAnomalyDetectors(
      describeAnomalyDetectorsRequest: DescribeAnomalyDetectorsRequest
  ): Future[DescribeAnomalyDetectorsResponse] =
    underlying.describeAnomalyDetectors(describeAnomalyDetectorsRequest).toScala

  override def describeInsightRules(
      describeInsightRulesRequest: DescribeInsightRulesRequest
  ): Future[DescribeInsightRulesResponse] =
    underlying.describeInsightRules(describeInsightRulesRequest).toScala

  def describeInsightRulesPaginator(
      describeInsightRulesRequest: DescribeInsightRulesRequest
  ): DescribeInsightRulesPublisher =
    underlying.describeInsightRulesPaginator(describeInsightRulesRequest)

  override def disableAlarmActions(
      disableAlarmActionsRequest: DisableAlarmActionsRequest
  ): Future[DisableAlarmActionsResponse] =
    underlying.disableAlarmActions(disableAlarmActionsRequest).toScala

  override def disableInsightRules(
      disableInsightRulesRequest: DisableInsightRulesRequest
  ): Future[DisableInsightRulesResponse] =
    underlying.disableInsightRules(disableInsightRulesRequest).toScala

  override def enableAlarmActions(
      enableAlarmActionsRequest: EnableAlarmActionsRequest
  ): Future[EnableAlarmActionsResponse] =
    underlying.enableAlarmActions(enableAlarmActionsRequest).toScala

  override def enableInsightRules(
      enableInsightRulesRequest: EnableInsightRulesRequest
  ): Future[EnableInsightRulesResponse] =
    underlying.enableInsightRules(enableInsightRulesRequest).toScala

  override def getDashboard(getDashboardRequest: GetDashboardRequest): Future[GetDashboardResponse] =
    underlying.getDashboard(getDashboardRequest).toScala

  override def getInsightRuleReport(
      getInsightRuleReportRequest: GetInsightRuleReportRequest
  ): Future[GetInsightRuleReportResponse] =
    underlying.getInsightRuleReport(getInsightRuleReportRequest).toScala

  override def getMetricData(getMetricDataRequest: GetMetricDataRequest): Future[GetMetricDataResponse] =
    underlying.getMetricData(getMetricDataRequest).toScala

  def getMetricDataPaginator(getMetricDataRequest: GetMetricDataRequest): GetMetricDataPublisher =
    underlying.getMetricDataPaginator(getMetricDataRequest)

  override def getMetricStatistics(
      getMetricStatisticsRequest: GetMetricStatisticsRequest
  ): Future[GetMetricStatisticsResponse] =
    underlying.getMetricStatistics(getMetricStatisticsRequest).toScala

  override def getMetricWidgetImage(
      getMetricWidgetImageRequest: GetMetricWidgetImageRequest
  ): Future[GetMetricWidgetImageResponse] =
    underlying.getMetricWidgetImage(getMetricWidgetImageRequest).toScala

  override def listDashboards(listDashboardsRequest: ListDashboardsRequest): Future[ListDashboardsResponse] =
    underlying.listDashboards(listDashboardsRequest).toScala

  override def listDashboards(): Future[ListDashboardsResponse] =
    underlying.listDashboards().toScala

  def listDashboardsPaginator(): ListDashboardsPublisher =
    underlying.listDashboardsPaginator()

  def listDashboardsPaginator(listDashboardsRequest: ListDashboardsRequest): ListDashboardsPublisher =
    underlying.listDashboardsPaginator(listDashboardsRequest)

  override def listMetrics(listMetricsRequest: ListMetricsRequest): Future[ListMetricsResponse] =
    underlying.listMetrics(listMetricsRequest).toScala

  override def listMetrics(): Future[ListMetricsResponse] =
    underlying.listMetrics().toScala

  def listMetricsPaginator(): ListMetricsPublisher =
    underlying.listMetricsPaginator()

  def listMetricsPaginator(listMetricsRequest: ListMetricsRequest): ListMetricsPublisher =
    underlying.listMetricsPaginator(listMetricsRequest)

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): Future[ListTagsForResourceResponse] =
    underlying.listTagsForResource(listTagsForResourceRequest).toScala

  override def putAnomalyDetector(
      putAnomalyDetectorRequest: PutAnomalyDetectorRequest
  ): Future[PutAnomalyDetectorResponse] =
    underlying.putAnomalyDetector(putAnomalyDetectorRequest).toScala

  override def putCompositeAlarm(
      putCompositeAlarmRequest: PutCompositeAlarmRequest
  ): Future[PutCompositeAlarmResponse] =
    underlying.putCompositeAlarm(putCompositeAlarmRequest).toScala

  override def putDashboard(putDashboardRequest: PutDashboardRequest): Future[PutDashboardResponse] =
    underlying.putDashboard(putDashboardRequest).toScala

  override def putInsightRule(putInsightRuleRequest: PutInsightRuleRequest): Future[PutInsightRuleResponse] =
    underlying.putInsightRule(putInsightRuleRequest).toScala

  override def putMetricAlarm(putMetricAlarmRequest: PutMetricAlarmRequest): Future[PutMetricAlarmResponse] =
    underlying.putMetricAlarm(putMetricAlarmRequest).toScala

  override def putMetricData(putMetricDataRequest: PutMetricDataRequest): Future[PutMetricDataResponse] =
    underlying.putMetricData(putMetricDataRequest).toScala

  override def setAlarmState(setAlarmStateRequest: SetAlarmStateRequest): Future[SetAlarmStateResponse] =
    underlying.setAlarmState(setAlarmStateRequest).toScala

  override def tagResource(tagResourceRequest: TagResourceRequest): Future[TagResourceResponse] =
    underlying.tagResource(tagResourceRequest).toScala

  override def untagResource(untagResourceRequest: UntagResourceRequest): Future[UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest).toScala

}
