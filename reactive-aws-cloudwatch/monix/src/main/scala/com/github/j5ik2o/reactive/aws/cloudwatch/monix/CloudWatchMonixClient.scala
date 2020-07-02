// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.monix

import software.amazon.awssdk.services.cloudwatch.model._
import com.github.j5ik2o.reactive.aws.cloudwatch.{ CloudWatchAsyncClient, CloudWatchClient }
import monix.eval.Task
import monix.reactive.Observable

object CloudWatchMonixClient {

  def apply(asyncClient: CloudWatchAsyncClient): CloudWatchMonixClient =
    new CloudWatchMonixClient {
      override val underlying: CloudWatchAsyncClient = asyncClient
    }

}

trait CloudWatchMonixClient extends CloudWatchClient[Task] {

  val underlying: CloudWatchAsyncClient

  override def deleteAlarms(deleteAlarmsRequest: DeleteAlarmsRequest): Task[DeleteAlarmsResponse] =
    Task.deferFuture {
      underlying.deleteAlarms(deleteAlarmsRequest)
    }

  override def deleteAnomalyDetector(
      deleteAnomalyDetectorRequest: DeleteAnomalyDetectorRequest
  ): Task[DeleteAnomalyDetectorResponse] =
    Task.deferFuture {
      underlying.deleteAnomalyDetector(deleteAnomalyDetectorRequest)
    }

  override def deleteDashboards(deleteDashboardsRequest: DeleteDashboardsRequest): Task[DeleteDashboardsResponse] =
    Task.deferFuture {
      underlying.deleteDashboards(deleteDashboardsRequest)
    }

  override def deleteInsightRules(
      deleteInsightRulesRequest: DeleteInsightRulesRequest
  ): Task[DeleteInsightRulesResponse] =
    Task.deferFuture {
      underlying.deleteInsightRules(deleteInsightRulesRequest)
    }

  override def describeAlarmHistory(
      describeAlarmHistoryRequest: DescribeAlarmHistoryRequest
  ): Task[DescribeAlarmHistoryResponse] =
    Task.deferFuture {
      underlying.describeAlarmHistory(describeAlarmHistoryRequest)
    }

  override def describeAlarmHistory(): Task[DescribeAlarmHistoryResponse] =
    Task.deferFuture {
      underlying.describeAlarmHistory()
    }

  def describeAlarmHistoryPaginator(): Observable[DescribeAlarmHistoryResponse] =
    Observable.fromReactivePublisher(underlying.describeAlarmHistoryPaginator())

  def describeAlarmHistoryPaginator(
      describeAlarmHistoryRequest: DescribeAlarmHistoryRequest
  ): Observable[DescribeAlarmHistoryResponse] =
    Observable.fromReactivePublisher(underlying.describeAlarmHistoryPaginator(describeAlarmHistoryRequest))

  override def describeAlarms(describeAlarmsRequest: DescribeAlarmsRequest): Task[DescribeAlarmsResponse] =
    Task.deferFuture {
      underlying.describeAlarms(describeAlarmsRequest)
    }

  override def describeAlarms(): Task[DescribeAlarmsResponse] =
    Task.deferFuture {
      underlying.describeAlarms()
    }

  override def describeAlarmsForMetric(
      describeAlarmsForMetricRequest: DescribeAlarmsForMetricRequest
  ): Task[DescribeAlarmsForMetricResponse] =
    Task.deferFuture {
      underlying.describeAlarmsForMetric(describeAlarmsForMetricRequest)
    }

  def describeAlarmsPaginator(): Observable[DescribeAlarmsResponse] =
    Observable.fromReactivePublisher(underlying.describeAlarmsPaginator())

  def describeAlarmsPaginator(describeAlarmsRequest: DescribeAlarmsRequest): Observable[DescribeAlarmsResponse] =
    Observable.fromReactivePublisher(underlying.describeAlarmsPaginator(describeAlarmsRequest))

  override def describeAnomalyDetectors(
      describeAnomalyDetectorsRequest: DescribeAnomalyDetectorsRequest
  ): Task[DescribeAnomalyDetectorsResponse] =
    Task.deferFuture {
      underlying.describeAnomalyDetectors(describeAnomalyDetectorsRequest)
    }

  override def describeInsightRules(
      describeInsightRulesRequest: DescribeInsightRulesRequest
  ): Task[DescribeInsightRulesResponse] =
    Task.deferFuture {
      underlying.describeInsightRules(describeInsightRulesRequest)
    }

  def describeInsightRulesPaginator(
      describeInsightRulesRequest: DescribeInsightRulesRequest
  ): Observable[DescribeInsightRulesResponse] =
    Observable.fromReactivePublisher(underlying.describeInsightRulesPaginator(describeInsightRulesRequest))

  override def disableAlarmActions(
      disableAlarmActionsRequest: DisableAlarmActionsRequest
  ): Task[DisableAlarmActionsResponse] =
    Task.deferFuture {
      underlying.disableAlarmActions(disableAlarmActionsRequest)
    }

  override def disableInsightRules(
      disableInsightRulesRequest: DisableInsightRulesRequest
  ): Task[DisableInsightRulesResponse] =
    Task.deferFuture {
      underlying.disableInsightRules(disableInsightRulesRequest)
    }

  override def enableAlarmActions(
      enableAlarmActionsRequest: EnableAlarmActionsRequest
  ): Task[EnableAlarmActionsResponse] =
    Task.deferFuture {
      underlying.enableAlarmActions(enableAlarmActionsRequest)
    }

  override def enableInsightRules(
      enableInsightRulesRequest: EnableInsightRulesRequest
  ): Task[EnableInsightRulesResponse] =
    Task.deferFuture {
      underlying.enableInsightRules(enableInsightRulesRequest)
    }

  override def getDashboard(getDashboardRequest: GetDashboardRequest): Task[GetDashboardResponse] =
    Task.deferFuture {
      underlying.getDashboard(getDashboardRequest)
    }

  override def getInsightRuleReport(
      getInsightRuleReportRequest: GetInsightRuleReportRequest
  ): Task[GetInsightRuleReportResponse] =
    Task.deferFuture {
      underlying.getInsightRuleReport(getInsightRuleReportRequest)
    }

  override def getMetricData(getMetricDataRequest: GetMetricDataRequest): Task[GetMetricDataResponse] =
    Task.deferFuture {
      underlying.getMetricData(getMetricDataRequest)
    }

  def getMetricDataPaginator(getMetricDataRequest: GetMetricDataRequest): Observable[GetMetricDataResponse] =
    Observable.fromReactivePublisher(underlying.getMetricDataPaginator(getMetricDataRequest))

  override def getMetricStatistics(
      getMetricStatisticsRequest: GetMetricStatisticsRequest
  ): Task[GetMetricStatisticsResponse] =
    Task.deferFuture {
      underlying.getMetricStatistics(getMetricStatisticsRequest)
    }

  override def getMetricWidgetImage(
      getMetricWidgetImageRequest: GetMetricWidgetImageRequest
  ): Task[GetMetricWidgetImageResponse] =
    Task.deferFuture {
      underlying.getMetricWidgetImage(getMetricWidgetImageRequest)
    }

  override def listDashboards(listDashboardsRequest: ListDashboardsRequest): Task[ListDashboardsResponse] =
    Task.deferFuture {
      underlying.listDashboards(listDashboardsRequest)
    }

  override def listDashboards(): Task[ListDashboardsResponse] =
    Task.deferFuture {
      underlying.listDashboards()
    }

  def listDashboardsPaginator(): Observable[ListDashboardsResponse] =
    Observable.fromReactivePublisher(underlying.listDashboardsPaginator())

  def listDashboardsPaginator(listDashboardsRequest: ListDashboardsRequest): Observable[ListDashboardsResponse] =
    Observable.fromReactivePublisher(underlying.listDashboardsPaginator(listDashboardsRequest))

  override def listMetrics(listMetricsRequest: ListMetricsRequest): Task[ListMetricsResponse] =
    Task.deferFuture {
      underlying.listMetrics(listMetricsRequest)
    }

  override def listMetrics(): Task[ListMetricsResponse] =
    Task.deferFuture {
      underlying.listMetrics()
    }

  def listMetricsPaginator(): Observable[ListMetricsResponse] =
    Observable.fromReactivePublisher(underlying.listMetricsPaginator())

  def listMetricsPaginator(listMetricsRequest: ListMetricsRequest): Observable[ListMetricsResponse] =
    Observable.fromReactivePublisher(underlying.listMetricsPaginator(listMetricsRequest))

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): Task[ListTagsForResourceResponse] =
    Task.deferFuture {
      underlying.listTagsForResource(listTagsForResourceRequest)
    }

  override def putAnomalyDetector(
      putAnomalyDetectorRequest: PutAnomalyDetectorRequest
  ): Task[PutAnomalyDetectorResponse] =
    Task.deferFuture {
      underlying.putAnomalyDetector(putAnomalyDetectorRequest)
    }

  override def putCompositeAlarm(putCompositeAlarmRequest: PutCompositeAlarmRequest): Task[PutCompositeAlarmResponse] =
    Task.deferFuture {
      underlying.putCompositeAlarm(putCompositeAlarmRequest)
    }

  override def putDashboard(putDashboardRequest: PutDashboardRequest): Task[PutDashboardResponse] =
    Task.deferFuture {
      underlying.putDashboard(putDashboardRequest)
    }

  override def putInsightRule(putInsightRuleRequest: PutInsightRuleRequest): Task[PutInsightRuleResponse] =
    Task.deferFuture {
      underlying.putInsightRule(putInsightRuleRequest)
    }

  override def putMetricAlarm(putMetricAlarmRequest: PutMetricAlarmRequest): Task[PutMetricAlarmResponse] =
    Task.deferFuture {
      underlying.putMetricAlarm(putMetricAlarmRequest)
    }

  override def putMetricData(putMetricDataRequest: PutMetricDataRequest): Task[PutMetricDataResponse] =
    Task.deferFuture {
      underlying.putMetricData(putMetricDataRequest)
    }

  override def setAlarmState(setAlarmStateRequest: SetAlarmStateRequest): Task[SetAlarmStateResponse] =
    Task.deferFuture {
      underlying.setAlarmState(setAlarmStateRequest)
    }

  override def tagResource(tagResourceRequest: TagResourceRequest): Task[TagResourceResponse] =
    Task.deferFuture {
      underlying.tagResource(tagResourceRequest)
    }

  override def untagResource(untagResourceRequest: UntagResourceRequest): Task[UntagResourceResponse] =
    Task.deferFuture {
      underlying.untagResource(untagResourceRequest)
    }

}
