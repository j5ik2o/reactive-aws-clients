// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch

import software.amazon.awssdk.services.cloudwatch.model._

trait CloudWatchClient[M[_]] {

  def deleteAlarms(deleteAlarmsRequest: DeleteAlarmsRequest): M[DeleteAlarmsResponse]

  def deleteDashboards(deleteDashboardsRequest: DeleteDashboardsRequest): M[DeleteDashboardsResponse]

  def describeAlarmHistory(describeAlarmHistoryRequest: DescribeAlarmHistoryRequest): M[DescribeAlarmHistoryResponse]

  def describeAlarmHistory(): M[DescribeAlarmHistoryResponse]

  def describeAlarms(describeAlarmsRequest: DescribeAlarmsRequest): M[DescribeAlarmsResponse]

  def describeAlarms(): M[DescribeAlarmsResponse]

  def describeAlarmsForMetric(
      describeAlarmsForMetricRequest: DescribeAlarmsForMetricRequest
  ): M[DescribeAlarmsForMetricResponse]

  def disableAlarmActions(disableAlarmActionsRequest: DisableAlarmActionsRequest): M[DisableAlarmActionsResponse]

  def enableAlarmActions(enableAlarmActionsRequest: EnableAlarmActionsRequest): M[EnableAlarmActionsResponse]

  def getDashboard(getDashboardRequest: GetDashboardRequest): M[GetDashboardResponse]

  def getMetricData(getMetricDataRequest: GetMetricDataRequest): M[GetMetricDataResponse]

  def getMetricStatistics(getMetricStatisticsRequest: GetMetricStatisticsRequest): M[GetMetricStatisticsResponse]

  def getMetricWidgetImage(getMetricWidgetImageRequest: GetMetricWidgetImageRequest): M[GetMetricWidgetImageResponse]

  def listDashboards(listDashboardsRequest: ListDashboardsRequest): M[ListDashboardsResponse]

  def listDashboards(): M[ListDashboardsResponse]

  def listMetrics(listMetricsRequest: ListMetricsRequest): M[ListMetricsResponse]

  def listMetrics(): M[ListMetricsResponse]

  def putDashboard(putDashboardRequest: PutDashboardRequest): M[PutDashboardResponse]

  def putMetricAlarm(putMetricAlarmRequest: PutMetricAlarmRequest): M[PutMetricAlarmResponse]

  def putMetricData(putMetricDataRequest: PutMetricDataRequest): M[PutMetricDataResponse]

  def setAlarmState(setAlarmStateRequest: SetAlarmStateRequest): M[SetAlarmStateResponse]

}
