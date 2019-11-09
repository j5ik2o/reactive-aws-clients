// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.cats

import cats.effect.{ ContextShift, IO }
import com.github.j5ik2o.reactive.aws.cloudwatch.{ CloudWatchAsyncClient, CloudWatchClient }
import software.amazon.awssdk.services.cloudwatch.model._
import software.amazon.awssdk.services.cloudwatch.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object CloudWatchCatsIOClient {

  def apply(asyncClient: CloudWatchAsyncClient)(implicit ec: ExecutionContext): CloudWatchCatsIOClient =
    new CloudWatchCatsIOClient {
      override val executionContext: ExecutionContext = ec
      override val underlying: CloudWatchAsyncClient  = asyncClient
    }

}

trait CloudWatchCatsIOClient extends CloudWatchClient[IO] {

  val underlying: CloudWatchAsyncClient

  def executionContext: ExecutionContext
  implicit def cs: ContextShift[IO] = IO.contextShift(executionContext)

  override def deleteAlarms(deleteAlarmsRequest: DeleteAlarmsRequest): IO[DeleteAlarmsResponse] =
    IO.fromFuture {
      IO(underlying.deleteAlarms(deleteAlarmsRequest))
    }

  override def deleteAnomalyDetector(
      deleteAnomalyDetectorRequest: DeleteAnomalyDetectorRequest
  ): IO[DeleteAnomalyDetectorResponse] =
    IO.fromFuture {
      IO(underlying.deleteAnomalyDetector(deleteAnomalyDetectorRequest))
    }

  override def deleteDashboards(deleteDashboardsRequest: DeleteDashboardsRequest): IO[DeleteDashboardsResponse] =
    IO.fromFuture {
      IO(underlying.deleteDashboards(deleteDashboardsRequest))
    }

  override def describeAlarmHistory(
      describeAlarmHistoryRequest: DescribeAlarmHistoryRequest
  ): IO[DescribeAlarmHistoryResponse] =
    IO.fromFuture {
      IO(underlying.describeAlarmHistory(describeAlarmHistoryRequest))
    }

  override def describeAlarmHistory(): IO[DescribeAlarmHistoryResponse] =
    IO.fromFuture {
      IO(underlying.describeAlarmHistory())
    }

  def describeAlarmHistoryPaginator(): DescribeAlarmHistoryPublisher =
    underlying.describeAlarmHistoryPaginator()

  def describeAlarmHistoryPaginator(
      describeAlarmHistoryRequest: DescribeAlarmHistoryRequest
  ): DescribeAlarmHistoryPublisher =
    underlying.describeAlarmHistoryPaginator(describeAlarmHistoryRequest)

  override def describeAlarms(describeAlarmsRequest: DescribeAlarmsRequest): IO[DescribeAlarmsResponse] =
    IO.fromFuture {
      IO(underlying.describeAlarms(describeAlarmsRequest))
    }

  override def describeAlarms(): IO[DescribeAlarmsResponse] =
    IO.fromFuture {
      IO(underlying.describeAlarms())
    }

  override def describeAlarmsForMetric(
      describeAlarmsForMetricRequest: DescribeAlarmsForMetricRequest
  ): IO[DescribeAlarmsForMetricResponse] =
    IO.fromFuture {
      IO(underlying.describeAlarmsForMetric(describeAlarmsForMetricRequest))
    }

  def describeAlarmsPaginator(): DescribeAlarmsPublisher =
    underlying.describeAlarmsPaginator()

  def describeAlarmsPaginator(describeAlarmsRequest: DescribeAlarmsRequest): DescribeAlarmsPublisher =
    underlying.describeAlarmsPaginator(describeAlarmsRequest)

  override def describeAnomalyDetectors(
      describeAnomalyDetectorsRequest: DescribeAnomalyDetectorsRequest
  ): IO[DescribeAnomalyDetectorsResponse] =
    IO.fromFuture {
      IO(underlying.describeAnomalyDetectors(describeAnomalyDetectorsRequest))
    }

  override def disableAlarmActions(
      disableAlarmActionsRequest: DisableAlarmActionsRequest
  ): IO[DisableAlarmActionsResponse] =
    IO.fromFuture {
      IO(underlying.disableAlarmActions(disableAlarmActionsRequest))
    }

  override def enableAlarmActions(
      enableAlarmActionsRequest: EnableAlarmActionsRequest
  ): IO[EnableAlarmActionsResponse] =
    IO.fromFuture {
      IO(underlying.enableAlarmActions(enableAlarmActionsRequest))
    }

  override def getDashboard(getDashboardRequest: GetDashboardRequest): IO[GetDashboardResponse] =
    IO.fromFuture {
      IO(underlying.getDashboard(getDashboardRequest))
    }

  override def getMetricData(getMetricDataRequest: GetMetricDataRequest): IO[GetMetricDataResponse] =
    IO.fromFuture {
      IO(underlying.getMetricData(getMetricDataRequest))
    }

  def getMetricDataPaginator(getMetricDataRequest: GetMetricDataRequest): GetMetricDataPublisher =
    underlying.getMetricDataPaginator(getMetricDataRequest)

  override def getMetricStatistics(
      getMetricStatisticsRequest: GetMetricStatisticsRequest
  ): IO[GetMetricStatisticsResponse] =
    IO.fromFuture {
      IO(underlying.getMetricStatistics(getMetricStatisticsRequest))
    }

  override def getMetricWidgetImage(
      getMetricWidgetImageRequest: GetMetricWidgetImageRequest
  ): IO[GetMetricWidgetImageResponse] =
    IO.fromFuture {
      IO(underlying.getMetricWidgetImage(getMetricWidgetImageRequest))
    }

  override def listDashboards(listDashboardsRequest: ListDashboardsRequest): IO[ListDashboardsResponse] =
    IO.fromFuture {
      IO(underlying.listDashboards(listDashboardsRequest))
    }

  override def listDashboards(): IO[ListDashboardsResponse] =
    IO.fromFuture {
      IO(underlying.listDashboards())
    }

  def listDashboardsPaginator(): ListDashboardsPublisher =
    underlying.listDashboardsPaginator()

  def listDashboardsPaginator(listDashboardsRequest: ListDashboardsRequest): ListDashboardsPublisher =
    underlying.listDashboardsPaginator(listDashboardsRequest)

  override def listMetrics(listMetricsRequest: ListMetricsRequest): IO[ListMetricsResponse] =
    IO.fromFuture {
      IO(underlying.listMetrics(listMetricsRequest))
    }

  override def listMetrics(): IO[ListMetricsResponse] =
    IO.fromFuture {
      IO(underlying.listMetrics())
    }

  def listMetricsPaginator(): ListMetricsPublisher =
    underlying.listMetricsPaginator()

  def listMetricsPaginator(listMetricsRequest: ListMetricsRequest): ListMetricsPublisher =
    underlying.listMetricsPaginator(listMetricsRequest)

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): IO[ListTagsForResourceResponse] =
    IO.fromFuture {
      IO(underlying.listTagsForResource(listTagsForResourceRequest))
    }

  override def putAnomalyDetector(
      putAnomalyDetectorRequest: PutAnomalyDetectorRequest
  ): IO[PutAnomalyDetectorResponse] =
    IO.fromFuture {
      IO(underlying.putAnomalyDetector(putAnomalyDetectorRequest))
    }

  override def putDashboard(putDashboardRequest: PutDashboardRequest): IO[PutDashboardResponse] =
    IO.fromFuture {
      IO(underlying.putDashboard(putDashboardRequest))
    }

  override def putMetricAlarm(putMetricAlarmRequest: PutMetricAlarmRequest): IO[PutMetricAlarmResponse] =
    IO.fromFuture {
      IO(underlying.putMetricAlarm(putMetricAlarmRequest))
    }

  override def putMetricData(putMetricDataRequest: PutMetricDataRequest): IO[PutMetricDataResponse] =
    IO.fromFuture {
      IO(underlying.putMetricData(putMetricDataRequest))
    }

  override def setAlarmState(setAlarmStateRequest: SetAlarmStateRequest): IO[SetAlarmStateResponse] =
    IO.fromFuture {
      IO(underlying.setAlarmState(setAlarmStateRequest))
    }

  override def tagResource(tagResourceRequest: TagResourceRequest): IO[TagResourceResponse] =
    IO.fromFuture {
      IO(underlying.tagResource(tagResourceRequest))
    }

  override def untagResource(untagResourceRequest: UntagResourceRequest): IO[UntagResourceResponse] =
    IO.fromFuture {
      IO(underlying.untagResource(untagResourceRequest))
    }

}
