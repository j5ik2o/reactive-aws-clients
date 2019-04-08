// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.cloudwatch.model._
import software.amazon.awssdk.services.cloudwatch.paginators._
import software.amazon.awssdk.services.cloudwatch.{ CloudWatchClient => JavaCloudWatchSyncClient }

object CloudWatchSyncClient extends ToEitherSupport {

  def apply(javaClient: JavaCloudWatchSyncClient): CloudWatchSyncClient =
    new CloudWatchSyncClient {
      override val underlying: JavaCloudWatchSyncClient = javaClient
    }
}

trait CloudWatchSyncClient extends CloudWatchClient[Either[Throwable, ?]] {
  val underlying: JavaCloudWatchSyncClient

  import CloudWatchSyncClient._

  override def deleteAlarms(deleteAlarmsRequest: DeleteAlarmsRequest): Either[Throwable, DeleteAlarmsResponse] =
    underlying.deleteAlarms(deleteAlarmsRequest).toEither

  override def deleteDashboards(
      deleteDashboardsRequest: DeleteDashboardsRequest
  ): Either[Throwable, DeleteDashboardsResponse] =
    underlying.deleteDashboards(deleteDashboardsRequest).toEither

  override def describeAlarmHistory(): Either[Throwable, DescribeAlarmHistoryResponse] =
    underlying.describeAlarmHistory().toEither

  override def describeAlarmHistory(
      describeAlarmHistoryRequest: DescribeAlarmHistoryRequest
  ): Either[Throwable, DescribeAlarmHistoryResponse] =
    underlying.describeAlarmHistory(describeAlarmHistoryRequest).toEither

  def describeAlarmHistoryPaginator(): DescribeAlarmHistoryIterable =
    underlying.describeAlarmHistoryPaginator()

  def describeAlarmHistoryPaginator(
      describeAlarmHistoryRequest: DescribeAlarmHistoryRequest
  ): DescribeAlarmHistoryIterable =
    underlying.describeAlarmHistoryPaginator(describeAlarmHistoryRequest)

  override def describeAlarms(): Either[Throwable, DescribeAlarmsResponse] =
    underlying.describeAlarms().toEither

  override def describeAlarms(describeAlarmsRequest: DescribeAlarmsRequest): Either[Throwable, DescribeAlarmsResponse] =
    underlying.describeAlarms(describeAlarmsRequest).toEither

  def describeAlarmsPaginator(): DescribeAlarmsIterable =
    underlying.describeAlarmsPaginator()

  def describeAlarmsPaginator(describeAlarmsRequest: DescribeAlarmsRequest): DescribeAlarmsIterable =
    underlying.describeAlarmsPaginator(describeAlarmsRequest)

  override def describeAlarmsForMetric(
      describeAlarmsForMetricRequest: DescribeAlarmsForMetricRequest
  ): Either[Throwable, DescribeAlarmsForMetricResponse] =
    underlying.describeAlarmsForMetric(describeAlarmsForMetricRequest).toEither

  override def disableAlarmActions(
      disableAlarmActionsRequest: DisableAlarmActionsRequest
  ): Either[Throwable, DisableAlarmActionsResponse] =
    underlying.disableAlarmActions(disableAlarmActionsRequest).toEither

  override def enableAlarmActions(
      enableAlarmActionsRequest: EnableAlarmActionsRequest
  ): Either[Throwable, EnableAlarmActionsResponse] =
    underlying.enableAlarmActions(enableAlarmActionsRequest).toEither

  override def getDashboard(getDashboardRequest: GetDashboardRequest): Either[Throwable, GetDashboardResponse] =
    underlying.getDashboard(getDashboardRequest).toEither

  override def getMetricData(getMetricDataRequest: GetMetricDataRequest): Either[Throwable, GetMetricDataResponse] =
    underlying.getMetricData(getMetricDataRequest).toEither

  override def getMetricStatistics(
      getMetricStatisticsRequest: GetMetricStatisticsRequest
  ): Either[Throwable, GetMetricStatisticsResponse] =
    underlying.getMetricStatistics(getMetricStatisticsRequest).toEither

  override def getMetricWidgetImage(
      getMetricWidgetImageRequest: GetMetricWidgetImageRequest
  ): Either[Throwable, GetMetricWidgetImageResponse] =
    underlying.getMetricWidgetImage(getMetricWidgetImageRequest).toEither

  override def listDashboards(): Either[Throwable, ListDashboardsResponse] =
    underlying.listDashboards().toEither

  override def listDashboards(listDashboardsRequest: ListDashboardsRequest): Either[Throwable, ListDashboardsResponse] =
    underlying.listDashboards(listDashboardsRequest).toEither

  override def listMetrics(): Either[Throwable, ListMetricsResponse] =
    underlying.listMetrics().toEither

  override def listMetrics(listMetricsRequest: ListMetricsRequest): Either[Throwable, ListMetricsResponse] =
    underlying.listMetrics(listMetricsRequest).toEither

  def listMetricsPaginator(): ListMetricsIterable =
    underlying.listMetricsPaginator()

  def listMetricsPaginator(listMetricsRequest: ListMetricsRequest): ListMetricsIterable =
    underlying.listMetricsPaginator(listMetricsRequest)

  override def putDashboard(putDashboardRequest: PutDashboardRequest): Either[Throwable, PutDashboardResponse] =
    underlying.putDashboard(putDashboardRequest).toEither

  override def putMetricAlarm(putMetricAlarmRequest: PutMetricAlarmRequest): Either[Throwable, PutMetricAlarmResponse] =
    underlying.putMetricAlarm(putMetricAlarmRequest).toEither

  override def putMetricData(putMetricDataRequest: PutMetricDataRequest): Either[Throwable, PutMetricDataResponse] =
    underlying.putMetricData(putMetricDataRequest).toEither

  override def setAlarmState(setAlarmStateRequest: SetAlarmStateRequest): Either[Throwable, SetAlarmStateResponse] =
    underlying.setAlarmState(setAlarmStateRequest).toEither

}
