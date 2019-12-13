// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch

import software.amazon.awssdk.services.cloudwatch.model._

trait CloudWatchClient[M[_]] {

  def deleteAlarms(deleteAlarmsRequest: DeleteAlarmsRequest): M[DeleteAlarmsResponse]

  def deleteAnomalyDetector(
      deleteAnomalyDetectorRequest: DeleteAnomalyDetectorRequest
  ): M[DeleteAnomalyDetectorResponse]

  def deleteDashboards(deleteDashboardsRequest: DeleteDashboardsRequest): M[DeleteDashboardsResponse]

  def deleteInsightRules(deleteInsightRulesRequest: DeleteInsightRulesRequest): M[DeleteInsightRulesResponse]

  def describeAlarmHistory(describeAlarmHistoryRequest: DescribeAlarmHistoryRequest): M[DescribeAlarmHistoryResponse]

  def describeAlarmHistory(): M[DescribeAlarmHistoryResponse]

  def describeAlarms(describeAlarmsRequest: DescribeAlarmsRequest): M[DescribeAlarmsResponse]

  def describeAlarms(): M[DescribeAlarmsResponse]

  def describeAlarmsForMetric(
      describeAlarmsForMetricRequest: DescribeAlarmsForMetricRequest
  ): M[DescribeAlarmsForMetricResponse]

  def describeAnomalyDetectors(
      describeAnomalyDetectorsRequest: DescribeAnomalyDetectorsRequest
  ): M[DescribeAnomalyDetectorsResponse]

  def describeInsightRules(describeInsightRulesRequest: DescribeInsightRulesRequest): M[DescribeInsightRulesResponse]

  def disableAlarmActions(disableAlarmActionsRequest: DisableAlarmActionsRequest): M[DisableAlarmActionsResponse]

  def disableInsightRules(disableInsightRulesRequest: DisableInsightRulesRequest): M[DisableInsightRulesResponse]

  def enableAlarmActions(enableAlarmActionsRequest: EnableAlarmActionsRequest): M[EnableAlarmActionsResponse]

  def enableInsightRules(enableInsightRulesRequest: EnableInsightRulesRequest): M[EnableInsightRulesResponse]

  def getDashboard(getDashboardRequest: GetDashboardRequest): M[GetDashboardResponse]

  def getInsightRuleReport(getInsightRuleReportRequest: GetInsightRuleReportRequest): M[GetInsightRuleReportResponse]

  def getMetricData(getMetricDataRequest: GetMetricDataRequest): M[GetMetricDataResponse]

  def getMetricStatistics(getMetricStatisticsRequest: GetMetricStatisticsRequest): M[GetMetricStatisticsResponse]

  def getMetricWidgetImage(getMetricWidgetImageRequest: GetMetricWidgetImageRequest): M[GetMetricWidgetImageResponse]

  def listDashboards(listDashboardsRequest: ListDashboardsRequest): M[ListDashboardsResponse]

  def listDashboards(): M[ListDashboardsResponse]

  def listMetrics(listMetricsRequest: ListMetricsRequest): M[ListMetricsResponse]

  def listMetrics(): M[ListMetricsResponse]

  def listTagsForResource(listTagsForResourceRequest: ListTagsForResourceRequest): M[ListTagsForResourceResponse]

  def putAnomalyDetector(putAnomalyDetectorRequest: PutAnomalyDetectorRequest): M[PutAnomalyDetectorResponse]

  def putDashboard(putDashboardRequest: PutDashboardRequest): M[PutDashboardResponse]

  def putInsightRule(putInsightRuleRequest: PutInsightRuleRequest): M[PutInsightRuleResponse]

  def putMetricAlarm(putMetricAlarmRequest: PutMetricAlarmRequest): M[PutMetricAlarmResponse]

  def putMetricData(putMetricDataRequest: PutMetricDataRequest): M[PutMetricDataResponse]

  def setAlarmState(setAlarmStateRequest: SetAlarmStateRequest): M[SetAlarmStateResponse]

  def tagResource(tagResourceRequest: TagResourceRequest): M[TagResourceResponse]

  def untagResource(untagResourceRequest: UntagResourceRequest): M[UntagResourceResponse]

}
